package ua.be.dc.services.seatAccommodation.db.service;

import java.util.List;

import ua.be.dc.services.seatAccommodation.models.Event;

public interface IDBEventService {
	
	public List<Event> getAll() throws Exception;
	
	public Event getById(Event event) throws Exception;
	
	public void insert(Event event) throws Exception;
	
	public void update(Event origEvent, Event newEvent) throws Exception;
	
	public void deleteById(Event event) throws Exception;

}
