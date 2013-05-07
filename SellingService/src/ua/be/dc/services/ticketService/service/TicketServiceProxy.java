package ua.be.dc.services.ticketService.service;

public class TicketServiceProxy implements ua.be.dc.services.ticketService.service.TicketService {
  private String _endpoint = null;
  private ua.be.dc.services.ticketService.service.TicketService ticketService = null;
  
  public TicketServiceProxy() {
    _initTicketServiceProxy();
  }
  
  public TicketServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initTicketServiceProxy();
  }
  
  private void _initTicketServiceProxy() {
    try {
      ticketService = (new ua.be.dc.services.ticketService.service.TicketServiceImplServiceLocator()).getTicketServiceImplPort();
      if (ticketService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)ticketService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)ticketService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (ticketService != null)
      ((javax.xml.rpc.Stub)ticketService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public ua.be.dc.services.ticketService.service.TicketService getTicketService() {
    if (ticketService == null)
      _initTicketServiceProxy();
    return ticketService;
  }
  
  public java.lang.String test() throws java.rmi.RemoteException{
    if (ticketService == null)
      _initTicketServiceProxy();
    return ticketService.test();
  }
  
  public ua.be.dc.services.ticketService.service.Ticket[] getTicketsByEventAndChannel(ua.be.dc.services.ticketService.service.Event event, ua.be.dc.services.ticketService.service.Channel channel) throws java.rmi.RemoteException{
    if (ticketService == null)
      _initTicketServiceProxy();
    return ticketService.getTicketsByEventAndChannel(event, channel);
  }
  
  public ua.be.dc.services.ticketService.service.Ticket getTicketById(java.lang.Integer id) throws java.rmi.RemoteException{
    if (ticketService == null)
      _initTicketServiceProxy();
    return ticketService.getTicketById(id);
  }
  
  public ua.be.dc.services.ticketService.service.Ticket[] getTicketsByEvent(ua.be.dc.services.ticketService.service.Event event) throws java.rmi.RemoteException{
    if (ticketService == null)
      _initTicketServiceProxy();
    return ticketService.getTicketsByEvent(event);
  }
  
  public void updateTicket(ua.be.dc.services.ticketService.service.Ticket ticket) throws java.rmi.RemoteException{
    if (ticketService == null)
      _initTicketServiceProxy();
    ticketService.updateTicket(ticket);
  }
  
  
}