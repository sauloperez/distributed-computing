package ua.be.dc.services.ticketService.service;

import java.util.List;

import javax.jws.WebService;

import ua.be.dc.services.ticketService.db.service.IDBTicketService;
import ua.be.dc.services.ticketService.db.service.impl.DBTicketServiceImpl;
import ua.be.dc.services.ticketService.models.Channel;
import ua.be.dc.services.ticketService.models.Event;
import ua.be.dc.services.ticketService.models.Ticket;

@WebService(endpointInterface = "ua.be.dc.services.ticketService.service.TicketService")
public class TicketServiceImpl implements TicketService {
	
	// TODO: throw HTTPException 503 Service Unavailable for rate timing policy

	private static IDBTicketService dbTicketService = new DBTicketServiceImpl();
	
	@Override
	public String test() {
		return "test";
	}

	@Override
	public Ticket[] getTicketsByEvent(Event event) {
		List<Ticket> ticketsList = dbTicketService.getByEventId(event.getId());
	
		return ticketsList.toArray(new Ticket[ticketsList.size()]);
	}
	
	@Override
	public Ticket[] getTicketsByEventAndChannel(Event event, Channel channel) {
		List<Ticket> ticketsList = dbTicketService.getByEventIdAndChannelId(event.getId(), channel.getId());
		
		return ticketsList.toArray(new Ticket[ticketsList.size()]);
	}

	@Override
	public Ticket getTicketById(Integer id) {
		return dbTicketService.getById(id);
	}
	
	@Override
	public void updateTicket(Ticket ticket) {
		dbTicketService.update(ticket);
	}
	
}
