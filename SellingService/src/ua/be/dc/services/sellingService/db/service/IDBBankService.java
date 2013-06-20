package ua.be.dc.services.sellingService.db.service;

import java.util.List;

import ua.be.dc.services.sellingService.db.service.exception.DBServiceException;
import ua.be.dc.services.sellingService.models.Bank;

public interface IDBBankService {

	public Bank getById(Integer id);
	
	public Bank getByCodeId(String bankCodeId);
	
	public List<Bank> getAll();

	public void insert(Bank bank) throws DBServiceException;

	public void update(Bank bank) throws DBServiceException;

	public void deleteById(Integer id) throws DBServiceException;
	
}
