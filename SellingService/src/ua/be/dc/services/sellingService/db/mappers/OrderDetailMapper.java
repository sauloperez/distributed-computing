package ua.be.dc.services.sellingService.db.mappers;

import java.util.List;

import ua.be.dc.services.sellingService.models.OrderDetail;

public interface OrderDetailMapper {
	
	/**
     * @return the list of all OrderDetail instances from the database
     */
	List<OrderDetail> selectAll();
	
	/**
     * Returns a OrderDetail instance from the database
     * @param id value used for lookup
     * @return A OrderDetail with an id value equals to id, null otherwise
     */
	OrderDetail selectById(Integer id);
	
	/**
	 * Inserts a OrderDetail instance into the database
	 * @param orderDetail the instance to be persisted
	 */
	void insert(OrderDetail orderDetail);
	
	/**
	 * Updates an instance of OrderDetail in the database.
     * @param orderDetail the instance to be updated.
	 */
	int update(OrderDetail orderDetail);
	
	/**
	 * Deletes a OrderDetail instance from the database
	 * @param id primary key value of the instance to be deleted
	 */
	int delete(Integer id);
}
