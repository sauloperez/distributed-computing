package ua.be.dc.services.ticketService.db.service;

import java.util.List;

import ua.be.dc.services.ticketService.db.service.exception.DBServiceException;
import ua.be.dc.services.ticketService.models.Ticket;

public interface IDBTicketService {

	public Ticket getById(Integer id);
	
	public List<Ticket> getAll();
	
	public List<Ticket> getByEventId(Integer eventId);
	
	public List<Ticket> getByEventIdAndChannelId(Integer eventId, Integer channelId);
	
	public void insert(Ticket ticket) throws DBServiceException;
	
	public void update(Ticket ticket) throws DBServiceException;
	
	public void deleteById(Integer id) throws DBServiceException;
	
}
