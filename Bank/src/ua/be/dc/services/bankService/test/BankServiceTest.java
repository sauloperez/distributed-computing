package ua.be.dc.services.bankService.test;

import static org.junit.Assert.fail;
import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import ua.be.dc.services.bankService.db.service.IDBAccountService;
import ua.be.dc.services.bankService.db.service.IDBTransactionService;
import ua.be.dc.services.bankService.db.service.exception.DBServiceException;
import ua.be.dc.services.bankService.db.service.impl.DBAccountServiceImpl;
import ua.be.dc.services.bankService.db.service.impl.DBTransactionServiceImpl;
import ua.be.dc.services.bankService.models.Account;
import ua.be.dc.services.bankService.service.BankService;
import ua.be.dc.services.bankService.service.BankServiceImpl;

public class BankServiceTest {
	
	private static BankService bankService;
	private static IDBAccountService dbAccountService;
	private static IDBTransactionService dbTransactionService;

	@Before
	public void setUp() throws Exception {
		bankService = new BankServiceImpl();
		dbAccountService = new DBAccountServiceImpl();
		dbTransactionService = new DBTransactionServiceImpl();
	}

	@After
	public void tearDown() throws Exception {
		bankService = null;
		dbAccountService = null;
		dbTransactionService = null;
	}

	@Test
	public final void testGetAccount() {
		String accountNumber = "ccf53688-113a-45d8-a748-8e0de5e7a8c9";

		Account account = bankService.getAccount(accountNumber);
		
		Assert.assertNotNull(account);
	}

//	@Test
//	public final void testGetAccountsOfHolder() {
//		fail("Not yet implemented");
//	}

	@Test
	public final void testCreateAccount() {
		try {
			Account account = bankService.createAccount();
			
			Assert.assertNotNull(account);
			Assert.assertNotNull(account.getNumber());
			Assert.assertEquals(0f, account.getBalance().floatValue());
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}

	@Test
	public final void testRemoveAccount() {
		try {
			String accountNumber = "ee12a16b-6d7d-4e38-8a38-1af4940753ee";
			
			bankService.removeAccount(accountNumber);
			Account deletedAccount = bankService.getAccount(accountNumber);
			
			Assert.assertNull(deletedAccount);
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}

	@Test
	public final void testWithdraw() {
		try {
			float amount = 1f;
			String accountNumber = "ccf53688-113a-45d8-a748-8e0de5e7a8c9";
			
			Account account = bankService.getAccount(accountNumber);
			bankService.withdraw(accountNumber, amount);
			Account updatedAccount = bankService.getAccount(accountNumber);
			
			Assert.assertEquals(account.getBalance().floatValue() - amount, updatedAccount.getBalance().floatValue());
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}
	
	@Test
	public final void testWithdrawNotEnoughFunds() throws Exception {
		exception.expect(Exception.class);
	    exception.expectMessage("The withdraw could not be made. There are not enough funds");
	    
		float amount = 10000f;
		String accountNumber = "ccf53688-113a-45d8-a748-8e0de5e7a8c9";
		
		Account account = bankService.getAccount(accountNumber);
		bankService.withdraw(accountNumber, amount);
		Account updatedAccount = bankService.getAccount(accountNumber);
		
		Assert.assertEquals(account.getBalance().floatValue() - amount, updatedAccount.getBalance().floatValue());
	}

	@Test
	public final void testDeposit() {
		try {
			float amount = 4f;
			String accountNumber = "ccf53688-113a-45d8-a748-8e0de5e7a8c9";
			
			Account account = bankService.getAccount(accountNumber);
			bankService.deposit(accountNumber, amount);
			Account updatedAccount = bankService.getAccount(accountNumber);
			
			Assert.assertEquals(account.getBalance().floatValue() + amount, updatedAccount.getBalance().floatValue());
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}

	@Test
	public final void testTransfer() {
		try {
			float fundsA = 200;
			float fundsB = 300;
			float amount = 200;
			String description = "Test transfer of " + amount + " euros";
			
			// Create the accounts to make the transfer
			Account accountA = bankService.createAccount();
			Account accountB = bankService.createAccount();
			
			Assert.assertNull(accountA.getTransactions());
			Assert.assertNull(accountB.getTransactions());
			
			// Deposit some initial funds
			bankService.deposit(accountA.getNumber(), fundsA);
			bankService.deposit(accountB.getNumber(), fundsB);
			
			// Make a transfer between them
			bankService.transfer(accountA.getNumber(), accountB.getNumber(), amount, description);
			
			// Get the transactions of each account
			accountA = bankService.getAccount(accountA.getNumber());
			accountB = bankService.getAccount(accountB.getNumber());
			
			Assert.assertNotNull(accountA.getTransactions());
			Assert.assertNotNull(accountB.getTransactions());
			
			Assert.assertEquals(fundsA-amount, accountA.getBalance());
			Assert.assertEquals(fundsB+amount, accountB.getBalance());
			
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}
	
	@Rule
	public ExpectedException exception = ExpectedException.none();
	
	@Test
	public final void testTransferNotEnoughFunds() throws Exception {
		exception.expect(Exception.class);
	    exception.expectMessage("The transfer could not be made. There are not enough funds");
	    
		float fundsA = 200;
		float fundsB = 300;
		float amount = 600;
		String description = "Test transfer of " + amount + " euros";
		
		// Create the accounts to make the transfer
		Account accountA = bankService.createAccount();
		Account accountB = bankService.createAccount();
		
		Assert.assertNull(accountA.getTransactions());
		Assert.assertNull(accountB.getTransactions());
		
		// Deposit some initial funds
		bankService.deposit(accountA.getNumber(), fundsA);
		bankService.deposit(accountB.getNumber(), fundsB);
		
		// Make a transfer between them
		bankService.transfer(accountA.getNumber(), accountB.getNumber(), amount, description);
		
		// Get the transactions of each account
		accountA = bankService.getAccount(accountA.getNumber());
		accountB = bankService.getAccount(accountB.getNumber());
		
		Assert.assertNotNull(accountA.getTransactions());
		Assert.assertNotNull(accountB.getTransactions());
		
		Assert.assertEquals(fundsA-amount, accountA.getBalance());
		Assert.assertEquals(fundsB+amount, accountB.getBalance());
			
	}

}
