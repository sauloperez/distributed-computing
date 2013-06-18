package ua.be.dc.services.sellingService.db.service.test;

import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import ua.be.dc.services.sellingService.db.service.IDBEventDetailService;
import ua.be.dc.services.sellingService.db.service.IDBEventOrganizerService;
import ua.be.dc.services.sellingService.db.service.IDBOrderDetailService;
import ua.be.dc.services.sellingService.db.service.IDBTicketDetailService;
import ua.be.dc.services.sellingService.db.service.exception.DBServiceException;
import ua.be.dc.services.sellingService.db.service.impl.DBEventDetailServiceImpl;
import ua.be.dc.services.sellingService.db.service.impl.DBEventOrganizerServiceImpl;
import ua.be.dc.services.sellingService.db.service.impl.DBOrderDetailServiceImpl;
import ua.be.dc.services.sellingService.db.service.impl.DBTicketDetailServiceImpl;
import ua.be.dc.services.sellingService.models.EventDetail;
import ua.be.dc.services.sellingService.models.EventOrganizer;
import ua.be.dc.services.sellingService.models.OrderDetail;
import ua.be.dc.services.sellingService.models.TicketDetail;
import ua.be.dc.services.ticketService.service.Event;
import ua.be.dc.services.ticketService.service.Ticket;
import ua.be.dc.services.ticketService.service.TicketService;
import ua.be.dc.services.ticketService.service.TicketServiceFactory;

public class DBTicketDetailServiceTest {
	
	private static IDBOrderDetailService dbOrderDetailService;
	private static IDBTicketDetailService dbTicketDetailService;
	private static IDBEventOrganizerService dbEventOrganizerService;
	private static IDBEventDetailService dbEventDetailService;
	private static TicketService ticketService;

	@Before
	public void setUp() throws Exception {
		dbOrderDetailService = new DBOrderDetailServiceImpl();
		dbTicketDetailService = new DBTicketDetailServiceImpl();
		dbEventOrganizerService = new DBEventOrganizerServiceImpl();
		dbEventDetailService = new DBEventDetailServiceImpl();
		ticketService = TicketServiceFactory.getService();
	}

	@After
	public void tearDown() throws Exception {
		dbOrderDetailService = null;
		dbTicketDetailService = null;
		dbEventOrganizerService = null;
		dbEventDetailService = null;
		ticketService = null;
	}

	@Test
	public final void testGetById() {
		int ticketDetailId = 1;
		
		TicketDetail ticketDetail = dbTicketDetailService.getById(ticketDetailId);
		Assert.assertNotNull(ticketDetail);
		System.out.println(ticketDetail.getEventDetail().getId());
		System.out.println(ticketDetail.getOrderDetail().getId());
	}

	@Test
	public final void testGetAll() {
		List<TicketDetail> ticketDetails = dbTicketDetailService.getAll();
		Assert.assertNotNull(ticketDetails);
		for (TicketDetail ticketDetail : ticketDetails) {
			System.out.println(ticketDetail);
		}
	}
	
	@Test
	public final void testGetByOrderDetailId() {
		int orderDetailId = 1;
		
		List<TicketDetail> ticketDetails = dbTicketDetailService.getByOrderDetailId(orderDetailId);
		Assert.assertNotNull(ticketDetails);
		for (TicketDetail ticketDetail : ticketDetails) {
			System.out.println(ticketDetail);
		}
	}

