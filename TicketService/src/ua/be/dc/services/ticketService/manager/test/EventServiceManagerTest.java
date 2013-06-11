/**
 * 
 */
package ua.be.dc.services.ticketService.manager.test;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import ua.be.dc.services.ticketService.db.service.IDBEventService;
import ua.be.dc.services.ticketService.db.service.impl.DBEventServiceImpl;
import ua.be.dc.services.ticketService.manager.EventServiceManager;
import ua.be.dc.services.ticketService.manager.IEventServiceManager;
import ua.be.dc.services.ticketService.models.Event;

/**
 * @author Pau
 *
 */
public class EventServiceManagerTest {

	private static IDBEventService dbEventService;
	private static IEventServiceManager eventServiceManager;
	
	@BeforeClass
	public static void setup() {
		dbEventService = new DBEventServiceImpl();
		eventServiceManager = new EventServiceManager();
	}
	
	@AfterClass
	public static void teardown() {
		dbEventService = null;
		eventServiceManager = null;
	}
	
	@Test
	public void testCreateEvent() {
		try {
			long timestamp = System.currentTimeMillis();
			
			Event event = new Event("testCreateEvent " + timestamp);
			event.setLocation("Ghent");
			Date date = new Date(timestamp);
			event.setDate(new Timestamp(date.getTime()));
			
			eventServiceManager.createEvent(event);
			
			Event createdEvent = dbEventService.getById(event.getId());
			Assert.assertNotNull(createdEvent);
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}
	
	@Test
	public void testDeleteEventById() {
		try {
			int eventId = 7;
			eventServiceManager.deleteEventById(eventId);
			
			Event deletedEvent = dbEventService.getById(eventId);
			Assert.assertNull(deletedEvent);
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}
	
	@Test
	public void getEvents() {
		List<Event> events = eventServiceManager.getEvents();
		int numEvents = dbEventService.getAll().size();
		
		Assert.assertEquals(numEvents, events.size());
		Assert.assertNotNull(events);
		for (Event event : events) {
			System.out.println(event);
		}
	}
}
