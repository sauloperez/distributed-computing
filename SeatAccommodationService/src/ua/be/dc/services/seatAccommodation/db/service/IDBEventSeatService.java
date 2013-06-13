package ua.be.dc.services.seatAccommodation.db.service;

import java.util.List;

import ua.be.dc.services.seatAccommodation.db.service.exception.DBServiceException;
import ua.be.dc.services.seatAccommodation.models.EventSeat;

public interface IDBEventSeatService {

	public EventSeat getById(Integer id);
	
	public List<EventSeat> getByEventId(Integer eventId);
	
	public List<EventSeat> getByEventToken(String token);
	
	public List<EventSeat> getByEventIdAndTypeId(Integer eventId, Integer typeId);
	
	public List<EventSeat> getByEventTokenAndTypeId(String token, Integer typeId);
	
	public List<EventSeat> getAll();
	
	public void insert(EventSeat eventSeat) throws DBServiceException;
	
	public void addSeatAndInsert(EventSeat eventSeat) throws DBServiceException;
	
	public void update(EventSeat eventSeat) throws DBServiceException;
	
	public void deleteById(Integer id) throws DBServiceException;
}
