package ua.be.dc.services.sellingService.db.service.test;

import java.util.List;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import ua.be.dc.services.sellingService.db.service.IDBBankService;
import ua.be.dc.services.sellingService.db.service.exception.DBServiceException;
import ua.be.dc.services.sellingService.db.service.impl.DBBankServiceImpl;
import ua.be.dc.services.sellingService.models.Bank;

public class DBBankServiceTest {

private static IDBBankService dbBankService;
	
	@BeforeClass
	public static void setup() {
		dbBankService = new DBBankServiceImpl();
	}
	
	@AfterClass
	public static void teardown() {
		dbBankService = null;
	}
	
	@Test
	public void testGetById() {
		int bankId = 1;
		Bank bank = dbBankService.getById(bankId);
		Assert.assertNotNull(bank);
	}
	
	@Test
	public void testGetByCodeId() {
		String bankCodeId = "9999";
		Bank bank = dbBankService.getByCodeId(bankCodeId);
		Assert.assertNotNull(bank);
	}

	@Test
	public void testGetAll() {
		List<Bank> banks = dbBankService.getAll();
		Assert.assertNotNull(banks);
		for (Bank bank : banks) {
			System.out.println(bank);
		}
	}
	
	@Test
	public void testInsert() {
		try {
			long timestamp = System.currentTimeMillis();
			
			Bank bank = new Bank();
			bank.setCodeId("8888");
			bank.setServiceEndpoint("http://localhost:8080/TestBank/" + timestamp);
			
			dbBankService.insert(bank);
			
			Assert.assertTrue(bank.getId() != 0);
			
			Bank createdBank = dbBankService.getById(bank.getId());
			Assert.assertNotNull(createdBank);
			Assert.assertEquals(bank.getServiceEndpoint(), createdBank.getServiceEndpoint());
		} catch (DBServiceException e) {
			e.printStackTrace();
			Assert.fail();
		}
	}
	
	@Test(expected = DBServiceException.class)
	public void testInsertEmpty() throws DBServiceException {
		dbBankService.insert(new Bank());
	}
	
	@Test
	public void testUpdate() {
		try {
			int bankId = 2;
			long timestamp = System.currentTimeMillis();
			
			Bank bank = dbBankService.getById(bankId);
			bank.setServiceEndpoint("http://localhost:8080/TestUpdateBank/" + timestamp);
			
			dbBankService.update(bank);
			
			Bank updatedBank =  dbBankService.getById(bankId);
			
			Assert.assertEquals(bank.getServiceEndpoint(), updatedBank.getServiceEndpoint());
		} catch (DBServiceException e) {
			e.printStackTrace();
			Assert.fail();
		}
	}

	@Test(expected = DBServiceException.class)
	public void testUpdateByInvalidBank() throws DBServiceException {
		dbBankService.update(new Bank());
	}
	
	@Test
	public void testDelete() {
		try {
			int bankId = 3;
			Bank bank = dbBankService.getById(bankId);
			
			dbBankService.deleteById(bank.getId());
			
			Bank deletedBank = dbBankService.getById(bankId);
			Assert.assertNull(deletedBank);
		} catch (DBServiceException e) {
			e.printStackTrace();
			Assert.fail();
		}
	}
	
	@Test(expected = DBServiceException.class)
	public void testDeleteByInvalidId() throws DBServiceException {
		int bankId = -1;
		dbBankService.deleteById(bankId);
	}
}
