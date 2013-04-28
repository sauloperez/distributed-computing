package ua.be.dc.services.ticketService.cli;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import gnu.getopt.Getopt;
import ua.be.dc.services.ticketService.manager.EventServiceManager;
import ua.be.dc.services.ticketService.manager.IEventServiceManager;
import ua.be.dc.services.ticketService.models.Event;

public class EventServiceCLI implements IServiceCLI {

	private static Logger logger = LogManager.getLogger(EventServiceCLI.class.getName());
	
	private IEventServiceManager serviceManager;
	
	public EventServiceCLI() {
		serviceManager = new EventServiceManager();
	}		
	
	public void executeStatement(String[] args) {
		int cmd;
		Getopt g = new Getopt("ticketws events", args, "a:r:h:l");
		while ((cmd = g.getopt()) != -1) {
			switch (cmd) {
			case 'l':
				listEvents();
				break;
			case 'a':
				addEvent(g);
				break;
			case 'r':
				removeEvent(g);
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
	}
	
	public void listEvents() {
		System.out.println("event id, event name");
		System.out.println("--------------------");
		for (Event event : serviceManager.getEvents()) {
			System.out.println(event.getId() + ", " + event.getName());
		}
	}

	public void addEvent(Getopt g) {
		Event event = new Event();
		event.setName(String.valueOf(g.getOptarg()));

		serviceManager.createEvent(event);

		logger.trace("CLI: Added event with ID " + event.getId());
	}
	
	public void removeEvent(Getopt g) {
		int eventId = Integer.parseInt(g.getOptarg());
		serviceManager.deleteEventById(eventId);
		
		logger.trace("CLI: Removed event with ID " + eventId);
	}
	
	/**
	 * Assumes the existence of a shell script wrapper
	 */
	public void showUsage() {
		System.out.println("usage: ticketws events <command> [<args>]\n");
	}

	/**
	 * Assumes the existence of a shell script wrapper
	 */
	public void showHelp() {
		showUsage();
		
		System.out.println("The events commands are:");
		System.out.println("   -l  List all the events");
		System.out.println("   -a  Add an event to the system. You must provide an event name");
		System.out.println("   -r  Remove an event from the system. You must provide the event id");
		System.exit(1);
	}
}
