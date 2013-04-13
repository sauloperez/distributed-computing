/**
 * 
 */
package ua.be.dc.services.ticketService.db.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

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

	public void insert(Channel channel) {
		SqlSession session = sqlSessionFactory.openSession();

		try {
			ChannelMapper mapper = session.getMapper(ChannelMapper.class);
			mapper.insert(channel);
			
			session.commit();
		} finally {
			session.close();
		}
	}
	
	public void update(Channel channel) {
		SqlSession session = sqlSessionFactory.openSession();

		try {
			ChannelMapper mapper = session.getMapper(ChannelMapper.class);
			mapper.update(channel);
			
			session.commit();
		} finally {
			session.close();
		}
	}
	
	public void delete(Integer id) {
		SqlSession session = sqlSessionFactory.openSession();

		try {
			ChannelMapper mapper = session.getMapper(ChannelMapper.class);
			mapper.delete(id);
			
			session.commit();
		} finally {
			session.close();
		}
	}
}
