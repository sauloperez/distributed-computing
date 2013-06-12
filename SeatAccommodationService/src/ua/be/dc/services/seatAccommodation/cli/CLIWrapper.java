package ua.be.dc.services.seatAccommodation.cli;

public class CLIWrapper extends BasicCLIWrapper {

	private static SeatServiceCLI seatServiceCLI = new SeatServiceCLI();
	private static EventSeatServiceCLI eventSeatServiceCLI = new EventSeatServiceCLI();
	
	public static void main(String[] args) {
		String model = getModel(args);
		switch (model) {
		case "seats":
			seatServiceCLI.executeStatement(getSubCLIargs(args));
			break;
		case "eventSeats":
			eventSeatServiceCLI.executeStatement(getSubCLIargs(args));
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
		System.out.println("usage: seatws <command> [<args>]\n");
	}
	
	/**
	 * Assumes the existence of a shell script wrapper
	 */
	public static void showHelp() {
		showUsage();
		
		System.out.println("The seatws commands are:");
		System.out.println("   seats   show, add, update or remove seats");
		System.exit(1);
	}
}
