package ua.be.dc.services.sellingService.db.service.test;

import java.sql.Timestamp;
import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import ua.be.dc.services.sellingService.db.service.IDBOrderService;
import ua.be.dc.services.sellingService.db.service.exception.DBServiceException;
import ua.be.dc.services.sellingService.db.service.impl.DBOrderServiceImpl;
import ua.be.dc.services.sellingService.models.Customer;
import ua.be.dc.services.sellingService.models.Order;
import ua.be.dc.services.ticketService.service.Ticket;
import ua.be.dc.services.ticketService.service.TicketService;
import ua.be.dc.services.ticketService.service.TicketServiceFactory;

public class DBOrderServiceTest {
	
	private static IDBOrderService dbOrderService;
	
	private TicketService ticketService = TicketServiceFactory.getService();

	@Before
	public void setUp() throws Exception {
		dbOrderService = new DBOrderServiceImpl();
	}

	@After
	public void tearDown() throws Exception {
		dbOrderService = null;
	}

	@Test
	public final void testGetById() {
		int orderId = 1;
		Order order = dbOrderService.getById(orderId);
		Assert.assertNotNull(order);
		System.out.println(order);
	}

	@Test
	public final void testGetOrderByToken() {
		String token = "";
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
			int ticketId = 14;
			int customerId = 22;
		
			Ticket ticket = ticketService.getTicketById(ticketId);
			Ticket[] tickets = new Ticket[1];
			tickets[0] = ticket;
			
			Customer customer = new Customer();
			customer.setId(customerId);
			
			Order order = new Order(tickets);
			order.setCustomer(customer);
			
			dbOrderService.insert(order);
			
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
	
	@Test
	public final void testUpdate() {
		try {
			int orderId = 1;
			
			Order order = dbOrderService.getById(orderId);
			order.setToken("token test");
			order.setTransactionId("fake_transactionId");
			order.setPurchased(new Timestamp(System.currentTimeMillis()));
		
			dbOrderService.update(order);
		
			Order purchasedOrder = dbOrderService.getById(orderId);
			Assert.assertEquals(order.getToken(), purchasedOrder.getToken());
			Assert.assertEquals(order.getPurchased(), purchasedOrder.getPurchased());
			Assert.assertEquals(order.getOrderDetails(), purchasedOrder.getOrderDetails());
		} catch (DBServiceException e) {
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
			int orderId = 1;
		
			dbOrderService.deleteById(orderId);

			Order deletedOrder = dbOrderService.getById(orderId);
			Assert.assertNull(deletedOrder);
		} catch (DBServiceException e) {
			e.printStackTrace();
			Assert.fail();
		}
	}

}
