package ua.be.dc.services.sellingService.test;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import ua.be.dc.services.sellingService.db.service.IDBCustomerService;
import ua.be.dc.services.sellingService.db.service.IDBOrderService;
import ua.be.dc.services.sellingService.db.service.impl.DBCustomerServiceImpl;
import ua.be.dc.services.sellingService.db.service.impl.DBOrderServiceImpl;
import ua.be.dc.services.sellingService.models.Customer;
import ua.be.dc.services.sellingService.models.Order;
import ua.be.dc.services.sellingService.models.OrderDetail;
import ua.be.dc.services.sellingService.models.TicketDetail;
import ua.be.dc.services.sellingService.service.SellingService;
import ua.be.dc.services.sellingService.service.SellingServiceImpl;
import ua.be.dc.services.ticketService.service.Channel;
import ua.be.dc.services.ticketService.service.Event;
import ua.be.dc.services.ticketService.service.Ticket;
import ua.be.dc.services.ticketService.service.TicketService;
import ua.be.dc.services.ticketService.service.TicketServiceFactory;

public class SellingServiceTest {

	private static IDBOrderService dbOrderService;
	private static IDBCustomerService dbCustomerService;
	private static SellingService sellingService;
	private static TicketService ticketService;
	
	@BeforeClass
	public static void setup() {
		dbOrderService = new DBOrderServiceImpl();
		dbCustomerService = new DBCustomerServiceImpl();
		sellingService = new SellingServiceImpl();
		ticketService = TicketServiceFactory.getService();
	}
	
	@AfterClass
	public static void teardown() {
		dbOrderService = null;
		dbCustomerService = null;
		sellingService = null;
		ticketService = null;
	}
	
	@Test
	public void testGetTicketById() {
		try {
			int ticketId = 14;
			Ticket ticket = sellingService.getTicketById(ticketId);
			
			Assert.assertNotNull(ticket);
			Assert.assertNotNull(ticket.getEvent());
			Assert.assertNotNull(ticket.getPrice());
			Assert.assertNotNull(ticket.getChannel());
			Assert.assertNotNull(ticket.getAvailable());
			Assert.assertNotNull(ticket.getSold());
			
			System.out.println(ticket);
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}
	
	@Test
	public void testGetAvailableTickets() {
		try {
			Channel channel = new Channel();
			channel.setId(1);
			Event event = new Event();
			event.setId(1);
			
			Ticket[] tickets = sellingService.getAvailableTickets(channel, event);
			Assert.assertNotNull(tickets);
			for (Ticket ticket : tickets) {
				System.out.println(ticket);
			}
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}
	
	@Test
	public void testReserveTicket() {
		try {
			int ticketId = 14;
			
			Ticket ticket = new Ticket();
			ticket.setId(ticketId);
			ticket = sellingService.reserveTicket(ticket);
			
			Ticket reservedTicket = sellingService.getTicketById(ticket.getId());
			Assert.assertEquals(ticket.getAvailable(), reservedTicket.getAvailable());
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}
	
	@Test
	public void testUnreserveTicket() {
		try {
			int ticketId = 14;
			
			Ticket ticket = new Ticket();
			ticket.setId(ticketId);
			
			sellingService.reserveTicket(ticket);
			sellingService.unreserveTicket(ticket);
			
			Ticket unreservedTicket = sellingService.getTicketById(ticket.getId());
			Assert.assertEquals(true, unreservedTicket.getAvailable());
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
		
	}
	
//	@Test
//	public void testStartPurchase() {
//		try {
//			int ticketId = 14;
//			int customerId = 4;
//			
//			Customer customer = dbCustomerService.getById(customerId);
//			
//			Ticket[] tickets = new Ticket[1];
//			Ticket ticket = new Ticket();
//			ticket.setId(ticketId);
//			tickets[0] = ticket;
//			
//			String token = sellingService.startPurchase(customer, tickets);
//			System.out.println(token);
//			
//			Order createdOrder = dbOrderService.getOrderByToken(token);
//			Assert.assertNotNull(createdOrder);
//			Assert.assertNotNull(createdOrder.getCreated());
//			Assert.assertNull(createdOrder.getPurchased());
//			
//			Assert.assertEquals(customer, createdOrder.getCustomer());
//		} catch (Exception e) {
//			e.printStackTrace();
//			Assert.fail();
//		}
//	}
	
//	@Test
//	public void testExecutePurchase() {
//		try {
//			String token = "EC-7FT967624V776545U";
//			String payerID = "Y3NL9RAW583NA";
//			
//			Order orderToPurchase = dbOrderService.getOrderByToken(token);
//			Assert.assertNotNull(orderToPurchase.getCreated());
//			Assert.assertNotNull(orderToPurchase.getOrderDetails());
//			Assert.assertNull(orderToPurchase.getPurchased());
//			
//			sellingService.executePurchase(token, payerID);
//			
//			Order purchasedOrder = dbOrderService.getOrderByToken(token);
//			Assert.assertNotNull(purchasedOrder.getPurchased());
//			Assert.assertNotNull(purchasedOrder.getTransactionId());
//			Assert.assertEquals(orderToPurchase.getCreated(), purchasedOrder.getCreated());
//			Assert.assertEquals(orderToPurchase.getOrderDetails(), purchasedOrder.getOrderDetails());
//			
//			for (OrderDetail orderDetail : purchasedOrder.getOrderDetails()) {
//				for (TicketDetail ticketDetail : orderDetail.getTicketsDetails()) {
//					Ticket ticket = ticketService.getTicketById(ticketDetail.getId());
//					Assert.assertEquals(true, ticket.getSold());
//				}
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//			Assert.fail();
//		}
//	}
//	
	@Test
	public void testGetEvents() {
		Event[] events = sellingService.getEvents();
		Assert.assertNotNull(events);
		
		for (Event event : events) {
			System.out.println(event.getId() + ", " + event.getName());
		}
	}
}
