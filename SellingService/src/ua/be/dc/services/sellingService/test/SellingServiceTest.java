package ua.be.dc.services.sellingService.test;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import ua.be.dc.services.sellingService.db.service.IDBPurchaseService;
import ua.be.dc.services.sellingService.db.service.impl.DBPurchaseServiceImpl;
import ua.be.dc.services.sellingService.service.SellingService;
import ua.be.dc.services.sellingService.service.SellingServiceImpl;
import ua.be.dc.services.ticketService.service.Channel;
import ua.be.dc.services.ticketService.service.Event;
import ua.be.dc.services.ticketService.service.Ticket;

public class SellingServiceTest {

	private static IDBPurchaseService dbPurchaseService;
	private static SellingService sellingService;
	
	@BeforeClass
	public static void setup() {
		dbPurchaseService = new DBPurchaseServiceImpl();
		sellingService = new SellingServiceImpl();
	}
	
	@AfterClass
	public static void teardown() {
		dbPurchaseService = null;
		sellingService = null;
	}
	
	@Test
	public void testGetTicketById() {
		try {
			Ticket ticket = sellingService.getTicketById(7);
			
			Assert.assertNotNull(ticket);
			Assert.assertNotNull(ticket.getEvent());
			Assert.assertNotNull(ticket.getPrice());
			Assert.assertNotNull(ticket.getChannel());
			Assert.assertNotNull(ticket.getAvailable());
			Assert.assertNotNull(ticket.getSold());
			
			System.out.println(ticket);
		} catch (Exception e) {
			e.printStackTrace();
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
		}
		
	}
	
	@Test
	public void testStartPurchase() {
		try {
			Ticket[] tickets = new Ticket[1];
			tickets[0] = sellingService.getTicketById(26);
			
			String token = sellingService.startPurchase(tickets);
			System.out.println(token);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testExecutePurchase() {
		try {
			int s = dbPurchaseService.getAll().size();
			
			Ticket[] tickets = new Ticket[1];
			tickets[0] = sellingService.getTicketById(7);
			
//			sellingService.executePurchase(tickets);
			
//			Assert.assertEquals(s+1, dbPurchaseService.getAll().size());
		} catch (Exception e) {
			e.printStackTrace();
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
