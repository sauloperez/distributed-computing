package ua.be.dc.services.seatAccommodation.service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.jws.WebService;

import ua.be.dc.services.seatAccommodation.db.service.IDBEventSeatService;
import ua.be.dc.services.seatAccommodation.db.service.IDBEventService;
import ua.be.dc.services.seatAccommodation.db.service.exception.DBServiceException;
import ua.be.dc.services.seatAccommodation.db.service.impl.DBEventSeatServiceImpl;
import ua.be.dc.services.seatAccommodation.db.service.impl.DBEventServiceImpl;
import ua.be.dc.services.seatAccommodation.models.Event;
import ua.be.dc.services.seatAccommodation.models.EventSeat;
import ua.be.dc.services.seatAccommodation.models.Seat;
import ua.be.dc.services.seatAccommodation.models.SeatType;

@WebService(endpointInterface = "ua.be.dc.services.seatAccommodation.service.SeatAccommodationService")
public class SeatAccommodationServiceImpl implements SeatAccommodationService {

	private static IDBEventSeatService dbEventSeatService = new DBEventSeatServiceImpl();
	private static IDBEventService dbEventService = new DBEventServiceImpl();
	

	@Override
	public Seat[] getSeatsByEvent(Event event) {
		System.out.println(event);
		
		List<Seat> seatsList = new ArrayList<Seat>();
		List<EventSeat> eventSeats = dbEventSeatService.getByEventToken(event.getToken());
		
		for (EventSeat eventSeat : eventSeats) {
			seatsList.add(eventSeat.getSeat());
		}

		return seatsList.toArray(new Seat[seatsList.size()]);
	}

	@Override
	public Seat[] getSeatsByEventAndType(Event event, SeatType seatType) {
		List<Seat> seatsList = new ArrayList<Seat>();
		List<EventSeat> eventSeats = dbEventSeatService.getByEventTokenAndTypeId(event.getToken(), seatType.getId());

		for (EventSeat eventSeat : eventSeats) {
			seatsList.add(eventSeat.getSeat());
		}

		return seatsList.toArray(new Seat[seatsList.size()]);
	}

	/**
	 * Callback executed by TicketService when a new event is created
	 * @throws Exception 
	 */
	@Override
	public void registerEvent(Event event) throws Exception {
		try {
			Date date = new Date(event.getTimestamp());
			event.setDate(new Timestamp(date.getTime()));
			event.setToken(event.getToken());

			dbEventService.insert(event);
		} catch (DBServiceException e) {
			throw new Exception(e.getMessage());
		}
	}
	
	/**
	 * Callback executed by TicketService when an event is removed
	 * @throws Exception 
	 */
	@Override
	public void unregisterEvent(Event event) throws Exception {
		try {
			dbEventService.deleteByToken(event.getToken());
		} catch (DBServiceException e) {
			throw new Exception(e.getMessage());
		}
	}
}
