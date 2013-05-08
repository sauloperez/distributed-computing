package ua.be.dc.services.sellingService.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import ua.be.dc.services.ticketService.service.Channel;
import ua.be.dc.services.ticketService.service.Event;
import ua.be.dc.services.ticketService.service.Ticket;

@WebService
public interface SellingService {

	@WebMethod
	public String test();
	
	/**
     * Returns a Ticket.
     * @param id primary key value used for lookup.
     * @return A Ticket with a primary key value equals to id. Null if it is does not exist.
	 * @throws Exception 
     */
	@WebMethod
	public Ticket getTicketById(@WebParam(name = "id") Integer id) throws Exception;
	
	@WebMethod
	public Ticket[] getAvailableTickets(@WebParam(name = "channel") Channel channel, 
										@WebParam(name = "event") Event event) throws Exception;
	
	@WebMethod
	public void reserveTicket(@WebParam(name = "ticket") Ticket ticket) throws Exception;
	
	@WebMethod
	public void unreserveTicket(@WebParam(name = "ticket") Ticket ticket) throws Exception;
	
	@WebMethod
	public void startPurchase(@WebParam(name = "tickets") Ticket[] tickets) throws Exception;
	
	@WebMethod
	public void executePurchase(@WebParam(name = "tickets") Ticket[] tickets) throws Exception;
	
}