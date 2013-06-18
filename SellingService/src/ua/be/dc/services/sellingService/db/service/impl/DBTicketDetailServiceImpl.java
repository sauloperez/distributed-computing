package ua.be.dc.services.sellingService.db.service.impl;

import java.util.List;

import org.apache.ibatis.exceptions.PersistenceException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import ua.be.dc.services.sellingService.db.dao.TicketDetailDAO;
import ua.be.dc.services.sellingService.db.dao.exception.DAOException;
import ua.be.dc.services.sellingService.db.service.IDBTicketDetailService;
import ua.be.dc.services.sellingService.db.service.exception.DBServiceException;
import ua.be.dc.services.sellingService.models.TicketDetail;

public class DBTicketDetailServiceImpl implements IDBTicketDetailService {

	private static Logger logger = LogManager.getLogger(DBTicketDetailServiceImpl.class.getName());
	
	private TicketDetailDAO ticketDetailDAO = new TicketDetailDAO();
	
	@Override
	public TicketDetail getById(Integer id) {
		TicketDetail ticketDetail = ticketDetailDAO.selectById(id);
		
		if (ticketDetail == null) {
			logger.trace("TicketDetail with ID " + id + " not found");
		}
		else {
			logger.trace("Retrieved ticketDetail with ID " + id);
		}
		
		return ticketDetail;
	}

	@Override
	public List<TicketDetail> getAll() {
		List<TicketDetail> ticketDetails = ticketDetailDAO.selectAll();
		
		logger.trace("Retrieved " + ticketDetails.size() + " ticketDetails");
		
		return ticketDetails;
	}
	
	@Override
	public List<TicketDetail> getByOrderDetailId(Integer orderDetailId) {
		List<TicketDetail> ticketDetails = ticketDetailDAO.selectByOrderDetailId(orderDetailId);
		
		logger.trace("Retrieved " + ticketDetails.size() + " ticketDetails");
		
		return ticketDetails;
	}

	@Override
	public void insert(TicketDetail ticketDetail) throws DBServiceException {
		try {
			ticketDetailDAO.insert(ticketDetail);
			
			logger.trace("Inserted ticketDetail with ID " + ticketDetail.getId());
		} catch (PersistenceException e) {
			throw new DBServiceException("The ticketDetail could not be inserted. " + e.getMessage());
		}
	}

	@Override
	public void update(TicketDetail ticketDetail) throws DBServiceException {
		try {
			ticketDetailDAO.update(ticketDetail);

			logger.trace("Updated ticketDetail with ID " + ticketDetail.getId());
		} catch (DAOException e) {
			throw new DBServiceException("The ticketDetail could not be updated. " + e.getMessage());
		}
	}

	@Override
	public void deleteById(Integer id) throws DBServiceException {
		try {
			ticketDetailDAO.delete(id);
			
			logger.trace("Deleted ticketDetail with ID " + id);
		} catch (DAOException e) {
			throw new DBServiceException("The ticketDetail could not be updated. " + e.getMessage());
		}
	}

}
