package ua.be.dc.services.sellingService.db.service;

import java.util.List;

import ua.be.dc.services.sellingService.db.service.exception.DBServiceException;
import ua.be.dc.services.sellingService.models.Order;

public interface IDBOrderService {

	public Order getById(Integer id);

	public Order getOrderByToken(String token);

	public List<Order> getAll();

	public void insert(Order order) throws DBServiceException;

	public void update(Order order) throws DBServiceException;

	public void deleteById(Integer id) throws DBServiceException;

}
