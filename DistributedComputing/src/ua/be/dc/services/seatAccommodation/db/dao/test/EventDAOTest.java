package ua.be.dc.services.seatAccommodation.db.dao.test;

import ua.be.dc.services.seatAccommodation.db.dao.EventDAO;
import ua.be.dc.services.seatAccommodation.models.Event;

public class EventDAOTest {
	
	private static EventDAO eventDAO;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		selectAll();
//		System.out.println("-------");
		
//		insert(new Event("N test"));
//		update(2, "updated event");
//		delete(4);
		
//		selectAll();
	}
	
	static void selectAll() {
		eventDAO = new EventDAO();
		for (Event event : eventDAO.selectAll()) {
			printEvent(event);
		}
	}
	
	static void selectById(Integer id) {
		eventDAO = new EventDAO();
		Event event = eventDAO.selectById(id);
		printEvent(event);
	}
	
	static void insert(Event event) {
		eventDAO = new EventDAO();
		eventDAO.insert(event);
	}
	
	static void update(Integer id, String name) {
		eventDAO = new EventDAO();
		Event event = eventDAO.selectById(id);
		event.setName(name);

		eventDAO.update(event);
	}
	
	static void delete(Integer id) {
		eventDAO = new EventDAO();
		eventDAO.delete(id);
	}
	
	static void printEvent(Event event) {
		System.out.println(event.getId() + ", " + event.getName());
	}
}
