package ua.be.dc.services.sellingService.db.service;

import java.util.List;

import ua.be.dc.services.sellingService.db.service.exception.DBServiceException;
import ua.be.dc.services.sellingService.models.EventDetail;

public interface IDBEventDetailService {

	public EventDetail getById(Integer id);

	public List<EventDetail> getAll();

	public void insert(EventDetail ticketDetail) throws DBServiceException;

	public void update(EventDetail ticketDetail) throws DBServiceException;

	public void deleteById(Integer id) throws DBServiceException;
}
