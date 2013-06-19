package ua.be.dc.services.bankService.models;

import java.util.UUID;

public class Account {

	private Integer id;
	private String number;
	private Float balance;
	
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
		return uniqueKey.toString();
	}

}
