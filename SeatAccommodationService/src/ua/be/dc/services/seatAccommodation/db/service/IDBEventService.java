package ua.be.dc.services.seatAccommodation.db.service;

import java.util.List;

import ua.be.dc.services.seatAccommodation.db.service.exception.DBServiceException;
import ua.be.dc.services.seatAccommodation.models.Event;

public interface IDBEventService {
	
	public List<Event> getAll();
	
	public Event getById(Integer id);
	
	public void insert(Event event) throws DBServiceException;
	
	public void update(Event event) throws DBServiceException;
	
	public void deleteById(Integer id) throws DBServiceException;

}
