package ua.be.dc.services.sellingService.paypal.test;

import java.math.BigInteger;
import java.rmi.RemoteException;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Properties;

import javax.xml.rpc.ServiceException;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Holder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import ua.be.dc.services.sellingService.paypal.PaypalConstants;

import ebay.api.paypalapi.PayPalAPIAAInterface;
import ebay.api.paypalapi.PayPalAPIInterfaceService;
import ebay.api.paypalapi.SetExpressCheckoutReq;
import ebay.api.paypalapi.SetExpressCheckoutRequestType;
import ebay.api.paypalapi.SetExpressCheckoutResponseType;
import ebay.apis.corecomponenttypes.BasicAmountType;
import ebay.apis.eblbasecomponents.CurrencyCodeType;
import ebay.apis.eblbasecomponents.CustomSecurityHeaderType;
import ebay.apis.eblbasecomponents.ErrorType;
import ebay.apis.eblbasecomponents.PaymentActionCodeType;
import ebay.apis.eblbasecomponents.PaymentDetailsItemType;
import ebay.apis.eblbasecomponents.PaymentDetailsType;
import ebay.apis.eblbasecomponents.SetExpressCheckoutRequestDetailsType;
import ebay.apis.eblbasecomponents.UserIdPasswordType;

public class PayPalClientTest {
	
	public static final CurrencyCodeType currencyCodeType = CurrencyCodeType.EUR;
	public static final PaymentActionCodeType paymentAction = PaymentActionCodeType.SALE;

	private PayPalAPIInterfaceService payPalAPIInterfaceService;
	
	// paypal config
	private String paypalProfileApiUsername;
	private String paypalProfileApiPassword;
	private String paypalProfileSignature;
	private String paypalEndpointAddress;
	private String paypalSetExpressCheckoutReturnURL;
	private String paypalSetExpressCheckoutCancelURL;
	
	private String paypalApiVersion;
	
	private Holder<CustomSecurityHeaderType> securityHeader;
	
	@Before
	public void setUp() throws Exception {
		// read properties
		Properties properties = new Properties();
		properties.load(PayPalClientTest.class.getResourceAsStream(("test.properties")));

		paypalEndpointAddress = (String) properties.get("paypal.endpoint.address");
		paypalApiVersion = (String) properties.get("paypal.api.version");
		paypalProfileApiUsername = (String) properties.get("paypal.profile.api.username");
		paypalProfileApiPassword = (String) properties.get("paypal.profile.api.password");
		paypalProfileSignature = (String) properties.get("paypal.profile.api.signature");
		paypalSetExpressCheckoutReturnURL = (String) properties.get("paypal.setExpressCheckout.returnURL");
		paypalSetExpressCheckoutCancelURL = (String) properties.get("paypal.setExpressCheckout.cancelURL");
		
		// init service
		payPalAPIInterfaceService = new PayPalAPIInterfaceService(PayPalAPIInterfaceService.WSDL_LOCATION);
		
		// build header
		UserIdPasswordType user = new UserIdPasswordType();
		user.setUsername(paypalProfileApiUsername);
		user.setPassword(paypalProfileApiPassword);
		user.setSignature(paypalProfileSignature);
		
		CustomSecurityHeaderType header = new CustomSecurityHeaderType();
		header.setCredentials(user);

		securityHeader = new Holder<CustomSecurityHeaderType>(header);
	}
	
	private BasicAmountType buildAmount(Double amount, CurrencyCodeType currencyCodeType) {
		BasicAmountType orderTotal = new BasicAmountType();

		NumberFormat nf = NumberFormat.getNumberInstance(Locale.ENGLISH);

		nf.setMaximumFractionDigits(2);
		nf.setMinimumFractionDigits(2);

		orderTotal.setValue(nf.format(amount));
		orderTotal.setCurrencyID(currencyCodeType);
		return orderTotal;
	}

	@Test
	public void testDoExpressCheckoutPayment() {
		PayPalAPIAAInterface port = payPalAPIInterfaceService.getPayPalAPIAA();

		((BindingProvider) port).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, paypalEndpointAddress);

		// construct the request
		SetExpressCheckoutReq setExpressCheckoutRequest = new SetExpressCheckoutReq();

		SetExpressCheckoutRequestType request = new SetExpressCheckoutRequestType();

		setExpressCheckoutRequest.setSetExpressCheckoutRequest(request);
		request.setVersion(paypalApiVersion);

		// construct the details for the request
		SetExpressCheckoutRequestDetailsType details = new SetExpressCheckoutRequestDetailsType();

		PaymentDetailsType paymentDetails = new PaymentDetailsType();
		paymentDetails.setOrderDescription("Simple test");
		paymentDetails.setInvoiceID("invoice-#xxx");
		paymentDetails.setPaymentAction(PaypalConstants.paymentAction);

		details.getPaymentDetails().add(paymentDetails);
		
		Double itemTotal = 0d;

		PaymentDetailsItemType item = new PaymentDetailsItemType();

		BasicAmountType amount = buildAmount(15.8d, PaypalConstants.currencyCodeType);
		item.setAmount(amount);

		item.setQuantity(new BigInteger("2"));
		item.setName("First item");

		itemTotal += 2 * 15.8;

		paymentDetails.getPaymentDetailsItem().add(item);

		Double orderTotal = itemTotal;

		paymentDetails.setOrderTotal(buildAmount(orderTotal, PaypalConstants.currencyCodeType));

		paymentDetails.setItemTotal(buildAmount(itemTotal, PaypalConstants.currencyCodeType));

		details.setReturnURL(paypalSetExpressCheckoutReturnURL);
		details.setCancelURL(paypalSetExpressCheckoutCancelURL);
		details.setCustom("my-ref-xxx");

		request.setSetExpressCheckoutRequestDetails(details);

		SetExpressCheckoutResponseType ppresponse = port.setExpressCheckout(setExpressCheckoutRequest, this.securityHeader);

		boolean isResponseWithErrors = !ppresponse.getErrors().isEmpty();

		if (isResponseWithErrors) {
			ErrorType error = ppresponse.getErrors().get(0);
			Assert.fail("Unexpected error during API call: "
					+ error.getErrorCode() + ":" + error.getShortMessage()
					+ " - " + error.getLongMessage());
		}

	}
}
