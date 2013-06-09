package ua.be.dc.services.sellingService.cli;

import gnu.getopt.Getopt;

import java.util.Arrays;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import ua.be.dc.services.sellingService.cli.util.Utils;
import ua.be.dc.services.sellingService.manager.EventOrganizerManager;
import ua.be.dc.services.sellingService.manager.IEventOrganizerServiceManager;
import ua.be.dc.services.sellingService.models.EventOrganizer;

public class EventOrganizerCLI implements IServiceCLI {
	
	private static Logger logger = LogManager.getLogger(EventOrganizerCLI.class.getName());
	
	private static final int EVENT_ORGANIZER_NUM_FIELDS = 1;
	private IEventOrganizerServiceManager serviceManager;
	
	public EventOrganizerCLI() {
		serviceManager = new EventOrganizerManager();
	}

	@Override
	public void executeStatement(String[] args) {
		int cmd;
		Getopt g = new Getopt("sellingws eos", args, "a:r:hle");
		while ((cmd = g.getopt()) != -1) {
			switch (cmd) {
			case 'l':
				listEventOrganizers();
				break;
			case 'a':
				args = Arrays.copyOfRange(args, 1, args.length);
				addEventOrganizer(args);
				break;
			case 'r':
				removeEventOrganizers(g);
				break;
			case 'e':
				emptyEventOrganizers();
				break;
			case 'h':
				showHelp();
				break;
			default:
				break;
			}
		}
	}

	private void emptyEventOrganizers() {
		try {
			List<EventOrganizer> eventOrganizers = serviceManager.getEventOrganizers();
			for (EventOrganizer eventOrganizer : eventOrganizers) {
				serviceManager.deleteEventOrganizerById(eventOrganizer.getId());
			}
			
			logger.trace("CLI: All event organizers deleted");
		} catch (Exception e) {
			System.err.println("CLI: " + e.getMessage());
		}
	}

	private void removeEventOrganizers(Getopt g) {
		try {
			int eventOrganizerId = Integer.parseInt(g.getOptarg());
			serviceManager.deleteEventOrganizerById(eventOrganizerId);
			
			logger.trace("CLI: Removed event with ID " + eventOrganizerId);
		} catch (Exception e) {
			System.err.println("CLI: " + e.getMessage());
		}
	}

	private void addEventOrganizer(String[] args) {
		try {
			String[] fields = Utils.parseFields(args);
			if (fields.length != EVENT_ORGANIZER_NUM_FIELDS) {
				showHelp();
				System.exit(-1);
			}
			
			String serviceEndpoint = fields[0];
			
			EventOrganizer eventOrganizer = new EventOrganizer();
			eventOrganizer.setServiceEndpoint(serviceEndpoint);
			
			serviceManager.addEventOrganizer(eventOrganizer);

			logger.trace("CLI: Added event organizer with ID " + eventOrganizer.getId());
		} catch (Exception e) {
			System.err.println("CLI: " + e.getMessage());
		}
		
	}

	private void listEventOrganizers() {
		System.out.println("\n ID, SERVICE ENDPOINT");
		System.out.println("------------------------");
		for (EventOrganizer eventOrganizer : serviceManager.getEventOrganizers()) {
			System.out.println(eventOrganizer.getId() + ", " + eventOrganizer.getServiceEndpoint());
		}
	}

	@Override
	public void showHelp() {
		showUsage();
		
		System.out.println("The event organizers commands are:");
		System.out.println("   -l  List all the event organizers");
		System.out.println("   -a  Add an event organizer to the system. You must provide its service endpoint");
		System.out.println("   -r  Remove an event organizer from the system. You must provide the event organizer id");
		System.out.println("   -e  Remove all event organizers from the system");
		System.exit(1);
	}

	@Override
	public void showUsage() {
		System.out.println("usage: sellingws eos <command> [<args>]\n");
	}

}
