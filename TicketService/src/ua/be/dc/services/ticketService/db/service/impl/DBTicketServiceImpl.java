package ua.be.dc.services.ticketService.db.service.impl;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import ua.be.dc.services.ticketService.db.dao.TicketDAO;
import ua.be.dc.services.ticketService.db.service.IDBTicketService;
import ua.be.dc.services.ticketService.models.Ticket;

public class DBTicketServiceImpl implements IDBTicketService {
	
	private static Logger logger = LogManager.getLogger(DBTicketServiceImpl.class
			.getName());
	
	private TicketDAO ticketDAO;

	@Override
	public Ticket getById(Integer id) {
		ticketDAO = new TicketDAO();
		Ticket ticket = ticketDAO.selectById(id);
		
		logger.trace("Retrieved ticket with ID " + id);
		
		return ticket;
	}

	@Override
	public List<Ticket> getAll() {
		ticketDAO = new TicketDAO();
		List<Ticket> tickets = ticketDAO.selectAll();
		
		logger.trace("Retrieved " + tickets.size() + " tickets");
		
		return tickets;
	}

	@Override
	public void insert(Ticket ticket) {
		ticketDAO = new TicketDAO();
		ticketDAO.insert(ticket);
		
		logger.trace("Inserted ticket with ID " + ticket.getId());
	}

	@Override
	public void update(Ticket ticket) {
		ticketDAO = new TicketDAO();
		ticketDAO.update(ticket);
		
		logger.trace("Updated ticket with ID " + ticket.getId());
	}

	@Override
	public void deleteById(Integer id) {
		ticketDAO = new TicketDAO();
		ticketDAO.delete(id);
		
		logger.trace("Deleted ticket with ID " + id);
	}

}
