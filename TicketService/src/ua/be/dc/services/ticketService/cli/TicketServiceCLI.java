package ua.be.dc.services.ticketService.cli;

import gnu.getopt.Getopt;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import ua.be.dc.services.ticketService.models.Event;
import ua.be.dc.services.ticketService.service.TicketServiceManager;

public class TicketServiceCLI {

	private static Logger logger = LogManager.getLogger(TicketServiceCLI.class
			.getName());

	private static String eventName;

	private static TicketServiceManager ticketServiceManager;

	/**
	 * Assumes the existance of a shell script wrapper
	 */
	private static void showUsage() {
		System.out.println("Usage: ticketws -a event_name");
		System.exit(1);
	}

	public static void main(String[] args) {
		int cmd;
		
		ticketServiceManager = new TicketServiceManager();
		Getopt g = new Getopt("ticketws", args, "a:");

		while ((cmd = g.getopt()) != -1) {
			switch (cmd) {
			case 'a':
				eventName = String.valueOf(g.getOptarg());
				add(eventName);
				break;

			default:
			case '?':
				showUsage();
				break;
			}
		}

		System.exit(1);
	}

	public static void add(String eventName) {

		if (eventName == "" | eventName == null) {
			System.out.println("Error: missing required arguments.");
			showUsage();
		}

		Event event = new Event();
		event.setName(eventName);

		ticketServiceManager.createEvent(event);

		logger.trace("CLI: Inserted event with ID " + event.getId());
	}
}
