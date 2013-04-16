package ua.be.dc.services.ticketService.cli;

import gnu.getopt.Getopt;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import ua.be.dc.services.ticketService.db.service.IDBEventService;
import ua.be.dc.services.ticketService.db.service.impl.DBEventServiceImpl;
import ua.be.dc.services.ticketService.models.Event;

public class TicketServiceCLIImpl {
	
	private static Logger logger = LogManager.getLogger(TicketServiceCLIImpl.class
			.getName());
	
	private static IDBEventService dbEventService;
	
	private static String eventName;
	
	/**
	 * Assumes the existance of a shell script wrapper
	 */
	private static void showUsage() {
		System.out.println("Usage: ticketws -a event_name");
		System.exit(1);
	}

	public static void main(String[] args) {
		
		int cmd;
		Getopt g = new Getopt("ticketws", args, "a:");
		
		while ((cmd = g.getopt()) != -1) {
			switch (cmd) {
			case 'a':
				eventName = String.valueOf(g.getOptarg());
				break;

			default:
			case '?':
				showUsage();
				break;
			}
		}
		
		// arguments validation
		if (eventName == "" | eventName == null) {
			System.out.println("Error: missing required arguments.");
			showUsage();
		}
		
		// command execution
		Event event = new Event();
		event.setName(eventName);
		
		dbEventService = new DBEventServiceImpl();
		dbEventService.insert(event);
		
		logger.trace("Inserted event with ID " + event.getId() + " through the CLI client ");
		
		System.exit(1);
	}
}
