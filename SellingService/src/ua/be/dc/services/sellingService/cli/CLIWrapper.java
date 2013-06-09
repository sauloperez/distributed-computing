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
			break;
		}
	}

}
