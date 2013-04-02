package ua.be.dc.services.seatAccommodation.db.mappers;

import java.util.List;

import ua.be.dc.services.seatAccommodation.models.SeatType;

public interface SeatTypeMapper {

	SeatType selectById(Integer id);
	
	List<SeatType> selectAll();
	
	void insert(SeatType seatType);
	
	void update(SeatType seatType);
	
	void delete(Integer id);
}
