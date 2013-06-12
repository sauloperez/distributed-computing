package ua.be.dc.services.seatAccommodation.manager;

import java.util.List;

import ua.be.dc.services.seatAccommodation.db.service.IDBEventSeatService;
import ua.be.dc.services.seatAccommodation.db.service.exception.DBServiceException;
import ua.be.dc.services.seatAccommodation.db.service.impl.DBEventSeatServiceImpl;
import ua.be.dc.services.seatAccommodation.models.Event;
import ua.be.dc.services.seatAccommodation.models.EventSeat;

public class EventSeatServiceManager implements IEventSeatServiceManager {

	private IDBEventSeatService dbEventSeatService = new DBEventSeatServiceImpl();
	
	@Override
	public List<EventSeat> getEventSeats() {
		List<EventSeat> eventSeats = dbEventSeatService.getAll();
		return eventSeats;
	}

	@Override
	public void createEventSeat(EventSeat eventSeat) throws Exception {
		try {
			dbEventSeatService.insert(eventSeat);
		} catch (DBServiceException e) {
			throw new Exception(e.getMessage());
		}
	}

	@Override
	public List<EventSeat> getEventSeats(Event event) {
		List<EventSeat> eventSeats = dbEventSeatService.getByEventId(event.getId());
		return eventSeats;
	}

	@Override
	public void removeEventSeat(EventSeat eventSeat) throws Exception {
		try {
			dbEventSeatService.deleteById(eventSeat.getId());
		} catch (DBServiceException e) {
			throw new Exception(e.getMessage());
		}
	}

	@Override
	public void removeEventSeats(Event event) throws Exception {
		try {
			List<EventSeat> eventSeats = dbEventSeatService.getByEventId(event.getId());
			for (EventSeat eventSeat : eventSeats) {
				dbEventSeatService.deleteById(eventSeat.getId());
			}
		} catch (DBServiceException e) {
			throw new Exception(e.getMessage());
		}
	}
}
