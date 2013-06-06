package ua.be.dc.services.sellingService.db.service.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import ua.be.dc.services.sellingService.db.service.IDBPurchaseService;
import ua.be.dc.services.sellingService.db.service.exception.DBServiceException;
import ua.be.dc.services.sellingService.db.service.impl.DBPurchaseServiceImpl;
import ua.be.dc.services.sellingService.models.Purchase;

public class DBPurchaseServiceTest {

	private static IDBPurchaseService dbPurchaseService;
	
	@BeforeClass
	public static void setup() {
		dbPurchaseService = new DBPurchaseServiceImpl();
	}
	
	@AfterClass
	public static void teardown() {
		dbPurchaseService = null;
	}
	
	@Test
	public void testGetById() {
		int purchaseId = 20;
		
		Purchase purchase = dbPurchaseService.getById(purchaseId);
		Assert.assertNotNull(purchase);
		System.out.println(purchase);
	}
	
	@Test
	public void testGetAll() {
		List<Purchase> purchases = dbPurchaseService.getAll();
		Assert.assertNotNull(purchases);
		for (Purchase purchase : purchases) {
			System.out.println(purchase);
		}
	}
	
	@Test
	public void testInsert() {
		try {
			Purchase purchase = new Purchase();
			ArrayList<Integer> ticketsList = new ArrayList<Integer>();
			ticketsList.add(1);
			ticketsList.add(2);
			purchase.setTicketsList(ticketsList);
			purchase.setEventOrganizerId(1);
			
			dbPurchaseService.insert(purchase);

			Assert.assertTrue(purchase.getId() != 0);
			
			Purchase createdPurchase = dbPurchaseService.getById(purchase.getId());
			Assert.assertNotNull(createdPurchase);
			
			ArrayList<Integer> tickets = purchase.getTicketsList();
			
			Assert.assertNotNull(tickets);
			for (int i = 0; i < tickets.size(); i++) {
				Assert.assertEquals(ticketsList.get(i), tickets.get(i));
			}
		} catch (DBServiceException e) {
			e.printStackTrace();
		}
	}
	
	@Test(expected = DBServiceException.class)
	public void testInsertEmpty() throws DBServiceException {
		dbPurchaseService.insert(new Purchase());
	}
	
	@Test
	public void testUpdate() {
		try {
			int purchaseId = 21;
			
			Purchase purchase = dbPurchaseService.getById(purchaseId);
			ArrayList<Integer> ticketsList = new ArrayList<Integer>();
			ticketsList.add(1);
			ticketsList.add(2);
			purchase.setTicketsList(ticketsList);
			
			dbPurchaseService.update(purchase);
			
			Purchase updatedPurchase = dbPurchaseService.getById(purchaseId);
			Assert.assertEquals(purchase.getTimestamp(), updatedPurchase.getTimestamp());
			
			ArrayList<Integer> tickets = purchase.getTicketsList();
			Assert.assertNotNull(tickets);
			for (int i = 0; i < tickets.size(); i++) {
				Assert.assertEquals(ticketsList.get(i), tickets.get(i));
			}
		} catch (DBServiceException e) {
			e.printStackTrace();
		}
	}
	
	@Test(expected = DBServiceException.class)
	public void testUpdateByInvalidEventOrganizer() throws DBServiceException {
		dbPurchaseService.update(new Purchase());
	}
	
	@Test
	public void testDelete() {
		try {
			int purchaseId = 23;
			
			dbPurchaseService.deleteById(purchaseId);
			
			Purchase deletedPurchase = dbPurchaseService.getById(3);
			Assert.assertNull(deletedPurchase);
		} catch (DBServiceException e) {
			e.printStackTrace();
		}
	}
	
	@Test(expected = DBServiceException.class)
	public void testDeleteByInvalidId() throws DBServiceException {
		int purchaseId = -1;
		dbPurchaseService.deleteById(purchaseId);
	}
}
