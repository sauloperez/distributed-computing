package ua.be.dc.services.sellingService.db.mappers;

import java.util.List;

import ua.be.dc.services.sellingService.models.Customer;

public interface CustomerMapper {
	
	/**
     * @return the list of all Customer instances from the database
     */
	List<Customer> selectAll();
	
	/**
     * Returns a Customer instance from the database
     * @param id value used for lookup
     * @return A Customer with an id value equals to id, null otherwise
     */
	Customer selectById(Integer id);
	
	/**
	 * Inserts a Customer instance into the database
	 * @param customer the instance to be persisted
	 */
	void insert(Customer customer);
	
	/**
	 * Updates an instance of Customer in the database.
     * @param customer the instance to be updated.
	 */
	int update(Customer customer);
	
	/**
	 * Deletes a Customer instance from the database
	 * @param id primary key value of the instance to be deleted
	 */
	int delete(Integer id);
}
