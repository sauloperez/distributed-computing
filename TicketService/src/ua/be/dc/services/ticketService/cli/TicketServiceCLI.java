package ua.be.dc.services.ticketService.cli;

import gnu.getopt.Getopt;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import ua.be.dc.services.ticketService.manager.ITicketServiceManager;
import ua.be.dc.services.ticketService.manager.TicketServiceManager;
import ua.be.dc.services.ticketService.models.Channel;
import ua.be.dc.services.ticketService.models.Event;
import ua.be.dc.services.ticketService.models.Ticket;

public class TicketServiceCLI implements IServiceCLI {
	
	private static Logger logger = LogManager.getLogger(TicketServiceCLI.class.getName());
	
	private Ticket ticket;
	private ITicketServiceManager serviceManager;
	
	public TicketServiceCLI() {
		serviceManager = new TicketServiceManager();
	}

	@Override
	public void executeStatement(String[] args) {
		int cmd;
		Getopt g = new Getopt("ticketws tickets", args, "a:r:h");
		while ((cmd = g.getopt()) != -1) {
			switch (cmd) {
			case 'a':
				addTicket(g);
				break;
			case 'r':
				removeTicket(g);
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
	
	// TODO: Use objects to pass the parameters, validate them in the db layer and throw exceptions accordingly
	public void addTicket(Getopt g) {
		try {
			ticket = new Ticket();
			ticket.setEvent(new Event(Integer.valueOf(g.getOptarg())));
			ticket.setSeatId(Integer.valueOf(g.getOptarg()));
			ticket.setChannel(new Channel(Integer.valueOf(g.getOptarg())));
			ticket.setPrice(Float.valueOf(g.getOptarg()));
			ticket.setSold(Boolean.valueOf(g.getOptarg()));
			ticket.setAvailable(Boolean.valueOf(g.getOptarg()));
			
			serviceManager.createTicket(ticket);
			
			logger.trace("CLI: Added ticket with ID " + ticket.getId());
		} catch (IllegalArgumentException e) {
			System.out.println("The ticket couldn't be added. " + e.getMessage());
		}
	}
	
	public void removeTicket(Getopt g) {
		Integer ticketId = Integer.valueOf(g.getOptarg());
		serviceManager.deleteTicketById(ticketId);

		logger.trace("CLI: Removed ticket with ID " + ticketId);
	}

	/**
	 * Assumes the existence of a shell script wrapper
	 */
	public void showUsage() {
		System.out.println("usage: ticketws tickets <command> [<args>]\n");
	}

	/**
	 * Assumes the existence of a shell script wrapper
	 */
	public void showHelp() {
		showUsage();
		
		System.out.println("The tickets commands are:");
		System.out.println("   -a  Add a ticket to the system. You must provide the following parameters: event id, seat id, channel id, price, sold and available");
		System.out.println("   -r  Remove an event from the system. You must provide the event id");
		System.exit(1);
	}

}
