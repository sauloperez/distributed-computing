package ua.be.dc.services.ticketService.cli;

import gnu.getopt.Getopt;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import ua.be.dc.services.ticketService.cli.util.Constants;
import ua.be.dc.services.ticketService.cli.util.Utils;
import ua.be.dc.services.ticketService.manager.EventServiceManager;
import ua.be.dc.services.ticketService.manager.IEventServiceManager;
import ua.be.dc.services.ticketService.models.Event;

public class EventServiceCLI implements IServiceCLI {

	private static Logger logger = LogManager.getLogger(EventServiceCLI.class.getName());
	
	private static final int EVENT_NUM_FIELDS = 3;
	private IEventServiceManager serviceManager;
	
	public EventServiceCLI() {
		serviceManager = new EventServiceManager();
	}		
	
	public void executeStatement(String[] args) {
		int cmd;
		Getopt g = new Getopt("ticketws events", args, "a:r:hle");
		while ((cmd = g.getopt()) != -1) {
			switch (cmd) {
			case 'l':
				listEvents();
				break;
			case 'a':
				args = Arrays.copyOfRange(args, 1, args.length);
				addEvent(args);
				break;
			case 'r':
				removeEvent(g);
				break;
			case 'e':
				emptyEvents();
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
	
	public void emptyEvents() {
		try {
			List<Event> events = serviceManager.getEvents();
			for (Event event : events) {
				serviceManager.deleteEventById(event.getId());
			}
			
			logger.trace("CLI: All events deleted");
		} catch (Exception e) {
			System.err.println("CLI: " + e.getMessage());
		}
	}
	
	public void listEvents() {
		System.out.println("\n ID, TOKEN, NAME, LOCATION, DATE");
		System.out.println("------------------------");
		for (Event event : serviceManager.getEvents()) {
			System.out.println(event.getId() + ", " +
					   		   event.getToken() + ", " + 
							   event.getName() + ", " + 
							   event.getLocation() + ", " + 
							   event.getDate().toString());
		}
	}
	
	public void addEvent(String[] args) {
		try {
			String[] fields = Utils.parseFields(args);
			if (fields.length != EVENT_NUM_FIELDS) {
				showHelp();
				System.exit(-1);
			}

			String name = fields[0];
			String location = fields[1];
			String date = fields[2];
			SimpleDateFormat dateFormat = new SimpleDateFormat(Constants.INPUT_DATE_FORMAT);
			Date parsedDate = dateFormat.parse(date);
			
			Event event = new Event();
			event.setName(name);
			event.setLocation(location);
			event.setDate(parsedDate.getTime());
			
			serviceManager.createEvent(event);

			logger.trace("CLI: Added event with ID " + event.getId());
		} catch (Exception e) {
			System.err.println("CLI: " + e.getMessage());
		}
	}
	
	public void removeEvent(Getopt g) {
		try {
			int eventId = Integer.parseInt(g.getOptarg());
			serviceManager.deleteEventById(eventId);
			
			logger.trace("CLI: Removed event with ID " + eventId);
		} catch (Exception e) {
			System.err.println("CLI: " + e.getMessage());
		}
	}
	
	/**
	 * Assumes the existence of a shell script wrapper
	 */
	public void showUsage() {
		System.out.println("usage: ticketws events <command> [<args>]\n");
	}

	public void showHelp() {
		showUsage();
		
		System.out.println("The events commands are:");
		System.out.println("   -l  List all the events");
		System.out.println("   -a  Add an event to the system. You must provide the information as following: <event_name>, <location> <date (as " + Constants.INPUT_DATE_FORMAT + ")>");
		System.out.println("   -r  Remove an event from the system. You must provide the event id");
		System.out.println("   -e  Remove all events from the system");
		System.exit(1);
	}
}
