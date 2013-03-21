package ua.be.dc.services.seatAccommodation.db.sqlMappers;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import ua.be.dc.services.seatAccommodation.db.dao.Event;

public interface EventMapper {
		
	/**
     * @return the list of all Events from the database
     */
	@Select("SELECT * FROM event")
	List<Event> selectAll();
	
	/**
     * Returns an Event from the database
     * @param id value used for lookup
     * @return An Event with an id value equals to id, null otherwise
     */
	@Select("SELECT * FROM event WHERE id = #{id}")
	Event selectById(Integer id);
	
	/**
     * Returns an Event from the database
     * @param name value used for lookup
     * @return An Event with an name value equals to name, null otherwise
     */
	@Select("SELECT * FROM event WHERE name = #{name}")
	Event selectByName(String name);
}
