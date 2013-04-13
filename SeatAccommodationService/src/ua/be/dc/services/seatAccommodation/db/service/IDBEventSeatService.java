package ua.be.dc.services.seatAccommodation.db.service;

import java.util.List;

import ua.be.dc.services.seatAccommodation.models.EventSeat;

public interface IDBEventSeatService {

	public EventSeat getById(Integer id);
	
	public List<EventSeat> getByEventId(Integer eventId);
	
	public List<EventSeat> getByEventIdAndTypeId(Integer eventId, Integer typeId);
	
	public List<EventSeat> getAll();
	
	public void insert(EventSeat eventSeat);
	
	public void update(EventSeat eventSeat);
	
	public void deleteById(Integer id);
}
