package ua.be.dc.services.seatAccommodation.manager.test;

import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import ua.be.dc.services.seatAccommodation.db.service.IDBEventService;
import ua.be.dc.services.seatAccommodation.db.service.IDBSeatService;
import ua.be.dc.services.seatAccommodation.db.service.impl.DBEventServiceImpl;
import ua.be.dc.services.seatAccommodation.db.service.impl.DBSeatServiceImpl;
import ua.be.dc.services.seatAccommodation.manager.ISeatServiceManager;
import ua.be.dc.services.seatAccommodation.manager.SeatServiceManager;
import ua.be.dc.services.seatAccommodation.models.Event;
import ua.be.dc.services.seatAccommodation.models.Seat;

public class SeatServiceManagerTest {

	private ISeatServiceManager serviceManager;
	private IDBSeatService dbSeatService;
	private IDBEventService dbEventService;
	
	@Before
	public void setUp() throws Exception {
		serviceManager = new SeatServiceManager();
		dbSeatService = new DBSeatServiceImpl();
		dbEventService = new DBEventServiceImpl();
	}

	@After
	public void tearDown() throws Exception {
		serviceManager = null;
		dbSeatService = null;
		dbEventService = null;
	}

	@Test
	public final void testGetSeats() {
		List<Seat> seats = serviceManager.getSeats();
		Assert.assertNotNull(seats);
	}
	
	@Test
	public final void testDeleteSeatById() {
		try {
			int seatId = 176;
			
			serviceManager.deleteSeatById(seatId);
			
			Seat deletedSeat = dbSeatService.getById(seatId);
			Assert.assertNull(deletedSeat);
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}
	
	@Test
	public final void testCreateSeatForEvent() {
		try {
			int eventId = 46;
			int seatId = 100;
			
			Event event = dbEventService.getById(eventId);
			Seat seat = dbSeatService.getById(seatId);
			
			serviceManager.createSeatForEvent(event, seat);
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}
	
	@Test
	public final void testCreateSeat() {
		try {
			serviceManager.createSeat(new Seat());
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}
}
