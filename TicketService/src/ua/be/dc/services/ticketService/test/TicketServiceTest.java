package ua.be.dc.services.ticketService.test;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import ua.be.dc.services.ticketService.models.Channel;
import ua.be.dc.services.ticketService.models.Event;
import ua.be.dc.services.ticketService.models.Ticket;
import ua.be.dc.services.ticketService.service.TicketService;
import ua.be.dc.services.ticketService.service.TicketServiceImpl;

public class TicketServiceTest {

	private static TicketService ticketService;
	
	@BeforeClass
	public static void setup() {
		ticketService = new TicketServiceImpl();
	}
	
	@AfterClass
	public static void teardown() {
		ticketService = null;
	}
	
	@Test
	public void testGetEvents() {
		Event[] events = ticketService.getEvents();
		Assert.assertNotNull(events);
		for (Event event : events) {
			System.out.println(event);
		}
	}
	
	@Test
	public void testGetTicketsByEvent() {
		Event event = new Event(2);
		Ticket[] tickets = ticketService.getTicketsByEvent(event);
		Assert.assertNotNull(tickets);
		for (Ticket ticket : tickets) {
			System.out.println(ticket);
		}
	}
	
	@Test
	public void testGetTicketsByEventAndChannel() {
		Event event = new Event(1);
		Channel channel = new Channel(1);
		Ticket[] tickets = ticketService.getTicketsByEventAndChannel(event, channel);
		Assert.assertNotNull(tickets);
		for (Ticket ticket : tickets) {
			System.out.println(ticket);
		}
	}
	
	@Test
	public void testGetTicketById() {
		int ticketId = 1;
		Ticket ticket = ticketService.getTicketById(ticketId);
		
		Assert.assertNotNull(ticket);
		Assert.assertNotNull(ticket.getEvent());
		Assert.assertNotNull(ticket.getPrice());
		Assert.assertNotNull(ticket.getChannel());
		Assert.assertNotNull(ticket.getAvailable());
		Assert.assertNotNull(ticket.getSold());
		
		System.out.println(ticket);
	}
	
	@Test
	public void testUpdate() {
		int ticketId = 2;
		Ticket ticket = ticketService.getTicketById(ticketId);
		Boolean available = !ticket.getAvailable();
		Channel channel = new Channel(1);
		Event event = new Event(2);
		Float price = ticket.getPrice() + 10;
		Boolean sold = !ticket.getSold();
		
		ticket.setAvailable(available);
		ticket.setChannel(channel);
		ticket.setEvent(event);
		ticket.setPrice(price);
		ticket.setSold(sold);
		
		ticketService.updateTicket(ticket);
		
		Ticket updatedTicket = ticketService.getTicketById(ticket.getId());
		Assert.assertNotNull(updatedTicket);
		Assert.assertEquals(available, updatedTicket.getAvailable());
		Assert.assertEquals(channel.getId(), updatedTicket.getChannel().getId());
		Assert.assertEquals(event.getId(), updatedTicket.getEvent().getId());
		Assert.assertEquals(ticket.getId(), updatedTicket.getId());
		Assert.assertEquals(price, updatedTicket.getPrice());
		Assert.assertEquals(sold, updatedTicket.getSold());
		
		System.out.println(updatedTicket);
	}
}
