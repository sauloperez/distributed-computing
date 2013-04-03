package ua.be.dc.services.seatAccommodation.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import ua.be.dc.services.seatAccommodation.db.service.IDBEventSeatService;
import ua.be.dc.services.seatAccommodation.db.service.IDBSeatService;
import ua.be.dc.services.seatAccommodation.db.service.impl.DBEventSeatServiceImpl;
import ua.be.dc.services.seatAccommodation.db.service.impl.DBSeatServiceImpl;
import ua.be.dc.services.seatAccommodation.models.Event;
import ua.be.dc.services.seatAccommodation.models.EventSeat;
import ua.be.dc.services.seatAccommodation.models.Seat;
import ua.be.dc.services.seatAccommodation.models.SeatType;

public class SeatAccommodationServiceImpl implements SeatAccommodationService {

	private static Logger logger = LogManager
			.getLogger(SeatAccommodationServiceImpl.class.getName());

	private static IDBEventSeatService dbEventSeatService;
	private static IDBSeatService dbSeatService;

	@Override
	public List<Seat> getSeatsByEvent(Event event) {
		logger.trace("init");
		dbEventSeatService = new DBEventSeatServiceImpl();

		List<Seat> seats = new ArrayList<Seat>();
		List<EventSeat> eventSeats = dbEventSeatService.getByEventId(event.getId());
		
		logger.trace("Got " + eventSeats.size() + " seats for the event " + event.getId());

		for (EventSeat eventSeat : eventSeats) {
			seats.add(eventSeat.getSeat());
		}

		logger.trace("end");
		return seats;
	}

	@Override
	public List<Seat> getSeatsByEventAndType(Event event, SeatType seatType) {
		logger.trace("init");
		dbEventSeatService = new DBEventSeatServiceImpl();

		List<Seat> seats = new ArrayList<Seat>();
		List<EventSeat> eventSeats = dbEventSeatService.getByEventIdAndTypeId(event.getId(), seatType.getId());

		logger.trace("Got " + eventSeats.size() + " seats for the event " + event.getId());
		
		for (EventSeat eventSeat : eventSeats) {
			seats.add(eventSeat.getSeat());
		}

		logger.trace("end");
		return seats;
	}

	@Override
	public Seat getSeatById(Integer id) {
		logger.trace("init");
		
		dbSeatService = new DBSeatServiceImpl();
		Seat seat = dbSeatService.getById(id);
		
		logger.trace("end");
		return seat;
	}

	@Override
	public Boolean create(Integer seatNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean update(Integer seatNumber, Integer newSeatNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean delete(Integer seatNumber) {
		// TODO Auto-generated method stub
		return null;
	}

}
