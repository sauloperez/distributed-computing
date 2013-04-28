package ua.be.dc.services.ticketService.manager;

import java.util.List;

import ua.be.dc.services.ticketService.db.service.IDBTicketService;
import ua.be.dc.services.ticketService.db.service.impl.DBTicketServiceImpl;
import ua.be.dc.services.ticketService.models.Ticket;

public class TicketServiceManager implements ITicketServiceManager {
	
	private IDBTicketService dbTicketService = new DBTicketServiceImpl();
	
	@Override
	public List<Ticket> getTickets() {
		return dbTicketService.getAll();
	}

	@Override
	public void deleteTicketById(Integer ticketId) {
		dbTicketService.deleteById(ticketId);
	}

	@Override
	public void createTicket(Ticket ticket) throws IllegalArgumentException {
		dbTicketService.insert(ticket);
	}

}
