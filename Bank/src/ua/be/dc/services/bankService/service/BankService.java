package ua.be.dc.services.bankService.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

import ua.be.dc.services.bankService.models.Account;


@WebService
public interface BankService {
	
	@WebMethod
	public Account getAccount(String accountNumber);

	@WebMethod
	public Account[] getAccountsOfHolder();

	@WebMethod
	public Account createAccount() throws Exception;
	
	@WebMethod
	public void removeAccount(String accountNumber) throws Exception;
	
	@WebMethod
	public void withdraw(String accountNumber, float amount) throws Exception;
	
	@WebMethod
	public void deposit(String accountNumber, float amount) throws Exception;
	
	@WebMethod
	public void transfer(String fromAccountNumber, String toAccountNumber, float amount, String description) throws Exception;

	@WebMethod
	public String getBankCodeId();
}
