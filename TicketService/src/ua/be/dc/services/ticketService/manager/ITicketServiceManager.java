/**
 * 
 */
package ua.be.dc.services.ticketService.manager;

import ua.be.dc.services.ticketService.models.Ticket;

/**
 * Specifies all required methods that a Ticket manager must implement
 * Is intended to be used by an administrator through a client such a CLI or a webapp.
 * 
 * @author Pau
 *
 */
public interface ITicketServiceManager {
	
	public void createTicket(Ticket ticket) throws IllegalArgumentException;

	public void deleteTicketById(Integer ticketId);
}
