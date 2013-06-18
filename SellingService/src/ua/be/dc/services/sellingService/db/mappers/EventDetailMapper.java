package ua.be.dc.services.sellingService.db.mappers;

import java.util.List;

import ua.be.dc.services.sellingService.models.EventDetail;

public interface EventDetailMapper {

	/**
     * @return the list of all EventDetail instances from the database
     */
	List<EventDetail> selectAll();
	
	/**
     * Returns a EventDetail instance from the database
     * @param id value used for lookup
     * @return A EventDetail with an id value equals to id, null otherwise
     */
	EventDetail selectById(Integer id);
	
	/**
	 * Inserts a EventDetail instance into the database
	 * @param eventDetail the instance to be persisted
	 */
	void insert(EventDetail eventDetail);
	
	/**
	 * Updates an instance of EventDetail in the database.
     * @param eventDetail the instance to be updated.
	 */
	int update(EventDetail eventDetail);
	
	/**
	 * Deletes a EventDetail instance from the database
	 * @param id primary key value of the instance to be deleted
	 */
	int delete(Integer id);
}
