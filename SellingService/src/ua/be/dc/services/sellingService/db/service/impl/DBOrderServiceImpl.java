package ua.be.dc.services.sellingService.db.service.impl;

import java.util.List;

import org.apache.ibatis.exceptions.PersistenceException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import ua.be.dc.services.sellingService.db.dao.OrderDAO;
import ua.be.dc.services.sellingService.db.dao.exception.DAOException;
import ua.be.dc.services.sellingService.db.service.IDBOrderService;
import ua.be.dc.services.sellingService.db.service.exception.DBServiceException;
import ua.be.dc.services.sellingService.models.Order;

public class DBOrderServiceImpl implements IDBOrderService {
	
	private static Logger logger = LogManager.getLogger(DBOrderServiceImpl.class.getName());
	
	private OrderDAO orderDAO = new OrderDAO(); 

	@Override
	public Order getById(Integer id) {
		Order order = orderDAO.selectById(id);
		
		if (order == null) {
			logger.trace("Order with ID " + id + " not found");
		}
		else {
			logger.trace("Retrieved order with ID " + id);
		}
		
		return order;
	}
	
	@Override
	public Order getOrderByToken(String token) {
		Order order = orderDAO.selectByToken(token);
		
		if (order == null) {
			logger.trace("Order with token " + token + " not found");
		}
		else {
			logger.trace("Retrieved order with token " + token);
		}
		
		return order;
	}

	@Override
	public List<Order> getAll() {
		List<Order> orders = orderDAO.selectAll();
		
		logger.trace("Retrieved " + orders.size() + " orders");
		
		return orders;
	}

	@Override
	public void insert(Order order) throws DBServiceException {
		try {
			orderDAO.insert(order);
			
			logger.trace("Inserted order with ID " + order.getId());
		} catch (PersistenceException e) {
			throw new DBServiceException("The order could not be inserted. " + e.getMessage());
		}
	}

	@Override
	public void update(Order order) throws DBServiceException {
		try {
			orderDAO.update(order);

			logger.trace("Updated order with ID " + order.getId());
		} catch (DAOException e) {
			throw new DBServiceException("The order could not be updated. " + e.getMessage());
		}
	}

	@Override
	public void deleteById(Integer id) throws DBServiceException {
		try {
			orderDAO.delete(id);
			
			logger.trace("Deleted order with ID " + id);
		} catch (DAOException e) {
			throw new DBServiceException("The order could not be updated. " + e.getMessage());
		}
	}
}
