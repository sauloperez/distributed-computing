package ua.be.dc.services.ticketService.db.service.impl;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import ua.be.dc.services.ticketService.db.dao.EventDAO;
import ua.be.dc.services.ticketService.db.service.IDBEventService;
import ua.be.dc.services.ticketService.models.Event;

public class DBEventServiceImpl implements IDBEventService {

	private static Logger logger = LogManager.getLogger(DBEventServiceImpl.class
			.getName());
	
	private EventDAO eventDAO;

	@Override
	public List<Event> getAll() {
		eventDAO = new EventDAO();
		List<Event> events = eventDAO.selectAll();
		
		logger.trace("Retrieved " + events.size() + " events");
		return events;
	}

	@Override
	public Event getById(Integer id) {
		eventDAO = new EventDAO();
		Event event = eventDAO.selectById(id);
		
		logger.trace("Retrieved event with ID " + id);
		
		return event;
	}

	@Override
	public void insert(Event event) {
		eventDAO = new EventDAO();
		eventDAO.insert(event);
		
		logger.trace("Inserted event with ID " + event.getId());
	}

	@Override
	public void update(Event event) {
		eventDAO.update(event);
		
		logger.trace("Updated event with ID " + event.getId());
	}

	@Override
	public void deleteById(Integer id) {
		eventDAO = new EventDAO();
		eventDAO.delete(id);
		
		logger.trace("Deleted event with ID " + id);
	}
}
