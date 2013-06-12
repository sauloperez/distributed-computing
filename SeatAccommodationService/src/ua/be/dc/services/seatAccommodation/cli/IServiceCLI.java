/**
 * 
 */
package ua.be.dc.services.seatAccommodation.cli;

/**
 * @author Pau
 *
 */
public interface IServiceCLI {

	public void executeStatement(String[] args);
	
	public void showHelp();
	
	public void showUsage();
}
