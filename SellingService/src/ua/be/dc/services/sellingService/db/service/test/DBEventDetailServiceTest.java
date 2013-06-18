package ua.be.dc.services.sellingService.db.service.test;

import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import ua.be.dc.services.sellingService.db.service.IDBEventDetailService;
import ua.be.dc.services.sellingService.db.service.IDBEventOrganizerService;
import ua.be.dc.services.sellingService.db.service.exception.DBServiceException;
import ua.be.dc.services.sellingService.db.service.impl.DBEventDetailServiceImpl;
import ua.be.dc.services.sellingService.db.service.impl.DBEventOrganizerServiceImpl;
import ua.be.dc.services.sellingService.models.EventDetail;
import ua.be.dc.services.sellingService.models.EventOrganizer;
import ua.be.dc.services.ticketService.service.Event;
import ua.be.dc.services.ticketService.service.Ticket;
import ua.be.dc.services.ticketService.service.TicketService;
import ua.be.dc.services.ticketService.service.TicketServiceFactory;

public class DBEventDetailServiceTest {
	
	private static IDBEventDetailService dbEventDetailService;
	private static IDBEventOrganizerService dbEventOrganizerService;
	private static TicketService ticketService;

	@Before
	public void setUp() throws Exception {
		dbEventDetailService = new DBEventDetailServiceImpl();
		dbEventOrganizerService = new DBEventOrganizerServiceImpl();
		ticketService = TicketServiceFactory.getService();
	}

	@After
	public void tearDown() throws Exception {
		dbEventDetailService = null;
		dbEventOrganizerService = null;
		ticketService = null;
	}

	@Test
	public final void testGetById() {
		int eventDetailId = 12;
		
		EventDetail eventDetail = dbEventDetailService.getById(eventDetailId);
		Assert.assertNotNull(eventDetail);
		System.out.println(eventDetail);
	}

	@Test
	public final void testGetAll() {
		List<EventDetail> eventDetails = dbEventDetailService.getAll();
		Assert.assertNotNull(eventDetails);
		for (EventDetail eventDetail : eventDetails) {
			System.out.println(eventDetail);
		}
	}

	@Test
	public final void testInsert() {
		try {
			int eventOrganizerId = 1;
			int eventId = 21;

			EventOrganizer eventOrganizer = dbEventOrganizerService.getById(eventOrganizerId);
			ticketService = TicketServiceFactory.getService(eventOrganizer.getServiceEndpoint());
			Event event = ticketService.getEventById(eventId);
			
			EventDetail eventDetail = new EventDetail();
			eventDetail.setEventOrganizer(eventOrganizer);
			eventDetail.setEventToken(event.getToken());
			
			dbEventDetailService.insert(eventDetail);
			
			Assert.assertTrue(eventDetail.getId() != 0);
			
			EventDetail createdEventDetail = dbEventDetailService.getById(eventDetail.getId());
			Assert.assertNotNull(createdEventDetail);
			Assert.assertEquals(eventDetail.getEventOrganizer().getId(), createdEventDetail.getEventOrganizer().getId());
			Assert.assertEquals(eventDetail.getEventToken(), createdEventDetail.getEventToken());
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}

	@Test
	public final void testUpdate() {
		try {
			int eventDetailId = 2;
			int eventOrganizerId = 1;
			int eventId = 23;

			EventOrganizer eventOrganizer = dbEventOrganizerService.getById(eventOrganizerId);
			ticketService = TicketServiceFactory.getService(eventOrganizer.getServiceEndpoint());
			Event event = ticketService.getEventById(eventId);
			
			EventDetail eventDetail = dbEventDetailService.getById(eventDetailId);
			eventDetail.setEventOrganizer(eventOrganizer);
			eventDetail.setEventToken(event.getToken());
			
			dbEventDetailService.update(eventDetail);
			
			Assert.assertTrue(eventDetail.getId() != 0);
			
			EventDetail updatedEventDetail = dbEventDetailService.getById(eventDetail.getId());
			Assert.assertNotNull(updatedEventDetail);
			Assert.assertEquals(eventDetail.getEventOrganizer().getId(), updatedEventDetail.getEventOrganizer().getId());
			Assert.assertEquals(eventDetail.getEventToken(), updatedEventDetail.getEventToken());
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}
	
	@Test(expected = DBServiceException.class)
	public void testUpdateByInvalidEventDetail() throws DBServiceException {
		dbEventDetailService.update(new EventDetail());
	}

	@Test
	public void testDelete() {
		try {
			int eventDetailId = 21;
			
			dbEventDetailService.deleteById(eventDetailId);
			
			EventDetail deletedEventDetail = dbEventDetailService.getById(3);
			Assert.assertNull(deletedEventDetail);
		} catch (DBServiceException e) {
			e.printStackTrace();
		}
	}
	
	@Test(expected = DBServiceException.class)
	public void testDeleteByInvalidId() throws DBServiceException {
		int eventDetailId = -1;
		dbEventDetailService.deleteById(eventDetailId);
	}
}
