package ua.be.dc.services.sellingService.db.mappers;

import java.util.List;

import ua.be.dc.services.sellingService.models.Bank;

public interface BankMapper {

	/**
     * @return the list of all Bank instances from the database
     */
	List<Bank> selectAll();
	
	/**
     * Returns a Bank instance from the database
     * @param id value used for lookup
     * @return A Bank with an id value equals to id, null otherwise
     */
	Bank selectById(Integer id);
	
	/**
     * Returns a Bank instance from the database based on the "my-standarized" 4 chars bank code id
     * @param bankCodeId value used for lookup
     * @return A Bank with an bank code id value equals to bankCodeId, null otherwise
     */
	Bank selectByCodeId(String bankCodeId);
	
	/**
	 * Inserts a Bank instance into the database
	 * @param bank the instance to be persisted
	 */
	void insert(Bank bank);
	
	/**
	 * Updates an instance of Bank in the database.
     * @param bank the instance to be updated.
	 */
	int update(Bank bank);
	
	/**
	 * Deletes a Bank instance from the database
	 * @param id primary key value of the instance to be deleted
	 */
	int delete(Integer id);
	
}
