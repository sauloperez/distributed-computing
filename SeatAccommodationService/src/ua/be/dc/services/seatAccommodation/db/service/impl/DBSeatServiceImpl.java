package ua.be.dc.services.seatAccommodation.db.service.impl;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import ua.be.dc.services.seatAccommodation.db.dao.SeatDAO;
import ua.be.dc.services.seatAccommodation.db.service.IDBSeatService;
import ua.be.dc.services.seatAccommodation.db.service.exception.DBServiceException;
import ua.be.dc.services.seatAccommodation.models.Seat;
import ua.be.dc.services.seatAccommodation.models.SeatType;

public class DBSeatServiceImpl implements IDBSeatService {

	private static Logger logger = LogManager.getLogger(DBSeatServiceImpl.class.getName());
	
	private SeatDAO seatDAO = new SeatDAO();
	
	@Override
	public Seat getById(Integer id) {
		Seat seat = seatDAO.selectById(id);
		
		logger.trace("Retrieved seat with ID " + id);
		
		if (seat == null) {
			logger.trace("Seat with ID " + id + " not found");
		}
		else {
			logger.trace("Retrieved seat with ID " + id);
		}
		
		return seat;
	}
	
	@Override
	public List<Seat> getAll() {
		List<Seat> seats = seatDAO.selectAll();
		
		logger.trace("Retrieved " + seats.size() + " seats");
		return seats;
	}

	/**
	 * Seat Type is not used temporally but might be used in the future.
	 * Is set by default to Seat Type with id = 1
	 */
	@Override
	public void insert(Seat seat) throws DBServiceException {
		try {
			seat.setType(new SeatType(1));
			seatDAO.insert(seat);

			logger.trace("Inserted seat with ID " + seat.getId());
		} catch (Exception e) {
			throw new DBServiceException("The seat could not be inserted. " + e.getMessage());
		}
		
	}

	@Override
	public void update(Seat seat) throws DBServiceException {
		try {
			seatDAO.update(seat);

			logger.trace("Updated seat with ID " + seat.getId());
		} catch (Exception e) {
			throw new DBServiceException("The seat could not be updated. " + e.getMessage());
		}
		
	}

	@Override
	public void deleteById(Integer id) throws DBServiceException {
		try {
			seatDAO.delete(id);

			logger.trace("Deleted seat with ID " + id);
		} catch (Exception e) {
			throw new DBServiceException("The seat could not be deleted. " + e.getMessage());
		}
		
	}

}
