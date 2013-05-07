package ua.be.dc.services.seatAccommodation.service;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import ua.be.dc.services.seatAccommodation.db.service.IDBEventSeatService;
import ua.be.dc.services.seatAccommodation.db.service.IDBEventService;
import ua.be.dc.services.seatAccommodation.db.service.IDBSeatService;
import ua.be.dc.services.seatAccommodation.db.service.impl.DBEventSeatServiceImpl;
import ua.be.dc.services.seatAccommodation.db.service.impl.DBEventServiceImpl;
import ua.be.dc.services.seatAccommodation.db.service.impl.DBSeatServiceImpl;
import ua.be.dc.services.seatAccommodation.models.Event;
import ua.be.dc.services.seatAccommodation.models.EventSeat;
import ua.be.dc.services.seatAccommodation.models.Seat;
import ua.be.dc.services.seatAccommodation.models.SeatType;

@WebService(endpointInterface = "ua.be.dc.services.seatAccommodation.service.SeatAccommodationService")
public class SeatAccommodationServiceImpl implements SeatAccommodationService {

	private static IDBEventSeatService dbEventSeatService = new DBEventSeatServiceImpl();
	private static IDBEventService dbEventService = new DBEventServiceImpl();
	private static IDBSeatService dbSeatService = new DBSeatServiceImpl();
	

	@Override
	public Seat[] getSeatsByEvent(Event event) {
		List<Seat> seatsList = new ArrayList<Seat>();
		List<EventSeat> eventSeats = dbEventSeatService.getByEventId(event.getId());
		
		for (EventSeat eventSeat : eventSeats) {
			seatsList.add(eventSeat.getSeat());
		}

		return seatsList.toArray(new Seat[seatsList.size()]);
	}

	@Override
	public Seat[] getSeatsByEventAndType(Event event, SeatType seatType) {
		List<Seat> seatsList = new ArrayList<Seat>();
		List<EventSeat> eventSeats = dbEventSeatService.getByEventIdAndTypeId(event.getId(), seatType.getId());

		for (EventSeat eventSeat : eventSeats) {
			seatsList.add(eventSeat.getSeat());
		}

		return seatsList.toArray(new Seat[seatsList.size()]);
	}

	@Override
	public Seat getSeatById(Integer id) {
		Seat seat = dbSeatService.getById(id);
		
		return seat;
	}

	/**
	 * Callback executed by TicketService when a new event is created
	 */
	@Override
	public void registerEvent(Event event) {
		dbEventService.insert(event);
	}
	
	/**
	 * Callback executed by TicketService when an event is removed
	 */
	@Override
	public void unregisterEvent(Event event) {
		dbEventService.deleteById(event.getId());
	}
	
	@Override
	public String test() {
		return "Hello, I'm Seat Accommodation Service";
	}
}
