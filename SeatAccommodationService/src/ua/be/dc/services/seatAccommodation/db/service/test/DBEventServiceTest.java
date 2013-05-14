package ua.be.dc.services.seatAccommodation.db.service.test;

import java.util.List;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import ua.be.dc.services.seatAccommodation.db.service.IDBEventService;
import ua.be.dc.services.seatAccommodation.db.service.exception.DBServiceException;
import ua.be.dc.services.seatAccommodation.db.service.impl.DBEventServiceImpl;
import ua.be.dc.services.seatAccommodation.models.Event;

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
	public void testGetByInvalidId() {
		Event event = dbEventService.getById(-1);
		Assert.assertNull(event);
	}

	@Test
	public void testInsert() {
		try {
			Event event = new Event();
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
	
	@Test(expected = DBServiceException.class)
	public void testInsertEmpty() throws DBServiceException {
		dbEventService.insert(new Event());
	}

	@Test
	public void testUpdate() {
		try {
			long timestamp = System.currentTimeMillis();
			
			Event event = dbEventService.getById(1);
			event.setName("Test name " + timestamp);

			dbEventService.update(event);
			
			Event updatedEvent = dbEventService.getById(1);
			Assert.assertEquals(event.getName(), updatedEvent.getName());
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
			Event event = dbEventService.getById(1);
			dbEventService.deleteById(event.getId());
			
			Event deletedEvent = dbEventService.getById(1);
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
