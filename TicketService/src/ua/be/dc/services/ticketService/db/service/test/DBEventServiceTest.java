package ua.be.dc.services.ticketService.db.service.test;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import ua.be.dc.services.ticketService.db.service.IDBEventService;
import ua.be.dc.services.ticketService.db.service.exception.DBServiceException;
import ua.be.dc.services.ticketService.db.service.impl.DBEventServiceImpl;
import ua.be.dc.services.ticketService.models.Event;

public class DBEventServiceTest {
	
	private static IDBEventService dbEventService;

	@BeforeClass
	public static void setup() {
		dbEventService = new DBEventServiceImpl();
	}
	
	@AfterClass
	public static void teardown() {
		dbEventService = null;
	}

	@Test
	public void testGetAll() {
		List<Event> events = dbEventService.getAll();
		Assert.assertNotNull(events);
		for (Event event : events) {
			System.out.println(event);
		}
	}

	@Test
	public void testGetById() {
		int eventId = 2;
		Event event = dbEventService.getById(eventId);
		Assert.assertNotNull(event);
		System.out.println(event);
	}

	@Test
	public void testInsert() {
		try {
			long timestamp = System.currentTimeMillis();
			
			Event event = new Event();
			event.setName("Event name " + timestamp);
			event.setLocation("Antwerpen");
			Date date = new Date(timestamp);
			event.setDate(new Timestamp(date.getTime()));
			
			dbEventService.insert(event);

			Assert.assertTrue(event.getId() != 0);
			
			Event createdEvent = dbEventService.getById(event.getId());
			Assert.assertNotNull(createdEvent);
			Assert.assertEquals(event.getName(), createdEvent.getName());
		} catch (DBServiceException e) {
			e.printStackTrace();
		}
	}
	
	@Test(expected = DBServiceException.class)
	public void testInsertEmpty() throws DBServiceException {
		dbEventService.insert(new Event());
	}

	@Test
	public void testUpdate() {
		try {
			int eventId = 2;
			long timestamp = System.currentTimeMillis();
			
			Event event = dbEventService.getById(eventId);
			event.setName("Test name " + timestamp);
			event.setLocation("Barcelona");
			Date date = new Date(timestamp);
			event.setDate(new Timestamp(date.getTime()));

			dbEventService.update(event);
			
			Event updatedEvent = dbEventService.getById(eventId);
			
			Assert.assertEquals(event.getName(), updatedEvent.getName());
			Assert.assertEquals(event.getLocation(), updatedEvent.getLocation());
		} catch (DBServiceException e) {
			e.printStackTrace();
		}
	}
	
	@Test(expected = DBServiceException.class)
	public void testUpdateByInvalidEvent() throws DBServiceException {
		dbEventService.update(new Event());
	}

	@Test
	public void testDelete() {
		try {
			int eventId = 3;
			Event event = dbEventService.getById(eventId);
			
			dbEventService.deleteById(event.getId());
			
			Event deletedEvent = dbEventService.getById(eventId);
			Assert.assertNull(deletedEvent);
		} catch (DBServiceException e) {
			e.printStackTrace();
		}
	}
	
	@Test(expected = DBServiceException.class)
	public void testDeleteByInvalidId() throws DBServiceException {
		int eventId = -1;
		dbEventService.deleteById(eventId);
	}
}
