/**
 * 
 */
package ua.be.dc.services.ticketService.manager;

import ua.be.dc.services.ticketService.models.Event;

/**
 * Specifies all required methods that an Event manager must implement
 * 
 * @author Pau
 *
 */
public interface IEventServiceManager {

	public void createEvent(Event event);

	public void deleteEventById(Integer eventId);
}
