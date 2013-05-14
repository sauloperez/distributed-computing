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
	
	public void insert(SeatType seatType) throws Exception {
		SqlSession session = sqlSessionFactory.openSession();
		
		try {
			SeatTypeMapper mapper = session.getMapper(SeatTypeMapper.class);
			mapper.insert(seatType);
			
			session.commit();
		} finally {
			session.close();
		}
	}
	
	public void update(SeatType seatType) throws Exception {
		SqlSession session = sqlSessionFactory.openSession();
		
		try {
			SeatTypeMapper mapper = session.getMapper(SeatTypeMapper.class);
			int affectedRows = mapper.update(seatType);
			if (affectedRows == 0) {
				throw new Exception("The seatType with ID " + seatType.getId() + " does not exist");
			}
			
			session.commit();
		} finally {
			session.close();
		}
	}
	
	public void delete(Integer id) throws Exception {
		SqlSession session = sqlSessionFactory.openSession();
		
		try {
			SeatTypeMapper mapper = session.getMapper(SeatTypeMapper.class);
			int affectedRows = mapper.delete(id);
			if (affectedRows == 0) {
				throw new Exception("The seat with ID " + id + " does not exist");
			}
			
			session.commit();
		} finally {
			session.close();
		}
	}
}
