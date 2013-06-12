package ua.be.dc.services.ticketService.db.service.impl;

import java.util.List;

import org.apache.ibatis.exceptions.PersistenceException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import ua.be.dc.services.ticketService.db.dao.ChannelDAO;
import ua.be.dc.services.ticketService.db.dao.exception.DAOException;
import ua.be.dc.services.ticketService.db.service.IDBChannelService;
import ua.be.dc.services.ticketService.db.service.exception.DBServiceException;
import ua.be.dc.services.ticketService.models.Channel;

public class DBChannelServiceImpl implements IDBChannelService {
	
	private static Logger logger = LogManager.getLogger(DBChannelServiceImpl.class
			.getName());
	
	private ChannelDAO channelDAO = new ChannelDAO();
	
	@Override
	public Channel getById(Integer id) {
		Channel channel = channelDAO.selectById(id);
		
		if (channel == null) {
			logger.trace("Channel with ID " + id + " not found");
		}
		else {
			logger.trace("Retrieved channel with ID " + id);
		}
		
		return channel;
	}

	@Override
	public List<Channel> getAll() {
		List<Channel> channels = channelDAO.selectAll();
		
		logger.trace("Retrieved " + channels.size() + " channels");
		
		return channels;
	}

	@Override
	public void insert(Channel channel) throws DBServiceException {
		try {
			channelDAO.insert(channel);

			logger.trace("Inserted channel with ID " + channel.getId());
		} catch (PersistenceException e) {
			throw new DBServiceException("The channel could not be inserted. " + e.getMessage());
		}
		
	}

	@Override
	public void update(Channel channel) throws DBServiceException {
		try {
			channelDAO.update(channel);

			logger.trace("Updated channel with ID " + channel.getId());
		} catch (DAOException e) {
			throw new DBServiceException("The channel could not be updated. " + e.getMessage());
		}
	}

	@Override
	public void deleteById(Integer id) throws DBServiceException {
		try {
			channelDAO.delete(id);

			logger.trace("Deleted channel with ID " + id);
		} catch (DAOException e) {
			throw new DBServiceException("The channel could not be deleted. " + e.getMessage());
		}
	}

	
}
