package ua.be.dc.services.ticketService.db.mappers;

import java.util.List;

import ua.be.dc.services.ticketService.models.Ticket;

public interface TicketMapper {
	
	/**
     * Returns a Ticket instance from the database
     * @param id value used for lookup
     * @return A Ticket with an id value equals to id, null otherwise
     */
	Ticket selectById(Integer id);
	
	/**
     * @return the list of all Ticket instances from the database
     */
	List<Ticket> selectAll();
	
	/**
	 * Inserts a Ticket instance into the database
	 * @param Ticket the instance to be persisted
	 */
	void insert(Ticket ticket);
	
	/**
	 * Updates an instance of Ticket in the database.
     * @param ticket the instance to be updated.
	 */
	void update(Ticket ticket);
	
	/**
	 * Deletes a Ticket instance from the database
	 * @param id primary key value of the instance to be deleted
	 */
	void delete(Integer id);
}
