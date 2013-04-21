package ua.be.dc.services.ticketService.service;

import java.util.List;

import ua.be.dc.services.ticketService.db.service.IDBTicketService;
import ua.be.dc.services.ticketService.db.service.impl.DBTicketServiceImpl;
import ua.be.dc.services.ticketService.models.Event;
import ua.be.dc.services.ticketService.models.Ticket;

public class TicketServiceImpl implements TicketService {

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
	public Ticket getTicketById(Integer id) {
		return dbTicketService.getById(id);
	}
	
	@Override
	public void updateTicket(Ticket ticket) {
		dbTicketService.update(ticket);
	}
}
