package ua.be.dc.services.ticketService.db.service.impl;

import java.util.List;

import org.apache.ibatis.exceptions.PersistenceException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import ua.be.dc.services.ticketService.db.dao.TicketDAO;
import ua.be.dc.services.ticketService.db.dao.exception.DAOException;
import ua.be.dc.services.ticketService.db.service.IDBTicketService;
import ua.be.dc.services.ticketService.db.service.exception.DBServiceException;
import ua.be.dc.services.ticketService.models.Ticket;
import ua.be.dc.services.ticketService.service.TicketServiceImpl;

public class DBTicketServiceImpl implements IDBTicketService {
	
	private static Logger logger = LogManager.getLogger(DBTicketServiceImpl.class
			.getName());
	
	private TicketDAO ticketDAO = new TicketDAO();

	@Override
	public Ticket getById(Integer id) {
		Ticket ticket = ticketDAO.selectById(id);
		
		if (ticket == null) {
			logger.trace("ticket with ID " + id + " not found");
		}
		else {
			ticket.setEventOrganizerToken(TicketServiceImpl.getEventOrganizerToken());
			logger.trace("Retrieved ticket with ID " + id);
		}
		
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
	public List<Ticket> getByEventToken(String token) {
		List<Ticket> tickets = ticketDAO.selectByEventToken(token);
		
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
	public List<Ticket> getByEventTokenAndChannelId(String token, Integer channelId) {
		List<Ticket> tickets = ticketDAO.selectByEventTokenAndChannelId(token, channelId);
		
		logger.trace("Retrieved " + tickets.size() + " tickets");
		
		return tickets;
	}
	
	@Override
	public void insert(Ticket ticket) throws DBServiceException {
		try {
			ticketDAO.insert(ticket);

			logger.trace("Inserted ticket with ID " + ticket.getId());
		} catch (PersistenceException e) {
			throw new DBServiceException("PersistenceException The ticket could not be inserted. " + e.getMessage());
		}
	}

	@Override
	public void update(Ticket ticket) throws DBServiceException {
		try {
			ticketDAO.update(ticket);

			logger.trace("Updated ticket with ID " + ticket.getId());
		} catch (DAOException e) {
			throw new DBServiceException("The ticket could not be updated. " + e.getMessage());
		}
	}

	// TODO it should unassign the ticket wiht its seat by a web service call to SeatAccommodationService
	@Override
	public void deleteById(Integer id) throws DBServiceException {
		try {
			ticketDAO.delete(id);

			logger.trace("Deleted ticket with ID " + id);
		} catch (DAOException e) {
			throw new DBServiceException("The ticket could not be deleted. " + e.getMessage());
		}
	}

}
