package ua.be.dc.services.sellingService.db.service;

import java.util.List;

import ua.be.dc.services.sellingService.db.service.exception.DBServiceException;
import ua.be.dc.services.sellingService.models.TicketDetail;

public interface IDBTicketDetailService {

	public TicketDetail getById(Integer id);

	public List<TicketDetail> getAll();
	
	public List<TicketDetail> getByOrderDetailId(Integer id);

	public void insert(TicketDetail ticketDetail) throws DBServiceException;

	public void update(TicketDetail ticketDetail) throws DBServiceException;

	public void deleteById(Integer id) throws DBServiceException;
	
}
