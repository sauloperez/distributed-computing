package ua.be.dc.services.bankService.db.service.test;

import java.util.List;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import ua.be.dc.services.bankService.db.service.IDBAccountService;
import ua.be.dc.services.bankService.db.service.exception.DBServiceException;
import ua.be.dc.services.bankService.db.service.impl.DBAccountServiceImpl;
import ua.be.dc.services.bankService.models.Account;

public class DBAccountServiceTest {

	private static IDBAccountService dbAccountService;
	
	@BeforeClass
	public static void setup() {
		dbAccountService = new DBAccountServiceImpl();
	}
	
	@AfterClass
	public static void teardown() {
		dbAccountService = null;
	}
	
	@Test
	public void testGetById() {
		Account account = dbAccountService.getById(1);
		Assert.assertNotNull(account);
		System.out.println(account);
	}
	
	@Test
	public void testGetAll() {
		List<Account> accounts = dbAccountService.getAll();
		Assert.assertNotNull(accounts);
		for (Account account : accounts) {
			System.out.println(account);
		}
	}
	
	@Test
	public void testInsert() {
		try {
			Account account = new Account();
			account.setBalance(new Float(100));
			
			dbAccountService.insert(account);
			
			Assert.assertTrue(account.getId() != 0);
			
			Account createdAccount = dbAccountService.getById(account.getId());
			Assert.assertNotNull(createdAccount);
			Assert.assertEquals(account.getBalance(), createdAccount.getBalance());
			Assert.assertEquals(account.getNumber(), createdAccount.getNumber());
		} catch (DBServiceException e) {
			e.printStackTrace();
			Assert.fail();
		}
	}
	

	@Test(expected = DBServiceException.class)
	public void testInsertEmpty() throws DBServiceException {
		dbAccountService.insert(new Account());
	}
	
	@Test
	public void testUpdate() {
		try {
			int accountId = 1;
			long balance = 2;
			
			Account account = dbAccountService.getById(accountId);
			account.setBalance(new Float(balance));
			
			dbAccountService.update(account);
			
			Account updatedAccount = dbAccountService.getById(accountId);
			Assert.assertEquals(account.getNumber(), updatedAccount.getNumber());
			Assert.assertEquals(account.getBalance(), updatedAccount.getBalance());
		} catch (DBServiceException e) {
			e.printStackTrace();
			Assert.fail();
		}
	}
	
	@Test(expected = DBServiceException.class)
	public void testUpdateByInvalidAccount() throws DBServiceException {
		dbAccountService.update(new Account());
	}
	
	@Test
	public void testDelete() {
		try {
			int accountId = 3;
			Account account = dbAccountService.getById(accountId);
			dbAccountService.deleteById(account.getId());
			
			Account deletedAccount = dbAccountService.getById(accountId);
			Assert.assertNull(deletedAccount);
		} catch (DBServiceException e) {
			e.printStackTrace();
			Assert.fail();
		}
	}
	
	@Test(expected = DBServiceException.class)
	public void testDeleteByInvalidId() throws DBServiceException {
		int accountId = -1;
		dbAccountService.deleteById(accountId);
	}
}
