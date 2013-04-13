package ua.be.dc.services.seatAccommodation.db.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import ua.be.dc.services.seatAccommodation.db.mappers.EventSeatMapper;
import ua.be.dc.services.seatAccommodation.db.mappers.SeatMapper;
import ua.be.dc.services.seatAccommodation.models.EventSeat;
import ua.be.dc.services.seatAccommodation.models.Seat;

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
	
	public void insert(EventSeat eventSeat) {
		SqlSession session = sqlSessionFactory.openSession();

		try {
			EventSeatMapper mapper = session.getMapper(EventSeatMapper.class);
			mapper.insert(eventSeat);

			session.commit();
		} finally {
			session.close();
		}
	}
	
	public void update(EventSeat eventSeat) {
		SqlSession session = sqlSessionFactory.openSession();

		try {
			EventSeatMapper mapper = session.getMapper(EventSeatMapper.class);
			mapper.update(eventSeat);

			session.commit();
		} finally {
			session.close();
		}
	}
	
	public void delet(Integer id) {
		SqlSession session = sqlSessionFactory.openSession();

		try {
			EventSeatMapper mapper = session.getMapper(EventSeatMapper.class);
			mapper.delete(id);

			session.commit();
		} finally {
			session.close();
		}
	}
}
