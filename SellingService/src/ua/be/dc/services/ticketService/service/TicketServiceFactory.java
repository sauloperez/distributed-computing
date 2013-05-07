/**
 * 
 */
package ua.be.dc.services.ticketService.service;

import javax.xml.rpc.ServiceException;

/**
 * @author Pau
 *
 */
public class TicketServiceFactory {

	private static TicketService service;
	
	static {
		try {
			if (service == null) {
				TicketServiceImplServiceLocator serviceLocator = new TicketServiceImplServiceLocator();
				service = serviceLocator.getTicketServiceImplPort();
			}
		} catch (ServiceException e) {
			System.out.println("Ticket Service couldn't be located");
			e.printStackTrace();
		}
	}
	
	public static TicketService getService() {
		return service;
	}
}
