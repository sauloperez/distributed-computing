/**
 * 
 */
package ua.be.dc.services.sellingService.paypal;

import java.io.IOException;
import java.math.BigInteger;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Properties;

import org.junit.Assert;

import ua.be.dc.services.sellingService.paypal.test.PayPalClientTest;
import ebay.api.paypalapi.PayPalAPIAAInterface;
import ebay.api.paypalapi.SetExpressCheckoutReq;
import ebay.api.paypalapi.SetExpressCheckoutRequestType;
import ebay.api.paypalapi.SetExpressCheckoutResponseType;
import ebay.apis.corecomponenttypes.BasicAmountType;
import ebay.apis.eblbasecomponents.CurrencyCodeType;
import ebay.apis.eblbasecomponents.ErrorType;
import ebay.apis.eblbasecomponents.PayPalUserStatusCodeType;
import ebay.apis.eblbasecomponents.PaymentActionCodeType;
import ebay.apis.eblbasecomponents.PaymentDetailsItemType;
import ebay.apis.eblbasecomponents.PaymentDetailsType;
import ebay.apis.eblbasecomponents.SetExpressCheckoutRequestDetailsType;

/**
 * @author Pau
 * 
 */
public class ExpressCheckout {
	
	private static String paypalSetExpressCheckoutReturnURL;
	private static String paypalSetExpressCheckoutCancelURL;

	/**
	 * Sets up an Express Checkout transaction
	 * 
	 * @param paymentAmount
	 * @param returnURL
	 * @param cancelURL
	 * @param paymentAction
	 * @param currencyCodeType
	 * @return PayPal API response
	 * @throws Exception 
	 */
	public String setExpressCheckout(Double paymentAmount) throws Exception {
		String token = null;
		PayPalAPIAAInterface port = PayPalServiceFactory.getPort();
		
		// Construct the request
		SetExpressCheckoutReq setExpressCheckoutReq = new SetExpressCheckoutReq();
		SetExpressCheckoutRequestType request = new SetExpressCheckoutRequestType();
		
		setExpressCheckoutReq.setSetExpressCheckoutRequest(request);
		request.setVersion(PayPalServiceFactory.getAPIversion());
		
		// Construct the details for the request
		SetExpressCheckoutRequestDetailsType details = new SetExpressCheckoutRequestDetailsType();
		
		PaymentDetailsType paymentDetails = new PaymentDetailsType();
		paymentDetails.setOrderDescription("Simple test");
		paymentDetails.setInvoiceID("invoice-#xxx");
		paymentDetails.setPaymentAction(PaypalConstants.paymentAction);
		
		details.getPaymentDetails().add(paymentDetails);
		
		// Add items to the order
		Double itemTotal = 0d;
		
		PaymentDetailsItemType item = new PaymentDetailsItemType();
		BasicAmountType amount = buildAmount(paymentAmount, PaypalConstants.currencyCodeType); 
		item.setAmount(amount);
		item.setQuantity(new BigInteger("1"));
		item.setName("First item");
		
		itemTotal += new Double(amount.getValue());

		paymentDetails.getPaymentDetailsItem().add(item);

		Double orderTotal = itemTotal;
		
		paymentDetails.setOrderTotal(buildAmount(orderTotal, PaypalConstants.currencyCodeType));
		paymentDetails.setItemTotal(buildAmount(itemTotal, PaypalConstants.currencyCodeType));
		
		readProperties();
		
		details.setReturnURL(paypalSetExpressCheckoutReturnURL);
		details.setCancelURL(paypalSetExpressCheckoutCancelURL);
		details.setCustom("my-ref-xxx");

		request.setSetExpressCheckoutRequestDetails(details);

		SetExpressCheckoutResponseType ppresponse = port.setExpressCheckout(setExpressCheckoutReq, PayPalServiceFactory.getSecurityHeader());
		
		boolean isResponseWithErrors = !ppresponse.getErrors().isEmpty();
		if (isResponseWithErrors) {
			ErrorType error = ppresponse.getErrors().get(0);
			throw new Exception("Error " + error.getErrorCode() + ": " + error.getLongMessage());
		}
		
		if (ppresponse.getAck().toString() == "SUCCESS") {
			token = ppresponse.getToken();
		}
		
		return token;
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
	
	/**
	 * Completes an Express Checkout transaction
	 * 
	 * @param token
	 * @param payerID
	 * @param paymentAmount
	 * @param paymentAction
	 * @param currencyCodeType
	 * @return 
	 * @return PayPal API response
	 */
//	public String doExpressCheckoutPayment(String token, String payerID, String paymentAmount) {
//		
//		String responseValue = null;
//		CallerServices caller = new CallerServices();
//
//		try {
//			// Set up your API credentials, PayPal end point, and API version.
//			setAPICredentials(caller);
//			DoExpressCheckoutPaymentRequestType pprequest = new DoExpressCheckoutPaymentRequestType();
//			pprequest.setVersion("51.0");
//
//			// Add request-specific fields to the request.
//			DoExpressCheckoutPaymentResponseType ppresponse = new DoExpressCheckoutPaymentResponseType();
//
//			// Create the request details object.
//			DoExpressCheckoutPaymentRequestDetailsType paymentDetailsRequestType = new DoExpressCheckoutPaymentRequestDetailsType();
//			// pass the token value by actual value returned in the SetExpressCheckout
//			paymentDetailsRequestType.setToken(token);
//			paymentDetailsRequestType.setPayerID(payerID);
//			paymentDetailsRequestType.setPaymentAction(ExpressCheckout.paymentAction);
//
//			BasicAmountType orderTotal = new BasicAmountType();
//			orderTotal.set_value(paymentAmount);
//			orderTotal.setCurrencyID(ExpressCheckout.currencyCodeType);
//			
//			PaymentDetailsType[] paymentDetails = new PaymentDetailsType[1];
//			paymentDetails[0].setOrderTotal(orderTotal);
//			paymentDetailsRequestType.setPaymentDetails(paymentDetails);
//			pprequest.setDoExpressCheckoutPaymentRequestDetails(paymentDetailsRequestType);
//
//			// Execute the API operation and obtain the response.
//			ppresponse = (DoExpressCheckoutPaymentResponseType) caller.call("DoExpressCheckoutPayment", pprequest);
//			responseValue = ppresponse.getAck().toString();
//
//		} catch (Exception ex) {
//			ex.printStackTrace();
//		}
//
//		return responseValue;
//	}
	
	// Helpers
	
	private static void readProperties() {
		try {
			Properties properties = new Properties();
			properties.load(ExpressCheckout.class.getResourceAsStream(("paypal.properties")));
			
			paypalSetExpressCheckoutReturnURL = (String) properties.get("paypal.setExpressCheckout.returnURL");
			paypalSetExpressCheckoutCancelURL = (String) properties.get("paypal.setExpressCheckout.cancelURL");
		} catch (IOException e) {
			System.err.println("The PayPal properties file could not be read. " + e.getMessage());
		}
	}
	
}
