package ua.be.dc.services.seatAccommodation.db.service.impl;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import ua.be.dc.services.seatAccommodation.db.dao.SeatDAO;
import ua.be.dc.services.seatAccommodation.db.dao.SeatTypeDAO;
import ua.be.dc.services.seatAccommodation.db.service.IDBSeatTypeService;
import ua.be.dc.services.seatAccommodation.models.SeatType;

public class DBSeatTypeServiceImpl implements IDBSeatTypeService {

	private static Logger logger = LogManager.getLogger(DBSeatServiceImpl.class
			.getName());
	
	private SeatTypeDAO seatTypeDAO;
	
	@Override
	public SeatType getById(Integer id) {
		seatTypeDAO = new SeatTypeDAO();
		SeatType seatType = seatTypeDAO.selectById(id);
		
		logger.trace("Retrieved SeatType with ID " + id);
		
		return seatType;
	}

	@Override
	public List<SeatType> getAll() {
		seatTypeDAO = new SeatTypeDAO();
		List<SeatType> seatTypes = seatTypeDAO.selectAll();
		
		logger.trace("Retrieved " + seatTypes.size() + " seats");
		
		return seatTypes;
	}

	@Override
	public void insert(SeatType seatType) {
		seatTypeDAO = new SeatTypeDAO();
		seatTypeDAO.insert(seatType);
		
		logger.trace("Inserted seatType with Name " + seatType.getName());
	}

	@Override
	public void update(SeatType seatType) {
		seatTypeDAO = new SeatTypeDAO();
		seatTypeDAO.update(seatType);
		
		logger.trace("Updated seatType with Name " + seatType.getName());
	}

	@Override
	public void deleteById(Integer id) {
		seatTypeDAO = new SeatTypeDAO();
		seatTypeDAO.delete(id);
		
		logger.trace("Updated seatType with ID " + id);
	}

	
}
