package ua.be.dc.services.sellingService.db.service;

import java.util.List;

import ua.be.dc.services.sellingService.db.service.exception.DBServiceException;
import ua.be.dc.services.sellingService.models.OrderDetail;

public interface IDBOrderDetailService {

	public OrderDetail getById(Integer id);

	public List<OrderDetail> getAll();

	public void insert(OrderDetail orderDetail) throws DBServiceException;

	public void update(OrderDetail orderDetail) throws DBServiceException;

	public void deleteById(Integer id) throws DBServiceException;
}
