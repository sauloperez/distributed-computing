package ua.be.dc.services.seatAccommodation.db.service.impl;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import ua.be.dc.services.seatAccommodation.db.dao.EventSeatDAO;
import ua.be.dc.services.seatAccommodation.db.service.IDBEventSeatService;
import ua.be.dc.services.seatAccommodation.models.EventSeat;

public class DBEventSeatServiceImpl implements IDBEventSeatService {
	
	private static Logger logger = LogManager.getLogger(DBSeatServiceImpl.class
			.getName());
	
	private EventSeatDAO eventSeatDAO;

	@Override
	public EventSeat getById(Integer id) {
		eventSeatDAO = new EventSeatDAO();
		EventSeat eventSeat = eventSeatDAO.selectById(id);
		
		logger.trace("Retrieved EventSeat: " + eventSeat);
		
		return eventSeat;
	}

	@Override
	public List<EventSeat> getAll() {
		eventSeatDAO = new EventSeatDAO();
		List<EventSeat> eventSeats = eventSeatDAO.selectAll();
		
//		logger.trace("Retrieved " + eventSeats.size() + " EventSeat's");
		
		return eventSeats;
	}

	@Override
	public void insert(EventSeat eventSeat) {
		eventSeatDAO = new EventSeatDAO();
		eventSeatDAO.insert(eventSeat);
		
//		logger.trace("Inserted EventSeat: " + eventSeat);
	}

	@Override
	public void update(EventSeat eventSeat) {
		eventSeatDAO = new EventSeatDAO();
		eventSeatDAO.update(eventSeat);
		
//		logger.trace("Updated EventSeat: " + eventSeat);
	}

	@Override
	public void deleteById(Integer id) {
		eventSeatDAO = new EventSeatDAO();
		eventSeatDAO.delet(id);
		
//		logger.trace("Deleted EventSeat with ID " + id);
	}
	

}
