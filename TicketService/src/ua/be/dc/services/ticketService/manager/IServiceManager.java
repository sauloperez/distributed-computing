package ua.be.dc.services.ticketService.manager;

/**
 * Specifies all required methods to manage the whole service. Is intended to be used by an administrator 
 * through a client such a CLI or a webapp.
 * 
 * @author Pau
 *
 */
public interface IServiceManager extends IEventServiceManager, ITicketServiceManager, IChannelServiceManager {

}
