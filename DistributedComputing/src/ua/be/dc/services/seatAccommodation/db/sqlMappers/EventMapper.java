package ua.be.dc.services.seatAccommodation.db.sqlMappers;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import ua.be.dc.services.seatAccommodation.models.Event;

public interface EventMapper {
		
	/**
     * @return the list of all Events from the database
     */
	@Select("SELECT * FROM events")
	List<Event> selectAll();
	
	/**
     * Returns an Event instance from the database
     * @param id value used for lookup
     * @return An Event with an id value equals to id, null otherwise
     */
	@Select("SELECT * FROM events WHERE id = #{id}")
	Event selectById(Integer id);
	
	/**
	 * Inserts an Event instance into the database
	 * @param event the instance to be persisted
	 */
	@Insert("INSERT INTO events (name) VALUES (#{name}) ")
	void insert(Event event);
	
	/**
	 * Updates an instance of Event in the database.
     * @param event the instance to be updated.
	 */
	@Update("UPDATE events SET name = #{name} WHERE id = #{id}")
	void update(Event event);
	
	/**
	 * Deletes an Event instance from the database
	 * @param id primary key value of the instance to be deleted
	 */
	@Delete("DELETE FROM events WHERE id = #{id}")
	void delete(Integer id);
}
