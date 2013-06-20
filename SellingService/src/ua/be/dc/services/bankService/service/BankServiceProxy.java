package ua.be.dc.services.bankService.service;

public class BankServiceProxy implements ua.be.dc.services.bankService.service.BankService {
  private String _endpoint = null;
  private ua.be.dc.services.bankService.service.BankService bankService = null;
  
  public BankServiceProxy() {
    _initBankServiceProxy();
  }
  
  public BankServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initBankServiceProxy();
  }
  
  private void _initBankServiceProxy() {
    try {
      bankService = (new ua.be.dc.services.bankService.service.BankServiceImplServiceLocator()).getBankServiceImplPort();
      if (bankService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)bankService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)bankService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (bankService != null)
      ((javax.xml.rpc.Stub)bankService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public ua.be.dc.services.bankService.service.BankService getBankService() {
    if (bankService == null)
      _initBankServiceProxy();
    return bankService;
  }
  
  public void transfer(java.lang.String arg0, java.lang.String arg1, float arg2, java.lang.String arg3) throws java.rmi.RemoteException, ua.be.dc.services.bankService.service.Exception{
    if (bankService == null)
      _initBankServiceProxy();
    bankService.transfer(arg0, arg1, arg2, arg3);
  }
  
  public ua.be.dc.services.bankService.service.Account createAccount() throws java.rmi.RemoteException, ua.be.dc.services.bankService.service.Exception{
    if (bankService == null)
      _initBankServiceProxy();
    return bankService.createAccount();
  }
  
  public void removeAccount(java.lang.String arg0) throws java.rmi.RemoteException, ua.be.dc.services.bankService.service.Exception{
    if (bankService == null)
      _initBankServiceProxy();
    bankService.removeAccount(arg0);
  }
  
  public void withdraw(java.lang.String arg0, float arg1) throws java.rmi.RemoteException, ua.be.dc.services.bankService.service.Exception{
    if (bankService == null)
      _initBankServiceProxy();
    bankService.withdraw(arg0, arg1);
  }
  
  public void deposit(java.lang.String arg0, float arg1) throws java.rmi.RemoteException, ua.be.dc.services.bankService.service.Exception{
    if (bankService == null)
      _initBankServiceProxy();
    bankService.deposit(arg0, arg1);
  }
  
  public ua.be.dc.services.bankService.service.Account[] getAccountsOfHolder() throws java.rmi.RemoteException{
    if (bankService == null)
      _initBankServiceProxy();
    return bankService.getAccountsOfHolder();
  }
  
  public ua.be.dc.services.bankService.service.Account getAccount(java.lang.String arg0) throws java.rmi.RemoteException{
    if (bankService == null)
      _initBankServiceProxy();
    return bankService.getAccount(arg0);
  }
  
  public java.lang.String getBankCodeId() throws java.rmi.RemoteException{
    if (bankService == null)
      _initBankServiceProxy();
    return bankService.getBankCodeId();
  }
  
  
}