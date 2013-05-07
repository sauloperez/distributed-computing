/**
 * 
 */
package ua.be.dc.services.sellingService.service;

import com.paypal.sdk.exceptions.PayPalException;
import com.paypal.sdk.profiles.APIProfile;
import com.paypal.sdk.profiles.ProfileFactory;
import com.paypal.sdk.services.CallerServices;
import com.paypal.soap.api.BasicAmountType;
import com.paypal.soap.api.CurrencyCodeType;
import com.paypal.soap.api.DoExpressCheckoutPaymentRequestDetailsType;
import com.paypal.soap.api.DoExpressCheckoutPaymentRequestType;
import com.paypal.soap.api.DoExpressCheckoutPaymentResponseType;
import com.paypal.soap.api.PaymentActionCodeType;
import com.paypal.soap.api.PaymentDetailsType;
import com.paypal.soap.api.SetExpressCheckoutRequestDetailsType;
import com.paypal.soap.api.SetExpressCheckoutRequestType;
import com.paypal.soap.api.SetExpressCheckoutResponseType;

/**
 * @author Pau
 * 
 */
public class ExpressCheckout {
	
	public static final String returnURL = "http://localhost:3000/executePurchase";
	public static final String cancelURL = "http://localhost:3000/";
	
	// API Credentials
	private static final String username = "sdk-three_api1.sdk.com";
	private static final String password = "QFZCWN5HZM8VBG7Q";
	private static final String signature = "AVGidzoSQiGWu.lGj3z15HLczXaaAcK6imHawrjefqgclVwBe8imgCHZ";
	private static final String environment = "sandbox";
	
	public static final CurrencyCodeType currencyCodeType = CurrencyCodeType.EUR;
	public static final PaymentActionCodeType paymentAction = PaymentActionCodeType.Sale;

	/**
	 * Sets up an Express Checkout transaction
	 * 
	 * @param paymentAmount
	 * @param returnURL
	 * @param cancelURL
	 * @param paymentAction
	 * @param currencyCodeType
	 * @return PayPal API response
	 */
	public String setExpressCheckout(String paymentAmount) {

		String responseValue = null;
		CallerServices caller = new CallerServices();

		try {
			// Set up your API credentials, PayPal end point, and API version.
			setAPICredentials(caller);
			SetExpressCheckoutRequestType pprequest = new SetExpressCheckoutRequestType();
			pprequest.setVersion("51.0");

			// Add request-specific fields to the request.
			SetExpressCheckoutRequestDetailsType details = new SetExpressCheckoutRequestDetailsType();
			details.setReturnURL(ExpressCheckout.returnURL);
			details.setCancelURL(ExpressCheckout.cancelURL);
			
			BasicAmountType orderTotal = new BasicAmountType();
			orderTotal.set_value(paymentAmount);
			orderTotal.setCurrencyID(ExpressCheckout.currencyCodeType);
			
			details.setOrderTotal(orderTotal);
			details.setPaymentAction(paymentAction);
			pprequest.setSetExpressCheckoutRequestDetails(details);

			// Execute the API operation and obtain the response.
			SetExpressCheckoutResponseType ppresponse = (SetExpressCheckoutResponseType) caller.call("SetExpressCheckout", pprequest);
			responseValue = ppresponse.getAck().toString();

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return responseValue;

	}

	/**
	 * Completes an Express Checkout transaction
	 * 
	 * @param token
	 * @param payerID
	 * @param paymentAmount
	 * @param paymentAction
	 * @param currencyCodeType
	 * @return PayPal API response
	 */
	public String doExpressCheckoutPayment(String token, String payerID, String paymentAmount) {
		
		String responseValue = null;
		CallerServices caller = new CallerServices();

		try {
			// Set up your API credentials, PayPal end point, and API version.
			setAPICredentials(caller);
			DoExpressCheckoutPaymentRequestType pprequest = new DoExpressCheckoutPaymentRequestType();
			pprequest.setVersion("51.0");

			// Add request-specific fields to the request.
			DoExpressCheckoutPaymentResponseType ppresponse = new DoExpressCheckoutPaymentResponseType();

			// Create the request details object.
			DoExpressCheckoutPaymentRequestDetailsType paymentDetailsRequestType = new DoExpressCheckoutPaymentRequestDetailsType();
			// pass the token value by actual value returned in the SetExpressCheckout
			paymentDetailsRequestType.setToken(token);
			paymentDetailsRequestType.setPayerID(payerID);
			paymentDetailsRequestType.setPaymentAction(ExpressCheckout.paymentAction);

			BasicAmountType orderTotal = new BasicAmountType();
			orderTotal.set_value(paymentAmount);
			orderTotal.setCurrencyID(ExpressCheckout.currencyCodeType);
			
			PaymentDetailsType[] paymentDetails = new PaymentDetailsType[1];
			paymentDetails[0].setOrderTotal(orderTotal);
			paymentDetailsRequestType.setPaymentDetails(paymentDetails);
			pprequest.setDoExpressCheckoutPaymentRequestDetails(paymentDetailsRequestType);

			// Execute the API operation and obtain the response.
			ppresponse = (DoExpressCheckoutPaymentResponseType) caller.call("DoExpressCheckoutPayment", pprequest);
			responseValue = ppresponse.getAck().toString();

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return responseValue;
	}
	
	// Helpers
	
	/*
	 * WARNING: Do not embed plaintext credentials in your application
	 * code. Doing so is insecure and against best practices. Your API
	 * credentials must be handled securely. Please consider encrypting
	 * them for use in any production environment, and ensure that only
	 * authorized individuals may view or modify them.
	 */
	private void setAPICredentials(CallerServices caller) {
		APIProfile profile;
		try {
			profile = ProfileFactory.createSignatureAPIProfile();
			profile.setAPIUsername(username);
			profile.setAPIPassword(password);
			profile.setSignature(signature);
			profile.setEnvironment(environment);
			caller.setAPIProfile(profile);
		} catch (PayPalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
