package ua.be.dc.services.ticketService.cli;

import gnu.getopt.Getopt;

import java.util.Arrays;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import ua.be.dc.services.ticketService.cli.util.Utils;
import ua.be.dc.services.ticketService.manager.ITicketServiceManager;
import ua.be.dc.services.ticketService.manager.TicketServiceManager;
import ua.be.dc.services.ticketService.models.Channel;
import ua.be.dc.services.ticketService.models.Event;
import ua.be.dc.services.ticketService.models.Ticket;

public class TicketServiceCLI implements IServiceCLI {
	
	private static Logger logger = LogManager.getLogger(TicketServiceCLI.class.getName());
	
	private static final int TICKET_NUM_FIELDS = 5;
	private ITicketServiceManager serviceManager;
	
	public TicketServiceCLI() {
		serviceManager = new TicketServiceManager();
	}

	@Override
	public void executeStatement(String[] args) {
		int cmd;
		Getopt g = new Getopt("ticketws tickets", args, "r:t:hlea");
		while ((cmd = g.getopt()) != -1) {
			switch (cmd) {
			case 'l':
				listTickets();
				break;
			case 'a':
				args = Arrays.copyOfRange(args, 1, args.length);
				addTicket(args);
				break;
			case 'r':
				removeTicket(g);
				break;
			case 'e':
				emptyTickets();
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
	
	/**
	 * 1- cd /Applications/eclipse_dc/plugins/oracle.eclipse.runtime.glassfish_3.1.0.0/glassfish3/bin
	 * 2- ./asadmin
	 * 3- list-domains
	 * 4- asadmin> list-domains
	 * 5- asadmin> create-domain --adminport <port_num> <domain_name>
	 * 6- New > Server pointing to the new domain folder
	 * 7- deploy service and get endpoint through domain's glassfish admin console (same as wsdl)
	 */
	
	private void listTickets() {
		System.out.println("ticket id, event id, channel id, price, sold, available");
		System.out.println("----------------------------------------------------------------");
		
		List<Ticket> tickets = serviceManager.getTickets();
		for (Ticket ticket : tickets) {
			System.out.println(ticket.getId() + ", "
							 + ticket.getEvent().getId() + ", "
							 + ticket.getChannel().getId() + ", "
							 + ticket.getPrice() + ", "
							 + ticket.getSold() + ", "
							 + ticket.getAvailable());
		}
	}

	public void addTicket(String[] args) {
		try {
			String[] fields = Utils.parseFields(args);
			if (args.length != TICKET_NUM_FIELDS) {
				showHelp();
				System.exit(-1);
			}
			
			Integer eventId = Integer.valueOf(fields[0]);
			Integer channelId = Integer.valueOf(fields[1]);
			Float price = Float.valueOf(fields[2]);
			Boolean sold = (fields[3].equals("1")) ? true : false;
			Boolean available = (fields[4].equals("1")) ? true : false;
			
			Ticket ticket = new Ticket();
			ticket.setEvent(new Event(eventId));
			ticket.setChannel(new Channel(channelId));
			ticket.setPrice(price);
			ticket.setSold(sold);
			ticket.setAvailable(available);
			
			serviceManager.createTicket(ticket);
			
			logger.trace("CLI: Added ticket with ID " + ticket.getId());
		} catch (Exception e) {
			String message = e.getMessage();
			if (e.getCause() != null) {
				message = e.getCause().getMessage();
			}
			System.out.println("The ticket couldn't be added. " + message);
		}
	}
	
	public void removeTicket(Getopt g) {
		try {
			Integer ticketId = Integer.valueOf(g.getOptarg());
			serviceManager.deleteTicketById(ticketId);
			
			logger.trace("CLI: Removed ticket with ID " + ticketId);
		} catch (Exception e) {
			System.err.println("CLI: " + e.getMessage());
		}
	}
	
	public void emptyTickets() {
		try {
			List<Ticket> tickets = serviceManager.getTickets();
			for (Ticket ticket : tickets) {
				serviceManager.deleteTicketById(ticket.getId());
			}
			
			logger.trace("CLI: All tickets deleted");
		} catch (Exception e) {
			System.err.println("CLI: " + e.getMessage());
		}
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
		System.out.println("   -l  List all the tickets");
		System.out.println("   -a  Add a ticket to the system. You must provide the information as following: <event_id>, <channel_id>, <price>, <sold>, <available>");
		System.out.println("   -r  Remove a ticket from the system. You must provide the ticket id");
		System.out.println("   -e  Remove all tickets from the system");
		System.exit(1);
	}

}
