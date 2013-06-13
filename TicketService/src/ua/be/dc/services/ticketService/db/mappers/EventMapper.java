package ua.be.dc.services.ticketService.db.mappers;

import java.util.List;

import ua.be.dc.services.ticketService.models.Event;

public interface EventMapper {
		
	/**
     * @return the list of all Events from the database
     */
	List<Event> selectAll();
	
	/**
     * Returns an Event instance from the database
     * @param id value used for lookup
     * @return An Event with an id value equals to id, null otherwise
     */
	Event selectById(Integer id);
	
	/**
     * Returns an Event instance from the database
     * @param token value used for lookup
     * @return An Event with a token value equals to token, null otherwise
     */
	Event selectByToken(String token);

	/**
	 * Inserts an Event instance into the database
	 * @param event the instance to be persisted
	 */
	void insert(Event event);
	
	/**
	 * Updates an instance of Event in the database.
     * @param event the instance to be updated.
	 * @return 
	 */
	int update(Event event);
	
	/**
	 * Deletes an Event instance from the database
	 * @param id primary key value of the instance to be deleted
	 * @return 
	 */
	int delete(Integer id);

}
