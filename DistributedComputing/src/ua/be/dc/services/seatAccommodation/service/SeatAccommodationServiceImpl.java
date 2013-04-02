package ua.be.dc.services.seatAccommodation.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import ua.be.dc.services.seatAccommodation.db.service.IDBEventService;
import ua.be.dc.services.seatAccommodation.db.service.impl.DBEventServiceImpl;
import ua.be.dc.services.seatAccommodation.models.Event;


public class SeatAccommodationServiceImpl implements SeatAccommodationService {
	
	private static Logger logger = LogManager
			.getLogger(SeatAccommodationServiceImpl.class.getName());
	
	private static IDBEventService dbEventService = new DBEventServiceImpl(); 
	
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
		return null;
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
