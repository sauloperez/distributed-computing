package ua.be.dc.services.bankService.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import ua.be.dc.services.bankService.models.Account;
import ua.be.dc.services.bankService.service.BankService;
import ua.be.dc.services.bankService.service.BankServiceImpl;

public class BankServiceTest {
	
	private static BankService bankService;

	@Before
	public void setUp() throws Exception {
		bankService = new BankServiceImpl();
	}

	@After
	public void tearDown() throws Exception {
		bankService = null;
	}

	@Test
	public final void testGetAccount() {
		String accountNumber = "20131b08f2d8-d67c-42c9-a559-c68a2d1ed6e3";

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
			Assert.assertEquals(0f, account.getBalance().floatValue(), 0.0009);
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}

	@Test
	public final void testRemoveAccount() {
		try {
			Account accountToRemove = bankService.createAccount();
			bankService.removeAccount(accountToRemove.getNumber());
			Account deletedAccount = bankService.getAccount(accountToRemove.getNumber());
			
			Assert.assertNull(deletedAccount);
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}

	@Test
	public final void testWithdraw() {
		try {
			float amount = 4f;
			String accountNumber = "201394561e48-b198-4a56-8f2b-33581c408c9c";
			
			Account account = bankService.getAccount(accountNumber);
			bankService.withdraw(accountNumber, amount);
			Account updatedAccount = bankService.getAccount(accountNumber);
			
			Assert.assertEquals(account.getBalance().floatValue() - amount, updatedAccount.getBalance().floatValue(), 0.0009);
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}
	
	@Test
	public final void testWithdrawNotEnoughFunds() throws Exception {
		exception.expect(Exception.class);
	    exception.expectMessage("The withdraw could not be made. There are not enough funds");
	    
		float amount = 100000f;
		String accountNumber = "201394561e48-b198-4a56-8f2b-33581c408c9c";
		
		Account account = bankService.getAccount(accountNumber);
		bankService.withdraw(accountNumber, amount);
		Account updatedAccount = bankService.getAccount(accountNumber);
		
		Assert.assertEquals(account.getBalance().floatValue() - amount, updatedAccount.getBalance().floatValue(), 0.0009);
	}

	@Test
	public final void testDeposit() {
		try {
			float amount = 4f;
			String accountNumber = "201394561e48-b198-4a56-8f2b-33581c408c9c";
			
			Account account = bankService.getAccount(accountNumber);
			bankService.deposit(accountNumber, amount);
			Account updatedAccount = bankService.getAccount(accountNumber);
			
			Assert.assertEquals(account.getBalance().floatValue() + amount, updatedAccount.getBalance().floatValue(), 0.0009);
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
			float amount = 10;
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
			
			Assert.assertEquals(fundsA-amount, accountA.getBalance().floatValue(), 0.0009);
			Assert.assertEquals(fundsB+amount, accountB.getBalance().floatValue(), 0.0009);
			
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
		
		Assert.assertEquals(fundsA-amount, accountA.getBalance().floatValue(), 0.0009);
		Assert.assertEquals(fundsB+amount, accountB.getBalance().floatValue(), 0.0009);
			
	}

}
