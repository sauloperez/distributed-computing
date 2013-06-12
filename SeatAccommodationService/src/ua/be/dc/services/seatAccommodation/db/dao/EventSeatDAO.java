package ua.be.dc.services.seatAccommodation.db.dao;

import java.util.List;

import org.apache.ibatis.exceptions.PersistenceException;
import org.apache.ibatis.session.SqlSession;

import ua.be.dc.services.seatAccommodation.db.dao.exception.DAOException;
import ua.be.dc.services.seatAccommodation.db.mappers.EventSeatMapper;
import ua.be.dc.services.seatAccommodation.db.mappers.SeatMapper;
import ua.be.dc.services.seatAccommodation.models.EventSeat;

public class EventSeatDAO extends BasicDAO {

	public EventSeatDAO() {
		super();
	}

	public EventSeat selectById(Integer id) {
		SqlSession session = sqlSessionFactory.openSession();

		try {
			EventSeatMapper mapper = session.getMapper(EventSeatMapper.class);
			EventSeat eventSeat = mapper.selectById(id);

			return eventSeat;
		} finally {
			session.close();
		}
	}
	
	public List<EventSeat> selectByEventId(Integer eventId) {
		SqlSession session = sqlSessionFactory.openSession();

		try {
			EventSeatMapper mapper = session.getMapper(EventSeatMapper.class);
			List<EventSeat> eventSeats = mapper.selectByEventId(eventId);

			return eventSeats;
		} finally {
			session.close();
		}
	}
	
	public List<EventSeat> selectByEventIdAndTypeId(Integer eventId, Integer typeId) {
		SqlSession session = sqlSessionFactory.openSession();

		try {
			EventSeatMapper mapper = session.getMapper(EventSeatMapper.class);
			List<EventSeat> eventSeats = mapper.selectByEventIdAndTypeId(eventId, typeId);

			return eventSeats;
		} finally {
			session.close();
		}
	}
	
	public List<EventSeat> selectAll() {
		SqlSession session = sqlSessionFactory.openSession();

		try {
			EventSeatMapper mapper = session.getMapper(EventSeatMapper.class);
			List<EventSeat> eventSeats = mapper.selectAll();

			return eventSeats;
		} finally {
			session.close();
		}
	}
	
	public void insert(EventSeat eventSeat) throws PersistenceException {
		SqlSession session = sqlSessionFactory.openSession();

		try {
			EventSeatMapper mapper = session.getMapper(EventSeatMapper.class);
			mapper.insert(eventSeat);

			session.commit();
		} finally {
			session.close();
		}
	}
	
	/**
	 * Uses a transaction to insert the seat and the related EventSeat. 
	 * If something goes wrong rollback. Therefore, we won't have a resulting unassigned seat
	 * @param eventSeat
	 * @throws Exception 
	 */
	public void addSeatAndInsert(EventSeat eventSeat) throws PersistenceException {
		SqlSession session = sqlSessionFactory.openSession();
		
		try {
			SeatMapper seatMapper = session.getMapper(SeatMapper.class);
			EventSeatMapper eventSeatMapper = session.getMapper(EventSeatMapper.class);

			// Insert the Seat
			seatMapper.insert(eventSeat.getSeat());
			
			// Insert the EventSeat
			eventSeatMapper.insert(eventSeat);
			
			// Commit the transaction
			session.commit();
			
		} catch (PersistenceException e) {
			session.rollback();
			throw new PersistenceException(e.getMessage());
		} finally {
			session.close();
		}
	}
	
	public void update(EventSeat eventSeat) throws DAOException {
		SqlSession session = sqlSessionFactory.openSession();

		try {
			EventSeatMapper mapper = session.getMapper(EventSeatMapper.class);
			int affectedRows = mapper.update(eventSeat);
			if (affectedRows == 0) {
				throw new DAOException("The eventSeat with ID " + eventSeat.getId() + " does not exist");
			}
			session.commit();
		} finally {
			session.close();
		}
	}
	
	public void delet(Integer id) throws DAOException {
		SqlSession session = sqlSessionFactory.openSession();

		try {
			EventSeatMapper mapper = session.getMapper(EventSeatMapper.class);
			int affectedRows = mapper.delete(id);
			if (affectedRows == 0) {
				throw new DAOException("The eventSeat with ID " + id + " does not exist");
			}
			session.commit();
		} finally {
			session.close();
		}
	}
}
