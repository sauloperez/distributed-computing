package ua.be.dc.services.ticketService.cli;

import gnu.getopt.Getopt;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import ua.be.dc.services.ticketService.manager.IServiceManager;
import ua.be.dc.services.ticketService.manager.ServiceManager;
import ua.be.dc.services.ticketService.models.Event;

public class TicketServiceCLI {

	private static Logger logger = LogManager.getLogger(TicketServiceCLI.class
			.getName());

	private static Integer eventId;
	private static String eventName;

	private static IServiceManager ticketServiceManager;

	public static void main(String[] args) {
		ticketServiceManager = new ServiceManager();
		
		int cmd;
		Getopt g = new Getopt("ticketws", args, "a:r:h");
		while ((cmd = g.getopt()) != -1) {
			switch (cmd) {
			case 'a':
				eventName = String.valueOf(g.getOptarg());
				addEvent(eventName);
				break;
			case 'r':
				eventId = Integer.parseInt(g.getOptarg());
				removeEvent(eventId);
				break;
			case 'h':
				showHelp();
				break;
				
			default:
			case '?':
				showHelp();
				break;
			}
		}

		System.exit(1);
	}
	
	/**
	 * Assumes the existance of a shell script wrapper
	 */
	public static void showHelp() {
		System.out.println("usage: ticketws <command> [<args>]\n");
		
		System.out.println("The ticketws commands are:");
		System.out.println("   -a  Add an event to the system. You must provide an event name");
		System.out.println("   -r  Remove an event from the system. You must provide the event id");
		System.exit(1);
	}

	public static void addEvent(String eventName) {

		if (eventName == "" | eventName == null) {
			System.out.println("Error: missing required arguments.");
			showHelp();
		}

		Event event = new Event();
		event.setName(eventName);

		ticketServiceManager.createEvent(event);

		logger.trace("CLI: Inserted event with ID " + event.getId());
	}
	
	public static void removeEvent(Integer eventId) {
		
		if (eventId == null) {
			System.out.println("Error: missing required arguments.");
			showHelp();
		}
		
		ticketServiceManager.deleteEventById(eventId);
		
		logger.trace("CLI: Deleted event with ID " + eventId);
	}
}
