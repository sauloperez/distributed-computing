package ua.be.dc.services.sellingService.cli;

public class CLIWrapper extends BasicCLIWrapper {
	
	private static EventOrganizerCLI eventOrganizerCLI = new EventOrganizerCLI();
	
	public static void main(String[] args) {
		String model = getModel(args);
		switch (model) {
		case "eos":
			eventOrganizerCLI.executeStatement(getSubCLIargs(args));
			break;

		default:
		case "h":
			showHelp();
			break;
		}
	}

	/**
	 * Assumes the existence of a shell script wrapper
	 */
	public static void showUsage() {
		System.out.println("usage: sellingws <command> [<args>]\n");
	}
	
	/**
	 * Assumes the existence of a shell script wrapper
	 */
	public static void showHelp() {
		showUsage();
		
		System.out.println("The sellingws commands are:");
		System.out.println("   eos   show, add, update or remove event organizers");
		System.exit(1);
	}
}
