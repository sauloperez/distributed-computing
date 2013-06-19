package ua.be.dc.services.bankService.service;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import ua.be.dc.services.bankService.db.service.IDBAccountService;
import ua.be.dc.services.bankService.db.service.IDBTransactionService;
import ua.be.dc.services.bankService.db.service.exception.DBServiceException;
import ua.be.dc.services.bankService.db.service.impl.DBAccountServiceImpl;
import ua.be.dc.services.bankService.db.service.impl.DBTransactionServiceImpl;
import ua.be.dc.services.bankService.models.Account;
import ua.be.dc.services.bankService.models.Transaction;

@WebService(endpointInterface = "ua.be.dc.services.bank.service.BankService")
public class BankServiceImpl implements BankService {
	
	private static IDBAccountService dbAccountService = new DBAccountServiceImpl();
	private static IDBTransactionService dbTransactionService = new DBTransactionServiceImpl();

	@Override
	public Account getAccount(String accountNumber) {
		Account account = dbAccountService.getByNumber(accountNumber);
		
		if (account != null) {
			List<Transaction> transactions = dbTransactionService.getByAccountId(account.getId());
			account.setTransactions(transactions);
		}
		
		return account;
	}

	@Override
	public Account[] getAccountsOfHolder() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Account createAccount() throws Exception {
		Account account = new Account();
		try {
			account.setBalance(new Float(0));
			dbAccountService.insert(account);
		} catch (DBServiceException e) {
			throw new Exception("The account could not be created. " + e.getMessage());
		}
		return account;
	}

	@Override
	public void removeAccount(String accountNumber) throws Exception {
		try {
			Account account = dbAccountService.getByNumber(accountNumber);
			if (account != null) {
				dbAccountService.deleteById(account.getId());
			}
		} catch (DBServiceException e) {
			throw new Exception("The account could not be deleted. " + e.getMessage());
		}
	}

	@Override
	public void withdraw(String accountNumber, float amount) throws Exception {
		try {
			Account account = dbAccountService.getByNumber(accountNumber);
			withdraw(account, amount);
		} catch (DBServiceException e) {
			throw new Exception("The withdraw could not be made. " + e.getMessage());
		}
	}
	
	private void withdraw(Account account, float amount) throws DBServiceException {
		account.setBalance(account.getBalance() - amount);
		dbAccountService.update(account);
	}

	@Override
	public void deposit(String accountNumber, float amount) throws Exception {
		try {
			Account account = dbAccountService.getByNumber(accountNumber);
			deposit(account, amount);
		} catch (DBServiceException e) {
			throw new Exception("The deposit could not be made. " + e.getMessage());
		}
	}
	
	private void deposit(Account account, float amount) throws DBServiceException {
		account.setBalance(account.getBalance() + amount);
		dbAccountService.update(account);
	}

	// TODO add transactions. It has to lead to a consistent state
	@Override
	public void transfer(String fromAccountNumber, String toAccountNumber, float amount, String description) throws Exception {
		try {
			Account sourceAccount = dbAccountService.getByNumber(fromAccountNumber);
			Account destAccount = dbAccountService.getByNumber(toAccountNumber);
			
			// Update the source account's balance
			withdraw(sourceAccount, amount);
			dbAccountService.update(sourceAccount);
			
			// Update the destination account's balance
			deposit(destAccount, amount);
			dbAccountService.update(destAccount);
			
			// TODO TransactionService to store tx in file besides the DB insert
			// Build a transaction for each account so the users will be able to list
			// the money movements of their accounts
			Transaction transaction = new Transaction();
			transaction.setAmount(-amount);
			transaction.setAccount(sourceAccount);
			transaction.setBalance(sourceAccount.getBalance());
			transaction.setDescription(description);
			dbTransactionService.insert(transaction);
			
			if (sourceAccount.getTransactions() == null) {
				List<Transaction> transactions = new ArrayList<>();
				sourceAccount.setTransactions(transactions);
			}
			sourceAccount.getTransactions().add(transaction);
			
			transaction = new Transaction();
			transaction.setAmount(amount);
			transaction.setAccount(destAccount);
			transaction.setBalance(destAccount.getBalance());
			transaction.setDescription(description);
			dbTransactionService.insert(transaction);
			
			if (destAccount.getTransactions() == null) {
				List<Transaction> transactions = new ArrayList<>();
				destAccount.setTransactions(transactions);
			}
			destAccount.getTransactions().add(transaction);
			
		} catch (DBServiceException e) {
			throw new Exception("The transfer could not be made. " + e.getMessage());
		}
	}

}
