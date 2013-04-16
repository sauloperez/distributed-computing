package ua.be.dc.services.ticketService.db.service.impl;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import ua.be.dc.services.ticketService.db.dao.ChannelDAO;
import ua.be.dc.services.ticketService.db.service.IDBChannelService;
import ua.be.dc.services.ticketService.models.Channel;

public class DBChannelServiceImpl implements IDBChannelService {
	
	private static Logger logger = LogManager.getLogger(DBChannelServiceImpl.class
			.getName());
	
	private ChannelDAO channelDAO;
	
	@Override
	public Channel getById(Integer id) {
		channelDAO = new ChannelDAO();
		Channel channel = channelDAO.selectById(id);
		
		logger.trace("Retrieved channel with ID " + id);
		
		return channel;
	}

	@Override
	public List<Channel> getAll() {
		channelDAO = new ChannelDAO();
		List<Channel> channels = channelDAO.selectAll();
		
		logger.trace("Retrieved " + channels.size() + " channels");
		
		return channels;
	}

	@Override
	public void insert(Channel channel) {
		channelDAO = new ChannelDAO();
		channelDAO.insert(channel);
		
		logger.trace("Inserted channel with ID " + channel.getId());
	}

	@Override
	public void update(Channel channel) {
		channelDAO = new ChannelDAO();
		channelDAO.update(channel);
		
		logger.trace("Updated channel with ID " + channel.getId());
	}

	@Override
	public void deleteById(Integer id) {
		channelDAO = new ChannelDAO();
		channelDAO.delete(id);
		
		logger.trace("Deleted channel with ID " + id);
	}

	
}
