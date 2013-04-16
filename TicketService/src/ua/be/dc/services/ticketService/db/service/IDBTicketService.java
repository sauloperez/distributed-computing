package ua.be.dc.services.ticketService.db.service;

import java.util.List;

import ua.be.dc.services.ticketService.models.Ticket;

public interface IDBTicketService {

	public Ticket getById(Integer id);
	
	public List<Ticket> getAll();
	
	public void insert(Ticket ticket);
	
	public void update(Ticket ticket);
	
	public void deleteById(Integer id);
}
