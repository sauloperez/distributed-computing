/**
 * 
 */
package ua.be.dc.services.ticketService.manager;

import java.util.List;

import ua.be.dc.services.ticketService.models.Event;

/**
 * Specifies all required methods that an Event manager must implement
 * Is intended to be used by an administrator through a client such a CLI or a webapp.
 * 
 * @author Pau
 *
 */
public interface IEventServiceManager {
	
	public List<Event> getEvents();

	public void createEvent(Event event);

	public void deleteEventById(Integer eventId);
}
