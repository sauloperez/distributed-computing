/**
 * 
 */
package ua.be.dc.services.sellingService.paypal;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import javax.xml.rpc.ServiceException;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Holder;

import ua.be.dc.services.sellingService.paypal.test.PayPalClientTest;

import ebay.api.paypalapi.PayPalAPIAAInterface;
import ebay.api.paypalapi.PayPalAPIInterfaceService;
import ebay.apis.eblbasecomponents.CustomSecurityHeaderType;
import ebay.apis.eblbasecomponents.UserIdPasswordType;

/**
 * @author Pau
 *
 */
public class PayPalServiceFactory {
	
	private static PayPalAPIInterfaceService payPalAPIInterfaceService;
	private static PayPalAPIAAInterface port;
	private static Holder<CustomSecurityHeaderType> securityHeader;
	
	// paypal config
	private static String paypalProfileApiUsername;
	private static String paypalProfileApiPassword;
	private static String paypalProfileSignature;
	private static String paypalEndpointAddress;
	
	private static String paypalApiVersion;
	
	static {
		if (payPalAPIInterfaceService == null) {
			readProperties();
			
			// init service
			payPalAPIInterfaceService = new PayPalAPIInterfaceService(PayPalAPIInterfaceService.WSDL_LOCATION);
			
			// init port
			port = payPalAPIInterfaceService.getPayPalAPIAA();
			((BindingProvider) port).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, paypalEndpointAddress);
			
			// build header
			UserIdPasswordType user = new UserIdPasswordType();
			user.setUsername(paypalProfileApiUsername);
			user.setPassword(paypalProfileApiPassword);
			user.setSignature(paypalProfileSignature);
			
			CustomSecurityHeaderType header = new CustomSecurityHeaderType();
			header.setCredentials(user);

			securityHeader = new Holder<CustomSecurityHeaderType>(header);
		}
	}
	
	private static void readProperties() {
		try {
			Properties properties = new Properties();
			properties.load(PayPalServiceFactory.class.getResourceAsStream(("paypal.properties")));
			
			paypalEndpointAddress = (String) properties.get("paypal.endpoint.address");
			paypalApiVersion = (String) properties.get("paypal.api.version");
			paypalProfileApiUsername = (String) properties.get("paypal.profile.api.username");
			paypalProfileApiPassword = (String) properties.get("paypal.profile.api.password");
			paypalProfileSignature = (String) properties.get("paypal.profile.api.signature");
		} catch (IOException e) {
			System.err.println("The PayPal properties file could not be read. " + e.getMessage());
		}
	}
	
	public static PayPalAPIInterfaceService getService() {
		return payPalAPIInterfaceService;
	}
	
	public static PayPalAPIAAInterface getPort() {
		return port;
	}
	
	public static Holder<CustomSecurityHeaderType> getSecurityHeader() {
		return securityHeader;
	}
	
	public static String getAPIversion() {
		return paypalApiVersion;
	}
}
