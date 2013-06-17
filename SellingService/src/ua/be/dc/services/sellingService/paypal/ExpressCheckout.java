/**
 * 
 */
package ua.be.dc.services.sellingService.paypal;

import java.io.IOException;
import java.math.BigInteger;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import ua.be.dc.services.sellingService.models.Order;
import ua.be.dc.services.sellingService.models.OrderDetail;
import ua.be.dc.services.sellingService.paypal.exception.PayPalException;
import ebay.api.paypalapi.DoExpressCheckoutPaymentReq;
import ebay.api.paypalapi.DoExpressCheckoutPaymentRequestType;
import ebay.api.paypalapi.DoExpressCheckoutPaymentResponseType;
import ebay.api.paypalapi.GetExpressCheckoutDetailsReq;
import ebay.api.paypalapi.GetExpressCheckoutDetailsRequestType;
import ebay.api.paypalapi.GetExpressCheckoutDetailsResponseType;
import ebay.api.paypalapi.PayPalAPIAAInterface;
import ebay.api.paypalapi.SetExpressCheckoutReq;
import ebay.api.paypalapi.SetExpressCheckoutRequestType;
import ebay.api.paypalapi.SetExpressCheckoutResponseType;
import ebay.apis.corecomponenttypes.BasicAmountType;
import ebay.apis.eblbasecomponents.CurrencyCodeType;
import ebay.apis.eblbasecomponents.DoExpressCheckoutPaymentRequestDetailsType;
import ebay.apis.eblbasecomponents.DoExpressCheckoutPaymentResponseDetailsType;
import ebay.apis.eblbasecomponents.ErrorType;
import ebay.apis.eblbasecomponents.GetExpressCheckoutDetailsResponseDetailsType;
import ebay.apis.eblbasecomponents.PaymentActionCodeType;
import ebay.apis.eblbasecomponents.PaymentDetailsItemType;
import ebay.apis.eblbasecomponents.PaymentDetailsType;
import ebay.apis.eblbasecomponents.PaymentInfoType;
import ebay.apis.eblbasecomponents.SetExpressCheckoutRequestDetailsType;

/**
 * @author Pau
 * 
 */
public class ExpressCheckout {
	
