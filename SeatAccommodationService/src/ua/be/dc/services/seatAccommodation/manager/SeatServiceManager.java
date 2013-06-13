package ua.be.dc.services.seatAccommodation.manager;

import java.util.List;

import ua.be.dc.services.seatAccommodation.db.service.IDBEventSeatService;
import ua.be.dc.services.seatAccommodation.db.service.IDBSeatService;
import ua.be.dc.services.seatAccommodation.db.service.exception.DBServiceException;
import ua.be.dc.services.seatAccommodation.db.service.impl.DBEventSeatServiceImpl;
import ua.be.dc.services.seatAccommodation.db.service.impl.DBSeatServiceImpl;
import ua.be.dc.services.seatAccommodation.models.Event;
import ua.be.dc.services.seatAccommodation.models.EventSeat;
import ua.be.dc.services.seatAccommodation.models.Seat;

public class SeatServiceManager implements ISeatServiceManager {
	
	private IDBSeatService dbSeatService = new DBSeatServiceImpl();
	private IDBEventSeatService dbEventSeatService = new DBEventSeatServiceImpl();

	@Override
	public List<Seat> getSeats() {
		return dbSeatService.getAll();
	}

	@Override
	public void deleteSeatById(Integer seatId) throws Exception {
		dbSeatService.deleteById(seatId);
	}

	/**
	 * Inserts the Seat and the EventSeat associated with the Event
	 */
	@Override
	public void createSeatForEvent(Event event, Seat seat) throws Exception {
		try {			
			EventSeat eventSeat = new EventSeat();
			eventSeat.setEvent(event);
			eventSeat.setSeat(seat);
			
			dbEventSeatService.addSeatAndInsert(eventSeat);
		} catch (Exception e) {
			throw new Exception("The seat couldn't be added. " + e.getMessage());
		}
	}

	@Override
	public void createSeat(Seat seat) throws Exception {
		try {
			dbSeatService.insert(seat);
		} catch (DBServiceException e) {
			throw new Exception("The seat couldn't be added. " + e.getMessage());
		}
	}
}
