package ua.be.dc.services.sellingService.db.service.impl;

import java.util.List;

import org.apache.ibatis.exceptions.PersistenceException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import ua.be.dc.services.sellingService.db.dao.BankDAO;
import ua.be.dc.services.sellingService.db.dao.exception.DAOException;
import ua.be.dc.services.sellingService.db.service.IDBBankService;
import ua.be.dc.services.sellingService.db.service.exception.DBServiceException;
import ua.be.dc.services.sellingService.models.Bank;

public class DBBankServiceImpl implements IDBBankService {

private static Logger logger = LogManager.getLogger(DBBankServiceImpl.class.getName());
	
	private BankDAO bankDAO = new BankDAO();
	
	@Override
	public Bank getById(Integer id) {
		Bank bank = bankDAO.selectById(id);
		
		if (bank == null) {
			logger.trace("Bank with ID " + id + " not found");
		}
		else {
			logger.trace("Retrieved bank with ID " + id);
		}
		
		return bank;
	}
	
	@Override
	public Bank getByCodeId(String bankCodeId) {
		Bank bank = bankDAO.selectByCodeId(bankCodeId);
		
		if (bank == null) {
			logger.trace("Bank with bank code id " + bankCodeId + " not found");
		}
		else {
			logger.trace("Retrieved bank with bank code id " + bankCodeId);
		}
		
		return bank;
	}

	@Override
	public List<Bank> getAll() {
		List<Bank> banks = bankDAO.selectAll();
		
		logger.trace("Retrieved " + banks.size() + " banks");
		
		return banks;
	}

	@Override
	public void insert(Bank bank) throws DBServiceException {
		try {
			bankDAO.insert(bank);
			
			logger.trace("Inserted bank with ID " + bank.getId());
		} catch (PersistenceException e) {
			throw new DBServiceException("The bank could not be inserted. " + e.getMessage());
		}
	}

	@Override
	public void update(Bank bank) throws DBServiceException {
		try {
			bankDAO.update(bank);

			logger.trace("Updated bank with ID " + bank.getId());
		} catch (DAOException e) {
			throw new DBServiceException("The bank could not be updated. " + e.getMessage());
		}
	}

	@Override
	public void deleteById(Integer id) throws DBServiceException {
		try {
			bankDAO.delete(id);
			
			logger.trace("Deleted bank with ID " + id);
		} catch (DAOException e) {
			throw new DBServiceException("The bank could not be updated. " + e.getMessage());
		}
	}

}
