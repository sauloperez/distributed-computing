package ua.be.dc.services.sellingService.service;

import java.rmi.RemoteException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.jws.WebService;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import ua.be.dc.services.bankService.service.BankService;
import ua.be.dc.services.bankService.service.BankServiceFactory;
import ua.be.dc.services.sellingService.db.service.IDBCustomerService;
import ua.be.dc.services.sellingService.db.service.IDBEventOrganizerService;
import ua.be.dc.services.sellingService.db.service.IDBOrderDetailService;
import ua.be.dc.services.sellingService.db.service.IDBOrderService;
import ua.be.dc.services.sellingService.db.service.IDBTicketDetailService;
import ua.be.dc.services.sellingService.db.service.impl.DBCustomerServiceImpl;
import ua.be.dc.services.sellingService.db.service.impl.DBEventOrganizerServiceImpl;
import ua.be.dc.services.sellingService.db.service.impl.DBOrderDetailServiceImpl;
import ua.be.dc.services.sellingService.db.service.impl.DBOrderServiceImpl;
import ua.be.dc.services.sellingService.db.service.impl.DBTicketDetailServiceImpl;
import ua.be.dc.services.sellingService.models.Customer;
import ua.be.dc.services.sellingService.models.EventOrganizer;
import ua.be.dc.services.sellingService.models.Order;
import ua.be.dc.services.sellingService.models.OrderDetail;
import ua.be.dc.services.sellingService.models.TicketDetail;
import ua.be.dc.services.sellingService.paypal.ExpressCheckout;
import ua.be.dc.services.sellingService.paypal.exception.PayPalException;
import ua.be.dc.services.ticketService.service.Channel;
import ua.be.dc.services.ticketService.service.Event;
import ua.be.dc.services.ticketService.service.Ticket;
import ua.be.dc.services.ticketService.service.TicketService;
import ua.be.dc.services.ticketService.service.TicketServiceFactory;

@WebService(endpointInterface = "ua.be.dc.services.sellingService.service.SellingService")
public class SellingServiceImpl implements SellingService {
	
	private static Logger logger = LogManager.getLogger(SellingServiceImpl.class.getName());
	
	static final String TICKET_RESELLER_ACCOUNT_NUMBER = "2013beee2537-2e40-4620-8c1f-38f0d5ec6d09";
	static final float TICKET_RESELLER_EVENT_FEE = 0.3f;
	
	static final float TOTAL_EARNINGS = 2000f;
	static final String EVENT_ORGANIZER_ACCOUNT_NUMBER = "201394561e48-b198-4a56-8f2b-33581c408c9c";
	
	private IDBOrderService dbOrderService = new DBOrderServiceImpl();
	private IDBOrderDetailService dbOrderDetailService = new DBOrderDetailServiceImpl();
	private IDBCustomerService dbCustomerService = new DBCustomerServiceImpl();
	private IDBEventOrganizerService dbEventOrganizerService = new DBEventOrganizerServiceImpl();
	private IDBTicketDetailService dbTicketDetailService = new DBTicketDetailServiceImpl();
	
	private BankService bankService = BankServiceFactory.getService();
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
			for (int i = 0; i < tickets.length; i++) {
				tickets[i] = ticketService.getTicketById(tickets[i].getId());
			}
			dbCustomerService.insert(customer);

			Order order = Order.createOrder(customer, tickets);
			
			String token = expressCheckout.setExpressCheckout(order);
			order.setToken(token);
			
			dbOrderService.update(order);
			
			url = expressCheckout.getUrl(token);

			// Reserve these tickets during the payment process
			// We don't want any surprise for the user at the end...
			if (url != null && url.equals("")) {
				for (int i = 0; i < tickets.length; ++i) {
					tickets[i] = reserveTicket(tickets[i]);
				}
			}
		} catch (PayPalException e) {
			dbCustomerService.deleteById(customer.getId());
			
			for (Ticket ticket : tickets) {
				unreserveTicket(ticket);
			}
			
			throw new Exception("The purchase couldn't be started. " + e.getMessage());
		}
		return url;
	}
	
	/**
	 * Simulates the corresponding money transfer for a ticket sell that PayPal would make 
	 * from a hardcoded user account (which should be related with a customer object) 
	 * to the ticket reseller company account
	 * @throws RemoteException 
	 * @throws ua.be.dc.services.bankService.service.Exception 
	 */
	private void simulatePayPalTransfer(Order order) throws ua.be.dc.services.bankService.service.Exception, RemoteException {
		logger.trace("Simulating PayPal transfer to ticket reseller company account...");
		
		String from = "2013474988de-4e29-4be1-9b77-ea3944ea2532";
		String to = TICKET_RESELLER_ACCOUNT_NUMBER;
		float amount = order.getTotalPrice().floatValue();
		
		bankService.transfer(from, to, amount, "PayPal order transfer simulation");
	}
	
	// TODO create account upon register event
	// TODO not necessarily at the same bank: prepend bank code and identify bank by it. Add Bank table
	private void transferEventEarnings(Event event) {
		// transfer from ticket reseller EVENT account to EVENT_ORGANIZER_ACCOUNT_NUMBER (in DB?)
		// amount = event account balance - fee (30%) = 0.7 * event account balance
		
		float amount = (1f-TICKET_RESELLER_EVENT_FEE) * TOTAL_EARNINGS;
		String from = TICKET_RESELLER_ACCOUNT_NUMBER;
		String to = EVENT_ORGANIZER_ACCOUNT_NUMBER;
		
		try {
			bankService.transfer(from, to, amount, event.getName() + " tickets selling earnings");
		} catch (Exception e) {
			System.err.println("The " + event.getName() + " event tickets selling earnings could not be transferred. " + e.getMessage());
		}
	}
	
	/**
	 * If we want to provide atomicity for the entire execute purchase method (including money transfers)
	 * we should move everything to DAO layer to use ibatis SqlSessionManager transaction
	 */
	@Override
	public void executePurchase(String token, String payerId) throws Exception {
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
			
			for (OrderDetail orderDetail : order.getOrderDetails()) {
				List<TicketDetail> ticketDetails = dbTicketDetailService.getByOrderDetailId(orderDetail.getId());
				for (TicketDetail ticketDetail : ticketDetails) {
					
					Ticket ticket = ticketService.getTicketById(ticketDetail.getTicketId());
					ticket.setSold(true);
					ticketService.updateTicket(ticket);
				}
			}
		}
		
		logger.trace("Purchase made");
		
		// Transfer the order payment to the ticket reseller company account
		simulatePayPalTransfer(order);
		
		OrderDetail orderDetail = order.getOrderDetails().get(0);
		orderDetail = dbOrderDetailService.getById(orderDetail.getId());
		
		TicketDetail ticketDetail = orderDetail.getTicketsDetails().get(0);
		ticketDetail = dbTicketDetailService.getById(ticketDetail.getId());
		
		String eventToken = ticketDetail.getEventDetail().getEventToken();
		Event event = ticketService.getEventByToken(eventToken);
		
		logger.trace("token = " + eventToken);
		logger.trace("Event = " + event.getName());
		
		// Transfer event earnings when tickets sold out
		if (ticketService.getTicketsByEvent(event) == null) {
			logger.trace("Tickets sold out. Transferring earnings...");
			transferEventEarnings(event);
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
