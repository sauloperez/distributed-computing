package ua.be.dc.services.sellingService.manager.test;

import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import ua.be.dc.services.sellingService.db.service.IDBEventOrganizerService;
import ua.be.dc.services.sellingService.db.service.impl.DBEventOrganizerServiceImpl;
import ua.be.dc.services.sellingService.manager.EventOrganizerManager;
import ua.be.dc.services.sellingService.manager.IEventOrganizerServiceManager;
import ua.be.dc.services.sellingService.models.EventOrganizer;

public class EventOrganizerManagerTest {

	private static IDBEventOrganizerService dbEventOrganizerService;
	private static IEventOrganizerServiceManager eventOrganizerServiceManager;
	
	@Before
	public void setUp() throws Exception {
		dbEventOrganizerService = new DBEventOrganizerServiceImpl();
		eventOrganizerServiceManager = new EventOrganizerManager();
	}

	@After
	public void tearDown() throws Exception {
		dbEventOrganizerService = null;
		eventOrganizerServiceManager = null;
	}

	@Test
	public final void testAddEventOrganizer() {
		try {
			EventOrganizer eventOrganizer = new EventOrganizer();
			eventOrganizer.setServiceEndpoint("testEndpoint");
			eventOrganizerServiceManager.addEventOrganizer(eventOrganizer);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public final void testDeleteEventOrganizerById() {
		try {
			int eventOrganizerId = 3;
			eventOrganizerServiceManager.deleteEventOrganizerById(eventOrganizerId);
			
			EventOrganizer deletedEventOrganizer = dbEventOrganizerService.getById(eventOrganizerId);
			Assert.assertNull(deletedEventOrganizer);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public final void testGetEventOrganizers() {
		List<EventOrganizer> eos = eventOrganizerServiceManager.getEventOrganizers();
		int numEos = dbEventOrganizerService.getAll().size();
		
		Assert.assertEquals(numEos, eos.size());
		Assert.assertNotNull(eos);
		for (EventOrganizer eventOrganizer : eos) {
			System.out.println(eventOrganizer);
		}
	}

}
