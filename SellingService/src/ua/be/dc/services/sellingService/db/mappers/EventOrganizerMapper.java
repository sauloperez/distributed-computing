package ua.be.dc.services.sellingService.db.mappers;

import java.util.List;

import ua.be.dc.services.sellingService.models.EventOrganizer;

public interface EventOrganizerMapper {

	/**
     * @return the list of all EventOrganizer instances from the database
     */
	List<EventOrganizer> selectAll();
	
	/**
     * Returns a EventOrganizer instance from the database
     * @param id value used for lookup
     * @return An EventOrganizer with an id value equals to id, null otherwise
     */
	EventOrganizer selectById(Integer id);
	
	/**
	 * Inserts a Purchase instance into the database
	 * @param eventOrganizer the instance to be persisted
	 */
	void insert(EventOrganizer eventOrganizer);
	
	/**
	 * Updates an instance of EventOrganizer in the database.
     * @param eventOrganizer the instance to be updated.
	 * @return 
	 */
	int update(EventOrganizer eventOrganizer);
	
	/**
	 * Deletes an EventOrganizer instance from the database
	 * @param id primary key value of the instance to be deleted
	 * @return 
	 */
	int delete(Integer id);
}
