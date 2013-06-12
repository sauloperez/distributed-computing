package ua.be.dc.services.seatAccommodation.manager.test;

import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import ua.be.dc.services.seatAccommodation.db.service.IDBEventSeatService;
import ua.be.dc.services.seatAccommodation.db.service.impl.DBEventSeatServiceImpl;
import ua.be.dc.services.seatAccommodation.manager.EventSeatServiceManager;
import ua.be.dc.services.seatAccommodation.manager.IEventSeatServiceManager;
import ua.be.dc.services.seatAccommodation.models.Event;
import ua.be.dc.services.seatAccommodation.models.EventSeat;
import ua.be.dc.services.seatAccommodation.models.Seat;

public class EventSeatServiceManagerTest {
	
	private IEventSeatServiceManager serviceManager;
	private IDBEventSeatService dbEventSeatService;
	
	@Before
	public void setUp() throws Exception {
		serviceManager = new EventSeatServiceManager();
		dbEventSeatService = new DBEventSeatServiceImpl();
	}

	@After
	public void tearDown() throws Exception {
		serviceManager = null;
		dbEventSeatService = null;
	}

	@Test
	public final void testGetEventSeats() {
		List<EventSeat> eventSeats = serviceManager.getEventSeats();
		Assert.assertNotNull(eventSeats);
	}
	
	@Test
	public final void testGetEventSeatsByEvent() {
		int eventId = 33;
		
		List<EventSeat> eventSeats = serviceManager.getEventSeats(new Event(eventId));
		Assert.assertNotNull(eventSeats);
	}
	
	@Test
	public final void testCreateEventSeat() {
		try {
			int eventId = 33;
			int seatId = 100;
			
			EventSeat eventSeat = new EventSeat();
			eventSeat.setEvent(new Event(eventId));
			eventSeat.setSeat(new Seat(seatId));
		
			serviceManager.createEventSeat(eventSeat);
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}

	@Test
	public final void testRemoveEventSeat() {
		try {
			int eventSeatId = 76;
		
			serviceManager.removeEventSeat(new EventSeat(eventSeatId));
			
			EventSeat removedEventSeat = dbEventSeatService.getById(eventSeatId);
			Assert.assertNull(removedEventSeat);
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}
	
	@Test
	public final void testRemoveEventSeats() {
		try {
			int eventId = 33;
			
			serviceManager.removeEventSeats(new Event(eventId));
			
			List<EventSeat> removedEventSeats = dbEventSeatService.getByEventId(eventId);
			Assert.assertEquals(0, removedEventSeats.size());
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}
}
