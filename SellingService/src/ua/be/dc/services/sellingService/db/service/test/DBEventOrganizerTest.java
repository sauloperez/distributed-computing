package ua.be.dc.services.sellingService.db.service.test;

import java.util.List;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import ua.be.dc.services.sellingService.db.service.IDBEventOrganizerService;
import ua.be.dc.services.sellingService.db.service.exception.DBServiceException;
import ua.be.dc.services.sellingService.db.service.impl.DBEventOrganizerImpl;
import ua.be.dc.services.sellingService.models.EventOrganizer;

public class DBEventOrganizerTest {

	private static IDBEventOrganizerService dbEventOrganizerService;
	
	@BeforeClass
	public static void setup() {
		dbEventOrganizerService = new DBEventOrganizerImpl();
	}
	
	@AfterClass
	public static void teardown() {
		dbEventOrganizerService = null;
	}
	
	@Test
	public void testGetById() {
		int eventOrganizerId = 1;
		EventOrganizer eventOrganizer = dbEventOrganizerService.getById(eventOrganizerId);
		Assert.assertNotNull(eventOrganizer);
		
		System.out.println(eventOrganizerId);
	}
	
	@Test
	public void testGetAll() {
		List<EventOrganizer> eventOrganizers = dbEventOrganizerService.getAll();
		Assert.assertNotNull(eventOrganizers);
		for (EventOrganizer eventOrganizer : eventOrganizers) {
			System.out.println(eventOrganizer);
		}
	}
	
	@Test
	public void testInsert() {
		try {
			long timestamp = System.currentTimeMillis();
			
			EventOrganizer eventOrganizer = new EventOrganizer();
			eventOrganizer.setServiceEndpoint("http://localhost:8080/TestEventOrganizer/" + timestamp);
			
			dbEventOrganizerService.insert(eventOrganizer);
			
			Assert.assertTrue(eventOrganizer.getId() != 0);
			
			EventOrganizer createdEventOrganizer = dbEventOrganizerService.getById(eventOrganizer.getId());
			Assert.assertNotNull(createdEventOrganizer);
			Assert.assertEquals(eventOrganizer.getServiceEndpoint(), createdEventOrganizer.getServiceEndpoint());
		} catch (DBServiceException e) {
			e.printStackTrace();
		}
	}
	
	@Test(expected = DBServiceException.class)
	public void testInsertEmpty() throws DBServiceException {
		dbEventOrganizerService.insert(new EventOrganizer());
	}
	
	@Test
	public void testUpdate() {
		try {
			int eventOrganizerId = 2;
			long timestamp = System.currentTimeMillis();
			
			EventOrganizer eventOrganizer = dbEventOrganizerService.getById(eventOrganizerId);
			eventOrganizer.setServiceEndpoint("http://localhost:8080/TestUpdateEventOrganizer/" + timestamp);
			
			dbEventOrganizerService.update(eventOrganizer);
			
			EventOrganizer updatedEventOrganizer =  dbEventOrganizerService.getById(eventOrganizerId);
			
			Assert.assertEquals(eventOrganizer.getServiceEndpoint(), updatedEventOrganizer.getServiceEndpoint());
		} catch (DBServiceException e) {
			e.printStackTrace();
		}
	}

	@Test(expected = DBServiceException.class)
	public void testUpdateByInvalidEventOrganizer() throws DBServiceException {
		dbEventOrganizerService.update(new EventOrganizer());
	}
	
	@Test
	public void testDelete() {
		try {
			int eventOrganizerId = 3;
			EventOrganizer eventOrganizer = dbEventOrganizerService.getById(eventOrganizerId);
			
			dbEventOrganizerService.deleteById(eventOrganizer.getId());
			
			EventOrganizer deletedEventOrganizer = dbEventOrganizerService.getById(eventOrganizerId);
			Assert.assertNull(deletedEventOrganizer);
		} catch (DBServiceException e) {
			e.printStackTrace();
		}
	}
	
	@Test(expected = DBServiceException.class)
	public void testDeleteByInvalidId() throws DBServiceException {
		int eventOrganizerId = -1;
		dbEventOrganizerService.deleteById(eventOrganizerId);
	}
}
