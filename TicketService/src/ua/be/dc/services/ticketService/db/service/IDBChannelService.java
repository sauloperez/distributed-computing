package ua.be.dc.services.ticketService.db.service;

import java.util.List;

import ua.be.dc.services.ticketService.db.service.exception.DBServiceException;
import ua.be.dc.services.ticketService.models.Channel;

public interface IDBChannelService {

	public Channel getById(Integer id);
	
	public List<Channel> getAll();
	
	public void insert(Channel channel) throws DBServiceException;
	
	public void update(Channel channel) throws DBServiceException;
	
	public void deleteById(Integer id) throws DBServiceException;
}
