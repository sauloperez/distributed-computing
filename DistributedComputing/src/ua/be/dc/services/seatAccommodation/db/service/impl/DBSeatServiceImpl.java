package ua.be.dc.services.seatAccommodation.db.service.impl;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import ua.be.dc.services.seatAccommodation.db.dao.SeatDAO;
import ua.be.dc.services.seatAccommodation.db.service.IDBSeatService;
import ua.be.dc.services.seatAccommodation.models.Seat;

public class DBSeatServiceImpl implements IDBSeatService {

	private static Logger logger = LogManager.getLogger(DBSeatServiceImpl.class
			.getName());
	
	private SeatDAO seatDAO;
	
	@Override
	public List<Seat> getAll() {
		seatDAO = new SeatDAO();
		List<Seat> seats = seatDAO.selectAll();
		
		logger.trace("Retrieved " + seats.size() + " seats");
		return seats;
	}

	@Override
	public Seat getById(Integer id) {
		seatDAO = new SeatDAO();
		
		logger.trace("Retrieved event with ID " + id);
		return seatDAO.selectById(id);
	}

	@Override
	public void insert(Seat seat) {
		seatDAO = new SeatDAO();
		seatDAO.insert(seat);
		
		logger.trace("Inserted seat with ID " + seat.getId());
	}

	@Override
	public void update(Seat seat) {
		seatDAO = new SeatDAO();
		seatDAO.update(seat);
		
		logger.trace("Updated seat with ID " + seat.getId());
	}

	@Override
	public void deleteById(Integer id) {
		seatDAO = new SeatDAO();
		seatDAO.delete(id);
		
		logger.trace("Deleted seat with ID " + id);
	}

}
