package ua.be.dc.services.ticketService.db.service;

import java.util.List;

import ua.be.dc.services.ticketService.db.service.exception.DBServiceException;
import ua.be.dc.services.ticketService.models.Event;

public interface IDBEventService {
	
	public List<Event> getAll();
	
	public Event getById(Integer id);
	
	public Event getByToken(String token);
	
	public void insert(Event event) throws DBServiceException;
	
	public void update(Event event) throws DBServiceException;
	
	public void deleteById(Integer id) throws DBServiceException;

}
