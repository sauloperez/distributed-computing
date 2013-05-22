package ua.be.dc.services.ticketService.db.service.test;

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
		Event event = dbEventService.getById(1);
		Assert.assertNotNull(event);
		System.out.println(event);
	}

	@Test
	public void testInsert() {
		try {
			Event event = new Event();
			event.setId(1);
			event.setName("Event name " + System.currentTimeMillis());
			
			dbEventService.insert(event);

			Assert.assertTrue(event.getId() != 0);
			
			Event createdEvent = dbEventService.getById(event.getId());
			Assert.assertNotNull(createdEvent);
			Assert.assertEquals(event.getName(), createdEvent.getName());
		} catch (DBServiceException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testUpdate() {
		try {
			int eventId = 2;
			long timestamp = System.currentTimeMillis();
			
			Event event = dbEventService.getById(eventId);
			event.setName("Test name " + timestamp);

			dbEventService.update(event);
			
			Event updatedEvent = dbEventService.getById(eventId);
			Assert.assertEquals(event.getName(), updatedEvent.getName());
		} catch (DBServiceException e) {
			e.printStackTrace();
		}
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
}
