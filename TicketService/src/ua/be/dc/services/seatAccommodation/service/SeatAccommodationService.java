/**
 * SeatAccommodationService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ua.be.dc.services.seatAccommodation.service;

public interface SeatAccommodationService extends java.rmi.Remote {
    public java.lang.String test() throws java.rmi.RemoteException;
    public ua.be.dc.services.seatAccommodation.service.Seat[] getSeatsByEvent(ua.be.dc.services.seatAccommodation.service.Event arg0) throws java.rmi.RemoteException;
    public ua.be.dc.services.seatAccommodation.service.Seat[] getSeatsByEventAndType(ua.be.dc.services.seatAccommodation.service.Event arg0, ua.be.dc.services.seatAccommodation.service.SeatType arg1) throws java.rmi.RemoteException;
    public ua.be.dc.services.seatAccommodation.service.Seat getSeatById(java.lang.Integer arg0) throws java.rmi.RemoteException;
    public void registerEvent(ua.be.dc.services.seatAccommodation.service.Event arg0) throws java.rmi.RemoteException;
}
