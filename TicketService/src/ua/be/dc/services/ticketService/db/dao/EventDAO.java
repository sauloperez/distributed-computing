package ua.be.dc.services.ticketService.db.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import ua.be.dc.services.ticketService.db.mappers.EventMapper;
import ua.be.dc.services.ticketService.models.Event;

public class EventDAO extends BasicDAO {

	 /**
     * Returns the list of all Event instances from the database.
     * @return the list of all Event instances from the database.
     */
	public List<Event> selectAll() {
		
		SqlSession session = sqlSessionFactory.openSession();
		
		try {
			EventMapper mapper = session.getMapper(EventMapper.class);
			List<Event> list = mapper.selectAll();
			
			return list;
		} finally {
			session.close();
		}
	}
	
	/**
     * Returns an Event instance from the database.
     * @param id primary key value used for lookup.
     * @return An Event instance with a primary key value equals to pk. null if there is no matching row.
     */
	public Event selectById(Integer id) {
		SqlSession session = sqlSessionFactory.openSession();
		
		try {
			EventMapper mapper = session.getMapper(EventMapper.class);
			Event event = mapper.selectById(id);
			
			return event;
		} finally {
			session.close();
		}
	}
	
	/**
     * Insert an instance of Event into the database.
     * @param event the instance to be persisted.
	 * @throws DAOException 
     */
	public void insert(Event event) {
		SqlSession session = sqlSessionFactory.openSession();
		
		try {
			EventMapper mapper = session.getMapper(EventMapper.class);
			mapper.insert(event);
			
			session.commit();
		} finally {
			session.close();
		}
	}
	
	/**
     * Updates an instance of Event in the database.
     * @param event the instance to be updated.
	 * @throws DAOException 
     */
	public void update(Event event) {
		SqlSession session = sqlSessionFactory.openSession();
		
		try {
			EventMapper mapper = session.getMapper(EventMapper.class);
			mapper.update(event);
			
			session.commit();
		} finally {
			session.close();
		}
	}
	
	/**
     * Delete an instance of Event from the database.
     * @param id primary key value of the instance to be deleted.
     */
	public void delete(Integer id) {
		SqlSession session = sqlSessionFactory.openSession();
		
		try {
			EventMapper mapper = session.getMapper(EventMapper.class);
			mapper.delete(id);
			
			session.commit();
		} finally {
			session.close();
		}
	}
}
