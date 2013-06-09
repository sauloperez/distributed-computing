package ua.be.dc.services.ticketService.cli;

public class CLIWrapper extends BasicCLIWrapper {

	private static EventServiceCLI eventServiceCLI;
	private static TicketServiceCLI ticketServiceCLI;

	public static void main(String[] args) {
		
		eventServiceCLI = new EventServiceCLI();
		ticketServiceCLI = new TicketServiceCLI();

		String model = getModel(args);
		String[] subCLIargs = getSubCLIargs(args);
		switch (model) {
		case "events":
			eventServiceCLI.executeStatement(subCLIargs);
			break;

		case "tickets":
			ticketServiceCLI.executeStatement(subCLIargs);
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
