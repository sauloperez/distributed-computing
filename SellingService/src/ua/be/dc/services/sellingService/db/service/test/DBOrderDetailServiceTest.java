package ua.be.dc.services.sellingService.db.service.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import sun.util.logging.resources.logging;
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
import ua.be.dc.services.sellingService.models.Order;
import ua.be.dc.services.sellingService.models.OrderDetail;
import ua.be.dc.services.sellingService.models.TicketDetail;
import ua.be.dc.services.sellingService.service.exception.InvalidTicketException;
import ua.be.dc.services.ticketService.service.Event;
import ua.be.dc.services.ticketService.service.Ticket;
import ua.be.dc.services.ticketService.service.TicketService;
import ua.be.dc.services.ticketService.service.TicketServiceFactory;

public class DBOrderDetailServiceTest {

	private static IDBOrderDetailService dbOrderDetailService;
	private static IDBEventOrganizerService dbEventOrganizerService;
	private static IDBEventDetailService dbEventDetailService;
	private static IDBTicketDetailService dbTicketDetailService;
	private static TicketService ticketService;

	@Before
	public void setUp() throws Exception {
		dbOrderDetailService = new DBOrderDetailServiceImpl();
		dbEventDetailService = new DBEventDetailServiceImpl();
		dbEventOrganizerService = new DBEventOrganizerServiceImpl();
		dbTicketDetailService = new DBTicketDetailServiceImpl();
		ticketService = TicketServiceFactory.getService();
	}

	@After
	public void tearDown() throws Exception {
		dbOrderDetailService = null;
		dbEventDetailService = null;
		dbEventOrganizerService = null;
		dbTicketDetailService = null;
		ticketService = null;
	}

	@Test
	public final void testGetById() {
		int orderDetailId = 1;
		
		OrderDetail orderDetail = dbOrderDetailService.getById(orderDetailId);
		Assert.assertNotNull(orderDetail);
		System.out.println(orderDetail.getTicketsDetails().size());
	}

	@Test
	public final void testGetAll() {
		List<OrderDetail> orderDetails = dbOrderDetailService.getAll();
		Assert.assertNotNull(orderDetails);
		for (OrderDetail orderDetail : orderDetails) {
			System.out.println(orderDetail);
		}
	}
	
	@Test
	public final void testGetByOrderId() {
		int orderId = 1;
		
		List<OrderDetail> orderDetails = dbOrderDetailService.getByOrderId(orderId);
		Assert.assertNotNull(orderDetails);
		for (OrderDetail orderDetail : orderDetails) {
			System.out.println(orderDetail);
		}
	}

