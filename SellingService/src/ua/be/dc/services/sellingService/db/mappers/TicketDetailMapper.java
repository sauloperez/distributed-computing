package ua.be.dc.services.sellingService.db.mappers;

import java.util.List;

import ua.be.dc.services.sellingService.models.TicketDetail;

public interface TicketDetailMapper {

	/**
     * @return the list of all TicketDetail instances from the database
     */
	List<TicketDetail> selectAll();
	
	/**
     * Returns a TicketDetail instance from the database
     * @param id value used for lookup
     * @return A TicketDetail with an id value equals to id, null otherwise
     */
	TicketDetail selectById(Integer id);
	
	/**
     * Returns a List of TicketDetail instance from the database
     * @param orderDetailId value used for lookup
     * @return A List of TicketDetail with an order detail id value equals to orderDetailId, null otherwise
     */
	List<TicketDetail> selectByOrderDetailId(Integer orderDetailId);
	
	/**
	 * Inserts a TicketDetail instance into the database
	 * @param ticketDetail the instance to be persisted
	 */
	void insert(TicketDetail ticketDetail);
	
	/**
	 * Updates an instance of TicketDetail in the database.
     * @param ticketDetail the instance to be updated.
	 */
	int update(TicketDetail ticketDetail);
	
	/**
	 * Deletes a TicketDetail instance from the database
	 * @param id primary key value of the instance to be deleted
	 */
	int delete(Integer id);
	
}
