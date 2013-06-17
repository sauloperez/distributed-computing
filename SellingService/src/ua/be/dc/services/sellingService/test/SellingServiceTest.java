package ua.be.dc.services.sellingService.test;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import ua.be.dc.services.sellingService.db.service.IDBOrderService;
import ua.be.dc.services.sellingService.db.service.impl.DBOrderServiceImpl;
import ua.be.dc.services.sellingService.models.Customer;
import ua.be.dc.services.sellingService.models.Order;
import ua.be.dc.services.sellingService.service.SellingService;
import ua.be.dc.services.sellingService.service.SellingServiceImpl;
import ua.be.dc.services.ticketService.service.Channel;
import ua.be.dc.services.ticketService.service.Event;
import ua.be.dc.services.ticketService.service.Ticket;

public class SellingServiceTest {

	private static IDBOrderService dbOrderService;
	private static SellingService sellingService;
	
	@BeforeClass
	public static void setup() {
		dbOrderService = new DBOrderServiceImpl();
		sellingService = new SellingServiceImpl();
	}
	
	@AfterClass
	public static void teardown() {
		dbOrderService = null;
		sellingService = null;
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
		}
	}
	
	@Test
	public void testReserveTicket() {
		try {
			Ticket ticket = new Ticket();
			ticket.setId(7);
			sellingService.reserveTicket(ticket);
			
			Ticket reservedTicket = sellingService.getTicketById(ticket.getId());
			Assert.assertEquals(false, reservedTicket.getAvailable());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testUnreserveTicket() {
		try {
			Ticket ticket = new Ticket();
			ticket.setId(7);
			sellingService.reserveTicket(ticket);
			sellingService.unreserveTicket(ticket);
			
			Ticket unreservedTicket = sellingService.getTicketById(ticket.getId());
			Assert.assertEquals(true, unreservedTicket.getAvailable());
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
		
	}
	
	@Test
	public void testStartPurchase() {
		try {
			int ticketId = 14;
			
			Customer customer = new Customer();
			customer.setName("Test name");
			customer.setSurname("Test surname");
			customer.setCountry("Catalunya");
			customer.setAddress("Carrer Mossèn Camill Rossell, 82, 3r 1ª");
			customer.setEmail("test@test.com");
			customer.setPhone("999999999");
			
			Ticket[] tickets = new Ticket[1];
			tickets[0] = sellingService.getTicketById(ticketId);
			
			String token = sellingService.startPurchase(customer, tickets);
			System.out.println(token);
			
			Order createdOrder = dbOrderService.getOrderByToken(token);
			Assert.assertNotNull(createdOrder);
			Assert.assertNotNull(createdOrder.getCreated());
			Assert.assertNull(createdOrder.getPurchased());
			
			Assert.assertEquals(customer, createdOrder.getCustomer());
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}
	
	@Test
	public void testExecutePurchase() {
		try {
			String token = "EC-7JJ8063363725972S";
			String payerID = "Y3NL9RAW583NA";
			
			Order orderToPurchase = dbOrderService.getOrderByToken(token);
			Assert.assertNotNull(orderToPurchase.getCreated());
			Assert.assertNotNull(orderToPurchase.getOrderDetails());
			Assert.assertNull(orderToPurchase.getPurchased());
			
			sellingService.executePurchase(token, payerID);
			
			Order purchasedOrder = dbOrderService.getOrderByToken(token);
			Assert.assertNotNull(purchasedOrder.getPurchased());
			Assert.assertEquals(orderToPurchase.getCreated(), purchasedOrder.getCreated());
			Assert.assertEquals(orderToPurchase.getOrderDetails(), purchasedOrder.getOrderDetails());
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}
	
	@Test
	public void testGetEvents() {
		Event[] events = sellingService.getEvents();
		Assert.assertNotNull(events);
		
		for (Event event : events) {
			System.out.println(event.getId() + ", " + event.getName());
		}
	}
}
