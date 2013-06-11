package ua.be.dc.services.sellingService.db.dao;

import java.util.List;

import org.apache.ibatis.exceptions.PersistenceException;
import org.apache.ibatis.session.SqlSession;

import ua.be.dc.services.sellingService.db.dao.exception.DAOException;
import ua.be.dc.services.sellingService.db.mappers.EventOrganizerMapper;
import ua.be.dc.services.sellingService.models.EventOrganizer;

public class EventOrganizerDAO extends BasicDAO {

	public List<EventOrganizer> selectAll() {
		SqlSession session = sqlSessionFactory.openSession();
		
		try {
			EventOrganizerMapper mapper = session.getMapper(EventOrganizerMapper.class);
			List<EventOrganizer> list = mapper.selectAll();
			
			return list;
		} finally {
			session.close();
		}
	}
	
	public EventOrganizer selectById(Integer id) {
		SqlSession session = sqlSessionFactory.openSession();
		
		try {
			EventOrganizerMapper mapper = session.getMapper(EventOrganizerMapper.class);
			EventOrganizer eventOrganizer = mapper.selectById(id);
			
			return eventOrganizer;
		} finally {
			session.close();
		}
	}
	
	public void insert(EventOrganizer EventOrganizer) throws PersistenceException {
		SqlSession session = sqlSessionFactory.openSession();
		
		try {
			EventOrganizerMapper mapper = session.getMapper(EventOrganizerMapper.class);
			mapper.insert(EventOrganizer);
			
			session.commit();
		} finally {
			session.close();
		}
	}
	
	public void update(EventOrganizer eventOrganizer) throws DAOException {
		SqlSession session = sqlSessionFactory.openSession();
		
		try {
			EventOrganizerMapper mapper = session.getMapper(EventOrganizerMapper.class);
			int affectedRows = mapper.update(eventOrganizer);
			if (affectedRows == 0) {
				throw new DAOException("The event organizer with ID " + eventOrganizer.getId() + " does not exist");
			}
			
			session.commit();
		} finally {
			session.close();
		}
	}
	
	public void delete(Integer id) throws DAOException {
		SqlSession session = sqlSessionFactory.openSession();
		
		try {
			EventOrganizerMapper mapper = session.getMapper(EventOrganizerMapper.class);
			int affectedRows = mapper.delete(id);
			if (affectedRows == 0) {
				throw new DAOException("The event organizer with ID " + id + " does not exist");
			}
			
			session.commit();
		} finally {
			session.close();
		}
	}
}
