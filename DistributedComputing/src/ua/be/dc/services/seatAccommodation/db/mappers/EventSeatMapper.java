package ua.be.dc.services.seatAccommodation.db.mappers;

import java.util.List;

import ua.be.dc.services.seatAccommodation.models.EventSeat;

public interface EventSeatMapper {

	public EventSeat selectById(Integer id);
	
	public List<EventSeat> selectByEventId(Integer eventId);
	
	public List<EventSeat> selectAll();
	
	public void insert(EventSeat eventSeat);
	
	public void update(EventSeat eventSeat);
	
	public void delete(Integer id);
}
