package ua.be.dc.services.bankService.db.service.impl;

import java.util.List;

import org.apache.ibatis.exceptions.PersistenceException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import ua.be.dc.services.bankService.db.dao.AccountDAO;
import ua.be.dc.services.bankService.db.dao.exception.DAOException;
import ua.be.dc.services.bankService.db.service.IDBAccountService;
import ua.be.dc.services.bankService.db.service.exception.DBServiceException;
import ua.be.dc.services.bankService.db.service.exception.DBServiceNotEnoughFundsException;
import ua.be.dc.services.bankService.models.Account;

public class DBAccountServiceImpl implements IDBAccountService {

	private static Logger logger = LogManager.getLogger(DBAccountServiceImpl.class
			.getName());
	
	private AccountDAO accountDAO = new AccountDAO();
	
	@Override
	public Account getById(Integer id) {
		Account account = accountDAO.selectById(id);
		
		if (account == null) {
			logger.trace("Account with ID " + id + " not found");
		}
		else {
			logger.trace("Retrieved account with ID " + id);
		}
		
		return account;
	}
	
	@Override
	public Account getByNumber(String number) {
		Account account = accountDAO.selectByNumber(number);
		
		if (account == null) {
			logger.trace("Account with number " + number + " not found");
		}
		else {
			logger.trace("Retrieved account with number " + number);
		}
		
		return account;
	}

	@Override
	public List<Account> getAll() {
		List<Account> accounts = accountDAO.selectAll();
		
		logger.trace("Retrieved " + accounts.size() + " accounts");
		
		return accounts;
	}

	@Override
	public void insert(Account account) throws DBServiceException {
		try {
			accountDAO.insert(account);

			logger.trace("Inserted account with ID " + account.getId());
		} catch (PersistenceException e) {
			throw new DBServiceException("The account could not be inserted. " + e.getMessage());
		}
		
	}

	@Override
	public void update(Account account) throws DBServiceException {
		try {
			if (account.getBalance().floatValue() < 0f) {
				throw new DBServiceNotEnoughFundsException("There are not enough funds");
			}
			accountDAO.update(account);

			logger.trace("Updated account with ID " + account.getId());
		} catch (DAOException e) {
			throw new DBServiceException("The account could not be updated. " + e.getMessage());
		}
	}

	@Override
	public void deleteById(Integer id) throws DBServiceException {
		try {
			accountDAO.delete(id);

			logger.trace("Deleted account with ID " + id);
		} catch (DAOException e) {
			throw new DBServiceException("The account could not be deleted. " + e.getMessage());
		}
	}

}
