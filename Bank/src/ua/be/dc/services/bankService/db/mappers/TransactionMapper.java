package ua.be.dc.services.bankService.db.mappers;

import java.util.List;

import ua.be.dc.services.bankService.models.Transaction;

public interface TransactionMapper {

	/**
     * @return the list of all Transaction instances from the database
     */
	List<Transaction> selectAll();
	
	/**
     * Returns a Transaction instance from the database
     * @param id value used for lookup
     * @return A Transaction with an id value equals to id, null otherwise
     */
	Transaction selectById(Integer id);
	
	/**
     * Returns a List of Transaction instance from the database
     * @param accountId value used for lookup
     * @return A Transaction with an account id value equals to accountId, null otherwise
     */
	List<Transaction> selectByAccountId(Integer accountId);
	
	/**
	 * Inserts a Transaction instance into the database
	 * @param transaction the instance to be persisted
	 */
	void insert(Transaction transaction);
	
	/**
	 * Updates an instance of Transaction in the database.
     * @param transaction the instance to be updated.
	 * @return 
	 */
	int update(Transaction transaction);
	
	/**
	 * Deletes a Transaction instance from the database
	 * @param id primary key value of the instance to be deleted
	 * @return 
	 */
	int delete(Integer id);

}
