package ua.be.dc.services.seatAccommodation.db.service.impl;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import ua.be.dc.services.seatAccommodation.db.dao.EventDAO;
import ua.be.dc.services.seatAccommodation.db.service.IDBEventService;
import ua.be.dc.services.seatAccommodation.db.service.test.DBEventServiceTest;
import ua.be.dc.services.seatAccommodation.models.Event;

public class DBEventServiceImpl implements IDBEventService {

	private static Logger logger = LogManager.getLogger(DBEventServiceImpl.class
			.getName());
	private EventDAO eventDAO;

	@Override
	public List<Event> getAll() throws Exception {
		eventDAO = new EventDAO();
		List<Event> events = eventDAO.selectAll();
		
		logger.trace("Retrieved " + events.size() + " events");
		return events;
	}

	@Override
	public Event getById(Event event) throws Exception {
		eventDAO = new EventDAO();
		if (event.getId() == null)
			throw new Exception("The event id can't be empty");
		
		logger.trace("Retrieved event with ID " + event.getId());
		return eventDAO.selectById(event.getId());
	}

	@Override
	public void insert(Event event) throws Exception {
		eventDAO = new EventDAO();
		eventDAO.insert(event);
		
		logger.trace("Inserted event with ID " + event.getId());
	}

	@Override
	public void update(Event origEvent, Event newEvent) throws Exception {
		eventDAO = new EventDAO();
		Event event = eventDAO.selectById(origEvent.getId());
		event.setName(newEvent.getName());
		eventDAO.update(event);
		
		logger.trace("Updated event with ID " + event.getId());
	}

	@Override
	public void deleteById(Event event) throws Exception {
		eventDAO = new EventDAO();
		if (event.getId() == null)
			throw new Exception("The event id can't be empty");
		
		eventDAO.delete(event.getId());
		
		logger.trace("Deleted event with ID " + event.getId());
	}

}
