package ua.be.dc.services.sellingService.db.service.impl;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import ua.be.dc.services.sellingService.db.dao.EventOrganizerDAO;
import ua.be.dc.services.sellingService.db.service.IDBEventOrganizerService;
import ua.be.dc.services.sellingService.db.service.exception.DBServiceException;
import ua.be.dc.services.sellingService.models.EventOrganizer;

public class DBEventOrganizerImpl implements IDBEventOrganizerService {

	private static Logger logger = LogManager.getLogger(DBEventOrganizerImpl.class.getName());
	
	private EventOrganizerDAO eventOrganizerDAO = new EventOrganizerDAO();
	
	@Override
	public EventOrganizer getById(Integer id) {
		EventOrganizer eventOrganizer = eventOrganizerDAO.selectById(id);
		
		logger.trace("Retrieved event organizer with ID " + id);
		
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
		} catch (Exception e) {
			throw new DBServiceException("The event organizer could not be inserted. " + e.getMessage());
		}
	}

	@Override
	public void update(EventOrganizer eventOrganizer) throws DBServiceException {
		try {
			eventOrganizerDAO.update(eventOrganizer);

			logger.trace("Updated event organizer with ID " + eventOrganizer.getId());
		} catch (Exception e) {
			throw new DBServiceException("The event organizer could not be updated. " + e.getMessage());
		}
	}

	@Override
	public void deleteById(Integer id) throws DBServiceException {
		try {
			eventOrganizerDAO.delete(id);
			
			logger.trace("Deleted event organizer with ID " + id);
		} catch (Exception e) {
			throw new DBServiceException("The event organizer could not be deleted. " + e.getMessage());
		}
	}

}
