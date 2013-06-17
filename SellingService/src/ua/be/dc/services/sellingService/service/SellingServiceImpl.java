package ua.be.dc.services.sellingService.service;

import java.rmi.RemoteException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.jws.WebService;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;

import ua.be.dc.services.sellingService.db.service.IDBCustomerService;
import ua.be.dc.services.sellingService.db.service.IDBEventOrganizerService;
import ua.be.dc.services.sellingService.db.service.IDBOrderDetailService;
import ua.be.dc.services.sellingService.db.service.IDBOrderService;
import ua.be.dc.services.sellingService.db.service.impl.DBCustomerServiceImpl;
import ua.be.dc.services.sellingService.db.service.impl.DBEventOrganizerImpl;
import ua.be.dc.services.sellingService.db.service.impl.DBOrderDetailServiceImpl;
import ua.be.dc.services.sellingService.db.service.impl.DBOrderServiceImpl;
import ua.be.dc.services.sellingService.models.Customer;
import ua.be.dc.services.sellingService.models.EventOrganizer;
import ua.be.dc.services.sellingService.models.Order;
import ua.be.dc.services.sellingService.models.OrderDetail;
import ua.be.dc.services.sellingService.models.TicketDetails;
import ua.be.dc.services.sellingService.paypal.ExpressCheckout;
import ua.be.dc.services.sellingService.paypal.exception.PayPalException;
import ua.be.dc.services.sellingService.service.exception.InvalidTicketException;
import ua.be.dc.services.ticketService.service.Channel;
import ua.be.dc.services.ticketService.service.Event;
import ua.be.dc.services.ticketService.service.Ticket;
import ua.be.dc.services.ticketService.service.TicketService;
import ua.be.dc.services.ticketService.service.TicketServiceFactory;

@WebService(endpointInterface = "ua.be.dc.services.sellingService.service.SellingService")
public class SellingServiceImpl implements SellingService {
	
	private static Logger logger = LogManager.getLogger(SellingServiceImpl.class.getName());
	
	private IDBOrderService dbOrderService = new DBOrderServiceImpl();
	private IDBOrderDetailService dbOrderDetailService = new DBOrderDetailServiceImpl();
	private IDBCustomerService dbCustomerService = new DBCustomerServiceImpl();
	private IDBEventOrganizerService dbEventOrganizerService = new DBEventOrganizerImpl();
	
	private TicketService ticketService = TicketServiceFactory.getService();
	private ExpressCheckout expressCheckout = new ExpressCheckout();

	@Override
	public String test() {
		return "test";
	}
	
	@Override
	public Ticket getTicketById(Integer id) throws Exception {
		return ticketService.getTicketById(id);
	}

	@Override
	public Ticket[] getAvailableTickets(Channel channel, Event event) throws Exception {
		return ticketService.getTicketsByEventAndChannel(event, channel);
	}

	@Override
	public Ticket reserveTicket(Ticket ticket) throws RemoteException {
		ticket = ticketService.getTicketById(ticket.getId());
		
		logger.trace(ticket);
		
		ticket.setAvailable(false);
		ticketService.updateTicket(ticket);
		return ticket;
	}

	@Override
	public Ticket unreserveTicket(Ticket ticket) throws Exception {
		ticket = ticketService.getTicketById(ticket.getId());
		ticket.setAvailable(true);
		ticketService.updateTicket(ticket);
		return ticket;
	}
	
	@Override
	public String startPurchase(Customer customer, Ticket[] tickets) throws Exception {
		String url = null;
		try {
			try {
				for (int i = 0; i < tickets.length; i++) {
					tickets[i] = ticketService.getTicketById(tickets[i].getId());
				}
				dbCustomerService.insert(customer);

				Order order = new Order(tickets);
				order.setCustomer(customer);
				
				// Build the order details
				OrderDetail orderDetail = new OrderDetail();
				orderDetail.setName("Tickets for event");
				orderDetail.setTicketsDetails(tickets);

				List<OrderDetail> orderDetails = new ArrayList<OrderDetail>();
				orderDetails.add(orderDetail);
				
				// Finish the order with order details information
				order.setOrderDetails(orderDetails);
				order.setTotalPrice(orderDetail.getPrice());
				
				String token = expressCheckout.setExpressCheckout(order);
				order.setToken(token);
				
				// Store them in DB upon PayPal call success
				dbOrderService.insert(order);
				for (int i = 0; i < orderDetails.size(); ++i) {
					OrderDetail detail = orderDetails.get(i);
					detail.setOrder(order);
					dbOrderDetailService.insert(detail);
				}
				
				url = expressCheckout.getUrl(token);

				// Reserve these tickets during the payment process
				// We don't want any surprise for the user at the end...
				if (url != null && url.equals("")) {
					for (int i = 0; i < tickets.length; ++i) {
						tickets[i] = reserveTicket(tickets[i]);
					}
				}
			} catch (PayPalException | InvalidTicketException e) {
				dbCustomerService.deleteById(customer.getId());
				
				for (Ticket ticket : tickets) {
					unreserveTicket(ticket);
				}
				
				throw new Exception(e.getMessage());
			}
		} catch (Exception e) {
			for (Ticket ticket : tickets) {
				unreserveTicket(ticket);
			}
			
			throw new Exception("The purchase couldn't be started. " + e.getMessage());
		}
		return url;
	}
	
	@Override
	public void executePurchase(String token, String payerId) throws Exception {
		try {
			if (token == null) {
				throw new Exception("The purchase couldn't be executed. The token cannot be null");
			}
			if (payerId == null) {
				throw new Exception("The purchase couldn't be executed. The payerId cannot be null");
			}
			
			Order order = dbOrderService.getOrderByToken(token);
			String transactionId = expressCheckout.doExpressCheckout(order.getTotalPrice(), token, payerId);
	
			// Update the order to purchased state
			if (transactionId != null) {
				order.setPurchased(new Timestamp(System.currentTimeMillis()));
				order.setTransactionId(transactionId);
				
				dbOrderService.update(order);
				
				// TODO set tickets of the orderDetail to sold
				for (OrderDetail orderDetail : order.getOrderDetails()) {
					for (TicketDetails ticketDetail : orderDetail.getTicketsDetails()) {
						Ticket ticket = ticketService.getTicketById(ticketDetail.getId());
						ticket.setSold(true);
						ticketService.updateTicket(ticket);
					}
				}
			}
		} catch (Exception e) {
			throw new Exception("The purchase couldn't be executed. " + e.getMessage());
		}
	}

	@Override
	public Event[] getEvents() {
		ArrayList<Event> events = new ArrayList<Event>();
		try {
			List<EventOrganizer> eventOrganizers = dbEventOrganizerService.getAll();
			for (EventOrganizer eventOrganizer : eventOrganizers) {
				String serviceEndpoint = eventOrganizer.getServiceEndpoint();
				ticketService = TicketServiceFactory.getService(serviceEndpoint);
				
				Collections.addAll(events, ticketService.getEvents());
			}
		} catch (RemoteException e) {
			e.printStackTrace();
		}

		return events.toArray(new Event[events.size()]);
	}

}
