package ua.be.dc.services.bankService.models;

import java.sql.Timestamp;

public class Transaction {

	private Integer id;
	private Account account;
	private Timestamp created;
	private Float amount;
	private Float balance;
	private String description;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Timestamp getCreated() {
		return created;
	}

	public void setCreated(Timestamp created) {
		this.created = created;
	}

	public Float getAmount() {
		return amount;
	}

	public void setAmount(Float amount) {
		this.amount = amount;
	}

	public Float getBalance() {
		return balance;
	}

	public void setBalance(Float balance) {
		this.balance = balance;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String toString() {
		return "account " + account.getNumber() + " gets " + amount + " euros. Final balance set to " + balance + " at ";// + created.toString();
 	}
}
