package ua.be.dc.services.seatAccommodation.db.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import ua.be.dc.services.seatAccommodation.db.mappers.SeatTypeMapper;
import ua.be.dc.services.seatAccommodation.models.SeatType;

public class SeatTypeDAO extends BasicDAO {

	public SeatTypeDAO() {
		super();
	}
	
	public SeatType selectById(Integer id) {
		SqlSession session = sqlSessionFactory.openSession();
		
		try {
			SeatTypeMapper mapper = session.getMapper(SeatTypeMapper.class);
			SeatType seatType = mapper.selectById(id);
			
			return seatType;
		} finally {
			session.close();
		}
	}
	
	public List<SeatType> selectAll() {
		SqlSession session = sqlSessionFactory.openSession();
		
		try {
			SeatTypeMapper mapper = session.getMapper(SeatTypeMapper.class);
			List<SeatType> types = mapper.selectAll();
			
			return types;
		} finally {
			session.close();
		}
	}
	
	public void insert(SeatType seatType) {
		SqlSession session = sqlSessionFactory.openSession();
		
		try {
			SeatTypeMapper mapper = session.getMapper(SeatTypeMapper.class);
			mapper.insert(seatType);
			
			session.commit();
		} finally {
			session.close();
		}
	}
	
	public void update(SeatType seatType) {
		SqlSession session = sqlSessionFactory.openSession();
		
		try {
			SeatTypeMapper mapper = session.getMapper(SeatTypeMapper.class);
			mapper.update(seatType);
			
			session.commit();
		} finally {
			session.close();
		}
	}
	
	public void delete(Integer id) {
		SqlSession session = sqlSessionFactory.openSession();
		
		try {
			SeatTypeMapper mapper = session.getMapper(SeatTypeMapper.class);
			mapper.delete(id);
			
			session.commit();
		} finally {
			session.close();
		}
	}
}
