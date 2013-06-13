package ua.be.dc.services.seatAccommodation.db.service.impl;

import java.util.List;

import org.apache.ibatis.exceptions.PersistenceException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import ua.be.dc.services.seatAccommodation.db.dao.EventSeatDAO;
import ua.be.dc.services.seatAccommodation.db.dao.exception.DAOException;
import ua.be.dc.services.seatAccommodation.db.service.IDBEventSeatService;
import ua.be.dc.services.seatAccommodation.db.service.exception.DBServiceException;
import ua.be.dc.services.seatAccommodation.models.EventSeat;
import ua.be.dc.services.seatAccommodation.models.SeatType;

public class DBEventSeatServiceImpl implements IDBEventSeatService {
	
	private static Logger logger = LogManager.getLogger(DBEventSeatServiceImpl.class
			.getName());
	
	private EventSeatDAO eventSeatDAO = new EventSeatDAO();

	@Override
	public EventSeat getById(Integer id) {
		EventSeat eventSeat = eventSeatDAO.selectById(id);
		
		if (eventSeat == null) {
			logger.trace("EventSeat with ID " + id + " not found");
		}
		else {
			logger.trace("Retrieved EventSeat with ID " + eventSeat.getId());
		}
		
		return eventSeat;
	}

	@Override
	public List<EventSeat> getByEventId(Integer eventId) {
		List<EventSeat> eventSeats = eventSeatDAO.selectByEventId(eventId);
		
		logger.trace("Retrieved " + eventSeats.size() + " EventSeats");
		
		return eventSeats;
	}
	
	@Override
	public List<EventSeat> getByEventToken(String token) {
		List<EventSeat> eventSeats = eventSeatDAO.selectByEventToken(token);
		
		logger.trace("Retrieved " + eventSeats.size() + " EventSeats");
		
		return eventSeats;
	}
	
	@Override
	public List<EventSeat> getByEventIdAndTypeId(Integer eventId, Integer typeId) {
		List<EventSeat> eventSeats = eventSeatDAO.selectByEventIdAndTypeId(eventId, typeId);
		
		logger.trace("Retrieved " + eventSeats.size() + " EventSeats");
		
		return eventSeats;
	}
	
	@Override
	public List<EventSeat> getByEventTokenAndTypeId(String token, Integer typeId) {
		List<EventSeat> eventSeats = eventSeatDAO.selectByEventTokenAndTypeId(token, typeId);
		
		logger.trace("Retrieved " + eventSeats.size() + " EventSeats");
		
		return eventSeats;
	}
	
	@Override
	public List<EventSeat> getAll() {
		List<EventSeat> eventSeats = eventSeatDAO.selectAll();
		
		logger.trace("Retrieved " + eventSeats.size() + " EventSeats");
		
		return eventSeats;
	}

	@Override
	public void insert(EventSeat eventSeat) throws DBServiceException {
		try {
			eventSeatDAO.insert(eventSeat);

			logger.trace("Inserted EventSeat with ID " + eventSeat.getId());
		} catch (PersistenceException e) {
			throw new DBServiceException("The eventSeat could not be inserted. " + e.getMessage());
		}
		
	}
	
	@Override
	public void addSeatAndInsert(EventSeat eventSeat) throws DBServiceException {
		try {
			eventSeat.getSeat().setType(new SeatType(1));
			
			eventSeatDAO.addSeatAndInsert(eventSeat);

			logger.trace("Inserted EventSeat with ID " + eventSeat.getId());
		} catch (PersistenceException e) {
			throw new DBServiceException("The eventSeat could not be inserted. " + e.getMessage());
		}
		
	}

	@Override
	public void update(EventSeat eventSeat) throws DBServiceException {
		try {
			eventSeatDAO.update(eventSeat);

			logger.trace("Updated EventSeat with ID " + eventSeat.getId());
		} catch (DAOException e) {
			throw new DBServiceException("The eventSeat could not be updated. " + e.getMessage());
		}
		
	}

	@Override
	public void deleteById(Integer id) throws DBServiceException {
		try {
			eventSeatDAO.delet(id);

			logger.trace("Deleted EventSeat with ID " + id);
		} catch (DAOException e) {
			throw new DBServiceException("The eventSeat could not be deleted. " + e.getMessage());
		}
		
	}
}
