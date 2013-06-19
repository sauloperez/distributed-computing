package ua.be.dc.services.bankService.db.service;

import java.util.List;

import ua.be.dc.services.bankService.db.service.exception.DBServiceException;
import ua.be.dc.services.bankService.models.Account;

public interface IDBAccountService {

	public Account getById(Integer id);
	
	public Account getByNumber(String number);
	
	public List<Account> getAll();
	
	public void insert(Account account) throws DBServiceException;
	
	public void update(Account account) throws DBServiceException;
	
	public void deleteById(Integer id) throws DBServiceException;
}
