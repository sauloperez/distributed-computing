package ua.be.dc.services.ticketService.db.service.test;

import java.util.List;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import ua.be.dc.services.ticketService.db.service.IDBTicketService;
import ua.be.dc.services.ticketService.db.service.impl.DBTicketServiceImpl;
import ua.be.dc.services.ticketService.models.Channel;
import ua.be.dc.services.ticketService.models.Event;
import ua.be.dc.services.ticketService.models.Ticket;

public class DBTicketServiceTest {

	private static IDBTicketService dbTicketService;
	
	@BeforeClass
	public static void setup() {
		dbTicketService = new DBTicketServiceImpl();
	}
	
	@AfterClass
	public static void teardown() {
		dbTicketService = null;
	}
	
	@Test
	public void testGetById() {
		Ticket ticket = dbTicketService.getById(1);
		Assert.assertNotNull(ticket);
		System.out.println(ticket);
	}
	
	@Test
	public void testGetAll() {
		List<Ticket> tickets = dbTicketService.getAll();
		Assert.assertNotNull(tickets);
		for (Ticket ticket : tickets) {
			System.out.println(ticket);
		}
	}
	
	@Test
	public void testGetByEvent() {
		List<Ticket> tickets = dbTicketService.getByEventId(1);
		Assert.assertNotNull(tickets);
		for (Ticket ticket : tickets) {
			System.out.println(ticket);
		}
	}
	
	@Test
	public void testGetByEventIdAndChannelId() {
		List<Ticket> tickets = dbTicketService.getByEventIdAndChannelId(1, 1);
		Assert.assertNotNull(tickets);
		for (Ticket ticket : tickets) {
			System.out.println(ticket);
		}
	}
	
	@Test
	public void testInsert() {
		Ticket ticket = new Ticket();
		
		// Set up all the nested objects
		Event event = new Event(1);
		ticket.setEvent(event);
		
		Channel channel = new Channel(1);
		ticket.setChannel(channel);
		
		ticket.setPrice(0f);
		ticket.setSeatId(1);
		ticket.setSold(false);
		ticket.setAvailable(true);
		
		// execute insert and check result
		dbTicketService.insert(ticket);
		Assert.assertTrue(ticket.getId() != 0);
		
		Ticket createdTicket = dbTicketService.getById(ticket.getId());
		Assert.assertNotNull(createdTicket);
		Assert.assertEquals(ticket.getPrice(), createdTicket.getPrice());
		Assert.assertEquals(ticket.getSeatId(), createdTicket.getSeatId());
		
		System.out.println(ticket.getSold());
		System.out.println(createdTicket.getSold());
		
		Assert.assertEquals(ticket.getSold(), createdTicket.getSold());
		Assert.assertEquals(ticket.getAvailable(), createdTicket.getAvailable());
		Assert.assertEquals(ticket.getEvent().getId(), createdTicket.getEvent().getId());
		Assert.assertEquals(ticket.getChannel().getId(), createdTicket.getChannel().getId());
	}
	
	@Test
	public void testUpdate() {
		Ticket ticket = dbTicketService.getById(2);
		ticket.setPrice(9.999f);
		dbTicketService.update(ticket);
		
		Ticket updatedTicket = dbTicketService.getById(2);
		Assert.assertEquals(ticket.getPrice(), updatedTicket.getPrice());
	}
	
	@Test
	public void testDelete() {
		Ticket ticket = dbTicketService.getById(3);
		dbTicketService.deleteById(ticket.getId());
		
		Ticket deletedTicket = dbTicketService.getById(3);
		Assert.assertNull(deletedTicket);
	}
}
