package ua.be.dc.services.seatAccommodation.db.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.One;

import ua.be.dc.services.seatAccommodation.models.Seat;
import ua.be.dc.services.seatAccommodation.models.SeatType;

public interface SeatMapper {
	
	/**
	 * @return the list of all Events from the database
	 */
	List<Seat> selectAll();

	/**
	 * Returns a Seat instance from the database
	 * 
	 * @param id value used for lookup
	 * @return An Seat with an id value equals to id, null otherwise
	 */
	Seat selectById(Integer id);

	/**
	 * Inserts a Seat instance into the database
	 * 
	 * @param seat
	 *            the instance to be persisted
	 */
	void insert(Seat seat);

	/**
	 * Updates a instance of Seat in the database.
	 * 
	 * @param seat
	 *            the instance to be updated.
	 * @return 
	 */
	int update(Seat seat);

	/**
	 * Deletes a Seat instance from the database
	 * 
	 * @param id
	 *            primary key value of the instance to be deleted
	 * @return 
	 */
	int delete(Integer id);
}
