package ua.be.dc.services.sellingService.paypal;

import ebay.apis.eblbasecomponents.CurrencyCodeType;
import ebay.apis.eblbasecomponents.PaymentActionCodeType;

public class PayPalConstants {

	public static final CurrencyCodeType CURRENCY_CODE = CurrencyCodeType.EUR;
	public static final PaymentActionCodeType PAYMENT_ACTION = PaymentActionCodeType.SALE;
	
	public static final String SANDBOX_URL = "https://www.sandbox.paypal.com/webscr?cmd=_express-checkout&useraction=commit&token=";

	// PayPal API calls return values
	public static final String SUCCESS = "SUCCESS";
	public static final String ERROR = "FAILURE";
}
