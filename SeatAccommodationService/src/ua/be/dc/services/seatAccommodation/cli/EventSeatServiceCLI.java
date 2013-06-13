package ua.be.dc.services.seatAccommodation.cli;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import gnu.getopt.Getopt;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import ua.be.dc.services.seatAccommodation.cli.util.Utils;
import ua.be.dc.services.seatAccommodation.manager.EventSeatServiceManager;
import ua.be.dc.services.seatAccommodation.manager.IEventSeatServiceManager;
import ua.be.dc.services.seatAccommodation.manager.SeatServiceManager;
import ua.be.dc.services.seatAccommodation.models.Event;
import ua.be.dc.services.seatAccommodation.models.EventSeat;
import ua.be.dc.services.seatAccommodation.models.Seat;

public class EventSeatServiceCLI implements IServiceCLI {

	private static Logger logger = LogManager.getLogger(EventSeatServiceCLI.class.getName());
	
	private static int EVENT_SEAT_NUM_FIELDS = 2;
	private IEventSeatServiceManager serviceManager = new EventSeatServiceManager();
	
	@Override
	public void executeStatement(String[] args) {
		int cmd;
		Getopt g = new Getopt("seatws eventSeats", args, "a:r:hle");
		while ((cmd = g.getopt()) != -1) {
			switch (cmd) {
			case 'l':
				listEventSeats();
				break;
			case 'a':
				args = Arrays.copyOfRange(args, 1, args.length);
				assignSeats(args);
				break;
			case 'r':
				args = Arrays.copyOfRange(args, 1, args.length);
				unassignSeats(args);
				break;
			case 'e':
				args = Arrays.copyOfRange(args, 1, args.length);
				unassignAllSeats(args);
				break;
			case 'h':
				showHelp();
				break;
			default:
				break;
			}
		}
	}

	private void unassignAllSeats(String[] args) {
		try {
			String[] fields = Utils.parseFields(args);
			if (fields.length != 1) {
				showHelp();
				System.exit(-1);
			}
			
			int eventId = Integer.valueOf(fields[0]);
		
			serviceManager.removeEventSeats(new Event(eventId));
		} catch (Exception e) {
			System.err.println("CLI: " + e.getMessage());
		}
	}

	private void unassignSeats(String[] args) {
		try {
			String[] fields = Utils.parseFields(args);
			if (fields.length != EVENT_SEAT_NUM_FIELDS) {
				showHelp();
				System.exit(-1);
			}
			
			int eventId = Integer.valueOf(fields[0]).intValue();
			int numSeats = Integer.valueOf(fields[1]).intValue();
			
			List<EventSeat> eventSeats = serviceManager.getEventSeats(new Event(eventId));
			
			for (int i = 0; i < numSeats; i++) {
				serviceManager.removeEventSeat(eventSeats.get(i));
			}
		} catch (Exception e) {
			System.err.println("CLI: " + e.getMessage());
		}
	}

	private void assignSeats(String[] args) {
		try {
			String[] fields = Utils.parseFields(args);
			if (fields.length != EVENT_SEAT_NUM_FIELDS) {
				showHelp();
				System.exit(-1);
			}
			
			int eventId = Integer.valueOf(fields[0]).intValue();
			int numSeats = Integer.valueOf(fields[1]).intValue();
			
			ArrayList<Integer> seatIds = new ArrayList<Integer>();
			ArrayList<Seat> seats = (ArrayList<Seat>) (new SeatServiceManager()).getSeats();
			for (Seat seat : seats) {
				seatIds.add(seat.getId());
			}
			
			List<EventSeat> eventSeats = serviceManager.getEventSeats(new Event(eventId));
			ArrayList<Integer> alreadyAssigned = new ArrayList<Integer>();
			for (EventSeat eventSeat : eventSeats) {
				alreadyAssigned.add(eventSeat.getSeat().getId());
			}
			
			// Get non-assigned seats
			seatIds.removeAll(alreadyAssigned);
			
			for (int i = 0; i < numSeats; i++) {
				EventSeat eventSeat = new EventSeat();
				eventSeat.setEvent(new Event(eventId));
				eventSeat.setSeat(new Seat(seatIds.get(i)));
	
				serviceManager.createEventSeat(eventSeat);
			}
		} catch (Exception e) {
			System.err.println("CLI: " + e.getMessage());
		}
	}

	private void listEventSeats() {
		System.out.println("EVENT SEAT ID, EVENT ID, EVENT TOKEN, SEAT ID");
		System.out.println("---------------------------------------------");
		
		List<EventSeat> eventSeats = serviceManager.getEventSeats();
		for (EventSeat eventSeat : eventSeats) {
			System.out.println(eventSeat.getId() + ", " + eventSeat.getEvent().getId() + ", " + eventSeat.getEvent().getToken() + ", " + eventSeat.getSeat().getId());
		}
	}

	@Override
	public void showHelp() {
		showUsage();
		
		System.out.println("The eventSeats commands are:");
		System.out.println("   -l  List all assigned seats");
		System.out.println("   -a  Assign seats for an event. You must provide the information as following: <event_id>, <num_seats>");
		System.out.println("   -r  Unassign seats of an event. You must provide the information as following: <event_id>, <num_seats>");
		System.out.println("   -e  Unassign all seats of every event of the system");
		System.exit(1);
	}

	@Override
	public void showUsage() {
		System.out.println("usage: seatws eventSeats <command> [<args>]\n");
	}

}
