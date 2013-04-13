package ua.be.dc.services.seatAccommodation.db.service.test;

import java.util.List;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import ua.be.dc.services.seatAccommodation.db.service.IDBSeatService;
import ua.be.dc.services.seatAccommodation.db.service.IDBSeatTypeService;
import ua.be.dc.services.seatAccommodation.db.service.impl.DBSeatServiceImpl;
import ua.be.dc.services.seatAccommodation.db.service.impl.DBSeatTypeServiceImpl;
import ua.be.dc.services.seatAccommodation.models.Seat;
import ua.be.dc.services.seatAccommodation.models.SeatType;

public class DBSeatServiceTest {
	
	private static IDBSeatService dbSeatService;
	private static IDBSeatTypeService dbSeatTypeService;
	
	@BeforeClass
	public static void setup() {
		dbSeatService = new DBSeatServiceImpl();
		dbSeatTypeService = new DBSeatTypeServiceImpl();
	}
	
	@AfterClass
	public static void teardown() {
		dbSeatService = null;
		dbSeatTypeService = null;
	}

	@Test
	public void testGetAll() {
		List<Seat> seats = dbSeatService.getAll();
		Assert.assertNotNull(seats);
		for (Seat seat : seats) {
			System.out.println(seat);
		}
	}
	
	@Test
	public void testGetById() {
		Seat seat = dbSeatService.getById(1);
		Assert.assertNotNull(seat);
		Assert.assertNotNull(seat.getType());
		System.out.println(seat);
	}

	@Test
	public void testInsert() {
		SeatType seatType = dbSeatTypeService.getById(1);
		
		Seat seat = new Seat();
		seat.setType(seatType);
		
		dbSeatService.insert(seat);
		Assert.assertTrue(seat.getId() != 0);
		
		Seat createdSeat = dbSeatService.getById(seat.getId());
		Assert.assertNotNull(createdSeat);
		Assert.assertEquals(seat.getType().getName(), seat.getType().getName());
	}
	
	@Test 
	public void testUpdate() {
		SeatType seatType = dbSeatTypeService.getById(2);
		
		Seat seat = dbSeatService.getById(2);
		seat.setType(seatType);
		dbSeatService.update(seat);
		
		Seat updatedSeat = dbSeatService.getById(2);
		Assert.assertEquals(seat.getId(), updatedSeat.getId());
	}
	
	@Test
	public void testDelete() {
		Seat seat = dbSeatService.getById(3);
		dbSeatService.deleteById(seat.getId());
		
		Seat deletedSeat = dbSeatService.getById(3);
		Assert.assertNull(deletedSeat);
	}
}
