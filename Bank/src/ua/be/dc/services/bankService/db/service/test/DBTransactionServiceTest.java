package ua.be.dc.services.bankService.db.service.test;

import java.util.List;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import ua.be.dc.services.bankService.db.service.IDBAccountService;
import ua.be.dc.services.bankService.db.service.IDBTransactionService;
import ua.be.dc.services.bankService.db.service.exception.DBServiceException;
import ua.be.dc.services.bankService.db.service.impl.DBAccountServiceImpl;
import ua.be.dc.services.bankService.db.service.impl.DBTransactionServiceImpl;
import ua.be.dc.services.bankService.models.Account;
import ua.be.dc.services.bankService.models.Transaction;

public class DBTransactionServiceTest {

	private static IDBTransactionService dbTransactionService;
	private static IDBAccountService dbAccountService;
	
	@BeforeClass
	public static void setup() {
		dbTransactionService = new DBTransactionServiceImpl();
		dbAccountService = new DBAccountServiceImpl();
	}
	
	@AfterClass
	public static void teardown() {
		dbTransactionService = null;
		dbAccountService = null;
	}
	
	@Test
	public void testGetById() {
		int transactionId = 48;
		Transaction transaction = dbTransactionService.getById(transactionId);
		Assert.assertNotNull(transaction);
		System.out.println(transaction);
	}
	
	@Test
	public void testGetAll() {
		List<Transaction> transactions = dbTransactionService.getAll();
		Assert.assertNotNull(transactions);
		for (Transaction transaction : transactions) {
			System.out.println(transaction);
		}
	}
	
	@Test
	public void testInsert() {
		try {
			int accountId = 1;
			float amount = 100f;
			float balance = 100f;
			
			Account account = dbAccountService.getById(accountId);
			
			Transaction transaction = new Transaction();
			transaction.setBalance(new Float(balance));
			transaction.setAmount(new Float(amount));
			transaction.setAccount(account);
			
			dbTransactionService.insert(transaction);
			
			Assert.assertTrue(transaction.getId() != 0);
			
			Transaction createdTransaction = dbTransactionService.getById(transaction.getId());
			Assert.assertNotNull(createdTransaction);
			Assert.assertNotNull(createdTransaction.getCreated());
			Assert.assertEquals(transaction.getBalance(), createdTransaction.getBalance());
			Assert.assertEquals(transaction.getAmount(), createdTransaction.getAmount());
			Assert.assertEquals(transaction.getDescription(), createdTransaction.getDescription());
			Assert.assertEquals(transaction.getAccount().getId(), createdTransaction.getAccount().getId());
			Assert.assertEquals(transaction.getAccount().getNumber(), createdTransaction.getAccount().getNumber());
		} catch (DBServiceException e) {
			e.printStackTrace();
			Assert.fail();
		}
	}
	

	@Test(expected = DBServiceException.class)
	public void testInsertEmpty() throws DBServiceException {
		dbTransactionService.insert(new Transaction());
	}
	
	@Test
	public void testUpdate() {
		try {
			int accountId = 2;
			int transactionId = 48;
			float amount = 200f;
			float balance = 400f;
			
			Account account = dbAccountService.getById(accountId);
			
			Transaction transaction = dbTransactionService.getById(transactionId);
			transaction.setBalance(new Float(balance));
			transaction.setAmount(new Float(amount));
			transaction.setAccount(account);
			
			dbTransactionService.update(transaction);
			
			Transaction updatedTransaction = dbTransactionService.getById(transactionId);
			Assert.assertEquals(transaction.getBalance(), updatedTransaction.getBalance());
			Assert.assertEquals(transaction.getAmount(), updatedTransaction.getAmount());
			Assert.assertEquals(transaction.getDescription(), updatedTransaction.getDescription());
			Assert.assertEquals(transaction.getAccount().getId(), updatedTransaction.getAccount().getId());
			Assert.assertEquals(transaction.getAccount().getNumber(), updatedTransaction.getAccount().getNumber());
		} catch (DBServiceException e) {
			e.printStackTrace();
			Assert.fail();
		}
	}
	
	@Test(expected = DBServiceException.class)
	public void testUpdateByInvalidTransaction() throws DBServiceException {
		dbTransactionService.update(new Transaction());
	}
	
	@Test
	public void testDelete() {
		try {
			int transactionId = 49;
			Transaction transaction = dbTransactionService.getById(transactionId);
			dbTransactionService.deleteById(transaction.getId());
			
			Transaction deletedTransaction = dbTransactionService.getById(transactionId);
			Assert.assertNull(deletedTransaction);
		} catch (DBServiceException e) {
			e.printStackTrace();
			Assert.fail();
		}
	}
	
	@Test(expected = DBServiceException.class)
	public void testDeleteByInvalidId() throws DBServiceException {
		int transactionId = -1;
		dbTransactionService.deleteById(transactionId);
	}
}
