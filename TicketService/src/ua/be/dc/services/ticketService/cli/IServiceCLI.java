/**
 * 
 */
package ua.be.dc.services.ticketService.cli;

/**
 * @author Pau
 *
 */
public interface IServiceCLI {

	public void executeStatement(String[] args);
	
	public void showHelp();
	
	/**
	 * Assumes the existence of a shell script wrapper
	 */
	public void showUsage();
}
