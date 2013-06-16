package ua.be.dc.services.sellingService.db.service;

import java.util.List;

import ua.be.dc.services.sellingService.db.service.exception.DBServiceException;
import ua.be.dc.services.sellingService.models.Customer;

public interface IDBCustomerService {

	public Customer getById(Integer id);

	public List<Customer> getAll();

	public void insert(Customer customer) throws DBServiceException;

	public void update(Customer customer) throws DBServiceException;

	public void deleteById(Integer id) throws DBServiceException;
}
