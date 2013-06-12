package ua.be.dc.services.seatAccommodation.db.service.impl;

import java.util.List;

import org.apache.ibatis.exceptions.PersistenceException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import ua.be.dc.services.seatAccommodation.db.dao.SeatTypeDAO;
import ua.be.dc.services.seatAccommodation.db.dao.exception.DAOException;
import ua.be.dc.services.seatAccommodation.db.service.IDBSeatTypeService;
import ua.be.dc.services.seatAccommodation.db.service.exception.DBServiceException;
import ua.be.dc.services.seatAccommodation.models.SeatType;

public class DBSeatTypeServiceImpl implements IDBSeatTypeService {

	private static Logger logger = LogManager.getLogger(DBSeatTypeServiceImpl.class.getName());
	
	private SeatTypeDAO seatTypeDAO = new SeatTypeDAO();
	
	@Override
	public SeatType getById(Integer id) {
		SeatType seatType = seatTypeDAO.selectById(id);
		
		logger.trace("Retrieved SeatType with ID " + id);
		
		return seatType;
	}

	@Override
	public List<SeatType> getAll() {
		List<SeatType> seatTypes = seatTypeDAO.selectAll();
		
		logger.trace("Retrieved " + seatTypes.size() + " seats");
		
		return seatTypes;
	}

	@Override
	public void insert(SeatType seatType) throws DBServiceException {
		try {
			seatTypeDAO.insert(seatType);
			
			logger.trace("Inserted seatType with Name " + seatType.getName());
		} catch (PersistenceException e) {
			throw new DBServiceException("The seat type could not be inserted. " + e.getMessage());
		}
	}

	@Override
	public void update(SeatType seatType) throws DBServiceException {
		try {
			seatTypeDAO.update(seatType);

			logger.trace("Updated seatType with Name " + seatType.getName());
		} catch (DAOException e) {
			throw new DBServiceException("The seat type could not be updated. " + e.getMessage());
		}
	}

	@Override
	public void deleteById(Integer id) throws DBServiceException {
		try {
			seatTypeDAO.delete(id);
			
			logger.trace("Updated seatType with ID " + id);
		} catch (DAOException e) {
			throw new DBServiceException("The seat type could not be deleted. " + e.getMessage());
		}
	}

	
}
