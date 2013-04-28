package ua.be.dc.services.ticketService.cli;

import java.util.Arrays;

public class ServiceCLI {

	private static EventServiceCLI eventServiceCLI;
	private static TicketServiceCLI ticketServiceCLI;

	public static void main(String[] args) {
		
		eventServiceCLI = new EventServiceCLI();
		ticketServiceCLI = new TicketServiceCLI();

		String model = args[1];
		args = Arrays.copyOfRange(args, 2, args.length);
		
		switch (model) {
		case "events":
			eventServiceCLI.executeStatement(args);
			break;

		case "tickets":
			ticketServiceCLI.executeStatement(args);
			break;
			
		default:
		case "h":
			showHelp();
			break;
		}
		
		System.exit(1);
	}
	
	/**
	 * Assumes the existence of a shell script wrapper
	 */
	public static void showUsage() {
		System.out.println("usage: ticketws <command> [<args>]\n");
	}
	
	/**
	 * Assumes the existence of a shell script wrapper
	 */
	public static void showHelp() {
		showUsage();
		
		System.out.println("The ticketws commands are:");
		System.out.println("   events   show, add, update or remove events");
		System.out.println("   tickets  show, add, update or remove events");
		System.exit(1);
	}

}
