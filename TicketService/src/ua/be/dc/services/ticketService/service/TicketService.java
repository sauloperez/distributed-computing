/**
 * 
 */
package ua.be.dc.services.ticketService.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

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
     * @return List of Tickets of event. Null if the event does not exist.
     */
	@WebMethod
	public Ticket[] getTicketsByEvent(Event event);
	
	/**
     * Returns a Ticket.
     * @param id primary key value used for lookup.
     * @return A Ticket with a primary key value equals to id. Null if it is does not exist.
     */
	@WebMethod
	public Ticket getTicketById(Integer id);
	
	@WebMethod
	public void updateTicket(Ticket ticket);
}
