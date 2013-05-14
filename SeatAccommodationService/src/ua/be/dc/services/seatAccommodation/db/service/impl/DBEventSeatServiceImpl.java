package ua.be.dc.services.seatAccommodation.db.service.impl;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import ua.be.dc.services.seatAccommodation.db.dao.EventDAO;
import ua.be.dc.services.seatAccommodation.db.dao.EventSeatDAO;
import ua.be.dc.services.seatAccommodation.db.dao.SeatDAO;
import ua.be.dc.services.seatAccommodation.db.service.IDBEventSeatService;
import ua.be.dc.services.seatAccommodation.db.service.exception.DBServiceException;
import ua.be.dc.services.seatAccommodation.models.Event;
import ua.be.dc.services.seatAccommodation.models.EventSeat;
import ua.be.dc.services.seatAccommodation.models.Seat;

public class DBEventSeatServiceImpl implements IDBEventSeatService {
	
	private static Logger logger = LogManager.getLogger(DBEventSeatServiceImpl.class
			.getName());
	
	private EventSeatDAO eventSeatDAO;

	@Override
	public EventSeat getById(Integer id) {
		eventSeatDAO = new EventSeatDAO();
		EventSeat eventSeat = eventSeatDAO.selectById(id);
		
		logger.trace("Retrieved EventSeat with ID " + eventSeat.getId());
		
		return eventSeat;
	}

	@Override
	public List<EventSeat> getByEventId(Integer eventId) {
		eventSeatDAO = new EventSeatDAO();
		List<EventSeat> eventSeats = eventSeatDAO.selectByEventId(eventId);
		
		logger.trace("Retrieved " + eventSeats.size() + " EventSeats");
		
		return eventSeats;
	}
	
	@Override
	public List<EventSeat> getByEventIdAndTypeId(Integer eventId, Integer typeId) {
		eventSeatDAO = new EventSeatDAO();
		List<EventSeat> eventSeats = eventSeatDAO.selectByEventIdAndTypeId(eventId, typeId);
		
		logger.trace("Retrieved " + eventSeats.size() + " EventSeats");
		
		return eventSeats;
	}
	
	@Override
	public List<EventSeat> getAll() {
		eventSeatDAO = new EventSeatDAO();
		List<EventSeat> eventSeats = eventSeatDAO.selectAll();
		
		logger.trace("Retrieved " + eventSeats.size() + " EventSeats");
		
		return eventSeats;
	}

	@Override
	public void insert(EventSeat eventSeat) throws DBServiceException {
		try {
			eventSeatDAO = new EventSeatDAO();
			eventSeatDAO.insert(eventSeat);

			logger.trace("Inserted EventSeat with ID " + eventSeat.getId());
		} catch (Exception e) {
			throw new DBServiceException("The eventSeat could not be inserted. " + e.getMessage());
		}
		
	}
	
	@Override
	public void addSeatAndInsert(EventSeat eventSeat) throws DBServiceException {
		try {
			eventSeatDAO = new EventSeatDAO();
			eventSeatDAO.addSeatAndInsert(eventSeat);

			logger.trace("Inserted EventSeat with ID " + eventSeat.getId());
		} catch (Exception e) {
			throw new DBServiceException("The eventSeat could not be inserted. " + e.getMessage());
		}
		
	}

	@Override
	public void update(EventSeat eventSeat) throws DBServiceException {
		try {
			eventSeatDAO = new EventSeatDAO();
			eventSeatDAO.update(eventSeat);

			logger.trace("Updated EventSeat with ID " + eventSeat.getId());
		} catch (Exception e) {
			throw new DBServiceException("The eventSeat could not be updated. " + e.getMessage());
		}
		
	}

	@Override
	public void deleteById(Integer id) throws DBServiceException {
		try {
			eventSeatDAO = new EventSeatDAO();
			eventSeatDAO.delet(id);

			logger.trace("Deleted EventSeat with ID " + id);
		} catch (Exception e) {
			throw new DBServiceException("The eventSeat could not be deleted. " + e.getMessage());
		}
		
	}
}
