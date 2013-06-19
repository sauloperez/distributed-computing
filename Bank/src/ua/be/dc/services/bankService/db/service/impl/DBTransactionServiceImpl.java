package ua.be.dc.services.bankService.db.service.impl;

import java.util.List;

import org.apache.ibatis.exceptions.PersistenceException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import ua.be.dc.services.bankService.db.dao.TransactionDAO;
import ua.be.dc.services.bankService.db.dao.exception.DAOException;
import ua.be.dc.services.bankService.db.service.IDBTransactionService;
import ua.be.dc.services.bankService.db.service.exception.DBServiceException;
import ua.be.dc.services.bankService.models.Transaction;

public class DBTransactionServiceImpl implements IDBTransactionService {

	private static Logger logger = LogManager.getLogger(DBTransactionServiceImpl.class
			.getName());
	
	private TransactionDAO transactionDAO = new TransactionDAO();
	
	@Override
	public Transaction getById(Integer id) {
		Transaction transaction = transactionDAO.selectById(id);
		
		if (transaction == null) {
			logger.trace("Transaction with ID " + id + " not found");
		}
		else {
			logger.trace("Retrieved transaction with ID " + id);
		}
		
		return transaction;
	}
	
	@Override
	public List<Transaction> getByAccountId(Integer accountId) {
		List<Transaction> transactions = transactionDAO.selectByAccountId(accountId);
		
		logger.trace("Retrieved " + transactions.size() + " transactions");
		
		return transactions;
	}
	
	@Override
	public List<Transaction> getAll() {
		List<Transaction> transactions = transactionDAO.selectAll();
		
		logger.trace("Retrieved " + transactions.size() + " transactions");
		
		return transactions;
	}

	@Override
	public void insert(Transaction transaction) throws DBServiceException {
		try {
			transactionDAO.insert(transaction);

			logger.trace("Inserted transaction with ID " + transaction.getId());
		} catch (PersistenceException e) {
			throw new DBServiceException("The transaction could not be inserted. " + e.getMessage());
		}
		
	}

	@Override
	public void update(Transaction transaction) throws DBServiceException {
		try {
			transactionDAO.update(transaction);

			logger.trace("Updated transaction with ID " + transaction.getId());
		} catch (DAOException e) {
			throw new DBServiceException("The transaction could not be updated. " + e.getMessage());
		}
	}

	@Override
	public void deleteById(Integer id) throws DBServiceException {
		try {
			transactionDAO.delete(id);

			logger.trace("Deleted transaction with ID " + id);
		} catch (DAOException e) {
			throw new DBServiceException("The transaction could not be deleted. " + e.getMessage());
		}
	}

}
