package ua.be.dc.services.bankService.db.service;

import java.util.List;

import ua.be.dc.services.bankService.db.service.exception.DBServiceException;
import ua.be.dc.services.bankService.models.Account;
import ua.be.dc.services.bankService.models.Transaction;

public interface IDBTransactionService {

	public Transaction getById(Integer id);
	
	public List<Transaction> getAll();
	
	public List<Transaction> getByAccountId(Integer id);
	
	public void createTransaction(Account sourceAccount, Account destAccount, float amount) throws DBServiceException;

	public void insert(Transaction transaction) throws DBServiceException;
	
	public void update(Transaction transaction) throws DBServiceException;
	
	public void deleteById(Integer id) throws DBServiceException;

}
