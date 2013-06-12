package ua.be.dc.services.seatAccommodation.db.service.impl;

import java.util.List;

import org.apache.ibatis.exceptions.PersistenceException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import ua.be.dc.services.seatAccommodation.db.dao.EventDAO;
import ua.be.dc.services.seatAccommodation.db.service.IDBEventService;
import ua.be.dc.services.seatAccommodation.db.service.exception.DBServiceException;
import ua.be.dc.services.seatAccommodation.models.Event;

public class DBEventServiceImpl implements IDBEventService {

	private static Logger logger = LogManager.getLogger(DBEventServiceImpl.class.getName());
	
	private EventDAO eventDAO = new EventDAO();

	@Override
	public List<Event> getAll() {
		List<Event> events = eventDAO.selectAll();
		
		logger.trace("Retrieved " + events.size() + " events");
		return events;
	}

	@Override
	public Event getById(Integer id) {
		Event event = eventDAO.selectById(id);
		
		if (event == null) {
			logger.trace("Event with ID " + id + " not found");
		}
		else {
			logger.trace("Retrieved event with ID " + id);
		}
		
		
		return event;
	}

	@Override
	public void insert(Event event) throws DBServiceException {
		try {
			eventDAO.insert(event);

			logger.trace("Inserted event with ID " + event.getId());
		} catch (PersistenceException e) {
			throw new DBServiceException("The event could not be inserted. " + e.getCause().getMessage());
		}
		
	}

	@Override
	public void update(Event event) throws DBServiceException {
		try {
			eventDAO.update(event);

			logger.trace("Updated event with ID " + event.getId());
		} catch (Exception e) {
			throw new DBServiceException("The event could not be updated. " + e.getMessage());
		}
		
	}

	@Override
	public void deleteById(Integer id) throws DBServiceException {
		try {
			eventDAO.delete(id);
			
			logger.trace("Deleted event with ID " + id);
		} catch (Exception e) {
			throw new DBServiceException("The event could not be deleted. " + e.getMessage());
		}
	}

}
