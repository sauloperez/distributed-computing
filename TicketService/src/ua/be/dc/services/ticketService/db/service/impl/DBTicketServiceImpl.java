package ua.be.dc.services.ticketService.db.service.impl;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import ua.be.dc.services.ticketService.db.dao.TicketDAO;
import ua.be.dc.services.ticketService.db.service.IDBTicketService;
import ua.be.dc.services.ticketService.db.service.exception.DBServiceException;
import ua.be.dc.services.ticketService.models.Event;
import ua.be.dc.services.ticketService.models.Ticket;

public class DBTicketServiceImpl implements IDBTicketService {
	
	private static Logger logger = LogManager.getLogger(DBTicketServiceImpl.class
			.getName());
	
	private TicketDAO ticketDAO = new TicketDAO();

	@Override
	public Ticket getById(Integer id) {
		Ticket ticket = ticketDAO.selectById(id);
		
		logger.trace("Retrieved ticket with ID " + id);
		
		return ticket;
	}

	@Override
	public List<Ticket> getAll() {
		List<Ticket> tickets = ticketDAO.selectAll();
		
		logger.trace("Retrieved " + tickets.size() + " tickets");
		
		return tickets;
	}
	
	@Override
	public List<Ticket> getByEventId(Integer eventId) {
		List<Ticket> tickets = ticketDAO.selectByEventId(eventId);
		
		logger.trace("Retrieved " + tickets.size() + " tickets");
		
		return tickets;
	}
	
	@Override
	public List<Ticket> getByEventIdAndChannelId(Integer eventId, Integer channelId) {
		List<Ticket> tickets = ticketDAO.selectByEventIdAndChannelId(eventId, channelId);
		
		logger.trace("Retrieved " + tickets.size() + " tickets");
		
		return tickets;
	}

	@Override
	public void insert(Ticket ticket) throws DBServiceException {
		try {
			ticketDAO.insert(ticket);

			logger.trace("Inserted ticket with ID " + ticket.getId());
		} catch (Exception e) {
			throw new DBServiceException("The tichet could not be inserted. " + e.getMessage());
		}
	}

	@Override
	public void update(Ticket ticket) throws DBServiceException {
		try {
			ticketDAO.update(ticket);

			logger.trace("Updated ticket with ID " + ticket.getId());
		} catch (Exception e) {
			throw new DBServiceException("The ticket could not be updated. " + e.getMessage());
		}
	}

	@Override
	public void deleteById(Integer id) throws DBServiceException {
		try {
			ticketDAO.delete(id);

			logger.trace("Deleted ticket with ID " + id);
		} catch (Exception e) {
			throw new DBServiceException("The ticket could not be deleted. " + e.getMessage());
		}
	}
	
}
