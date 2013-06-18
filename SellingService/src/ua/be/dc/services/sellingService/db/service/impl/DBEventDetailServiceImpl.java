package ua.be.dc.services.sellingService.db.service.impl;

import java.util.List;

import org.apache.ibatis.exceptions.PersistenceException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import ua.be.dc.services.sellingService.db.dao.EventDetailDAO;
import ua.be.dc.services.sellingService.db.dao.exception.DAOException;
import ua.be.dc.services.sellingService.db.service.IDBEventDetailService;
import ua.be.dc.services.sellingService.db.service.exception.DBServiceException;
import ua.be.dc.services.sellingService.models.EventDetail;

public class DBEventDetailServiceImpl implements IDBEventDetailService {

private static Logger logger = LogManager.getLogger(DBEventDetailServiceImpl.class.getName());
	
	private EventDetailDAO eventDetailDAO = new EventDetailDAO();
	
	@Override
	public EventDetail getById(Integer id) {
		EventDetail eventDetail = eventDetailDAO.selectById(id);
		
		if (eventDetail == null) {
			logger.trace("EventDetail with ID " + id + " not found");
		}
		else {
			logger.trace("Retrieved eventDetail with ID " + id);
		}
		
		return eventDetail;
	}

	@Override
	public List<EventDetail> getAll() {
		List<EventDetail> eventDetails = eventDetailDAO.selectAll();
		
		logger.trace("Retrieved " + eventDetails.size() + " eventDetails");
		
		return eventDetails;
	}

	@Override
	public void insert(EventDetail eventDetail) throws DBServiceException {
		try {
			eventDetailDAO.insert(eventDetail);
			
			logger.trace("Inserted eventDetail with ID " + eventDetail.getId());
		} catch (PersistenceException e) {
			throw new DBServiceException("The eventDetail could not be inserted. " + e.getMessage());
		}
	}

	@Override
	public void update(EventDetail eventDetail) throws DBServiceException {
		try {
			eventDetailDAO.update(eventDetail);

			logger.trace("Updated eventDetail with ID " + eventDetail.getId());
		} catch (DAOException e) {
			throw new DBServiceException("The eventDetail could not be updated. " + e.getMessage());
		}
	}

	@Override
	public void deleteById(Integer id) throws DBServiceException {
		try {
			eventDetailDAO.delete(id);
			
			logger.trace("Deleted eventDetail with ID " + id);
		} catch (DAOException e) {
			throw new DBServiceException("The eventDetail could not be updated. " + e.getMessage());
		}
	}

}
