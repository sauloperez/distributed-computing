/**
 * SeatAccommodationService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ua.be.dc.services.seatAccommodation.service;

public interface SeatAccommodationService extends java.rmi.Remote {
    public ua.be.dc.services.seatAccommodation.service.Seat[] getSeatsByEvent(ua.be.dc.services.seatAccommodation.service.Event event) throws java.rmi.RemoteException;
    public ua.be.dc.services.seatAccommodation.service.Seat[] getSeatsByEventAndType(ua.be.dc.services.seatAccommodation.service.Event event, ua.be.dc.services.seatAccommodation.service.SeatType seatType) throws java.rmi.RemoteException;
    public void registerEvent(ua.be.dc.services.seatAccommodation.service.Event event) throws java.rmi.RemoteException, ua.be.dc.services.seatAccommodation.service.Exception;
    public void unregisterEvent(ua.be.dc.services.seatAccommodation.service.Event event) throws java.rmi.RemoteException, ua.be.dc.services.seatAccommodation.service.Exception;
}