	@Test
	public final void testInsert() {
		try {
			// The eventOrganizer must contain the ticket
			int eventOrganizerId = 1;
			int ticketId = 14;
			int orderId = 1;
			
			// Get the order the orderDetail will belong to
			Order order = new Order();
			order.setId(orderId);
			
			// Get the ticket and event information from the web service
			EventOrganizer eventOrganizer = dbEventOrganizerService.getById(eventOrganizerId);
			Ticket ticket = ticketService.getTicketById(ticketId);
			Event event = ticket.getEvent();
			
			// Build the event detail and insert it in DB
			EventDetail eventDetail = new EventDetail();
			eventDetail.setEventOrganizer(eventOrganizer);
			eventDetail.setEventToken(event.getToken());
			
			dbEventDetailService.insert(eventDetail);
			
			// Build the ticket detail and insert it in DB
			TicketDetail ticketDetail = new TicketDetail();
			ticketDetail.setTicketId(ticket.getId());
			ticketDetail.setEventDetail(eventDetail);

			dbTicketDetailService.insert(ticketDetail);
			
			// Build the order detail and insert it in DB
			List<TicketDetail> ticketsDetails = new ArrayList<>();
			ticketsDetails.add(ticketDetail);

			OrderDetail orderDetail = new OrderDetail();
			orderDetail.setTicketsDetails(ticketsDetails);
			orderDetail.setPrice(ticket.getPrice());
			orderDetail.setName("Test orderDetail name");
			orderDetail.setOrder(order);
			
			dbOrderDetailService.insert(orderDetail);
			
			// Set the assigned orderDetail id to the ticketDetail
			ticketDetail.setOrderDetail(orderDetail);
			dbTicketDetailService.update(ticketDetail);
			
			// Add order details to the order
			List<OrderDetail> orderDetails = new ArrayList<OrderDetail>();
			orderDetails.add(orderDetail);
			order.setOrderDetails(orderDetails);
		
			Assert.assertTrue(orderDetail.getId() != 0);
			
			OrderDetail createdOrderDetail = dbOrderDetailService.getById(orderDetail.getId());
			Assert.assertNotNull(createdOrderDetail);
			Assert.assertEquals(orderDetail.getName(), createdOrderDetail.getName());
			Assert.assertEquals(orderDetail.getPrice(), createdOrderDetail.getPrice());
			TicketDetail tDetail = orderDetail.getTicketsDetails().get(0);
			TicketDetail ctDetail = createdOrderDetail.getTicketsDetails().get(0);
			Assert.assertEquals(tDetail.getId(), ctDetail.getId());
			Assert.assertEquals(orderDetail.getOrder(), order);
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}

	@Test
	public final void testUpdate() {
		try {
			// The eventOrganizer must contain the ticket
			int eventOrganizerId = 1;
			int ticketId = 15;
			
			// The order must contain the orderDetail
			int orderId = 1;
			int orderDetailId = 1;
			
			OrderDetail orderDetail = dbOrderDetailService.getById(orderDetailId);
			TicketDetail ticketDetail = orderDetail.getTicketsDetails().get(0);
			ticketDetail = dbTicketDetailService.getById(ticketDetail.getId());
			
			// Get the order the orderDetail will belong to
			Order order = new Order();
			order.setId(orderId);
			
			// Get the ticket and event information from the web service
			EventOrganizer eventOrganizer = dbEventOrganizerService.getById(eventOrganizerId);
			Ticket ticket = ticketService.getTicketById(ticketId);
			Event event = ticket.getEvent();
			
			// Update the event detail
			EventDetail eventDetail = ticketDetail.getEventDetail();
			eventDetail.setEventOrganizer(eventOrganizer);
			eventDetail.setEventToken(event.getToken());
			
			dbEventDetailService.update(eventDetail);
			
			// Update the ticket detail
			ticketDetail.setTicketId(ticket.getId());
//			ticketDetail.setEventDetail(eventDetail);

			dbTicketDetailService.update(ticketDetail);
			
			// Update the order detail
			List<TicketDetail> ticketsDetails = orderDetail.getTicketsDetails();
			ticketsDetails.set(0, ticketDetail);

//			orderDetail.setTicketsDetails(ticketsDetails);
			orderDetail.setPrice(ticket.getPrice());
			orderDetail.setName("Test orderDetail name");
			orderDetail.setOrder(order);
			
			dbOrderDetailService.update(orderDetail);
			
			// Set the assigned orderDetail id to the ticketDetail
			ticketDetail.setOrderDetail(orderDetail);
			dbTicketDetailService.update(ticketDetail);
			
			// Add order details to the order
			List<OrderDetail> orderDetails = new ArrayList<OrderDetail>();
			orderDetails.add(orderDetail);
			order.setOrderDetails(orderDetails);
		
			Assert.assertTrue(orderDetail.getId() != 0);
			
			OrderDetail createdOrderDetail = dbOrderDetailService.getById(orderDetail.getId());
			Assert.assertNotNull(createdOrderDetail);
			Assert.assertEquals(orderDetail.getName(), createdOrderDetail.getName());
			Assert.assertEquals(orderDetail.getPrice(), createdOrderDetail.getPrice());
			TicketDetail tDetail = orderDetail.getTicketsDetails().get(0);
			TicketDetail ctDetail = createdOrderDetail.getTicketsDetails().get(0);
			Assert.assertEquals(tDetail.getId(), ctDetail.getId());
			Assert.assertEquals(orderDetail.getOrder(), order);
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}
	
	@Test(expected = DBServiceException.class)
	public void testUpdateByInvalidOrderDetail() throws DBServiceException {
		dbOrderDetailService.update(new OrderDetail());
	}

	@Test
	public void testDelete() {
		try {
			int orderDetailId = 3;
			
			dbOrderDetailService.deleteById(orderDetailId);
			
			OrderDetail deletedOrderDetail = dbOrderDetailService.getById(3);
			Assert.assertNull(deletedOrderDetail);
		} catch (DBServiceException e) {
			e.printStackTrace();
		}
	}
	
	@Test(expected = DBServiceException.class)
	public void testDeleteByInvalidId() throws DBServiceException {
		int orderDetailId = -1;
		dbOrderDetailService.deleteById(orderDetailId);
	}

}
