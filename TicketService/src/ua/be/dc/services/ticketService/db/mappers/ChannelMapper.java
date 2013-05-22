package ua.be.dc.services.ticketService.db.mappers;

import java.util.List;

import ua.be.dc.services.ticketService.models.Channel;

public interface ChannelMapper {

	/**
     * @return the list of all Channel instances from the database
     */
	List<Channel> selectAll();
	
	/**
     * Returns a Channel instance from the database
     * @param id value used for lookup
     * @return A Channel with an id value equals to id, null otherwise
     */
	Channel selectById(Integer id);
	
	/**
	 * Inserts a Channel instance into the database
	 * @param channel the instance to be persisted
	 */
	void insert(Channel channel);
	
	/**
	 * Updates an instance of Channel in the database.
     * @param channel the instance to be updated.
	 * @return 
	 */
	int update(Channel channel);
	
	/**
	 * Deletes a Channel instance from the database
	 * @param id primary key value of the instance to be deleted
	 * @return 
	 */
	int delete(Integer id);
}