	@Test
	public final void testInsert() {
		try {
			// The eventOrganizer must contain the ticket
			int eventOrganizerId = 1;
			int ticketId = 14;
			int orderDetailId = 1;
			
			// Get the orderDetail the ticketDetail belongs to
			OrderDetail orderDetail = dbOrderDetailService.getById(orderDetailId);
			
			// Get the ticket and event information from the web service
			EventOrganizer eventOrganizer = dbEventOrganizerService.getById(eventOrganizerId);
			Ticket ticket = ticketService.getTicketById(ticketId);
			Event event = ticket.getEvent();
			
			// Build its event detail and insert it in DB
			EventDetail eventDetail = new EventDetail();
			eventDetail.setEventOrganizer(eventOrganizer);
			eventDetail.setEventToken(event.getToken());
			
			dbEventDetailService.insert(eventDetail);
			
			// Build the ticket detail and insert it in DB
			TicketDetail ticketDetail = new TicketDetail();
			ticketDetail.setTicketId(ticket.getId());
			ticketDetail.setEventDetail(eventDetail);
			ticketDetail.setOrderDetail(orderDetail);

			dbTicketDetailService.insert(ticketDetail);
			
			Assert.assertTrue(ticketDetail.getId() != 0);
			
			TicketDetail createdTicketDetail = dbTicketDetailService.getById(ticketDetail.getId());
			Assert.assertNotNull(createdTicketDetail);
			Assert.assertEquals(ticketDetail.getTicketId(), createdTicketDetail.getTicketId());
			Assert.assertEquals(ticketDetail.getEventDetail().getEventToken(), createdTicketDetail.getEventDetail().getEventToken());
			Assert.assertEquals(ticketDetail.getOrderDetail().getId(), createdTicketDetail.getOrderDetail().getId());
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}

	@Test
	public final void testUpdate() {
		try {
			// The eventOrganizer must contain the ticket
			int ticketDetailId = 1;
			int eventOrganizerId = 1;
			int ticketId = 15;
			int orderDetailId = 2;
			
			// Get the orderDetail the ticketDetail belongs to
			OrderDetail orderDetail = dbOrderDetailService.getById(orderDetailId);
			
			// Get the ticket and event information from the web service
			EventOrganizer eventOrganizer = dbEventOrganizerService.getById(eventOrganizerId);
			Ticket ticket = ticketService.getTicketById(ticketId);
			Event event = ticket.getEvent();
			
			TicketDetail ticketDetail = dbTicketDetailService.getById(ticketDetailId);
			ticketDetail.setTicketId(ticket.getId());
			
			// Update its eventDetail
			EventDetail eventDetail = ticketDetail.getEventDetail();
			eventDetail.setEventOrganizer(eventOrganizer);
			eventDetail.setEventToken(event.getToken());
			
			ticketDetail.setEventDetail(eventDetail);
			ticketDetail.setOrderDetail(orderDetail);
			
			dbEventDetailService.update(eventDetail);
			
			dbTicketDetailService.update(ticketDetail);
			
			Assert.assertTrue(ticketDetail.getId() != 0);
			
			TicketDetail createdTicketDetail = dbTicketDetailService.getById(ticketDetail.getId());
			Assert.assertNotNull(createdTicketDetail);
			Assert.assertEquals(ticketDetail.getTicketId(), createdTicketDetail.getTicketId());
			Assert.assertEquals(ticketDetail.getEventDetail().getEventToken(), createdTicketDetail.getEventDetail().getEventToken());
			Assert.assertEquals(ticketDetail.getOrderDetail().getId(), createdTicketDetail.getOrderDetail().getId());
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}
	
	@Test(expected = DBServiceException.class)
	public void testUpdateByInvalidTicketDetail() throws DBServiceException {
		dbTicketDetailService.update(new TicketDetail());
	}

	@Test
	public void testDelete() {
		try {
			int ticketDetailId = 10;
			
			dbTicketDetailService.deleteById(ticketDetailId);
			
			TicketDetail deletedTicketDetail = dbTicketDetailService.getById(3);
			Assert.assertNull(deletedTicketDetail);
		} catch (DBServiceException e) {
			e.printStackTrace();
		}
	}
	
	@Test(expected = DBServiceException.class)
	public void testDeleteByInvalidId() throws DBServiceException {
		int ticketDetailId = -1;
		dbTicketDetailService.deleteById(ticketDetailId);
	}
}
