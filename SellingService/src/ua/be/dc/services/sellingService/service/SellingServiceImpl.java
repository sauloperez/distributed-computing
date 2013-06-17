package ua.be.dc.services.sellingService.service;

import java.rmi.RemoteException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.jws.WebService;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import ebay.apis.eblbasecomponents.GetExpressCheckoutDetailsResponseDetailsType;

import ua.be.dc.services.sellingService.db.service.IDBCustomerService;
import ua.be.dc.services.sellingService.db.service.IDBEventOrganizerService;
import ua.be.dc.services.sellingService.db.service.IDBOrderService;
import ua.be.dc.services.sellingService.db.service.exception.DBServiceException;
import ua.be.dc.services.sellingService.db.service.impl.DBCustomerServiceImpl;
import ua.be.dc.services.sellingService.db.service.impl.DBEventOrganizerImpl;
import ua.be.dc.services.sellingService.db.service.impl.DBOrderServiceImpl;
import ua.be.dc.services.sellingService.models.Customer;
import ua.be.dc.services.sellingService.models.EventOrganizer;
import ua.be.dc.services.sellingService.models.Order;
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
	public void reserveTicket(Ticket ticket) throws RemoteException {
		ticket = ticketService.getTicketById(ticket.getId());
		ticket.setAvailable(false);
		ticketService.updateTicket(ticket);
	}

	@Override
	public void unreserveTicket(Ticket ticket) throws Exception {
		ticket = ticketService.getTicketById(ticket.getId());
		ticket.setAvailable(true);
		ticketService.updateTicket(ticket);
	}
	
	@Override
	public String startPurchase(Customer customer, Ticket[] tickets) throws Exception {
		String url = null;
		try {
			try {
				// Reserve these tickets during the payment process
				// We don't want any surprise for the user at the end...
				for (Ticket ticket : tickets) {
					reserveTicket(ticket);
				}
				
				dbCustomerService.insert(customer);
				
				Order order = new Order(tickets);
				order.setCustomer(customer);
				String token = expressCheckout.setExpressCheckout(order);
				
				dbOrderService.insert(order);
				
				url = expressCheckout.getUrl(token);
			} catch (PayPalException | InvalidTicketException e) {
				dbCustomerService.deleteById(customer.getId());
				throw new Exception(e.getMessage());
			}
		} catch (Exception e) {
			throw new Exception("The purchase couldn't be started. " + e.getMessage());
		}
		return url;
	}
	
	@Override
	public void executePurchase(String token, String payerId) throws Exception {
		try {
			Order order = dbOrderService.getOrderByToken(token);
			String transactionId = expressCheckout.doExpressCheckout(order.getTotalPrice(), token, payerId);
	
			// Update the order to purchased state
			if (transactionId != null) {
				order.setPurchased(new Timestamp(System.currentTimeMillis()));
				order.setTransactionId(transactionId);
				
				dbOrderService.update(order);
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
