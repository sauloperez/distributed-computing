package ua.be.dc.services.seatAccommodation.db.service.test;

import java.util.List;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import ua.be.dc.services.seatAccommodation.db.service.IDBSeatService;
import ua.be.dc.services.seatAccommodation.db.service.IDBSeatTypeService;
import ua.be.dc.services.seatAccommodation.db.service.exception.DBServiceException;
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
		try {
			int seatId = 30;
			Seat seat = dbSeatService.getById(seatId);
			Assert.assertNotNull(seat);
			Assert.assertNotNull(seat.getType());
			
			System.out.println(seat);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testGetByInvalidId() {
		Seat seat = dbSeatService.getById(-1);
		Assert.assertNull(seat);
	}

	@Test
	public void testInsert() {
		
		try {
			Seat seat = new Seat();
			
			dbSeatService.insert(seat);
			Assert.assertTrue(seat.getId() != 0);
			
			Seat createdSeat = dbSeatService.getById(seat.getId());
			
			Assert.assertNotNull(createdSeat);
			Assert.assertEquals(seat.getType().getName(), seat.getType().getName());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test(expected = DBServiceException.class) 
	public void testInsertByInvalidSeat() throws DBServiceException {
		dbSeatService.insert(new Seat());
	}
	
	@Test 
	public void testUpdate() {
		try {
			SeatType seatType = dbSeatTypeService.getById(2);
			
			Seat seat = dbSeatService.getById(2);
			seat.setType(seatType);
			dbSeatService.update(seat);
			
			Seat updatedSeat = dbSeatService.getById(2);
			Assert.assertEquals(seat.getId(), updatedSeat.getId());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test(expected = DBServiceException.class) 
	public void testUpdateByInvalidSeat() throws DBServiceException {
		dbSeatService.update(new Seat());
	}
	
	@Test
	public void testDelete() {
		try {
			int seatId = 30;
			Seat seat = dbSeatService.getById(seatId);
			dbSeatService.deleteById(seat.getId());
			
			Seat deletedSeat = dbSeatService.getById(seatId);
			Assert.assertNull(deletedSeat);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test(expected = DBServiceException.class)
	public void testDeleteByInvalidId() throws DBServiceException {
		dbSeatService.deleteById(-1);
	}
}
