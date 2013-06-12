package ua.be.dc.services.seatAccommodation.manager;

import java.util.List;

import ua.be.dc.services.seatAccommodation.models.Event;
import ua.be.dc.services.seatAccommodation.models.EventSeat;

public interface IEventSeatServiceManager {

	public List<EventSeat> getEventSeats();

	public List<EventSeat> getEventSeats(Event event);
	
	public void createEventSeat(EventSeat eventSeat) throws Exception;

	public void removeEventSeat(EventSeat eventSeat) throws Exception;

	public void removeEventSeats(Event event) throws Exception;

}
