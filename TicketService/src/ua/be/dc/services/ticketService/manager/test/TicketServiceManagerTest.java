/**
 * 
 */
package ua.be.dc.services.ticketService.manager.test;

import java.util.List;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import ua.be.dc.services.ticketService.db.service.IDBTicketService;
import ua.be.dc.services.ticketService.db.service.impl.DBTicketServiceImpl;
import ua.be.dc.services.ticketService.manager.ITicketServiceManager;
import ua.be.dc.services.ticketService.manager.TicketServiceManager;
import ua.be.dc.services.ticketService.models.Channel;
import ua.be.dc.services.ticketService.models.Event;
import ua.be.dc.services.ticketService.models.Ticket;

/**
 * @author Pau
 *
 */
public class TicketServiceManagerTest {

	private static IDBTicketService dbTicketService;
	private static ITicketServiceManager ticketServiceManager;
	
	@BeforeClass
	public static void setup() {
		dbTicketService = new DBTicketServiceImpl();
		ticketServiceManager = new TicketServiceManager();
	}
	
	@AfterClass
	public static void teardown() {
		dbTicketService = null;
		ticketServiceManager = null;
	}
	
	@Test
	public void testGetTickets() {
		List<Ticket> tickets = ticketServiceManager.getTickets();
		Assert.assertNotNull(tickets);
		for (Ticket ticket : tickets) {
			Assert.assertNotNull(ticket.getEvent());
			Assert.assertNotNull(ticket.getPrice());
			Assert.assertNotNull(ticket.getChannel());
			Assert.assertNotNull(ticket.getAvailable());
			Assert.assertNotNull(ticket.getSold());
			
			System.out.println(ticket);
		}
	}
	
	@Test
	public void testDeleteTicketById() {
		try {
			int ticketId = 8;
			Ticket ticket = dbTicketService.getById(ticketId);
			ticketServiceManager.deleteTicketById(ticket.getId());
			
			Ticket deletedTicket = dbTicketService.getById(ticketId);
			Assert.assertNull(deletedTicket);
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}
	
	@Test
	public void testCreateTicket() {
		try {
			Ticket ticket = new Ticket();
			ticket.setAvailable(true);
			ticket.setChannel(new Channel(1));
			ticket.setEvent(new Event(1));
			ticket.setPrice(new Float(9.9));
			ticket.setSold(false);
			
			ticketServiceManager.createTicket(ticket);
			Assert.assertTrue(ticket.getId() != 0);
			
			Ticket createdTicket = dbTicketService.getById(ticket.getId());
			Assert.assertNotNull(createdTicket);
			Assert.assertEquals(ticket.getPrice(), createdTicket.getPrice());
			
			Assert.assertEquals(ticket.getSold(), createdTicket.getSold());
			Assert.assertEquals(ticket.getAvailable(), createdTicket.getAvailable());
			Assert.assertEquals(ticket.getEvent().getId(), createdTicket.getEvent().getId());
			Assert.assertEquals(ticket.getChannel().getId(), createdTicket.getChannel().getId());
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}
}
