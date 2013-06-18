package ua.be.dc.services.sellingService.db.service.test;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import ua.be.dc.services.sellingService.db.service.IDBCustomerService;
import ua.be.dc.services.sellingService.db.service.IDBEventDetailService;
import ua.be.dc.services.sellingService.db.service.IDBEventOrganizerService;
import ua.be.dc.services.sellingService.db.service.IDBOrderDetailService;
import ua.be.dc.services.sellingService.db.service.IDBOrderService;
import ua.be.dc.services.sellingService.db.service.IDBTicketDetailService;
import ua.be.dc.services.sellingService.db.service.exception.DBServiceException;
import ua.be.dc.services.sellingService.db.service.impl.DBCustomerServiceImpl;
import ua.be.dc.services.sellingService.db.service.impl.DBEventDetailServiceImpl;
import ua.be.dc.services.sellingService.db.service.impl.DBEventOrganizerServiceImpl;
import ua.be.dc.services.sellingService.db.service.impl.DBOrderDetailServiceImpl;
import ua.be.dc.services.sellingService.db.service.impl.DBOrderServiceImpl;
import ua.be.dc.services.sellingService.db.service.impl.DBTicketDetailServiceImpl;
import ua.be.dc.services.sellingService.models.Customer;
import ua.be.dc.services.sellingService.models.EventDetail;
import ua.be.dc.services.sellingService.models.EventOrganizer;
import ua.be.dc.services.sellingService.models.Order;
import ua.be.dc.services.sellingService.models.OrderDetail;
import ua.be.dc.services.sellingService.models.TicketDetail;
import ua.be.dc.services.ticketService.service.Event;
import ua.be.dc.services.ticketService.service.Ticket;
import ua.be.dc.services.ticketService.service.TicketService;
import ua.be.dc.services.ticketService.service.TicketServiceFactory;

public class DBOrderServiceTest {
	
	private static IDBOrderService dbOrderService;
	private static IDBCustomerService dbCustomerService;
	private static IDBOrderDetailService dbOrderDetailService;
	private static IDBEventOrganizerService dbEventOrganizerService;
	private static IDBEventDetailService dbEventDetailService;
	private static IDBTicketDetailService dbTicketDetailService;
	private static TicketService ticketService;

	@Before
	public void setUp() throws Exception {
		dbOrderService = new DBOrderServiceImpl();
		dbCustomerService = new DBCustomerServiceImpl();
		dbOrderDetailService = new DBOrderDetailServiceImpl();
		dbEventDetailService = new DBEventDetailServiceImpl();
		dbEventOrganizerService = new DBEventOrganizerServiceImpl();
		dbTicketDetailService = new DBTicketDetailServiceImpl();
		ticketService = TicketServiceFactory.getService();
	}

	@After
	public void tearDown() throws Exception {
		dbOrderService = null;
		dbCustomerService = null;
		dbOrderDetailService = null;
		dbEventDetailService = null;
		dbEventOrganizerService = null;
		dbTicketDetailService = null;
		ticketService = null;
	}
	
	@Test
	public final void testGetById() {
		int orderId = 1;
		Order order = dbOrderService.getById(orderId);
		Assert.assertNotNull(order);
		System.out.println(order.getOrderDetails().size());
	}

	@Test
	public final void testGetOrderByToken() {
		String token = "EC-0C3558285T360471F";
		Order order = dbOrderService.getOrderByToken(token);
		Assert.assertNotNull(order);
		System.out.println(order);
	}

	@Test
	public final void testGetAll() {
		List<Order> orders = dbOrderService.getAll();
		Assert.assertNotNull(orders);
		for (Order order : orders) {
			System.out.println(order);
		}
	}

