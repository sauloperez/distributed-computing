package ua.be.dc.services.bankService.db.mappers;

import java.util.List;

import ua.be.dc.services.bankService.models.Account;

public interface AccountMapper {

	/**
     * @return the list of all Account instances from the database
     */
	List<Account> selectAll();
	
	/**
     * Returns a Account instance from the database
     * @param id value used for lookup
     * @return An Account with an id value equals to id, null otherwise
     */
	Account selectById(Integer id);
	
	/**
     * Returns a Account instance from the database
     * @param number value used for lookup
     * @return An Account with an account number value equals to number, null otherwise
     */
	Account selectByNumber(String number);
	
	/**
	 * Inserts a Account instance into the database
	 * @param account the instance to be persisted
	 */
	void insert(Account account);
	
	/**
	 * Updates an instance of Account in the database.
     * @param account the instance to be updated.
	 * @return 
	 */
	int update(Account account);
	
	/**
	 * Deletes a Account instance from the database
	 * @param id primary key value of the instance to be deleted
	 * @return 
	 */
	int delete(Integer id);

}