	private static Logger logger = LogManager.getLogger(ExpressCheckout.class.getName());
	
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
	public String setExpressCheckout(Order order) throws PayPalException {
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
		paymentDetails.setOrderDescription("Tickets order");
		paymentDetails.setInvoiceID("invoice-" + System.currentTimeMillis());
		paymentDetails.setPaymentAction(PayPalConstants.PAYMENT_ACTION);
		
		details.getPaymentDetails().add(paymentDetails);
		
		// Add items to the order
		Double orderTotal = 0d;
		for (OrderDetail orderDetail : order.getOrderDetails()) {
			PaymentDetailsItemType item = new PaymentDetailsItemType();
			BasicAmountType amount = buildAmount(new Double(orderDetail.getPrice().doubleValue()), PayPalConstants.CURRENCY_CODE); 
			item.setAmount(amount);
			item.setQuantity(BigInteger.valueOf(orderDetail.getQuantity()));
			item.setName(orderDetail.getName());
			
			paymentDetails.getPaymentDetailsItem().add(item);
			
			orderTotal += new Double(amount.getValue());
		}
		
		BasicAmountType amount = buildAmount(orderTotal, PayPalConstants.CURRENCY_CODE);
		paymentDetails.setOrderTotal(amount);
		paymentDetails.setItemTotal(amount);
		
		readProperties();
		
		details.setReturnURL(paypalSetExpressCheckoutReturnURL);
		details.setCancelURL(paypalSetExpressCheckoutCancelURL);
		details.setCustom("user_id");

		request.setSetExpressCheckoutRequestDetails(details);

		SetExpressCheckoutResponseType ppresponse = port.setExpressCheckout(setExpressCheckoutReq, PayPalServiceFactory.getSecurityHeader());
		
		boolean isResponseWithErrors = !ppresponse.getErrors().isEmpty();
		if (isResponseWithErrors) {
			ErrorType error = ppresponse.getErrors().get(0);
			throw new PayPalException("Error " + error.getErrorCode() + ": " + error.getLongMessage());
		}
		
		if (ppresponse.getAck().toString() == "SUCCESS") {
			token = ppresponse.getToken();
		}
		
		order.setToken(token);
		
		return "https://www.sandbox.paypal.com/webscr?cmd=_express-checkout&useraction=commit&token=" + token;
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
	 * Get the order details set for the order belonging to the provided token
	 * 
	 * @param token
	 * @return
	 */
	private GetExpressCheckoutDetailsResponseDetailsType getExpressCheckoutDetails(String token) {
		PayPalAPIAAInterface port = PayPalServiceFactory.getPort();
		
		GetExpressCheckoutDetailsReq detailsReq = new GetExpressCheckoutDetailsReq();
		GetExpressCheckoutDetailsRequestType request = new GetExpressCheckoutDetailsRequestType();

		detailsReq.setGetExpressCheckoutDetailsRequest(request);
		request.setVersion(PayPalServiceFactory.getAPIversion());
		request.setToken(token);
		
		GetExpressCheckoutDetailsResponseType response = port.getExpressCheckoutDetails(detailsReq, PayPalServiceFactory.getSecurityHeader());
		
		// TODO notificar error en el proces!
		
		logger.trace("getExpressCheckoutDetails = " + response.getAck().toString());
		
		for (ErrorType error : response.getErrors()) {
			logger.trace(error.getErrorCode() + ": " + error.getLongMessage());
		}
		
		return response.getGetExpressCheckoutDetailsResponseDetails();
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
	public boolean doExpressCheckout(Float amount, String token, String payerId) {//GetExpressCheckoutDetailsResponseDetailsType expressCheckoutDetails) {
		PayPalAPIAAInterface port = PayPalServiceFactory.getPort();
		
		// Get Transaction details set so far
		GetExpressCheckoutDetailsResponseDetailsType expressCheckoutDetails = getExpressCheckoutDetails(token);
		expressCheckoutDetails.getPayerInfo().setPayerID(payerId);
		
		DoExpressCheckoutPaymentReq paymentReq = new DoExpressCheckoutPaymentReq();
		DoExpressCheckoutPaymentRequestType request = new DoExpressCheckoutPaymentRequestType();
		
		paymentReq.setDoExpressCheckoutPaymentRequest(request);
		request.setVersion(PayPalServiceFactory.getAPIversion());

		DoExpressCheckoutPaymentRequestDetailsType paymentDetailsRequest = new DoExpressCheckoutPaymentRequestDetailsType();
		paymentDetailsRequest.setPayerID(expressCheckoutDetails.getPayerInfo().getPayerID());
		paymentDetailsRequest.setToken(expressCheckoutDetails.getToken());
		
		List<PaymentDetailsType> paymentDetailsList = paymentDetailsRequest.getPaymentDetails();
		PaymentDetailsType paymentDetails = new PaymentDetailsType();
		
		BasicAmountType orderTotal = buildAmount(new Double(amount), PayPalConstants.CURRENCY_CODE);
		paymentDetails.setOrderTotal(orderTotal);
		paymentDetails.setPaymentAction(paymentDetails.getPaymentAction());
		
		paymentDetailsList.add(paymentDetails);
		
		request.setDoExpressCheckoutPaymentRequestDetails(paymentDetailsRequest);

		DoExpressCheckoutPaymentResponseType response = port.doExpressCheckoutPayment(paymentReq, PayPalServiceFactory.getSecurityHeader());

//		logger.trace("doExpressCheckout = " + response.getAck().toString());
		
		if (response.getAck().toString() == PayPalConstants.SUCCESS) {
			DoExpressCheckoutPaymentResponseDetailsType responseDetails = response.getDoExpressCheckoutPaymentResponseDetails();
			if (responseDetails != null) {
				PaymentInfoType paymentInfo = responseDetails.getPaymentInfo().get(0);
				logger.trace(paymentInfo.getPaymentStatus().value());
//				if (paymentInfo.getPaymentStatus().value().equals(PaymentStatusCodeType.fromValue("Completed"))) {
//					logger.trace("Payment completed.");
//					return true;
//				}
//				else {
//					logger.trace("Payment not completed.. (" + paymentInfo.getPaymentStatus() + ")");
//					return false;
//				}
			}
			else {
				logger.trace("Problem executing DoExpressCheckoutPayment. Maybe you tried to process an ExpressCheckout that has already been processed.");
				return false;
			}
		}
		else {
			for (ErrorType error : response.getErrors()) {
				logger.trace(error.getErrorCode() + ": " + error.getLongMessage());
			}
		}
		
		return false;
	}
	
	public String getUrl(String token) {
		return PayPalConstants.SANDBOX_URL + token;
	}
	
	/**
	 * Helpers
	 */
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
