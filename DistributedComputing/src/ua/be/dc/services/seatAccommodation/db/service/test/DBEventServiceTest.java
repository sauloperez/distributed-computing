package ua.be.dc.services.seatAccommodation.db.service.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import ua.be.dc.services.seatAccommodation.db.service.IDBEventService;
import ua.be.dc.services.seatAccommodation.db.service.impl.DBEventServiceImpl;
import ua.be.dc.services.seatAccommodation.models.Event;

public class DBEventServiceTest {

	private static Logger logger = LogManager
			.getLogger(DBEventServiceTest.class.getName());
	private static IDBEventService dbEventService;

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		dbEventService = new DBEventServiceImpl();

		try {
			selectAll();
//			System.out.println("-------");

			// insert(new Event("N test"));
//			update(16, "last event");
			// delete(17);

//			selectAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void selectAll() throws Exception {
		for (Event event : dbEventService.getAll()) {
			printEvent(event);
		}
	}

	static void selectById(Integer id) throws Exception {
		Event event = new Event();
		event.setId(id);
		printEvent(dbEventService.getById(event));
	}

	static void insert(Event event) throws Exception {
		dbEventService.insert(event);
	}

	static void update(Integer id, String name) throws Exception {
		dbEventService.update(new Event(id), new Event(id, name));
	}

	static void delete(Integer id) throws Exception {
		dbEventService.deleteById(new Event(id));
	}

	static void printEvent(Event event) {
		System.out.println(event.getId() + ", " + event.getName());
	}
}