	@Test
	public final void testInsert() {
		try {
			// The eventOrganizer must contain the ticket
			int eventOrganizerId = 1;
			int ticketId = 15;
			
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
			
			// Build the customer 
			Customer customer = new Customer();
			customer.setName("Test name");
			customer.setSurname("Test surname");
			customer.setCountry("Catalunya");
			customer.setAddress("Carrer Mossèn Camill Rossell, 82, 3r 1ª");
			customer.setEmail("test@test.com");
			customer.setPhone("999999999");
		
			dbCustomerService.insert(customer);
			
			// Insert in the DB with the data gathered so far to get its id
			Order order = new Order();
			order.setCustomer(customer);
			order.setTotalPrice(0f);
			
			dbOrderService.insert(order);
			
			// Build the order detail and insert it in DB
			OrderDetail orderDetail = new OrderDetail();
			List<TicketDetail> ticketsDetails = new ArrayList<>();
			ticketsDetails.add(ticketDetail);
			orderDetail.setTicketsDetails(ticketsDetails);
			orderDetail.setPrice(ticket.getPrice());
			orderDetail.setName("Test orderDetail name");
			orderDetail.setOrder(order);
			
			dbOrderDetailService.insert(orderDetail);
			
			// Update the ticketDetail with the orderDetail it belongs to
			ticketDetail.setOrderDetail(orderDetail);
			dbTicketDetailService.update(ticketDetail);
			
			// Update the order with the stored orderDetails
			List<OrderDetail> orderDetails = new ArrayList<>();
			orderDetails.add(orderDetail);
			order.setOrderDetails(orderDetails);
			order.setTotalPrice(orderDetail.getPrice());
			
			dbOrderService.update(order);
			
			Assert.assertTrue(order.getId() != 0);
			
			Order createdOrder = dbOrderService.getById(order.getId());
			Assert.assertNotNull(createdOrder);
			Assert.assertNull(createdOrder.getPurchased());
			Assert.assertNull(createdOrder.getTransactionId());
			Assert.assertNotNull(createdOrder.getCreated());
			Assert.assertNotNull(createdOrder.getTotalPrice());
			Assert.assertNotNull(createdOrder.getOrderDetails());
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}
	
	@Test(expected = DBServiceException.class)
	public void testInsertEmpty() throws DBServiceException {
		dbOrderService.insert(new Order());
	}
	
	/**
	 * NOTE that we assume an Order contains only one OrderDetail
	 * and the OrderDetail only contains one TicketDetail
	 */
	@Test
	public final void testUpdate() {
		try {
			// The eventOrganizer must contain the ticket
			int eventOrganizerId = 1;
			int ticketId = 14;
			int orderId = 39;
			
			// Get the order and its components
			Order order = dbOrderService.getById(orderId);
			List<OrderDetail> orderDetails = dbOrderDetailService.getByOrderId(orderId);
			order.setOrderDetails(orderDetails);
			
			OrderDetail orderDetail = orderDetails.get(0);
			
			System.out.println("orderDetail = " + orderDetail.getId());
			
			List<TicketDetail> ticketDetails = dbTicketDetailService.getByOrderDetailId(orderDetail.getId());
			
			System.out.println("ticketDetail = " + ticketDetails.get(0).getId());
			
			TicketDetail ticketDetail = dbTicketDetailService.getById(ticketDetails.get(0).getId());
			
			// Get the ticket and event information from the web service
			EventOrganizer eventOrganizer = dbEventOrganizerService.getById(eventOrganizerId);
			Ticket ticket = ticketService.getTicketById(ticketId);
			Event event = ticket.getEvent();
			
			// Update the event detail
			EventDetail eventDetail = dbEventDetailService.getById(ticketDetail.getId());
			eventDetail.setEventOrganizer(eventOrganizer);
			eventDetail.setEventToken(event.getToken());

			dbEventDetailService.update(eventDetail);
			
			// Update the ticketDetail
			ticketDetail.setTicketId(ticket.getId());
			dbTicketDetailService.update(ticketDetail);
			
			// Update the order detail
			orderDetail.setPrice(ticket.getPrice());
			dbOrderDetailService.update(orderDetail);
			
			// Update the order
			order.setTotalPrice(orderDetail.getPrice());
			dbOrderService.update(order);
			
			Order updatedOrder = dbOrderService.getById(order.getId());
			Assert.assertNotNull(updatedOrder);
			Assert.assertNull(updatedOrder.getPurchased());
			Assert.assertNull(updatedOrder.getTransactionId());
			Assert.assertNotNull(updatedOrder.getCreated());
			
			OrderDetail updatedOrderDetail = dbOrderDetailService.getById(order.getOrderDetails().get(0).getId());
			Assert.assertEquals(order.getId(), updatedOrderDetail.getOrder().getId());
			Assert.assertEquals(updatedOrderDetail.getPrice(), order.getTotalPrice());
			Assert.assertEquals(updatedOrderDetail.getTicketsDetails().get(0).getId(), order.getOrderDetails().get(0).getTicketsDetails().get(0).getId());
		
			TicketDetail updatedTicketDetail = dbTicketDetailService.getById(updatedOrderDetail.getTicketsDetails().get(0).getId());
			Assert.assertEquals(updatedOrderDetail.getId(), updatedTicketDetail.getOrderDetail().getId());
		
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}
	
	@Test(expected = DBServiceException.class)
	public void testUpdateByInvalidOrder() throws DBServiceException {
		dbOrderService.update(new Order());
	}

	@Test
	public final void testDeleteById() {
		try {
			int orderId = 13;
		
			dbOrderService.deleteById(orderId);

			Order deletedOrder = dbOrderService.getById(orderId);
			Assert.assertNull(deletedOrder);
		} catch (DBServiceException e) {
			e.printStackTrace();
			Assert.fail();
		}
	}

}
