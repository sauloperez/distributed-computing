package ua.be.dc.services.bankService.models;

import java.util.List;
import java.util.UUID;

import ua.be.dc.services.bankService.service.BankService;
import ua.be.dc.services.bankService.service.BankServiceImpl;

public class Account {

	private Integer id;
	private String number;
	private Float balance;
	
	// Not populated by default. A potentially large list
	private List<Transaction> transactions; 
	
	public Account() {
		number = generateNumber();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public Float getBalance() {
		return balance;
	}

	public void setBalance(Float balance) {
		this.balance = balance;
	}

	private String generateNumber() {
		UUID uniqueKey = UUID.randomUUID();
		BankService bankService = new BankServiceImpl();
		return bankService.getBankCodeId() + uniqueKey.toString();
	}

	public List<Transaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}
	
}
