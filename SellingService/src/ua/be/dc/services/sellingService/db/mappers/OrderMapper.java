package ua.be.dc.services.sellingService.db.mappers;

import java.util.List;

import ua.be.dc.services.sellingService.models.Order;

public interface OrderMapper {
	
	/**
     * @return the list of all order instances from the database
     */
	List<Order> selectAll();
	
	/**
     * Returns a order instance from the database
     * @param id value used for lookup
     * @return A order with an id value equals to id, null otherwise
     */
	Order selectById(Integer id);
	
	/**
     * Returns a order instance from the database
     * @param token PayPal token value used for lookup
     * @return A order with an token value equals to token, null otherwise
     */
	Order selectByToken(String token);
	
	/**
	 * Inserts a order instance into the database
	 * @param order the instance to be persisted
	 */
	void insert(Order order);
	
	/**
	 * Updates an instance of order in the database.
     * @param order the instance to be updated.
	 */
	int update(Order order);
	
	/**
	 * Deletes a order instance from the database
	 * @param id primary key value of the instance to be deleted
	 */
	int delete(Integer id);
}
