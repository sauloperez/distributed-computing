package ua.be.dc.services.seatAccommodation.cli;

import gnu.getopt.Getopt;

import java.util.Arrays;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import ua.be.dc.services.seatAccommodation.cli.util.Utils;
import ua.be.dc.services.seatAccommodation.manager.ISeatServiceManager;
import ua.be.dc.services.seatAccommodation.manager.SeatServiceManager;
import ua.be.dc.services.seatAccommodation.models.Seat;

public class SeatServiceCLI implements IServiceCLI {
	
	private static Logger logger = LogManager.getLogger(SeatServiceCLI.class.getName());
	
	private static int SEAT_NUM_FIELDS = 1;
	private ISeatServiceManager serviceManager = new SeatServiceManager();
	
	@Override
	public void executeStatement(String[] args) {
		int cmd;
		Getopt g = new Getopt("seatws seats", args, "a:r:hle");
		while ((cmd = g.getopt()) != -1) {
			switch (cmd) {
			case 'l':
				listSeats();
				break;
			case 'a':
				args = Arrays.copyOfRange(args, 1, args.length);
				addSeats(args);
				break;
			case 'r':
				removeSeat(g);
				break;
			case 'e':
				emptySeats();
				break;
			case 'h':
				showHelp();
				break;
			default:
				break;
			}
		}
	}

//	private void addSeats(String[] args) {
//		try {
//			String[] fields = Utils.parseFields(args);
//			if (fields.length != SEAT_NUM_FIELDS && fields.length != SEAT_NUM_FIELDS+1) {
//				showHelp();
//				System.exit(-1);
//			}
//			
//			int eventId = Integer.valueOf(fields[0]).intValue();
//			int numSeats = 1;
//			// The user also specified a number of seats to set up
//			if (fields.length == SEAT_NUM_FIELDS+1) {
//				numSeats = Integer.valueOf(fields[1]).intValue();
//			}
//			
//			Event event = new Event(eventId);
//			for (int i = 0; i < numSeats; i++) {
//				Seat seat = new Seat();
//				seat.setId(eventId);
//				
//				// TODO Seat Type is not used temporally but might be used in the future
//				seat.setType(new SeatType(1)); 	
//				
//				serviceManager.createSeatForEvent(event, seat);
//			}
//		} catch (Exception e) {
//			System.err.println("CLI: " + e.getMessage());
//		}
//	}
	private void addSeats(String[] args) {
		try {
			String[] fields = Utils.parseFields(args);
			if (fields.length != SEAT_NUM_FIELDS) {
				showHelp();
				System.exit(-1);
			}
			
			int numSeats = Integer.valueOf(fields[0]);
			for (int i = 0; i < numSeats; i++) {
				serviceManager.createSeat(new Seat());
			}
		} catch (Exception e) {
			System.err.println("CLI: " + e.getMessage());
		}
	}

	private void emptySeats() {
		try {
			List<Seat> seats = serviceManager.getSeats();
			for (Seat seat : seats) {
				serviceManager.deleteSeatById(seat.getId());
			}

			logger.trace("CLI: All seats deleted");
		} catch (Exception e) {
			System.err.println("CLI: " + e.getMessage());
		}
		
	}

	private void removeSeat(Getopt g) {
		try {
			Integer seatId = Integer.valueOf(g.getOptarg());
			serviceManager.deleteSeatById(seatId);
			
			logger.trace("CLI: Removed seat with ID " + seatId);
		} catch (Exception e) {
			System.err.println("CLI: " + e.getMessage());
		}
	}

	private void listSeats() {
		System.out.println("SEAT ID, TYPE ID");
		System.out.println("----------------");
		
		List<Seat> seats = serviceManager.getSeats();
		for (Seat seat : seats) {
			System.out.println(seat.getId() + ", " + seat.getType().getId());
		}
	}

	/**
	 * Assumes the existence of a shell script wrapper
	 */
	public void showUsage() {
		System.out.println("usage: seatws seats <command> [<args>]\n");
	}
	
	/**
	 * Assumes the existence of a shell script wrapper
	 */
	public void showHelp() {
		showUsage();
		
		System.out.println("The seats commands are:");
		System.out.println("   -l  List all the seats");
		System.out.println("   -a  Add seats to the system. You must provide the information as following: <num_of_seats>");
		System.out.println("   -r  Remove a seat from the system. You must provide the seat id");
		System.out.println("   -e  Remove all seats from the system");
		System.exit(1);
	}

}
