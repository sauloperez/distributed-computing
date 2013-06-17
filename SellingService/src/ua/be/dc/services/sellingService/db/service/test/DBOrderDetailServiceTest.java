package ua.be.dc.services.sellingService.db.service.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import ua.be.dc.services.sellingService.db.service.IDBOrderDetailService;
import ua.be.dc.services.sellingService.db.service.exception.DBServiceException;
import ua.be.dc.services.sellingService.db.service.impl.DBOrderDetailServiceImpl;
import ua.be.dc.services.sellingService.models.Order;
import ua.be.dc.services.sellingService.models.OrderDetail;
import ua.be.dc.services.sellingService.service.exception.InvalidTicketException;
import ua.be.dc.services.ticketService.service.Ticket;
import ua.be.dc.services.ticketService.service.TicketService;
import ua.be.dc.services.ticketService.service.TicketServiceFactory;

public class DBOrderDetailServiceTest {

	private static IDBOrderDetailService dbOrderDetailService;
	private static TicketService ticketService;

	@Before
	public void setUp() throws Exception {
		dbOrderDetailService = new DBOrderDetailServiceImpl();
		ticketService = TicketServiceFactory.getService();
	}

	@After
	public void tearDown() throws Exception {
		dbOrderDetailService = null;
		ticketService = null;
	}

	@Test
	public final void testGetById() {
		int orderDetailId = 1;
		
		OrderDetail orderDetail = dbOrderDetailService.getById(orderDetailId);
		Assert.assertNotNull(orderDetail);
		System.out.println(orderDetail);
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
	public final void testInsert() {
		try {
			int ticketId = 14;
			int orderId = 1;
			
			Order order = new Order();
			order.setId(orderId);
			
			OrderDetail orderDetail = new OrderDetail();
			orderDetail.setName("Test name");
			orderDetail.setPrice(49.99f);
			
			Ticket[] tickets = new Ticket[1];
			tickets[0] = new Ticket();
			tickets[0].setId(ticketId);
			
			for (int i = 0; i < tickets.length; i++) {
				tickets[i] = ticketService.getTicketById(tickets[i].getId());
			}
			
			orderDetail.setTicketsDetails(tickets);
			
			orderDetail.setOrder(order);
			
			List<OrderDetail> orderDetails = new ArrayList<OrderDetail>();
			orderDetails.add(orderDetail);
			order.setOrderDetails(orderDetails);
		
			dbOrderDetailService.insert(orderDetail);
		
			Assert.assertTrue(orderDetail.getId() != 0);
			
			OrderDetail createdOrderDetail = dbOrderDetailService.getById(orderDetail.getId());
			Assert.assertNotNull(createdOrderDetail);
			Assert.assertEquals(orderDetail.getName(), createdOrderDetail.getName());
			Assert.assertEquals(orderDetail.getPrice(), createdOrderDetail.getPrice());
//			Assert.assertEquals(orderDetail.getQuantity(), createdOrderDetail.getQuantity());
			Assert.assertEquals(orderDetail.getOrder(), order);
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}

	@Test
	public final void testUpdate() {
		try {
			int ticketId = 14;
			
			OrderDetail orderDetail = new OrderDetail();
			orderDetail.setName("Test name");
			orderDetail.setPrice(49.99f);
			
			Ticket[] tickets = new Ticket[1];
			tickets[0] = new Ticket();
			tickets[0].setId(ticketId);
			orderDetail.setTicketsDetails(tickets);
		
			dbOrderDetailService.update(orderDetail);
					
			OrderDetail updatedOrderDetail = dbOrderDetailService.getById(orderDetail.getId());
			Assert.assertNotNull(updatedOrderDetail);
			Assert.assertEquals(orderDetail.getName(), updatedOrderDetail.getName());
			Assert.assertEquals(orderDetail.getPrice(), updatedOrderDetail.getPrice());
			Assert.assertEquals(orderDetail.getQuantity(), updatedOrderDetail.getQuantity());
		} catch (DBServiceException | InvalidTicketException e) {
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
