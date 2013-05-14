package ua.be.dc.services.seatAccommodation.db.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import ua.be.dc.services.seatAccommodation.db.mappers.SeatMapper;
import ua.be.dc.services.seatAccommodation.models.Seat;

public class SeatDAO extends BasicDAO {

	public SeatDAO() {
		super();
	}

	/**
	 * Returns the list of all Seat instances from the database.
	 * @return the list of all Seat instances from the database.
	 */
	public List<Seat> selectAll() {

		SqlSession session = sqlSessionFactory.openSession();

		try {
			SeatMapper mapper = session.getMapper(SeatMapper.class);
			List<Seat> list = mapper.selectAll();

			return list;
		} finally {
			session.close();
		}
	}

	/**
     * Returns a Seat instance from the database.
     * @param id primary key value used for lookup.
     * @return A Seat instance with a primary key value equals to pk. null if there is no matching row.
     */
	public Seat selectById(Integer id) {
		SqlSession session = sqlSessionFactory.openSession();
		
		try {
			SeatMapper mapper = session.getMapper(SeatMapper.class);
			Seat seat = mapper.selectById(id);
			
			return seat;
		} finally {
			session.close();
		}
	}

	/**
     * Insert an instance of Seat into the database.
     * @param seat the instance to be persisted.
     */
	public void insert(Seat seat) throws Exception {
		SqlSession session = sqlSessionFactory.openSession();
		
		try {
			SeatMapper mapper = session.getMapper(SeatMapper.class);
			mapper.insert(seat);
			
			session.commit();
		} finally {
			session.close();
		}
	}

	/**
     * Updates an instance of Seat in the database.
     * @param seat the instance to be updated.
	 * @throws Exception 
     */
	public void update(Seat seat) throws Exception {
		SqlSession session = sqlSessionFactory.openSession();
		
		try {
			SeatMapper mapper = session.getMapper(SeatMapper.class);
			int affectedRows = mapper.update(seat);
			if (affectedRows == 0) {
				throw new Exception("The seat with ID " + seat.getId() + " does not exist");
			}
			
			session.commit();
		} finally {
			session.close();
		}
	}
	
	/**
     * Delete an instance of Seat from the database.
     * @param id primary key value of the instance to be deleted.
	 * @throws Exception 
     */
	public void delete(Integer id) throws Exception {
		SqlSession session = sqlSessionFactory.openSession();
		
		try {
			SeatMapper mapper = session.getMapper(SeatMapper.class);
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
