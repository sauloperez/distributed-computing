/**
 * 
 */
package ua.be.dc.services.ticketService.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import ua.be.dc.services.ticketService.models.Channel;
import ua.be.dc.services.ticketService.models.Event;
import ua.be.dc.services.ticketService.models.Ticket;

/**
 * @author Pau
 *
 */

@WebService
public interface TicketService {

	@WebMethod
	public String test();
	
	/**
     * Returns all the Tickets available for an Event.
     * @param event event whose tickets we look for.
     * @return List of Tickets of event
     */
	@WebMethod
	public Ticket[] getTicketsByEvent(@WebParam(name = "event") Event event);
	
	/**
     * Returns all the Tickets available for an Event and a certain selling channel.
     * @param event event whose tickets we look for.
     * @param channel the selling channel
     * @return List of Tickets of the event and channel
     */
	@WebMethod
	public Ticket[] getTicketsByEventAndChannel(@WebParam(name = "event") Event event, 
												@WebParam(name = "channel") Channel channel);
	
	/**
     * Returns a Ticket.
     * @param id primary key value used for lookup.
     * @return A Ticket with a primary key value equals to id. Null if it is does not exist.
     */
	@WebMethod
	public Ticket getTicketById(@WebParam(name = "id") Integer id);
	
	@WebMethod
	public void updateTicket(@WebParam(name = "ticket") Ticket ticket);
}
