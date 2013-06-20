/**
 * BankService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ua.be.dc.services.bankService.service;

public interface BankService extends java.rmi.Remote {
    public void transfer(java.lang.String arg0, java.lang.String arg1, float arg2, java.lang.String arg3) throws java.rmi.RemoteException, ua.be.dc.services.bankService.service.Exception;
    public ua.be.dc.services.bankService.service.Account createAccount() throws java.rmi.RemoteException, ua.be.dc.services.bankService.service.Exception;
    public void removeAccount(java.lang.String arg0) throws java.rmi.RemoteException, ua.be.dc.services.bankService.service.Exception;
    public void withdraw(java.lang.String arg0, float arg1) throws java.rmi.RemoteException, ua.be.dc.services.bankService.service.Exception;
    public void deposit(java.lang.String arg0, float arg1) throws java.rmi.RemoteException, ua.be.dc.services.bankService.service.Exception;
    public ua.be.dc.services.bankService.service.Account[] getAccountsOfHolder() throws java.rmi.RemoteException;
    public ua.be.dc.services.bankService.service.Account getAccount(java.lang.String arg0) throws java.rmi.RemoteException;
    public java.lang.String getBankCodeId() throws java.rmi.RemoteException;
}
