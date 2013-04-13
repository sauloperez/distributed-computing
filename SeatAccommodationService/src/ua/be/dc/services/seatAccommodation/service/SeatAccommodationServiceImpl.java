package ua.be.dc.services.seatAccommodation.service;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import ua.be.dc.services.seatAccommodation.db.service.IDBEventSeatService;
import ua.be.dc.services.seatAccommodation.db.service.IDBSeatService;
import ua.be.dc.services.seatAccommodation.db.service.impl.DBEventSeatServiceImpl;
import ua.be.dc.services.seatAccommodation.db.service.impl.DBSeatServiceImpl;
import ua.be.dc.services.seatAccommodation.models.Event;
import ua.be.dc.services.seatAccommodation.models.EventSeat;
import ua.be.dc.services.seatAccommodation.models.Seat;
import ua.be.dc.services.seatAccommodation.models.SeatType;

@WebService(endpointInterface = "ua.be.dc.services.seatAccommodation.service.SeatAccommodationService")
public class SeatAccommodationServiceImpl implements SeatAccommodationService {

	private static IDBEventSeatService dbEventSeatService;
	private static IDBSeatService dbSeatService;

	@Override
	public Seat[] getSeatsByEvent(Event event) {
		dbEventSeatService = new DBEventSeatServiceImpl();

		List<Seat> seatsList = new ArrayList<Seat>();
		List<EventSeat> eventSeats = dbEventSeatService.getByEventId(event.getId());
		
		for (EventSeat eventSeat : eventSeats) {
			seatsList.add(eventSeat.getSeat());
		}

		return seatsList.toArray(new Seat[seatsList.size()]);
	}

	@Override
	public Seat[] getSeatsByEventAndType(Event event, SeatType seatType) {
		dbEventSeatService = new DBEventSeatServiceImpl();

		List<Seat> seatsList = new ArrayList<Seat>();
		List<EventSeat> eventSeats = dbEventSeatService.getByEventIdAndTypeId(event.getId(), seatType.getId());

		for (EventSeat eventSeat : eventSeats) {
			seatsList.add(eventSeat.getSeat());
		}

		return seatsList.toArray(new Seat[seatsList.size()]);
	}

	@Override
	public Seat getSeatById(Integer id) {
		dbSeatService = new DBSeatServiceImpl();
		Seat seat = dbSeatService.getById(id);
		
		return seat;
	}

	@Override
	public String test() {
		return "test";
	}

}
