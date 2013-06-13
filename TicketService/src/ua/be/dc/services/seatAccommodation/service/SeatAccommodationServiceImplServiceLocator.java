/**
 * SeatAccommodationServiceImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ua.be.dc.services.seatAccommodation.service;

public class SeatAccommodationServiceImplServiceLocator extends org.apache.axis.client.Service implements ua.be.dc.services.seatAccommodation.service.SeatAccommodationServiceImplService {

    public SeatAccommodationServiceImplServiceLocator() {
    }


    public SeatAccommodationServiceImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SeatAccommodationServiceImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SeatAccommodationServiceImplPort
    private java.lang.String SeatAccommodationServiceImplPort_address = "http://macbook-macbook-pro-de-pau.local:9090/SeatAccommodationService/SeatAccommodationServiceImplService";

    public java.lang.String getSeatAccommodationServiceImplPortAddress() {
        return SeatAccommodationServiceImplPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SeatAccommodationServiceImplPortWSDDServiceName = "SeatAccommodationServiceImplPort";

    public java.lang.String getSeatAccommodationServiceImplPortWSDDServiceName() {
        return SeatAccommodationServiceImplPortWSDDServiceName;
    }

    public void setSeatAccommodationServiceImplPortWSDDServiceName(java.lang.String name) {
        SeatAccommodationServiceImplPortWSDDServiceName = name;
    }

    public ua.be.dc.services.seatAccommodation.service.SeatAccommodationService getSeatAccommodationServiceImplPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SeatAccommodationServiceImplPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSeatAccommodationServiceImplPort(endpoint);
    }

    public ua.be.dc.services.seatAccommodation.service.SeatAccommodationService getSeatAccommodationServiceImplPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            ua.be.dc.services.seatAccommodation.service.SeatAccommodationServiceImplPortBindingStub _stub = new ua.be.dc.services.seatAccommodation.service.SeatAccommodationServiceImplPortBindingStub(portAddress, this);
            _stub.setPortName(getSeatAccommodationServiceImplPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSeatAccommodationServiceImplPortEndpointAddress(java.lang.String address) {
        SeatAccommodationServiceImplPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (ua.be.dc.services.seatAccommodation.service.SeatAccommodationService.class.isAssignableFrom(serviceEndpointInterface)) {
                ua.be.dc.services.seatAccommodation.service.SeatAccommodationServiceImplPortBindingStub _stub = new ua.be.dc.services.seatAccommodation.service.SeatAccommodationServiceImplPortBindingStub(new java.net.URL(SeatAccommodationServiceImplPort_address), this);
                _stub.setPortName(getSeatAccommodationServiceImplPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("SeatAccommodationServiceImplPort".equals(inputPortName)) {
            return getSeatAccommodationServiceImplPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://service.seatAccommodation.services.dc.be.ua/", "SeatAccommodationServiceImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://service.seatAccommodation.services.dc.be.ua/", "SeatAccommodationServiceImplPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("SeatAccommodationServiceImplPort".equals(portName)) {
            setSeatAccommodationServiceImplPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
