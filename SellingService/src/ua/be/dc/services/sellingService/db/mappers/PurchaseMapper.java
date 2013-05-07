package ua.be.dc.services.sellingService.db.mappers;

import java.util.List;

import ua.be.dc.services.sellingService.models.Purchase;

public interface PurchaseMapper {

	/**
     * @return the list of all Purchase instances from the database
     */
	List<Purchase> selectAll();
	
	/**
     * Returns a Purchase instance from the database
     * @param id value used for lookup
     * @return A Purchase with an id value equals to id, null otherwise
     */
	Purchase selectById(Integer id);
	
	/**
	 * Inserts a Purchase instance into the database
	 * @param purchase the instance to be persisted
	 */
	void insert(Purchase purchase);
	
	/**
	 * Updates an instance of Purchase in the database.
     * @param purchase the instance to be updated.
	 */
	void update(Purchase purchase);
	
	/**
	 * Deletes a Purchase instance from the database
	 * @param id primary key value of the instance to be deleted
	 */
	void delete(Integer id);
}
