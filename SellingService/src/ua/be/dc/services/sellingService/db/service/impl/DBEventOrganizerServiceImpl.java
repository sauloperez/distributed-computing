package ua.be.dc.services.sellingService.db.service.impl;

import java.util.List;

import org.apache.ibatis.exceptions.PersistenceException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import ua.be.dc.services.sellingService.db.dao.EventOrganizerDAO;
import ua.be.dc.services.sellingService.db.dao.exception.DAOException;
import ua.be.dc.services.sellingService.db.service.IDBEventOrganizerService;
import ua.be.dc.services.sellingService.db.service.exception.DBServiceException;
import ua.be.dc.services.sellingService.models.EventOrganizer;

public class DBEventOrganizerServiceImpl implements IDBEventOrganizerService {

	private static Logger logger = LogManager.getLogger(DBEventOrganizerServiceImpl.class.getName());
	
	private EventOrganizerDAO eventOrganizerDAO = new EventOrganizerDAO();
	
	@Override
	public EventOrganizer getById(Integer id) {
		EventOrganizer eventOrganizer = eventOrganizerDAO.selectById(id);
		
		if (eventOrganizer == null) {
			logger.trace("Event organizer with ID " + id + " not found");
		}
		else {
			logger.trace("Retrieved event organizer with ID " + id);
		}
		
		return eventOrganizer;
	}
	
	@Override
	public EventOrganizer getByToken(String eventOrganizerToken) {
		EventOrganizer eventOrganizer = eventOrganizerDAO.selectByToken(eventOrganizerToken);
		
		if (eventOrganizer == null) {
			logger.trace("Event organizer with token " + eventOrganizerToken + " not found");
		}
		else {
			logger.trace("Retrieved event organizer with token " + eventOrganizerToken);
		}
		
		return eventOrganizer;
	}

	@Override
	public List<EventOrganizer> getAll() {
		List<EventOrganizer> eventOrganizers = eventOrganizerDAO.selectAll();
		
		logger.trace("Retrieved " + eventOrganizers.size() + " event organizers");
		
		return eventOrganizers;
	}

	@Override
	public void insert(EventOrganizer eventOrganizer) throws DBServiceException {
		try {
			eventOrganizerDAO.insert(eventOrganizer);
			
			logger.trace("Inserted event organizer with ID " + eventOrganizer.getId());
		} catch (PersistenceException e) {
			throw new DBServiceException("The event organizer could not be inserted. " + e.getMessage());
		}
	}

	@Override
	public void update(EventOrganizer eventOrganizer) throws DBServiceException {
		try {
			eventOrganizerDAO.update(eventOrganizer);

			logger.trace("Updated event organizer with ID " + eventOrganizer.getId());
		} catch (DAOException e) {
			throw new DBServiceException("The event organizer could not be updated. " + e.getMessage());
		}
	}

	@Override
	public void deleteById(Integer id) throws DBServiceException {
		try {
			eventOrganizerDAO.delete(id);
			
			logger.trace("Deleted event organizer with ID " + id);
		} catch (PersistenceException e) {
			throw new DBServiceException("The event organizer could not be deleted because it is still in use");
		} catch (DAOException e) {
			throw new DBServiceException("The event organizer could not be deleted. " + e.getMessage());
		}
	}

}
