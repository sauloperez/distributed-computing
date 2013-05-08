package ua.be.dc.services.sellingService.service;

import java.sql.Timestamp;
import java.util.ArrayList;

import java.lang.Exception;

import javax.jws.WebService;

import ua.be.dc.services.sellingService.db.service.IDBPurchaseService;
import ua.be.dc.services.sellingService.db.service.impl.DBPurchaseServiceImpl;
import ua.be.dc.services.sellingService.models.Purchase;
import ua.be.dc.services.ticketService.service.Channel;
import ua.be.dc.services.ticketService.service.Event;
import ua.be.dc.services.ticketService.service.Ticket;
import ua.be.dc.services.ticketService.service.TicketService;
import ua.be.dc.services.ticketService.service.TicketServiceFactory;

@WebService(endpointInterface = "ua.be.dc.services.sellingService.service.SellingService")
public class SellingServiceImpl implements SellingService {

	private IDBPurchaseService dbPurchaseService = new DBPurchaseServiceImpl();
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
	public void reserveTicket(Ticket ticket) throws Exception {
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
	public void startPurchase(Ticket[] tickets) throws Exception {
		Float paymentAmount = new Float(0);
		for (Ticket ticket : tickets) {
			validateTicket(ticket);
			paymentAmount += ticket.getPrice();
		}
		
		// TODO PayPal setExpressCheckout
		String response = expressCheckout.setExpressCheckout(String.valueOf(paymentAmount.floatValue()));
		System.out.println(response);
	}

	@Override
	public void executePurchase(Ticket[] tickets) throws Exception {
		ArrayList<Integer> ticketIds = new ArrayList<Integer>();
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		
		//init transaction
		
		Float paymentAmount = new Float(0);
		for (Ticket ticket : tickets) {
			ticket = ticketService.getTicketById(ticket.getId());
			validateTicket(ticket);
			
			paymentAmount += ticket.getPrice();			
		}
		
		// TODO PayPal doExpressCheckout

		for (Ticket ticket : tickets) {
			ticket.setSold(true);
			ticketService.updateTicket(ticket);
			ticketIds.add(ticket.getId());
		}
		
		// Register the purchase in the history log
		Purchase purchase = new Purchase();
		purchase.setTimestamp(timestamp);
		purchase.setTicketsList(ticketIds);
		
		dbPurchaseService.insert(purchase);
		//end transaction
	}
	
	private void validateTicket(Ticket ticket) throws Exception {
		if (ticket == null) {
			throw new Exception("The ticket does not exist");
		}
		if (ticket.getSold()) {
			throw new Exception("Ticket already sold");
		}
	}

}