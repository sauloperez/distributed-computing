package ua.be.dc.services.sellingService.db.service.impl;

import java.util.List;

import org.apache.ibatis.exceptions.PersistenceException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import ua.be.dc.services.sellingService.db.dao.OrderDetailDAO;
import ua.be.dc.services.sellingService.db.dao.exception.DAOException;
import ua.be.dc.services.sellingService.db.service.IDBOrderDetailService;
import ua.be.dc.services.sellingService.db.service.exception.DBServiceException;
import ua.be.dc.services.sellingService.models.OrderDetail;

public class DBOrderDetailServiceImpl implements IDBOrderDetailService {

private static Logger logger = LogManager.getLogger(DBOrderDetailServiceImpl.class.getName());
	
	private OrderDetailDAO orderDetailDAO = new OrderDetailDAO();
	
	@Override
	public OrderDetail getById(Integer id) {
		OrderDetail orderDetail = orderDetailDAO.selectById(id);
		
		if (orderDetail == null) {
			logger.trace("OrderDetail with ID " + id + " not found");
		}
		else {
			logger.trace("Retrieved orderDetail with ID " + id);
		}
		
		return orderDetail;
	}

	@Override
	public List<OrderDetail> getAll() {
		List<OrderDetail> orderDetails = orderDetailDAO.selectAll();
		
		logger.trace("Retrieved " + orderDetails.size() + " orderDetails");
		
		return orderDetails;
	}

	@Override
	public void insert(OrderDetail orderDetail) throws DBServiceException {
		try {
			orderDetailDAO.insert(orderDetail);
			
			logger.trace("Inserted orderDetail with ID " + orderDetail.getId());
		} catch (PersistenceException e) {
			throw new DBServiceException("The orderDetail could not be inserted. " + e.getMessage());
		}
	}

	@Override
	public void update(OrderDetail orderDetail) throws DBServiceException {
		try {
			orderDetailDAO.update(orderDetail);

			logger.trace("Updated orderDetail with ID " + orderDetail.getId());
		} catch (DAOException e) {
			throw new DBServiceException("The orderDetail could not be updated. " + e.getMessage());
		}
	}

	@Override
	public void deleteById(Integer id) throws DBServiceException {
		try {
			orderDetailDAO.delete(id);
			
			logger.trace("Deleted orderDetail with ID " + id);
		} catch (DAOException e) {
			throw new DBServiceException("The orderDetail could not be updated. " + e.getMessage());
		}
	}

}
