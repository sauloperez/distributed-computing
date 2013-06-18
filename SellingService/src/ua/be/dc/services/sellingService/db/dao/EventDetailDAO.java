package ua.be.dc.services.sellingService.db.dao;

import java.util.List;

import org.apache.ibatis.exceptions.PersistenceException;
import org.apache.ibatis.session.SqlSession;

import ua.be.dc.services.sellingService.db.dao.exception.DAOException;
import ua.be.dc.services.sellingService.db.mappers.EventDetailMapper;
import ua.be.dc.services.sellingService.models.EventDetail;

public class EventDetailDAO extends BasicDAO {

	public List<EventDetail> selectAll() {
		SqlSession session = sqlSessionFactory.openSession();
		
		try {
			EventDetailMapper mapper = session.getMapper(EventDetailMapper.class);
			List<EventDetail> eventDetails = mapper.selectAll();
			
			return eventDetails;
		} finally {
			session.close();
		}
	}
	
	public EventDetail selectById(Integer id) {
		SqlSession session = sqlSessionFactory.openSession();
		
		try {
			EventDetailMapper mapper = session.getMapper(EventDetailMapper.class);
			EventDetail eventDetail = mapper.selectById(id);
			
			return eventDetail;
		} finally {
			session.close();
		}
	}
	
	public void insert(EventDetail eventDetail) throws PersistenceException {
		SqlSession session = sqlSessionFactory.openSession();
		
		try {
			EventDetailMapper mapper = session.getMapper(EventDetailMapper.class);
			mapper.insert(eventDetail);
			
			session.commit();
		} finally {
			session.close();
		}
	}
	
	public void update(EventDetail eventDetail) throws DAOException {
		SqlSession session = sqlSessionFactory.openSession();
		
		try {
			EventDetailMapper mapper = session.getMapper(EventDetailMapper.class);
			int affectedRows = mapper.update(eventDetail);
			if (affectedRows == 0) {
				throw new DAOException("The eventDetail with ID " + eventDetail.getId() + " does not exist");
			}
			
			session.commit();
		} finally {
			session.close();
		}
	}
	
	public void delete(Integer id) throws DAOException {
		SqlSession session = sqlSessionFactory.openSession();
		
		try {
			EventDetailMapper mapper = session.getMapper(EventDetailMapper.class);
			int affectedRows = mapper.delete(id);
			if (affectedRows == 0) {
				throw new DAOException("The eventDetail with ID " + id + " does not exist");
			}
			
			session.commit();
		} finally {
			session.close();
		}
	}
}
