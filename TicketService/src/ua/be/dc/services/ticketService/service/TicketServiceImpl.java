package ua.be.dc.services.ticketService.service;

import java.util.List;

import javax.jws.WebService;

import ua.be.dc.services.ticketService.db.service.IDBEventService;
import ua.be.dc.services.ticketService.db.service.IDBTicketService;
import ua.be.dc.services.ticketService.db.service.exception.DBServiceException;
import ua.be.dc.services.ticketService.db.service.impl.DBEventServiceImpl;
import ua.be.dc.services.ticketService.db.service.impl.DBTicketServiceImpl;
import ua.be.dc.services.ticketService.models.Channel;
import ua.be.dc.services.ticketService.models.Event;
import ua.be.dc.services.ticketService.models.Ticket;

@WebService(endpointInterface = "ua.be.dc.services.ticketService.service.TicketService")
public class TicketServiceImpl implements TicketService {
	
	// TODO: throw HTTPException 503 Service Unavailable for rate timing policy

	private static IDBTicketService dbTicketService = new DBTicketServiceImpl();
	private static IDBEventService dbEventService = new DBEventServiceImpl();
	
	@Override
	public String test() {
		return "test";
	}

	@Override
	public Ticket[] getTicketsByEvent(Event event) {
		List<Ticket> ticketsList = dbTicketService.getByEventToken(event.getToken());
	
		return ticketsList.toArray(new Ticket[ticketsList.size()]);
	}
	
	@Override
	public Ticket[] getTicketsByEventAndChannel(Event event, Channel channel) {
		List<Ticket> ticketsList = dbTicketService.getByEventTokenAndChannelId(event.getToken(), channel.getId());
		
		return ticketsList.toArray(new Ticket[ticketsList.size()]);
	}

	@Override
	public Ticket getTicketById(Integer id) {
		return dbTicketService.getById(id);
	}
	
	@Override
	public void updateTicket(Ticket ticket) {
		try {
			dbTicketService.update(ticket);
		} catch (DBServiceException e) {
			System.err.println(e.getMessage());
		}
	}

	@Override
	public Event[] getEvents() {
		List<Event> eventsList = dbEventService.getAll();
		
		return eventsList.toArray(new Event[eventsList.size()]);
	}

	@Override
	public Ticket[] getTickets() {
		List<Ticket> ticketsList = dbTicketService.getAll();
		
		return ticketsList.toArray(new Ticket[ticketsList.size()]);
	}
	
}
