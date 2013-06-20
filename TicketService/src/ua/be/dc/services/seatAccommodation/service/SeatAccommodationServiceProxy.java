package ua.be.dc.services.seatAccommodation.service;

public class SeatAccommodationServiceProxy implements ua.be.dc.services.seatAccommodation.service.SeatAccommodationService {
  private String _endpoint = null;
  private ua.be.dc.services.seatAccommodation.service.SeatAccommodationService seatAccommodationService = null;
  
  public SeatAccommodationServiceProxy() {
    _initSeatAccommodationServiceProxy();
  }
  
  public SeatAccommodationServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initSeatAccommodationServiceProxy();
  }
  
  private void _initSeatAccommodationServiceProxy() {
    try {
      seatAccommodationService = (new ua.be.dc.services.seatAccommodation.service.SeatAccommodationServiceImplServiceLocator()).getSeatAccommodationServiceImplPort();
      if (seatAccommodationService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)seatAccommodationService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)seatAccommodationService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (seatAccommodationService != null)
      ((javax.xml.rpc.Stub)seatAccommodationService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public ua.be.dc.services.seatAccommodation.service.SeatAccommodationService getSeatAccommodationService() {
    if (seatAccommodationService == null)
      _initSeatAccommodationServiceProxy();
    return seatAccommodationService;
  }
  
  public ua.be.dc.services.seatAccommodation.service.Seat[] getSeatsByEvent(ua.be.dc.services.seatAccommodation.service.Event event) throws java.rmi.RemoteException{
    if (seatAccommodationService == null)
      _initSeatAccommodationServiceProxy();
    return seatAccommodationService.getSeatsByEvent(event);
  }
  
  public ua.be.dc.services.seatAccommodation.service.Seat[] getSeatsByEventAndType(ua.be.dc.services.seatAccommodation.service.Event event, ua.be.dc.services.seatAccommodation.service.SeatType seatType) throws java.rmi.RemoteException{
    if (seatAccommodationService == null)
      _initSeatAccommodationServiceProxy();
    return seatAccommodationService.getSeatsByEventAndType(event, seatType);
  }
  
  public void registerEvent(ua.be.dc.services.seatAccommodation.service.Event event) throws java.rmi.RemoteException, ua.be.dc.services.seatAccommodation.service.Exception{
    if (seatAccommodationService == null)
      _initSeatAccommodationServiceProxy();
    seatAccommodationService.registerEvent(event);
  }
  
  public void unregisterEvent(ua.be.dc.services.seatAccommodation.service.Event event) throws java.rmi.RemoteException, ua.be.dc.services.seatAccommodation.service.Exception{
    if (seatAccommodationService == null)
      _initSeatAccommodationServiceProxy();
    seatAccommodationService.unregisterEvent(event);
  }
  
  
}