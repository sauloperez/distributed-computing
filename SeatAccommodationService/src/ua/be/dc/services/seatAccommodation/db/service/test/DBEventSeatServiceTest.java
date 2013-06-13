package ua.be.dc.services.seatAccommodation.db.service.test;

import java.util.List;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import ua.be.dc.services.seatAccommodation.db.service.IDBEventSeatService;
import ua.be.dc.services.seatAccommodation.db.service.IDBEventService;
import ua.be.dc.services.seatAccommodation.db.service.IDBSeatService;
import ua.be.dc.services.seatAccommodation.db.service.exception.DBServiceException;
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
		int eventSeatId = 90;
		
		EventSeat eventSeat = dbEventSeatService.getById(eventSeatId);
		Assert.assertNotNull(eventSeat);
		Assert.assertNotNull(eventSeat.getEvent());
		System.out.println(eventSeat);
	}
	
	@Test
	public void testGetByEventId() {
		int eventId = 44;
		
		List<EventSeat> eventSeats = dbEventSeatService.getByEventId(eventId);
		Assert.assertNotNull(eventSeats);
		for (EventSeat eventSeat : eventSeats) {
			Assert.assertNotNull(eventSeat.getEvent());
			System.out.println(eventSeat);
		}
	}
	
	@Test
	public void testGetByEventToken() {
		String token = "ce5faeaf-c42e-4c25-ade4-1aadc3398597";
		
		List<EventSeat> eventSeats = dbEventSeatService.getByEventToken(token);
		Assert.assertNotNull(eventSeats);
		for (EventSeat eventSeat : eventSeats) {
			Assert.assertNotNull(eventSeat.getEvent());
			System.out.println(eventSeat);
		}
	}
	
	@Test
	public void testGetByInvalidId() {
		List<EventSeat> eventSeats = dbEventSeatService.getByEventId(-1);
		Assert.assertTrue(eventSeats.size() == 0);
	}
	
	@Test
	public void testGetByInvalidToken() {
		List<EventSeat> eventSeats = dbEventSeatService.getByEventToken("_");
		Assert.assertTrue(eventSeats.size() == 0);
	}
	
	@Test
	public void testGetByEventIdAndTypeId() {
		int eventId = 44;
		int typeId = 1;
		
		List<EventSeat> eventSeats = dbEventSeatService.getByEventIdAndTypeId(eventId, typeId);
		Assert.assertNotNull(eventSeats);
		for (EventSeat eventSeat : eventSeats) {
			Assert.assertNotNull(eventSeat.getEvent());
			System.out.println(eventSeat);
		}
	}
	
	@Test
	public void testGetByEventTokenAndTypeId() {
		String token = "ce5faeaf-c42e-4c25-ade4-1aadc3398597";
		int typeId = 1;
		
		List<EventSeat> eventSeats = dbEventSeatService.getByEventTokenAndTypeId(token, typeId);
		Assert.assertNotNull(eventSeats);
		for (EventSeat eventSeat : eventSeats) {
			Assert.assertNotNull(eventSeat.getEvent());
			System.out.println(eventSeat);
		}
	}
	
	@Test
	public void testGetByInvalidEventIdAndInvalidTypeId() {
		List<EventSeat> eventSeats = dbEventSeatService.getByEventIdAndTypeId(-1, -2);
		Assert.assertTrue(eventSeats.size() == 0);
	}
	
	@Test
	public void testGetByInvalidEventTokenAndInvalidTypeId() {
		List<EventSeat> eventSeats = dbEventSeatService.getByEventTokenAndTypeId("_", -2);
		Assert.assertTrue(eventSeats.size() == 0);
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
		try {
			int eventId = 44;
			int seatId = 78;
			
			Event event = dbEventService.getById(eventId);
			Seat seat = dbSeatService.getById(seatId);
			
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
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}
	
	@Test(expected = DBServiceException.class)
	public void testInsertByInvalidEventSeat() throws DBServiceException {
		dbEventSeatService.insert(new EventSeat());
	}
	
	@Test
	public void testUpdate() {
		try {
			int eventSeatId = 90;
			int eventId = 44;
			int seatId = 78;
			
			Event event = dbEventService.getById(eventId);
			Seat seat = dbSeatService.getById(seatId);
			
			EventSeat eventSeat = dbEventSeatService.getById(eventSeatId);
			eventSeat.setEvent(event);
			eventSeat.setSeat(seat);
			dbEventSeatService.update(eventSeat);
			
			EventSeat updatedEventSeat = dbEventSeatService.getById(eventSeatId);
			Assert.assertEquals(eventSeat.getId(), updatedEventSeat.getId());
			Assert.assertEquals((eventSeat.getEvent()).getId(), (updatedEventSeat.getEvent()).getId());
			Assert.assertEquals((eventSeat.getSeat()).getId(), (updatedEventSeat.getSeat()).getId());
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}
	
	@Test(expected = DBServiceException.class)
	public void testUpdateByInvalidEventSeat() throws DBServiceException {
		dbEventSeatService.update(new EventSeat());
	}
	
	@Test
	public void testDelete() {
		try {
			int eventSeatId = 93;
			
			EventSeat eventSeat = dbEventSeatService.getById(eventSeatId);
			dbEventSeatService.deleteById(eventSeat.getId());
			
			EventSeat deletedEventSeat = dbEventSeatService.getById(eventSeatId);
			Assert.assertNull(deletedEventSeat);
		} catch (DBServiceException e) {
			e.printStackTrace();
			Assert.fail();
		}
	}
	
	@Test(expected = DBServiceException.class)
	public void testDeleteByInvalidId() throws DBServiceException {
		dbEventSeatService.deleteById(-1);
	}
}
