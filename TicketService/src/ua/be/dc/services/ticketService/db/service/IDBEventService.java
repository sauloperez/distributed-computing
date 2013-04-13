package ua.be.dc.services.ticketService.db.service;

import java.util.List;

import ua.be.dc.services.ticketService.models.Event;

public interface IDBEventService {
	
	public List<Event> getAll();
	
	public Event getById(Integer id);
	
	public void insert(Event event);
	
	public void update(Event event);
	
	public void deleteById(Integer id);

}
