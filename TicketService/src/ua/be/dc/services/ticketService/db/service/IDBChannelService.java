package ua.be.dc.services.ticketService.db.service;

import java.util.List;

import ua.be.dc.services.ticketService.models.Channel;

public interface IDBChannelService {

	public Channel getById(Integer id);
	
	public List<Channel> getAll();
	
	public void insert(Channel channel);
	
	public void update(Channel channel);
	
	public void deleteById(Integer id);
}
