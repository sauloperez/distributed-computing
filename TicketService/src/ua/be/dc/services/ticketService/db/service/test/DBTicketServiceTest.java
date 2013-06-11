package ua.be.dc.services.ticketService.db.service.test;

import java.util.List;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import ua.be.dc.services.ticketService.db.service.IDBTicketService;
import ua.be.dc.services.ticketService.db.service.exception.DBServiceException;
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
		int ticketId = 1;
		Ticket ticket = dbTicketService.getById(ticketId);
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
		try {
			Ticket ticket = new Ticket();
			
			// Set up all the nested objects
			Event event = new Event(1);
			ticket.setEvent(event);
			
			Channel channel = new Channel(1);
			ticket.setChannel(channel);
			
			ticket.setPrice(0f);
			ticket.setSold(false);
			ticket.setAvailable(true);
			
			dbTicketService.insert(ticket);
			
			Assert.assertTrue(ticket.getId() != 0);
			
			Ticket createdTicket = dbTicketService.getById(ticket.getId());
			Assert.assertNotNull(createdTicket);
			Assert.assertEquals(ticket.getPrice(), createdTicket.getPrice());
			
			Assert.assertEquals(ticket.getSold(), createdTicket.getSold());
			Assert.assertEquals(ticket.getAvailable(), createdTicket.getAvailable());
			Assert.assertEquals(ticket.getEvent().getId(), createdTicket.getEvent().getId());
			Assert.assertEquals(ticket.getChannel().getId(), createdTicket.getChannel().getId());
		} catch (DBServiceException e) {
			e.printStackTrace();
		}
	}
	
	@Test(expected = DBServiceException.class)
	public void testInsertEmpty() throws DBServiceException {
		dbTicketService.insert(new Ticket());
	}
	
	@Test
	public void testUpdate() {
		try {
			int ticketId = 1;
			Ticket ticket = dbTicketService.getById(ticketId);
			ticket.setPrice(9.999f);
			
			dbTicketService.update(ticket);
			
			Ticket updatedTicket = dbTicketService.getById(ticketId);
			Assert.assertEquals(ticket.getPrice(), updatedTicket.getPrice());
		} catch (DBServiceException e) {
			e.printStackTrace();
		}
	}
	
	@Test(expected = DBServiceException.class)
	public void testUPdateByInvalidTicket() throws DBServiceException {
		dbTicketService.update(new Ticket());
	}
	
	@Test
	public void testDelete() {
		try {
			int ticketId = 6;
			Ticket ticket = dbTicketService.getById(ticketId);
			
			dbTicketService.deleteById(ticket.getId());
			
			Ticket deletedTicket = dbTicketService.getById(ticketId);
			Assert.assertNull(deletedTicket);
		} catch (DBServiceException e) {
			e.printStackTrace();
		}
	}
	
	@Test(expected = DBServiceException.class)
	public void testDeleteByInvalidId() throws DBServiceException {
		int ticketID = -1;
		dbTicketService.deleteById(ticketID);
	}
}
