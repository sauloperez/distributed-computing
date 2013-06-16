package ua.be.dc.services.sellingService.db.service.impl;

import java.util.List;

import org.apache.ibatis.exceptions.PersistenceException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import ua.be.dc.services.sellingService.db.dao.CustomerDAO;
import ua.be.dc.services.sellingService.db.dao.exception.DAOException;
import ua.be.dc.services.sellingService.db.service.IDBCustomerService;
import ua.be.dc.services.sellingService.db.service.exception.DBServiceException;
import ua.be.dc.services.sellingService.models.Customer;

public class DBCustomerServiceImpl implements IDBCustomerService {

	private static Logger logger = LogManager.getLogger(DBCustomerServiceImpl.class.getName());
	
	private CustomerDAO customerDAO = new CustomerDAO();
	
	@Override
	public Customer getById(Integer id) {
		Customer customer = customerDAO.selectById(id);
		
		if (customer == null) {
			logger.trace("Customer with ID " + id + " not found");
		}
		else {
			logger.trace("Retrieved customer with ID " + id);
		}
		
		return customer;
	}

	@Override
	public List<Customer> getAll() {
		List<Customer> customers = customerDAO.selectAll();
		
		logger.trace("Retrieved " + customers.size() + " customers");
		
		return customers;
	}

	@Override
	public void insert(Customer customer) throws DBServiceException {
		try {
			customerDAO.insert(customer);
			
			logger.trace("Inserted customer with ID " + customer.getId());
		} catch (PersistenceException e) {
			throw new DBServiceException("The customer could not be inserted. " + e.getMessage());
		}
	}

	@Override
	public void update(Customer customer) throws DBServiceException {
		try {
			customerDAO.update(customer);

			logger.trace("Updated customer with ID " + customer.getId());
		} catch (DAOException e) {
			throw new DBServiceException("The customer could not be updated. " + e.getMessage());
		}
	}

	@Override
	public void deleteById(Integer id) throws DBServiceException {
		try {
			customerDAO.delete(id);
			
			logger.trace("Deleted customer with ID " + id);
		} catch (DAOException e) {
			throw new DBServiceException("The customer could not be updated. " + e.getMessage());
		}
	}

}
