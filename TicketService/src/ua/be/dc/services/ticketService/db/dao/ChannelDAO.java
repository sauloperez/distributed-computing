/**
 * 
 */
package ua.be.dc.services.ticketService.db.dao;

import java.util.List;

import org.apache.ibatis.exceptions.PersistenceException;
import org.apache.ibatis.session.SqlSession;

import ua.be.dc.services.ticketService.db.dao.exception.DAOException;
import ua.be.dc.services.ticketService.db.mappers.ChannelMapper;
import ua.be.dc.services.ticketService.models.Channel;

/**
 * @author Pau
 * 
 */
public class ChannelDAO extends BasicDAO {

	public List<Channel> selectAll() {
		SqlSession session = sqlSessionFactory.openSession();

		try {
			ChannelMapper mapper = session.getMapper(ChannelMapper.class);
			List<Channel> channels = mapper.selectAll();

			return channels;
		} finally {
			session.close();
		}
	}

	public Channel selectById(Integer id) {
		SqlSession session = sqlSessionFactory.openSession();

		try {
			ChannelMapper mapper = session.getMapper(ChannelMapper.class);
			Channel channel = mapper.selectById(id);

			return channel;
		} finally {
			session.close();
		}
	}

	public void insert(Channel channel) throws PersistenceException {
		SqlSession session = sqlSessionFactory.openSession();

		try {
			ChannelMapper mapper = session.getMapper(ChannelMapper.class);
			mapper.insert(channel);
			
			session.commit();
		} finally {
			session.close();
		}
	}
	
	public void update(Channel channel) throws DAOException {
		SqlSession session = sqlSessionFactory.openSession();

		try {
			ChannelMapper mapper = session.getMapper(ChannelMapper.class);
			int affectedRows = mapper.update(channel);
			if (affectedRows == 0) {
				throw new DAOException("The channel with ID " + channel.getId() + " does not exist");
			}
			
			session.commit();
		} finally {
			session.close();
		}
	}
	
	public void delete(Integer id) throws DAOException {
		SqlSession session = sqlSessionFactory.openSession();

		try {
			ChannelMapper mapper = session.getMapper(ChannelMapper.class);
			int affectedRows = mapper.delete(id);
			if (affectedRows == 0) {
				throw new DAOException("The chanel with ID " + id + " does not exist");
			}
			
			session.commit();
		} finally {
			session.close();
		}
	}
}
