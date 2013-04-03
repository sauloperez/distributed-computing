package ua.be.dc.services.seatAccommodation.db.service.test;

import java.util.List;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import ua.be.dc.services.seatAccommodation.db.service.IDBEventSeatService;
import ua.be.dc.services.seatAccommodation.db.service.IDBEventService;
import ua.be.dc.services.seatAccommodation.db.service.IDBSeatService;
import ua.be.dc.services.seatAccommodation.db.service.impl.DBEventSeatServiceImpl;
import ua.be.dc.services.seatAccommodation.db.service.impl.DBEventServiceImpl;
import ua.be.dc.services.seatAccommodation.db.service.impl.DBSeatServiceImpl;
import ua.be.dc.services.seatAccommodation.models.Event;
import ua.be.dc.services.seatAccommodation.models.EventSeat;
import ua.be.dc.services.seatAccommodation.models.Seat;

public class DBEventSeatServiceTest {
	
	private static IDBEventSeatService dbEventSeatService;
	private static IDBEventService dbEventService;
	private static IDBSeatService dbSeatService;

	@BeforeClass
	public static void setup() {
		dbEventSeatService = new DBEventSeatServiceImpl();
		dbEventService = new DBEventServiceImpl();
		dbSeatService = new DBSeatServiceImpl();
	}
	
	@AfterClass
	public static void teardown() {
		dbEventSeatService = null;
		dbEventService = null;
		dbSeatService = null;
	}
	
	@Test
	public void testGetById() {
		EventSeat eventSeat = dbEventSeatService.getById(1);
		Assert.assertNotNull(eventSeat);
		Assert.assertNotNull(eventSeat.getEvent());
		System.out.println(eventSeat);
	}
	
	@Test
	public void testGetByEventId() {
		List<EventSeat> eventSeats = dbEventSeatService.getByEventId(1);
		Assert.assertNotNull(eventSeats);
		for (EventSeat eventSeat : eventSeats) {
			Assert.assertNotNull(eventSeat.getEvent());
			System.out.println(eventSeat);
		}
	}
	
	@Test
	public void testGetByEventIdAndTypeId() {
		List<EventSeat> eventSeats = dbEventSeatService.getByEventIdAndTypeId(1, 2);
		Assert.assertNotNull(eventSeats);
		for (EventSeat eventSeat : eventSeats) {
			Assert.assertNotNull(eventSeat.getEvent());
			System.out.println(eventSeat);
		}
	}
	
	@Test
	public void testGetAll() {
		List<EventSeat> eventSeats = dbEventSeatService.getAll();
		Assert.assertNotNull(eventSeats);
		for (EventSeat eventSeat : eventSeats) {
			Assert.assertNotNull(eventSeat.getEvent());
			System.out.println(eventSeat);
		}
	}
	
	@Test
	public void testInsert() {
		Event event = dbEventService.getById(1);
		Seat seat = dbSeatService.getById(1);
		
		EventSeat eventSeat = new EventSeat();
		eventSeat.setEvent(event);
		eventSeat.setSeat(seat);
		
		dbEventSeatService.insert(eventSeat);
		Assert.assertTrue(eventSeat.getId() != 0);
		
		EventSeat createdEventSeat = dbEventSeatService.getById(eventSeat.getId());
		Assert.assertNotNull(createdEventSeat);
		
		Event e = createdEventSeat.getEvent();
		Seat s = createdEventSeat.getSeat();
		Assert.assertEquals(event.getId(), e.getId());
		Assert.assertEquals(seat.getId(), s.getId());
	}
	
	@Test
	public void testUpdate() {
		Event event = dbEventService.getById(2);
		Seat seat = dbSeatService.getById(2);
		
		EventSeat eventSeat = dbEventSeatService.getById(2);
		eventSeat.setEvent(event);
		eventSeat.setSeat(seat);
		dbEventSeatService.update(eventSeat);
		
		EventSeat updatedEventSeat = dbEventSeatService.getById(2);
		Assert.assertEquals(eventSeat.getId(), updatedEventSeat.getId());
		Assert.assertEquals((eventSeat.getEvent()).getId(), (updatedEventSeat.getEvent()).getId());
		Assert.assertEquals((eventSeat.getSeat()).getId(), (updatedEventSeat.getSeat()).getId());
	}
	
	@Test
	public void testDelete() {
		EventSeat eventSeat = dbEventSeatService.getById(3);
		dbEventSeatService.deleteById(eventSeat.getId());
		
		EventSeat deletedEventSeat = dbEventSeatService.getById(3);
		Assert.assertNull(deletedEventSeat);
	}
}
