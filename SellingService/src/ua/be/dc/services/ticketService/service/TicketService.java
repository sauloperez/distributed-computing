/**
 * TicketService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ua.be.dc.services.ticketService.service;

public interface TicketService extends java.rmi.Remote {
    public java.lang.String test() throws java.rmi.RemoteException;
    public ua.be.dc.services.ticketService.service.Event getEventById(java.lang.Integer id) throws java.rmi.RemoteException;
    public ua.be.dc.services.ticketService.service.Ticket[] getTickets() throws java.rmi.RemoteException;
    public ua.be.dc.services.ticketService.service.Ticket[] getTicketsByEvent(ua.be.dc.services.ticketService.service.Event event) throws java.rmi.RemoteException;
    public ua.be.dc.services.ticketService.service.Ticket[] getTicketsByEventAndChannel(ua.be.dc.services.ticketService.service.Event event, ua.be.dc.services.ticketService.service.Channel channel) throws java.rmi.RemoteException;
    public ua.be.dc.services.ticketService.service.Ticket getTicketById(java.lang.Integer id) throws java.rmi.RemoteException;
    public void updateTicket(ua.be.dc.services.ticketService.service.Ticket ticket) throws java.rmi.RemoteException;
    public ua.be.dc.services.ticketService.service.Event getEventByToken(java.lang.String token) throws java.rmi.RemoteException;
    public ua.be.dc.services.ticketService.service.Event[] getEvents() throws java.rmi.RemoteException;
}
