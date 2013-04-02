package ua.be.dc.services.seatAccommodation.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import ua.be.dc.services.seatAccommodation.db.service.IDBEventSeatService;
import ua.be.dc.services.seatAccommodation.db.service.IDBEventService;
import ua.be.dc.services.seatAccommodation.db.service.impl.DBEventSeatServiceImpl;
import ua.be.dc.services.seatAccommodation.db.service.impl.DBEventServiceImpl;
import ua.be.dc.services.seatAccommodation.models.Event;
import ua.be.dc.services.seatAccommodation.models.EventSeat;


public class SeatAccommodationServiceImpl implements SeatAccommodationService {
	
	private static Logger logger = LogManager
			.getLogger(SeatAccommodationServiceImpl.class.getName());
	
	private static IDBEventService dbEventService;
	private static IDBEventSeatService dbEventSeatService;
	
	/**
     * 
     * @param 
     */
	public void registerEvent(Event event) {
		try {
			dbEventService.insert(event);
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
	}

	@Override
	public Integer getTotalNumber(Event event) {
		dbEventSeatService = new DBEventSeatServiceImpl();
		List<EventSeat> eventSeats = dbEventSeatService.getByEventId(event.getId());
		return eventSeats.size();
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
