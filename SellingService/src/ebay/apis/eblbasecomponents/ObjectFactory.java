
package ebay.apis.eblbasecomponents;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;

import ebay.apis.corecomponenttypes.AmountType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ebay.apis.eblbasecomponents package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _RefundInfo_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "RefundInfo");
    private final static QName _StoreOwner_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "StoreOwner");
    private final static QName _StateOrProvince_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "StateOrProvince");
    private final static QName _Currency_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "Currency");
    private final static QName _SetCustomerBillingAgreementRequestDetails_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "SetCustomerBillingAgreementRequestDetails");
    private final static QName _ExecuteCheckoutOperationsResponseDetails_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "ExecuteCheckoutOperationsResponseDetails");
    private final static QName _DoNonReferencedCreditRequestDetails_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "DoNonReferencedCreditRequestDetails");
    private final static QName _RegistrationAddress_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "RegistrationAddress");
    private final static QName _GetRecurringPaymentsProfileDetailsResponseDetails_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "GetRecurringPaymentsProfileDetailsResponseDetails");
    private final static QName _Transactions_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "Transactions");
    private final static QName _ShippingInfo_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "ShippingInfo");
    private final static QName _SellerPaymentAddress_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "SellerPaymentAddress");
    private final static QName _EnhancedData_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "EnhancedData");
    private final static QName _ManageRecurringPaymentsProfileStatusResponseDetails_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "ManageRecurringPaymentsProfileStatusResponseDetails");
    private final static QName _ExecuteCheckoutOperationsRequestDetails_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "ExecuteCheckoutOperationsRequestDetails");
    private final static QName _ShippingService_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "ShippingService");
    private final static QName _OfferDetails_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "OfferDetails");
    private final static QName _RefundItemDetails_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "RefundItemDetails");
    private final static QName _DoExpressCheckoutPaymentResponseDetails_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "DoExpressCheckoutPaymentResponseDetails");
    private final static QName _GetBoardingDetailsResponseDetails_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "GetBoardingDetailsResponseDetails");
    private final static QName _DoNonReferencedCreditResponseDetails_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "DoNonReferencedCreditResponseDetails");
    private final static QName _BillOutstandingAmountRequestDetails_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "BillOutstandingAmountRequestDetails");
    private final static QName _GetIncentiveEvaluationResponseDetails_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "GetIncentiveEvaluationResponseDetails");
    private final static QName _TaxInfo_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "TaxInfo");
    private final static QName _CategoryArray_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "CategoryArray");
    private final static QName _MerchantStoreDetails_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "MerchantStoreDetails");
    private final static QName _AccountSummary_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "AccountSummary");
    private final static QName _CreateRecurringPaymentsProfileRequestDetails_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "CreateRecurringPaymentsProfileRequestDetails");
    private final static QName _TransactionID_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "TransactionID");
    private final static QName _DoReferenceTransactionResponseDetails_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "DoReferenceTransactionResponseDetails");
    private final static QName _ReceiptID_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "ReceiptID");
    private final static QName _BillOutstandingAmountResponseDetails_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "BillOutstandingAmountResponseDetails");
    private final static QName _PaymentTransactionDetails_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "PaymentTransactionDetails");
    private final static QName _CheckoutEnabled_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "CheckoutEnabled");
    private final static QName _UpdateRecurringPaymentsProfileResponseDetails_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "UpdateRecurringPaymentsProfileResponseDetails");
    private final static QName _SetAuthFlowParamRequestDetails_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "SetAuthFlowParamRequestDetails");
    private final static QName _GetMobileStatusRequestDetails_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "GetMobileStatusRequestDetails");
    private final static QName _GetAccessPermissionDetailsResponseDetails_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "GetAccessPermissionDetailsResponseDetails");
    private final static QName _StoreCategoryID_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "StoreCategoryID");
    private final static QName _ItemTrackingDetails_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "ItemTrackingDetails");
    private final static QName _CreateRecurringPaymentsProfileResponseDetails_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "CreateRecurringPaymentsProfileResponseDetails");
    private final static QName _RegionID_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "RegionID");
    private final static QName _UpdateRecurringPaymentsProfileRequestDetails_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "UpdateRecurringPaymentsProfileRequestDetails");
    private final static QName _GetAuthDetailsResponseDetails_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "GetAuthDetailsResponseDetails");
    private final static QName _PaymentMethods_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "PaymentMethods");
    private final static QName _AuthorizationInfo_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "AuthorizationInfo");
    private final static QName _SellerLevel_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "SellerLevel");
    private final static QName _GetIncentiveEvaluationRequestDetails_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "GetIncentiveEvaluationRequestDetails");
    private final static QName _ReverseTransactionResponseDetails_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "ReverseTransactionResponseDetails");
    private final static QName _AmountPaid_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "AmountPaid");
    private final static QName _EnterBoardingRequestDetails_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "EnterBoardingRequestDetails");
    private final static QName _ListingDuration_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "ListingDuration");
    private final static QName _SetMobileCheckoutRequestDetails_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "SetMobileCheckoutRequestDetails");
    private final static QName _User_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "User");
    private final static QName _DoMobileCheckoutPaymentResponseDetails_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "DoMobileCheckoutPaymentResponseDetails");
    private final static QName _AccountCode_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "AccountCode");
    private final static QName _UATPDetails_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "UATPDetails");
    private final static QName _ReviseStatus_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "ReviseStatus");
    private final static QName _ShippingAddress_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "ShippingAddress");
    private final static QName _PaymentMeans_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "PaymentMeans");
    private final static QName _Item_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "Item");
    private final static QName _Country_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "Country");
    private final static QName _ThreeDSecureRequest_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "ThreeDSecureRequest");
    private final static QName _MerchantPullPaymentDetails_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "MerchantPullPaymentDetails");
    private final static QName _Pagination_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "Pagination");
    private final static QName _CreditCardInfo_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "CreditCardInfo");
    private final static QName _GetExpressCheckoutDetailsResponseDetails_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "GetExpressCheckoutDetailsResponseDetails");
    private final static QName _ButtonSearchResult_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "ButtonSearchResult");
    private final static QName _InsuranceFee_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "InsuranceFee");
    private final static QName _PaginationResult_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "PaginationResult");
    private final static QName _CurrentBalance_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "CurrentBalance");
    private final static QName _Email_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "Email");
    private final static QName _UserID_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "UserID");
    private final static QName _AirlineItinerary_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "AirlineItinerary");
    private final static QName _ThreeDSecureDetails_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "ThreeDSecureDetails");
    private final static QName _PaymentTransactions_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "PaymentTransactions");
    private final static QName _ManageRecurringPaymentsProfileStatusRequestDetails_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "ManageRecurringPaymentsProfileStatusRequestDetails");
    private final static QName _AuthorizationID_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "AuthorizationID");
    private final static QName _StoreURL_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "StoreURL");
    private final static QName _DoCaptureResponseDetails_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "DoCaptureResponseDetails");
    private final static QName _SetAccessPermissionsRequestDetails_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "SetAccessPermissionsRequestDetails");
    private final static QName _ShippingDetails_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "ShippingDetails");
    private final static QName _UUID_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "UUID");
    private final static QName _CountryName_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "CountryName");
    private final static QName _OptionTrackingDetails_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "OptionTrackingDetails");
    private final static QName _SellingStatus_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "SellingStatus");
    private final static QName _ShippingTerm_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "ShippingTerm");
    private final static QName _ReverseTransactionRequestDetails_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "ReverseTransactionRequestDetails");
    private final static QName _BillUserResponseDetails_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "BillUserResponseDetails");
    private final static QName _Balance_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "Balance");
    private final static QName _HighBidder_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "HighBidder");
    private final static QName _SubscriptionID_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "SubscriptionID");
    private final static QName _ItemArray_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "ItemArray");
    private final static QName _FeedbackScore_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "FeedbackScore");
    private final static QName _EbayTransactionID_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "EbayTransactionID");
    private final static QName _Seller_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "Seller");
    private final static QName _Site_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "Site");
    private final static QName _Buyer_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "Buyer");
    private final static QName _APIType_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "APIType");
    private final static QName _BAUpdateResponseDetails_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "BAUpdateResponseDetails");
    private final static QName _AmountPastDue_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "AmountPastDue");
    private final static QName _InstrumentDetails_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "InstrumentDetails");
    private final static QName _PaymentType_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "PaymentType");
    private final static QName _CreateMobilePaymentRequestDetails_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "CreateMobilePaymentRequestDetails");
    private final static QName _DoExpressCheckoutPaymentRequestDetails_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "DoExpressCheckoutPaymentRequestDetails");
    private final static QName _ItemID_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "ItemID");
    private final static QName _DoDirectPaymentRequestDetails_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "DoDirectPaymentRequestDetails");
    private final static QName _RefundType_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "RefundType");
    private final static QName _ShippingRegions_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "ShippingRegions");
    private final static QName _Region_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "Region");
    private final static QName _Fees_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "Fees");
    private final static QName _DoReferenceTransactionRequestDetails_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "DoReferenceTransactionRequestDetails");
    private final static QName _SetExpressCheckoutRequestDetails_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "SetExpressCheckoutRequestDetails");
    private final static QName _Error_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "Error");
    private final static QName _Transaction_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "Transaction");
    private final static QName _InsuranceOption_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "InsuranceOption");
    private final static QName _SetEbayMobileCheckoutRequestDetails_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "SetEbayMobileCheckoutRequestDetails");
    private final static QName _Category_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "Category");
    private final static QName _GetBillingAgreementCustomerDetailsResponseDetails_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "GetBillingAgreementCustomerDetailsResponseDetails");
    private final static QName _AccountSummaryTypePaymentMethod_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "PaymentMethod");
    private final static QName _AccountSummaryTypeAdditionalAccount_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "AdditionalAccount");
    private final static QName _AccountSummaryTypeCCExp_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "CCExp");
    private final static QName _AccountSummaryTypePastDue_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "PastDue");
    private final static QName _AccountSummaryTypeAdditionalAccountsCount_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "AdditionalAccountsCount");
    private final static QName _AccountSummaryTypeCCModifyDate_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "CCModifyDate");
    private final static QName _AccountSummaryTypeLastInvoiceAmount_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "LastInvoiceAmount");
    private final static QName _AccountSummaryTypeBillingCycleDate_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "BillingCycleDate");
    private final static QName _AccountSummaryTypeBankModifyDate_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "BankModifyDate");
    private final static QName _AccountSummaryTypeCCInfo_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "CCInfo");
    private final static QName _AccountSummaryTypeAccountState_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "AccountState");
    private final static QName _AccountSummaryTypeLastAmountPaid_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "LastAmountPaid");
    private final static QName _AccountSummaryTypeBankAccountInfo_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "BankAccountInfo");
    private final static QName _AccountSummaryTypeLastInvoiceDate_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "LastInvoiceDate");
    private final static QName _AccountSummaryTypeLastPaymentDate_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "LastPaymentDate");
    private final static QName _ReverseTransactionResponseDetailsTypeReverseTransactionID_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "ReverseTransactionID");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ebay.apis.eblbasecomponents
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CustomSecurityHeaderType }
     * 
     */
    public CustomSecurityHeaderType createCustomSecurityHeaderType() {
        return new CustomSecurityHeaderType();
    }

    /**
     * Create an instance of {@link UserType }
     * 
     */
    public UserType createUserType() {
        return new UserType();
    }

    /**
     * Create an instance of {@link SetMobileCheckoutRequestDetailsType }
     * 
     */
    public SetMobileCheckoutRequestDetailsType createSetMobileCheckoutRequestDetailsType() {
        return new SetMobileCheckoutRequestDetailsType();
    }

    /**
     * Create an instance of {@link RefundInfoType }
     * 
     */
    public RefundInfoType createRefundInfoType() {
        return new RefundInfoType();
    }

    /**
     * Create an instance of {@link ExecuteCheckoutOperationsResponseDetailsType }
     * 
     */
    public ExecuteCheckoutOperationsResponseDetailsType createExecuteCheckoutOperationsResponseDetailsType() {
        return new ExecuteCheckoutOperationsResponseDetailsType();
    }

    /**
     * Create an instance of {@link ReviseStatusType }
     * 
     */
    public ReviseStatusType createReviseStatusType() {
        return new ReviseStatusType();
    }

    /**
     * Create an instance of {@link ItemType }
     * 
     */
    public ItemType createItemType() {
        return new ItemType();
    }

    /**
     * Create an instance of {@link AddressType }
     * 
     */
    public AddressType createAddressType() {
        return new AddressType();
    }

    /**
     * Create an instance of {@link PaymentMeansType }
     * 
     */
    public PaymentMeansType createPaymentMeansType() {
        return new PaymentMeansType();
    }

    /**
     * Create an instance of {@link DoMobileCheckoutPaymentResponseDetailsType }
     * 
     */
    public DoMobileCheckoutPaymentResponseDetailsType createDoMobileCheckoutPaymentResponseDetailsType() {
        return new DoMobileCheckoutPaymentResponseDetailsType();
    }

    /**
     * Create an instance of {@link SetCustomerBillingAgreementRequestDetailsType }
     * 
     */
    public SetCustomerBillingAgreementRequestDetailsType createSetCustomerBillingAgreementRequestDetailsType() {
        return new SetCustomerBillingAgreementRequestDetailsType();
    }

    /**
     * Create an instance of {@link UATPDetailsType }
     * 
     */
    public UATPDetailsType createUATPDetailsType() {
        return new UATPDetailsType();
    }

    /**
     * Create an instance of {@link PaginationType }
     * 
     */
    public PaginationType createPaginationType() {
        return new PaginationType();
    }

    /**
     * Create an instance of {@link DoNonReferencedCreditRequestDetailsType }
     * 
     */
    public DoNonReferencedCreditRequestDetailsType createDoNonReferencedCreditRequestDetailsType() {
        return new DoNonReferencedCreditRequestDetailsType();
    }

    /**
     * Create an instance of {@link ThreeDSecureRequestType }
     * 
     */
    public ThreeDSecureRequestType createThreeDSecureRequestType() {
        return new ThreeDSecureRequestType();
    }

    /**
     * Create an instance of {@link MerchantPullPaymentType }
     * 
     */
    public MerchantPullPaymentType createMerchantPullPaymentType() {
        return new MerchantPullPaymentType();
    }

    /**
     * Create an instance of {@link PaginationResultType }
     * 
     */
    public PaginationResultType createPaginationResultType() {
        return new PaginationResultType();
    }

    /**
     * Create an instance of {@link ButtonSearchResultType }
     * 
     */
    public ButtonSearchResultType createButtonSearchResultType() {
        return new ButtonSearchResultType();
    }

    /**
     * Create an instance of {@link GetRecurringPaymentsProfileDetailsResponseDetailsType }
     * 
     */
    public GetRecurringPaymentsProfileDetailsResponseDetailsType createGetRecurringPaymentsProfileDetailsResponseDetailsType() {
        return new GetRecurringPaymentsProfileDetailsResponseDetailsType();
    }

    /**
     * Create an instance of {@link CreditCardDetailsType }
     * 
     */
    public CreditCardDetailsType createCreditCardDetailsType() {
        return new CreditCardDetailsType();
    }

    /**
     * Create an instance of {@link GetExpressCheckoutDetailsResponseDetailsType }
     * 
     */
    public GetExpressCheckoutDetailsResponseDetailsType createGetExpressCheckoutDetailsResponseDetailsType() {
        return new GetExpressCheckoutDetailsResponseDetailsType();
    }

    /**
     * Create an instance of {@link ShippingInfoType }
     * 
     */
    public ShippingInfoType createShippingInfoType() {
        return new ShippingInfoType();
    }

    /**
     * Create an instance of {@link EnhancedDataType }
     * 
     */
    public EnhancedDataType createEnhancedDataType() {
        return new EnhancedDataType();
    }

    /**
     * Create an instance of {@link ThreeDSecureInfoType }
     * 
     */
    public ThreeDSecureInfoType createThreeDSecureInfoType() {
        return new ThreeDSecureInfoType();
    }

    /**
     * Create an instance of {@link AirlineItineraryType }
     * 
     */
    public AirlineItineraryType createAirlineItineraryType() {
        return new AirlineItineraryType();
    }

    /**
     * Create an instance of {@link TransactionsType }
     * 
     */
    public TransactionsType createTransactionsType() {
        return new TransactionsType();
    }

    /**
     * Create an instance of {@link SetAccessPermissionsRequestDetailsType }
     * 
     */
    public SetAccessPermissionsRequestDetailsType createSetAccessPermissionsRequestDetailsType() {
        return new SetAccessPermissionsRequestDetailsType();
    }

    /**
     * Create an instance of {@link ManageRecurringPaymentsProfileStatusResponseDetailsType }
     * 
     */
    public ManageRecurringPaymentsProfileStatusResponseDetailsType createManageRecurringPaymentsProfileStatusResponseDetailsType() {
        return new ManageRecurringPaymentsProfileStatusResponseDetailsType();
    }

    /**
     * Create an instance of {@link ExecuteCheckoutOperationsRequestDetailsType }
     * 
     */
    public ExecuteCheckoutOperationsRequestDetailsType createExecuteCheckoutOperationsRequestDetailsType() {
        return new ExecuteCheckoutOperationsRequestDetailsType();
    }

    /**
     * Create an instance of {@link DoCaptureResponseDetailsType }
     * 
     */
    public DoCaptureResponseDetailsType createDoCaptureResponseDetailsType() {
        return new DoCaptureResponseDetailsType();
    }

    /**
     * Create an instance of {@link PaymentTransactionSearchResultType }
     * 
     */
    public PaymentTransactionSearchResultType createPaymentTransactionSearchResultType() {
        return new PaymentTransactionSearchResultType();
    }

    /**
     * Create an instance of {@link ManageRecurringPaymentsProfileStatusRequestDetailsType }
     * 
     */
    public ManageRecurringPaymentsProfileStatusRequestDetailsType createManageRecurringPaymentsProfileStatusRequestDetailsType() {
        return new ManageRecurringPaymentsProfileStatusRequestDetailsType();
    }

    /**
     * Create an instance of {@link OfferDetailsType }
     * 
     */
    public OfferDetailsType createOfferDetailsType() {
        return new OfferDetailsType();
    }

    /**
     * Create an instance of {@link InvoiceItemType }
     * 
     */
    public InvoiceItemType createInvoiceItemType() {
        return new InvoiceItemType();
    }

    /**
     * Create an instance of {@link GetIncentiveEvaluationResponseDetailsType }
     * 
     */
    public GetIncentiveEvaluationResponseDetailsType createGetIncentiveEvaluationResponseDetailsType() {
        return new GetIncentiveEvaluationResponseDetailsType();
    }

    /**
     * Create an instance of {@link DoExpressCheckoutPaymentResponseDetailsType }
     * 
     */
    public DoExpressCheckoutPaymentResponseDetailsType createDoExpressCheckoutPaymentResponseDetailsType() {
        return new DoExpressCheckoutPaymentResponseDetailsType();
    }

    /**
     * Create an instance of {@link ShippingDetailsType }
     * 
     */
    public ShippingDetailsType createShippingDetailsType() {
        return new ShippingDetailsType();
    }

    /**
     * Create an instance of {@link BillOutstandingAmountRequestDetailsType }
     * 
     */
    public BillOutstandingAmountRequestDetailsType createBillOutstandingAmountRequestDetailsType() {
        return new BillOutstandingAmountRequestDetailsType();
    }

    /**
     * Create an instance of {@link GetBoardingDetailsResponseDetailsType }
     * 
     */
    public GetBoardingDetailsResponseDetailsType createGetBoardingDetailsResponseDetailsType() {
        return new GetBoardingDetailsResponseDetailsType();
    }

    /**
     * Create an instance of {@link DoNonReferencedCreditResponseDetailsType }
     * 
     */
    public DoNonReferencedCreditResponseDetailsType createDoNonReferencedCreditResponseDetailsType() {
        return new DoNonReferencedCreditResponseDetailsType();
    }

    /**
     * Create an instance of {@link CategoryArrayType }
     * 
     */
    public CategoryArrayType createCategoryArrayType() {
        return new CategoryArrayType();
    }

    /**
     * Create an instance of {@link MerchantStoreDetailsType }
     * 
     */
    public MerchantStoreDetailsType createMerchantStoreDetailsType() {
        return new MerchantStoreDetailsType();
    }

    /**
     * Create an instance of {@link OptionTrackingDetailsType }
     * 
     */
    public OptionTrackingDetailsType createOptionTrackingDetailsType() {
        return new OptionTrackingDetailsType();
    }

    /**
     * Create an instance of {@link TaxInfoType }
     * 
     */
    public TaxInfoType createTaxInfoType() {
        return new TaxInfoType();
    }

    /**
     * Create an instance of {@link BillOutstandingAmountResponseDetailsType }
     * 
     */
    public BillOutstandingAmountResponseDetailsType createBillOutstandingAmountResponseDetailsType() {
        return new BillOutstandingAmountResponseDetailsType();
    }

    /**
     * Create an instance of {@link PaymentTransactionType }
     * 
     */
    public PaymentTransactionType createPaymentTransactionType() {
        return new PaymentTransactionType();
    }

    /**
     * Create an instance of {@link DoReferenceTransactionResponseDetailsType }
     * 
     */
    public DoReferenceTransactionResponseDetailsType createDoReferenceTransactionResponseDetailsType() {
        return new DoReferenceTransactionResponseDetailsType();
    }

    /**
     * Create an instance of {@link SellingStatusType }
     * 
     */
    public SellingStatusType createSellingStatusType() {
        return new SellingStatusType();
    }

    /**
     * Create an instance of {@link AccountSummaryType }
     * 
     */
    public AccountSummaryType createAccountSummaryType() {
        return new AccountSummaryType();
    }

    /**
     * Create an instance of {@link CreateRecurringPaymentsProfileRequestDetailsType }
     * 
     */
    public CreateRecurringPaymentsProfileRequestDetailsType createCreateRecurringPaymentsProfileRequestDetailsType() {
        return new CreateRecurringPaymentsProfileRequestDetailsType();
    }

    /**
     * Create an instance of {@link ReverseTransactionRequestDetailsType }
     * 
     */
    public ReverseTransactionRequestDetailsType createReverseTransactionRequestDetailsType() {
        return new ReverseTransactionRequestDetailsType();
    }

    /**
     * Create an instance of {@link MerchantPullPaymentResponseType }
     * 
     */
    public MerchantPullPaymentResponseType createMerchantPullPaymentResponseType() {
        return new MerchantPullPaymentResponseType();
    }

    /**
     * Create an instance of {@link ItemArrayType }
     * 
     */
    public ItemArrayType createItemArrayType() {
        return new ItemArrayType();
    }

    /**
     * Create an instance of {@link PaymentType }
     * 
     */
    public PaymentType createPaymentType() {
        return new PaymentType();
    }

    /**
     * Create an instance of {@link SetAuthFlowParamRequestDetailsType }
     * 
     */
    public SetAuthFlowParamRequestDetailsType createSetAuthFlowParamRequestDetailsType() {
        return new SetAuthFlowParamRequestDetailsType();
    }

    /**
     * Create an instance of {@link UpdateRecurringPaymentsProfileResponseDetailsType }
     * 
     */
    public UpdateRecurringPaymentsProfileResponseDetailsType createUpdateRecurringPaymentsProfileResponseDetailsType() {
        return new UpdateRecurringPaymentsProfileResponseDetailsType();
    }

    /**
     * Create an instance of {@link BAUpdateResponseDetailsType }
     * 
     */
    public BAUpdateResponseDetailsType createBAUpdateResponseDetailsType() {
        return new BAUpdateResponseDetailsType();
    }

    /**
     * Create an instance of {@link InstrumentDetailsType }
     * 
     */
    public InstrumentDetailsType createInstrumentDetailsType() {
        return new InstrumentDetailsType();
    }

    /**
     * Create an instance of {@link DoDirectPaymentRequestDetailsType }
     * 
     */
    public DoDirectPaymentRequestDetailsType createDoDirectPaymentRequestDetailsType() {
        return new DoDirectPaymentRequestDetailsType();
    }

    /**
     * Create an instance of {@link GetMobileStatusRequestDetailsType }
     * 
     */
    public GetMobileStatusRequestDetailsType createGetMobileStatusRequestDetailsType() {
        return new GetMobileStatusRequestDetailsType();
    }

    /**
     * Create an instance of {@link GetAccessPermissionDetailsResponseDetailsType }
     * 
     */
    public GetAccessPermissionDetailsResponseDetailsType createGetAccessPermissionDetailsResponseDetailsType() {
        return new GetAccessPermissionDetailsResponseDetailsType();
    }

    /**
     * Create an instance of {@link CreateMobilePaymentRequestDetailsType }
     * 
     */
    public CreateMobilePaymentRequestDetailsType createCreateMobilePaymentRequestDetailsType() {
        return new CreateMobilePaymentRequestDetailsType();
    }

    /**
     * Create an instance of {@link DoExpressCheckoutPaymentRequestDetailsType }
     * 
     */
    public DoExpressCheckoutPaymentRequestDetailsType createDoExpressCheckoutPaymentRequestDetailsType() {
        return new DoExpressCheckoutPaymentRequestDetailsType();
    }

    /**
     * Create an instance of {@link FeesType }
     * 
     */
    public FeesType createFeesType() {
        return new FeesType();
    }

    /**
     * Create an instance of {@link GetAuthDetailsResponseDetailsType }
     * 
     */
    public GetAuthDetailsResponseDetailsType createGetAuthDetailsResponseDetailsType() {
        return new GetAuthDetailsResponseDetailsType();
    }

    /**
     * Create an instance of {@link UpdateRecurringPaymentsProfileRequestDetailsType }
     * 
     */
    public UpdateRecurringPaymentsProfileRequestDetailsType createUpdateRecurringPaymentsProfileRequestDetailsType() {
        return new UpdateRecurringPaymentsProfileRequestDetailsType();
    }

    /**
     * Create an instance of {@link ItemTrackingDetailsType }
     * 
     */
    public ItemTrackingDetailsType createItemTrackingDetailsType() {
        return new ItemTrackingDetailsType();
    }

    /**
     * Create an instance of {@link CreateRecurringPaymentsProfileResponseDetailsType }
     * 
     */
    public CreateRecurringPaymentsProfileResponseDetailsType createCreateRecurringPaymentsProfileResponseDetailsType() {
        return new CreateRecurringPaymentsProfileResponseDetailsType();
    }

    /**
     * Create an instance of {@link TransactionType }
     * 
     */
    public TransactionType createTransactionType() {
        return new TransactionType();
    }

    /**
     * Create an instance of {@link ReverseTransactionResponseDetailsType }
     * 
     */
    public ReverseTransactionResponseDetailsType createReverseTransactionResponseDetailsType() {
        return new ReverseTransactionResponseDetailsType();
    }

    /**
     * Create an instance of {@link GetIncentiveEvaluationRequestDetailsType }
     * 
     */
    public GetIncentiveEvaluationRequestDetailsType createGetIncentiveEvaluationRequestDetailsType() {
        return new GetIncentiveEvaluationRequestDetailsType();
    }

    /**
     * Create an instance of {@link SetExpressCheckoutRequestDetailsType }
     * 
     */
    public SetExpressCheckoutRequestDetailsType createSetExpressCheckoutRequestDetailsType() {
        return new SetExpressCheckoutRequestDetailsType();
    }

    /**
     * Create an instance of {@link DoReferenceTransactionRequestDetailsType }
     * 
     */
    public DoReferenceTransactionRequestDetailsType createDoReferenceTransactionRequestDetailsType() {
        return new DoReferenceTransactionRequestDetailsType();
    }

    /**
     * Create an instance of {@link AuthorizationInfoType }
     * 
     */
    public AuthorizationInfoType createAuthorizationInfoType() {
        return new AuthorizationInfoType();
    }

    /**
     * Create an instance of {@link ErrorType }
     * 
     */
    public ErrorType createErrorType() {
        return new ErrorType();
    }

    /**
     * Create an instance of {@link GetBillingAgreementCustomerDetailsResponseDetailsType }
     * 
     */
    public GetBillingAgreementCustomerDetailsResponseDetailsType createGetBillingAgreementCustomerDetailsResponseDetailsType() {
        return new GetBillingAgreementCustomerDetailsResponseDetailsType();
    }

    /**
     * Create an instance of {@link CategoryType }
     * 
     */
    public CategoryType createCategoryType() {
        return new CategoryType();
    }

    /**
     * Create an instance of {@link EnterBoardingRequestDetailsType }
     * 
     */
    public EnterBoardingRequestDetailsType createEnterBoardingRequestDetailsType() {
        return new EnterBoardingRequestDetailsType();
    }

    /**
     * Create an instance of {@link SetEbayMobileCheckoutRequestDetailsType }
     * 
     */
    public SetEbayMobileCheckoutRequestDetailsType createSetEbayMobileCheckoutRequestDetailsType() {
        return new SetEbayMobileCheckoutRequestDetailsType();
    }

    /**
     * Create an instance of {@link BillingApprovalDetailsType }
     * 
     */
    public BillingApprovalDetailsType createBillingApprovalDetailsType() {
        return new BillingApprovalDetailsType();
    }

    /**
     * Create an instance of {@link IncentiveApplyIndicationType }
     * 
     */
    public IncentiveApplyIndicationType createIncentiveApplyIndicationType() {
        return new IncentiveApplyIndicationType();
    }

    /**
     * Create an instance of {@link FMFDetailsType }
     * 
     */
    public FMFDetailsType createFMFDetailsType() {
        return new FMFDetailsType();
    }

    /**
     * Create an instance of {@link IncentiveAppliedDetailsType }
     * 
     */
    public IncentiveAppliedDetailsType createIncentiveAppliedDetailsType() {
        return new IncentiveAppliedDetailsType();
    }

    /**
     * Create an instance of {@link ShippingOptionType }
     * 
     */
    public ShippingOptionType createShippingOptionType() {
        return new ShippingOptionType();
    }

    /**
     * Create an instance of {@link PaymentInfoType }
     * 
     */
    public PaymentInfoType createPaymentInfoType() {
        return new PaymentInfoType();
    }

    /**
     * Create an instance of {@link RefreshTokenStatusDetailsType }
     * 
     */
    public RefreshTokenStatusDetailsType createRefreshTokenStatusDetailsType() {
        return new RefreshTokenStatusDetailsType();
    }

    /**
     * Create an instance of {@link EbayItemPaymentDetailsItemType }
     * 
     */
    public EbayItemPaymentDetailsItemType createEbayItemPaymentDetailsItemType() {
        return new EbayItemPaymentDetailsItemType();
    }

    /**
     * Create an instance of {@link ReceiverInfoType }
     * 
     */
    public ReceiverInfoType createReceiverInfoType() {
        return new ReceiverInfoType();
    }

    /**
     * Create an instance of {@link ThreeDSecureResponseType }
     * 
     */
    public ThreeDSecureResponseType createThreeDSecureResponseType() {
        return new ThreeDSecureResponseType();
    }

    /**
     * Create an instance of {@link CreditCardNumberTypeType }
     * 
     */
    public CreditCardNumberTypeType createCreditCardNumberTypeType() {
        return new CreditCardNumberTypeType();
    }

    /**
     * Create an instance of {@link CalculatedShippingRateType }
     * 
     */
    public CalculatedShippingRateType createCalculatedShippingRateType() {
        return new CalculatedShippingRateType();
    }

    /**
     * Create an instance of {@link IncentiveInfoType }
     * 
     */
    public IncentiveInfoType createIncentiveInfoType() {
        return new IncentiveInfoType();
    }

    /**
     * Create an instance of {@link AttributeType }
     * 
     */
    public AttributeType createAttributeType() {
        return new AttributeType();
    }

    /**
     * Create an instance of {@link ListingDetailsType }
     * 
     */
    public ListingDetailsType createListingDetailsType() {
        return new ListingDetailsType();
    }

    /**
     * Create an instance of {@link ExternalRememberMeOptInDetailsType }
     * 
     */
    public ExternalRememberMeOptInDetailsType createExternalRememberMeOptInDetailsType() {
        return new ExternalRememberMeOptInDetailsType();
    }

    /**
     * Create an instance of {@link SiteHostedPictureType }
     * 
     */
    public SiteHostedPictureType createSiteHostedPictureType() {
        return new SiteHostedPictureType();
    }

    /**
     * Create an instance of {@link APICredentialsType }
     * 
     */
    public APICredentialsType createAPICredentialsType() {
        return new APICredentialsType();
    }

    /**
     * Create an instance of {@link PaymentRequestInfoType }
     * 
     */
    public PaymentRequestInfoType createPaymentRequestInfoType() {
        return new PaymentRequestInfoType();
    }

    /**
     * Create an instance of {@link IncentiveAppliedToType }
     * 
     */
    public IncentiveAppliedToType createIncentiveAppliedToType() {
        return new IncentiveAppliedToType();
    }

    /**
     * Create an instance of {@link ValType }
     * 
     */
    public ValType createValType() {
        return new ValType();
    }

    /**
     * Create an instance of {@link BillingPeriodDetailsTypeUpdate }
     * 
     */
    public BillingPeriodDetailsTypeUpdate createBillingPeriodDetailsTypeUpdate() {
        return new BillingPeriodDetailsTypeUpdate();
    }

    /**
     * Create an instance of {@link UserSelectedOptionType }
     * 
     */
    public UserSelectedOptionType createUserSelectedOptionType() {
        return new UserSelectedOptionType();
    }

    /**
     * Create an instance of {@link BillingPeriodDetailsType }
     * 
     */
    public BillingPeriodDetailsType createBillingPeriodDetailsType() {
        return new BillingPeriodDetailsType();
    }

    /**
     * Create an instance of {@link RecurringPaymentsProfileDetailsType }
     * 
     */
    public RecurringPaymentsProfileDetailsType createRecurringPaymentsProfileDetailsType() {
        return new RecurringPaymentsProfileDetailsType();
    }

    /**
     * Create an instance of {@link IncentiveRequestDetailsType }
     * 
     */
    public IncentiveRequestDetailsType createIncentiveRequestDetailsType() {
        return new IncentiveRequestDetailsType();
    }

    /**
     * Create an instance of {@link RememberMeIDInfoType }
     * 
     */
    public RememberMeIDInfoType createRememberMeIDInfoType() {
        return new RememberMeIDInfoType();
    }

    /**
     * Create an instance of {@link OrderDetailsType }
     * 
     */
    public OrderDetailsType createOrderDetailsType() {
        return new OrderDetailsType();
    }

    /**
     * Create an instance of {@link PhoneNumberType }
     * 
     */
    public PhoneNumberType createPhoneNumberType() {
        return new PhoneNumberType();
    }

    /**
     * Create an instance of {@link CoupledBucketsType }
     * 
     */
    public CoupledBucketsType createCoupledBucketsType() {
        return new CoupledBucketsType();
    }

    /**
     * Create an instance of {@link PaymentDetailsItemType }
     * 
     */
    public PaymentDetailsItemType createPaymentDetailsItemType() {
        return new PaymentDetailsItemType();
    }

    /**
     * Create an instance of {@link ModifiedFieldType }
     * 
     */
    public ModifiedFieldType createModifiedFieldType() {
        return new ModifiedFieldType();
    }

    /**
     * Create an instance of {@link ExternalRememberMeOwnerDetailsType }
     * 
     */
    public ExternalRememberMeOwnerDetailsType createExternalRememberMeOwnerDetailsType() {
        return new ExternalRememberMeOwnerDetailsType();
    }

    /**
     * Create an instance of {@link OtherPaymentMethodDetailsType }
     * 
     */
    public OtherPaymentMethodDetailsType createOtherPaymentMethodDetailsType() {
        return new OtherPaymentMethodDetailsType();
    }

    /**
     * Create an instance of {@link IdentificationInfoType }
     * 
     */
    public IdentificationInfoType createIdentificationInfoType() {
        return new IdentificationInfoType();
    }

    /**
     * Create an instance of {@link SetDataRequestType }
     * 
     */
    public SetDataRequestType createSetDataRequestType() {
        return new SetDataRequestType();
    }

    /**
     * Create an instance of {@link CrossPromotionsType }
     * 
     */
    public CrossPromotionsType createCrossPromotionsType() {
        return new CrossPromotionsType();
    }

    /**
     * Create an instance of {@link SetDataResponseType }
     * 
     */
    public SetDataResponseType createSetDataResponseType() {
        return new SetDataResponseType();
    }

    /**
     * Create an instance of {@link PaymentItemInfoType }
     * 
     */
    public PaymentItemInfoType createPaymentItemInfoType() {
        return new PaymentItemInfoType();
    }

    /**
     * Create an instance of {@link AuthorizationRequestType }
     * 
     */
    public AuthorizationRequestType createAuthorizationRequestType() {
        return new AuthorizationRequestType();
    }

    /**
     * Create an instance of {@link BusinessInfoType }
     * 
     */
    public BusinessInfoType createBusinessInfoType() {
        return new BusinessInfoType();
    }

    /**
     * Create an instance of {@link OfferCouponInfoType }
     * 
     */
    public OfferCouponInfoType createOfferCouponInfoType() {
        return new OfferCouponInfoType();
    }

    /**
     * Create an instance of {@link ExternalRememberMeStatusDetailsType }
     * 
     */
    public ExternalRememberMeStatusDetailsType createExternalRememberMeStatusDetailsType() {
        return new ExternalRememberMeStatusDetailsType();
    }

    /**
     * Create an instance of {@link AccountEntryType }
     * 
     */
    public AccountEntryType createAccountEntryType() {
        return new AccountEntryType();
    }

    /**
     * Create an instance of {@link PaymentItemType }
     * 
     */
    public PaymentItemType createPaymentItemType() {
        return new PaymentItemType();
    }

    /**
     * Create an instance of {@link CharityType }
     * 
     */
    public CharityType createCharityType() {
        return new CharityType();
    }

    /**
     * Create an instance of {@link AttributeSetType }
     * 
     */
    public AttributeSetType createAttributeSetType() {
        return new AttributeSetType();
    }

    /**
     * Create an instance of {@link RiskFilterDetailsType }
     * 
     */
    public RiskFilterDetailsType createRiskFilterDetailsType() {
        return new RiskFilterDetailsType();
    }

    /**
     * Create an instance of {@link FlatShippingRateType }
     * 
     */
    public FlatShippingRateType createFlatShippingRateType() {
        return new FlatShippingRateType();
    }

    /**
     * Create an instance of {@link FlowControlDetailsType }
     * 
     */
    public FlowControlDetailsType createFlowControlDetailsType() {
        return new FlowControlDetailsType();
    }

    /**
     * Create an instance of {@link StorefrontType }
     * 
     */
    public StorefrontType createStorefrontType() {
        return new StorefrontType();
    }

    /**
     * Create an instance of {@link MerchantPullInfoType }
     * 
     */
    public MerchantPullInfoType createMerchantPullInfoType() {
        return new MerchantPullInfoType();
    }

    /**
     * Create an instance of {@link SalesTaxType }
     * 
     */
    public SalesTaxType createSalesTaxType() {
        return new SalesTaxType();
    }

    /**
     * Create an instance of {@link ExternalPartnerTrackingDetailsType }
     * 
     */
    public ExternalPartnerTrackingDetailsType createExternalPartnerTrackingDetailsType() {
        return new ExternalPartnerTrackingDetailsType();
    }

    /**
     * Create an instance of {@link BuyerType }
     * 
     */
    public BuyerType createBuyerType() {
        return new BuyerType();
    }

    /**
     * Create an instance of {@link FlightDetailsType }
     * 
     */
    public FlightDetailsType createFlightDetailsType() {
        return new FlightDetailsType();
    }

    /**
     * Create an instance of {@link IncentiveBucketType }
     * 
     */
    public IncentiveBucketType createIncentiveBucketType() {
        return new IncentiveBucketType();
    }

    /**
     * Create an instance of {@link BMLOfferInfoType }
     * 
     */
    public BMLOfferInfoType createBMLOfferInfoType() {
        return new BMLOfferInfoType();
    }

    /**
     * Create an instance of {@link SellerDetailsType }
     * 
     */
    public SellerDetailsType createSellerDetailsType() {
        return new SellerDetailsType();
    }

    /**
     * Create an instance of {@link ActivationDetailsType }
     * 
     */
    public ActivationDetailsType createActivationDetailsType() {
        return new ActivationDetailsType();
    }

    /**
     * Create an instance of {@link BusinessOwnerInfoType }
     * 
     */
    public BusinessOwnerInfoType createBusinessOwnerInfoType() {
        return new BusinessOwnerInfoType();
    }

    /**
     * Create an instance of {@link ListOfAttributeSetType }
     * 
     */
    public ListOfAttributeSetType createListOfAttributeSetType() {
        return new ListOfAttributeSetType();
    }

    /**
     * Create an instance of {@link TaxIdDetailsType }
     * 
     */
    public TaxIdDetailsType createTaxIdDetailsType() {
        return new TaxIdDetailsType();
    }

    /**
     * Create an instance of {@link PaymentDetailsType }
     * 
     */
    public PaymentDetailsType createPaymentDetailsType() {
        return new PaymentDetailsType();
    }

    /**
     * Create an instance of {@link SenderDetailsType }
     * 
     */
    public SenderDetailsType createSenderDetailsType() {
        return new SenderDetailsType();
    }

    /**
     * Create an instance of {@link IncentiveDetailType }
     * 
     */
    public IncentiveDetailType createIncentiveDetailType() {
        return new IncentiveDetailType();
    }

    /**
     * Create an instance of {@link InfoSharingDirectivesType }
     * 
     */
    public InfoSharingDirectivesType createInfoSharingDirectivesType() {
        return new InfoSharingDirectivesType();
    }

    /**
     * Create an instance of {@link SellerType }
     * 
     */
    public SellerType createSellerType() {
        return new SellerType();
    }

    /**
     * Create an instance of {@link DisplayControlDetailsType }
     * 
     */
    public DisplayControlDetailsType createDisplayControlDetailsType() {
        return new DisplayControlDetailsType();
    }

    /**
     * Create an instance of {@link AuthorizationResponseType }
     * 
     */
    public AuthorizationResponseType createAuthorizationResponseType() {
        return new AuthorizationResponseType();
    }

    /**
     * Create an instance of {@link SchedulingInfoType }
     * 
     */
    public SchedulingInfoType createSchedulingInfoType() {
        return new SchedulingInfoType();
    }

    /**
     * Create an instance of {@link SubscriptionTermsType }
     * 
     */
    public SubscriptionTermsType createSubscriptionTermsType() {
        return new SubscriptionTermsType();
    }

    /**
     * Create an instance of {@link BuyerDetailType }
     * 
     */
    public BuyerDetailType createBuyerDetailType() {
        return new BuyerDetailType();
    }

    /**
     * Create an instance of {@link ShippingCarrierDetailsType }
     * 
     */
    public ShippingCarrierDetailsType createShippingCarrierDetailsType() {
        return new ShippingCarrierDetailsType();
    }

    /**
     * Create an instance of {@link TransactionStatusType }
     * 
     */
    public TransactionStatusType createTransactionStatusType() {
        return new TransactionStatusType();
    }

    /**
     * Create an instance of {@link DiscountType }
     * 
     */
    public DiscountType createDiscountType() {
        return new DiscountType();
    }

    /**
     * Create an instance of {@link ListingDesignerType }
     * 
     */
    public ListingDesignerType createListingDesignerType() {
        return new ListingDesignerType();
    }

    /**
     * Create an instance of {@link DeviceDetailsType }
     * 
     */
    public DeviceDetailsType createDeviceDetailsType() {
        return new DeviceDetailsType();
    }

    /**
     * Create an instance of {@link IncentiveItemType }
     * 
     */
    public IncentiveItemType createIncentiveItemType() {
        return new IncentiveItemType();
    }

    /**
     * Create an instance of {@link RiskFilterListType }
     * 
     */
    public RiskFilterListType createRiskFilterListType() {
        return new RiskFilterListType();
    }

    /**
     * Create an instance of {@link VATDetailsType }
     * 
     */
    public VATDetailsType createVATDetailsType() {
        return new VATDetailsType();
    }

    /**
     * Create an instance of {@link IdentityTokenInfoType }
     * 
     */
    public IdentityTokenInfoType createIdentityTokenInfoType() {
        return new IdentityTokenInfoType();
    }

    /**
     * Create an instance of {@link FaultDetailsType }
     * 
     */
    public FaultDetailsType createFaultDetailsType() {
        return new FaultDetailsType();
    }

    /**
     * Create an instance of {@link AdditionalFeeType }
     * 
     */
    public AdditionalFeeType createAdditionalFeeType() {
        return new AdditionalFeeType();
    }

    /**
     * Create an instance of {@link RecurringPaymentsSummaryType }
     * 
     */
    public RecurringPaymentsSummaryType createRecurringPaymentsSummaryType() {
        return new RecurringPaymentsSummaryType();
    }

    /**
     * Create an instance of {@link OptionType }
     * 
     */
    public OptionType createOptionType() {
        return new OptionType();
    }

    /**
     * Create an instance of {@link PromotedItemType }
     * 
     */
    public PromotedItemType createPromotedItemType() {
        return new PromotedItemType();
    }

    /**
     * Create an instance of {@link SubscriptionInfoType }
     * 
     */
    public SubscriptionInfoType createSubscriptionInfoType() {
        return new SubscriptionInfoType();
    }

    /**
     * Create an instance of {@link ScheduleDetailsType }
     * 
     */
    public ScheduleDetailsType createScheduleDetailsType() {
        return new ScheduleDetailsType();
    }

    /**
     * Create an instance of {@link BillingAgreementDetailsType }
     * 
     */
    public BillingAgreementDetailsType createBillingAgreementDetailsType() {
        return new BillingAgreementDetailsType();
    }

    /**
     * Create an instance of {@link AuctionInfoType }
     * 
     */
    public AuctionInfoType createAuctionInfoType() {
        return new AuctionInfoType();
    }

    /**
     * Create an instance of {@link PaymentDirectivesType }
     * 
     */
    public PaymentDirectivesType createPaymentDirectivesType() {
        return new PaymentDirectivesType();
    }

    /**
     * Create an instance of {@link UserIdPasswordType }
     * 
     */
    public UserIdPasswordType createUserIdPasswordType() {
        return new UserIdPasswordType();
    }

    /**
     * Create an instance of {@link ReferenceCreditCardDetailsType }
     * 
     */
    public ReferenceCreditCardDetailsType createReferenceCreditCardDetailsType() {
        return new ReferenceCreditCardDetailsType();
    }

    /**
     * Create an instance of {@link IncentiveDetailsType }
     * 
     */
    public IncentiveDetailsType createIncentiveDetailsType() {
        return new IncentiveDetailsType();
    }

    /**
     * Create an instance of {@link ErrorParameterType }
     * 
     */
    public ErrorParameterType createErrorParameterType() {
        return new ErrorParameterType();
    }

    /**
     * Create an instance of {@link PersonNameType }
     * 
     */
    public PersonNameType createPersonNameType() {
        return new PersonNameType();
    }

    /**
     * Create an instance of {@link BankAccountDetailsType }
     * 
     */
    public BankAccountDetailsType createBankAccountDetailsType() {
        return new BankAccountDetailsType();
    }

    /**
     * Create an instance of {@link FeeType }
     * 
     */
    public FeeType createFeeType() {
        return new FeeType();
    }

    /**
     * Create an instance of {@link FundingSourceDetailsType }
     * 
     */
    public FundingSourceDetailsType createFundingSourceDetailsType() {
        return new FundingSourceDetailsType();
    }

    /**
     * Create an instance of {@link AdditionalAccountType }
     * 
     */
    public AdditionalAccountType createAdditionalAccountType() {
        return new AdditionalAccountType();
    }

    /**
     * Create an instance of {@link PayerInfoType }
     * 
     */
    public PayerInfoType createPayerInfoType() {
        return new PayerInfoType();
    }

    /**
     * Create an instance of {@link BuyerDetailsType }
     * 
     */
    public BuyerDetailsType createBuyerDetailsType() {
        return new BuyerDetailsType();
    }

    /**
     * Create an instance of {@link MobileIDInfoType }
     * 
     */
    public MobileIDInfoType createMobileIDInfoType() {
        return new MobileIDInfoType();
    }

    /**
     * Create an instance of {@link CoupledPaymentInfoType }
     * 
     */
    public CoupledPaymentInfoType createCoupledPaymentInfoType() {
        return new CoupledPaymentInfoType();
    }

    /**
     * Create an instance of {@link VendorHostedPictureType }
     * 
     */
    public VendorHostedPictureType createVendorHostedPictureType() {
        return new VendorHostedPictureType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RefundInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "RefundInfo")
    public JAXBElement<RefundInfoType> createRefundInfo(RefundInfoType value) {
        return new JAXBElement<RefundInfoType>(_RefundInfo_QNAME, RefundInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "StoreOwner")
    public JAXBElement<Boolean> createStoreOwner(Boolean value) {
        return new JAXBElement<Boolean>(_StoreOwner_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "StateOrProvince")
    public JAXBElement<String> createStateOrProvince(String value) {
        return new JAXBElement<String>(_StateOrProvince_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurrencyCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "Currency")
    public JAXBElement<CurrencyCodeType> createCurrency(CurrencyCodeType value) {
        return new JAXBElement<CurrencyCodeType>(_Currency_QNAME, CurrencyCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetCustomerBillingAgreementRequestDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "SetCustomerBillingAgreementRequestDetails")
    public JAXBElement<SetCustomerBillingAgreementRequestDetailsType> createSetCustomerBillingAgreementRequestDetails(SetCustomerBillingAgreementRequestDetailsType value) {
        return new JAXBElement<SetCustomerBillingAgreementRequestDetailsType>(_SetCustomerBillingAgreementRequestDetails_QNAME, SetCustomerBillingAgreementRequestDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExecuteCheckoutOperationsResponseDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "ExecuteCheckoutOperationsResponseDetails")
    public JAXBElement<ExecuteCheckoutOperationsResponseDetailsType> createExecuteCheckoutOperationsResponseDetails(ExecuteCheckoutOperationsResponseDetailsType value) {
        return new JAXBElement<ExecuteCheckoutOperationsResponseDetailsType>(_ExecuteCheckoutOperationsResponseDetails_QNAME, ExecuteCheckoutOperationsResponseDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoNonReferencedCreditRequestDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "DoNonReferencedCreditRequestDetails")
    public JAXBElement<DoNonReferencedCreditRequestDetailsType> createDoNonReferencedCreditRequestDetails(DoNonReferencedCreditRequestDetailsType value) {
        return new JAXBElement<DoNonReferencedCreditRequestDetailsType>(_DoNonReferencedCreditRequestDetails_QNAME, DoNonReferencedCreditRequestDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "RegistrationAddress")
    public JAXBElement<AddressType> createRegistrationAddress(AddressType value) {
        return new JAXBElement<AddressType>(_RegistrationAddress_QNAME, AddressType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRecurringPaymentsProfileDetailsResponseDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "GetRecurringPaymentsProfileDetailsResponseDetails")
    public JAXBElement<GetRecurringPaymentsProfileDetailsResponseDetailsType> createGetRecurringPaymentsProfileDetailsResponseDetails(GetRecurringPaymentsProfileDetailsResponseDetailsType value) {
        return new JAXBElement<GetRecurringPaymentsProfileDetailsResponseDetailsType>(_GetRecurringPaymentsProfileDetailsResponseDetails_QNAME, GetRecurringPaymentsProfileDetailsResponseDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransactionsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "Transactions")
    public JAXBElement<TransactionsType> createTransactions(TransactionsType value) {
        return new JAXBElement<TransactionsType>(_Transactions_QNAME, TransactionsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShippingInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "ShippingInfo")
    public JAXBElement<ShippingInfoType> createShippingInfo(ShippingInfoType value) {
        return new JAXBElement<ShippingInfoType>(_ShippingInfo_QNAME, ShippingInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "SellerPaymentAddress")
    public JAXBElement<AddressType> createSellerPaymentAddress(AddressType value) {
        return new JAXBElement<AddressType>(_SellerPaymentAddress_QNAME, AddressType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnhancedDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "EnhancedData")
    public JAXBElement<EnhancedDataType> createEnhancedData(EnhancedDataType value) {
        return new JAXBElement<EnhancedDataType>(_EnhancedData_QNAME, EnhancedDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManageRecurringPaymentsProfileStatusResponseDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "ManageRecurringPaymentsProfileStatusResponseDetails")
    public JAXBElement<ManageRecurringPaymentsProfileStatusResponseDetailsType> createManageRecurringPaymentsProfileStatusResponseDetails(ManageRecurringPaymentsProfileStatusResponseDetailsType value) {
        return new JAXBElement<ManageRecurringPaymentsProfileStatusResponseDetailsType>(_ManageRecurringPaymentsProfileStatusResponseDetails_QNAME, ManageRecurringPaymentsProfileStatusResponseDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExecuteCheckoutOperationsRequestDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "ExecuteCheckoutOperationsRequestDetails")
    public JAXBElement<ExecuteCheckoutOperationsRequestDetailsType> createExecuteCheckoutOperationsRequestDetails(ExecuteCheckoutOperationsRequestDetailsType value) {
        return new JAXBElement<ExecuteCheckoutOperationsRequestDetailsType>(_ExecuteCheckoutOperationsRequestDetails_QNAME, ExecuteCheckoutOperationsRequestDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShippingServiceCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "ShippingService")
    public JAXBElement<ShippingServiceCodeType> createShippingService(ShippingServiceCodeType value) {
        return new JAXBElement<ShippingServiceCodeType>(_ShippingService_QNAME, ShippingServiceCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OfferDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "OfferDetails")
    public JAXBElement<OfferDetailsType> createOfferDetails(OfferDetailsType value) {
        return new JAXBElement<OfferDetailsType>(_OfferDetails_QNAME, OfferDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvoiceItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "RefundItemDetails")
    public JAXBElement<InvoiceItemType> createRefundItemDetails(InvoiceItemType value) {
        return new JAXBElement<InvoiceItemType>(_RefundItemDetails_QNAME, InvoiceItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoExpressCheckoutPaymentResponseDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "DoExpressCheckoutPaymentResponseDetails")
    public JAXBElement<DoExpressCheckoutPaymentResponseDetailsType> createDoExpressCheckoutPaymentResponseDetails(DoExpressCheckoutPaymentResponseDetailsType value) {
        return new JAXBElement<DoExpressCheckoutPaymentResponseDetailsType>(_DoExpressCheckoutPaymentResponseDetails_QNAME, DoExpressCheckoutPaymentResponseDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBoardingDetailsResponseDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "GetBoardingDetailsResponseDetails")
    public JAXBElement<GetBoardingDetailsResponseDetailsType> createGetBoardingDetailsResponseDetails(GetBoardingDetailsResponseDetailsType value) {
        return new JAXBElement<GetBoardingDetailsResponseDetailsType>(_GetBoardingDetailsResponseDetails_QNAME, GetBoardingDetailsResponseDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoNonReferencedCreditResponseDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "DoNonReferencedCreditResponseDetails")
    public JAXBElement<DoNonReferencedCreditResponseDetailsType> createDoNonReferencedCreditResponseDetails(DoNonReferencedCreditResponseDetailsType value) {
        return new JAXBElement<DoNonReferencedCreditResponseDetailsType>(_DoNonReferencedCreditResponseDetails_QNAME, DoNonReferencedCreditResponseDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BillOutstandingAmountRequestDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "BillOutstandingAmountRequestDetails")
    public JAXBElement<BillOutstandingAmountRequestDetailsType> createBillOutstandingAmountRequestDetails(BillOutstandingAmountRequestDetailsType value) {
        return new JAXBElement<BillOutstandingAmountRequestDetailsType>(_BillOutstandingAmountRequestDetails_QNAME, BillOutstandingAmountRequestDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetIncentiveEvaluationResponseDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "GetIncentiveEvaluationResponseDetails")
    public JAXBElement<GetIncentiveEvaluationResponseDetailsType> createGetIncentiveEvaluationResponseDetails(GetIncentiveEvaluationResponseDetailsType value) {
        return new JAXBElement<GetIncentiveEvaluationResponseDetailsType>(_GetIncentiveEvaluationResponseDetails_QNAME, GetIncentiveEvaluationResponseDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaxInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "TaxInfo")
    public JAXBElement<TaxInfoType> createTaxInfo(TaxInfoType value) {
        return new JAXBElement<TaxInfoType>(_TaxInfo_QNAME, TaxInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CategoryArrayType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "CategoryArray")
    public JAXBElement<CategoryArrayType> createCategoryArray(CategoryArrayType value) {
        return new JAXBElement<CategoryArrayType>(_CategoryArray_QNAME, CategoryArrayType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MerchantStoreDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "MerchantStoreDetails")
    public JAXBElement<MerchantStoreDetailsType> createMerchantStoreDetails(MerchantStoreDetailsType value) {
        return new JAXBElement<MerchantStoreDetailsType>(_MerchantStoreDetails_QNAME, MerchantStoreDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountSummaryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "AccountSummary")
    public JAXBElement<AccountSummaryType> createAccountSummary(AccountSummaryType value) {
        return new JAXBElement<AccountSummaryType>(_AccountSummary_QNAME, AccountSummaryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateRecurringPaymentsProfileRequestDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "CreateRecurringPaymentsProfileRequestDetails")
    public JAXBElement<CreateRecurringPaymentsProfileRequestDetailsType> createCreateRecurringPaymentsProfileRequestDetails(CreateRecurringPaymentsProfileRequestDetailsType value) {
        return new JAXBElement<CreateRecurringPaymentsProfileRequestDetailsType>(_CreateRecurringPaymentsProfileRequestDetails_QNAME, CreateRecurringPaymentsProfileRequestDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "TransactionID")
    public JAXBElement<String> createTransactionID(String value) {
        return new JAXBElement<String>(_TransactionID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoReferenceTransactionResponseDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "DoReferenceTransactionResponseDetails")
    public JAXBElement<DoReferenceTransactionResponseDetailsType> createDoReferenceTransactionResponseDetails(DoReferenceTransactionResponseDetailsType value) {
        return new JAXBElement<DoReferenceTransactionResponseDetailsType>(_DoReferenceTransactionResponseDetails_QNAME, DoReferenceTransactionResponseDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "ReceiptID")
    public JAXBElement<String> createReceiptID(String value) {
        return new JAXBElement<String>(_ReceiptID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BillOutstandingAmountResponseDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "BillOutstandingAmountResponseDetails")
    public JAXBElement<BillOutstandingAmountResponseDetailsType> createBillOutstandingAmountResponseDetails(BillOutstandingAmountResponseDetailsType value) {
        return new JAXBElement<BillOutstandingAmountResponseDetailsType>(_BillOutstandingAmountResponseDetails_QNAME, BillOutstandingAmountResponseDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentTransactionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "PaymentTransactionDetails")
    public JAXBElement<PaymentTransactionType> createPaymentTransactionDetails(PaymentTransactionType value) {
        return new JAXBElement<PaymentTransactionType>(_PaymentTransactionDetails_QNAME, PaymentTransactionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "CheckoutEnabled")
    public JAXBElement<Boolean> createCheckoutEnabled(Boolean value) {
        return new JAXBElement<Boolean>(_CheckoutEnabled_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateRecurringPaymentsProfileResponseDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "UpdateRecurringPaymentsProfileResponseDetails")
    public JAXBElement<UpdateRecurringPaymentsProfileResponseDetailsType> createUpdateRecurringPaymentsProfileResponseDetails(UpdateRecurringPaymentsProfileResponseDetailsType value) {
        return new JAXBElement<UpdateRecurringPaymentsProfileResponseDetailsType>(_UpdateRecurringPaymentsProfileResponseDetails_QNAME, UpdateRecurringPaymentsProfileResponseDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetAuthFlowParamRequestDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "SetAuthFlowParamRequestDetails")
    public JAXBElement<SetAuthFlowParamRequestDetailsType> createSetAuthFlowParamRequestDetails(SetAuthFlowParamRequestDetailsType value) {
        return new JAXBElement<SetAuthFlowParamRequestDetailsType>(_SetAuthFlowParamRequestDetails_QNAME, SetAuthFlowParamRequestDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMobileStatusRequestDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "GetMobileStatusRequestDetails")
    public JAXBElement<GetMobileStatusRequestDetailsType> createGetMobileStatusRequestDetails(GetMobileStatusRequestDetailsType value) {
        return new JAXBElement<GetMobileStatusRequestDetailsType>(_GetMobileStatusRequestDetails_QNAME, GetMobileStatusRequestDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccessPermissionDetailsResponseDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "GetAccessPermissionDetailsResponseDetails")
    public JAXBElement<GetAccessPermissionDetailsResponseDetailsType> createGetAccessPermissionDetailsResponseDetails(GetAccessPermissionDetailsResponseDetailsType value) {
        return new JAXBElement<GetAccessPermissionDetailsResponseDetailsType>(_GetAccessPermissionDetailsResponseDetails_QNAME, GetAccessPermissionDetailsResponseDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "StoreCategoryID")
    public JAXBElement<Integer> createStoreCategoryID(Integer value) {
        return new JAXBElement<Integer>(_StoreCategoryID_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemTrackingDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "ItemTrackingDetails")
    public JAXBElement<ItemTrackingDetailsType> createItemTrackingDetails(ItemTrackingDetailsType value) {
        return new JAXBElement<ItemTrackingDetailsType>(_ItemTrackingDetails_QNAME, ItemTrackingDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateRecurringPaymentsProfileResponseDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "CreateRecurringPaymentsProfileResponseDetails")
    public JAXBElement<CreateRecurringPaymentsProfileResponseDetailsType> createCreateRecurringPaymentsProfileResponseDetails(CreateRecurringPaymentsProfileResponseDetailsType value) {
        return new JAXBElement<CreateRecurringPaymentsProfileResponseDetailsType>(_CreateRecurringPaymentsProfileResponseDetails_QNAME, CreateRecurringPaymentsProfileResponseDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "RegionID")
    public JAXBElement<String> createRegionID(String value) {
        return new JAXBElement<String>(_RegionID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateRecurringPaymentsProfileRequestDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "UpdateRecurringPaymentsProfileRequestDetails")
    public JAXBElement<UpdateRecurringPaymentsProfileRequestDetailsType> createUpdateRecurringPaymentsProfileRequestDetails(UpdateRecurringPaymentsProfileRequestDetailsType value) {
        return new JAXBElement<UpdateRecurringPaymentsProfileRequestDetailsType>(_UpdateRecurringPaymentsProfileRequestDetails_QNAME, UpdateRecurringPaymentsProfileRequestDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAuthDetailsResponseDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "GetAuthDetailsResponseDetails")
    public JAXBElement<GetAuthDetailsResponseDetailsType> createGetAuthDetailsResponseDetails(GetAuthDetailsResponseDetailsType value) {
        return new JAXBElement<GetAuthDetailsResponseDetailsType>(_GetAuthDetailsResponseDetails_QNAME, GetAuthDetailsResponseDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuyerPaymentMethodCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "PaymentMethods")
    public JAXBElement<BuyerPaymentMethodCodeType> createPaymentMethods(BuyerPaymentMethodCodeType value) {
        return new JAXBElement<BuyerPaymentMethodCodeType>(_PaymentMethods_QNAME, BuyerPaymentMethodCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthorizationInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "AuthorizationInfo")
    public JAXBElement<AuthorizationInfoType> createAuthorizationInfo(AuthorizationInfoType value) {
        return new JAXBElement<AuthorizationInfoType>(_AuthorizationInfo_QNAME, AuthorizationInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SellerLevelCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "SellerLevel")
    public JAXBElement<SellerLevelCodeType> createSellerLevel(SellerLevelCodeType value) {
        return new JAXBElement<SellerLevelCodeType>(_SellerLevel_QNAME, SellerLevelCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetIncentiveEvaluationRequestDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "GetIncentiveEvaluationRequestDetails")
    public JAXBElement<GetIncentiveEvaluationRequestDetailsType> createGetIncentiveEvaluationRequestDetails(GetIncentiveEvaluationRequestDetailsType value) {
        return new JAXBElement<GetIncentiveEvaluationRequestDetailsType>(_GetIncentiveEvaluationRequestDetails_QNAME, GetIncentiveEvaluationRequestDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReverseTransactionResponseDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "ReverseTransactionResponseDetails")
    public JAXBElement<ReverseTransactionResponseDetailsType> createReverseTransactionResponseDetails(ReverseTransactionResponseDetailsType value) {
        return new JAXBElement<ReverseTransactionResponseDetailsType>(_ReverseTransactionResponseDetails_QNAME, ReverseTransactionResponseDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "AmountPaid")
    public JAXBElement<AmountType> createAmountPaid(AmountType value) {
        return new JAXBElement<AmountType>(_AmountPaid_QNAME, AmountType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnterBoardingRequestDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "EnterBoardingRequestDetails")
    public JAXBElement<EnterBoardingRequestDetailsType> createEnterBoardingRequestDetails(EnterBoardingRequestDetailsType value) {
        return new JAXBElement<EnterBoardingRequestDetailsType>(_EnterBoardingRequestDetails_QNAME, EnterBoardingRequestDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListingDurationCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "ListingDuration")
    public JAXBElement<ListingDurationCodeType> createListingDuration(ListingDurationCodeType value) {
        return new JAXBElement<ListingDurationCodeType>(_ListingDuration_QNAME, ListingDurationCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetMobileCheckoutRequestDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "SetMobileCheckoutRequestDetails")
    public JAXBElement<SetMobileCheckoutRequestDetailsType> createSetMobileCheckoutRequestDetails(SetMobileCheckoutRequestDetailsType value) {
        return new JAXBElement<SetMobileCheckoutRequestDetailsType>(_SetMobileCheckoutRequestDetails_QNAME, SetMobileCheckoutRequestDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "User")
    public JAXBElement<UserType> createUser(UserType value) {
        return new JAXBElement<UserType>(_User_QNAME, UserType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoMobileCheckoutPaymentResponseDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "DoMobileCheckoutPaymentResponseDetails")
    public JAXBElement<DoMobileCheckoutPaymentResponseDetailsType> createDoMobileCheckoutPaymentResponseDetails(DoMobileCheckoutPaymentResponseDetailsType value) {
        return new JAXBElement<DoMobileCheckoutPaymentResponseDetailsType>(_DoMobileCheckoutPaymentResponseDetails_QNAME, DoMobileCheckoutPaymentResponseDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "AccountCode")
    public JAXBElement<String> createAccountCode(String value) {
        return new JAXBElement<String>(_AccountCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UATPDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "UATPDetails")
    public JAXBElement<UATPDetailsType> createUATPDetails(UATPDetailsType value) {
        return new JAXBElement<UATPDetailsType>(_UATPDetails_QNAME, UATPDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReviseStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "ReviseStatus")
    public JAXBElement<ReviseStatusType> createReviseStatus(ReviseStatusType value) {
        return new JAXBElement<ReviseStatusType>(_ReviseStatus_QNAME, ReviseStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "ShippingAddress")
    public JAXBElement<AddressType> createShippingAddress(AddressType value) {
        return new JAXBElement<AddressType>(_ShippingAddress_QNAME, AddressType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentMeansType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "PaymentMeans")
    public JAXBElement<PaymentMeansType> createPaymentMeans(PaymentMeansType value) {
        return new JAXBElement<PaymentMeansType>(_PaymentMeans_QNAME, PaymentMeansType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "Item")
    public JAXBElement<ItemType> createItem(ItemType value) {
        return new JAXBElement<ItemType>(_Item_QNAME, ItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountryCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "Country")
    public JAXBElement<CountryCodeType> createCountry(CountryCodeType value) {
        return new JAXBElement<CountryCodeType>(_Country_QNAME, CountryCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ThreeDSecureRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "ThreeDSecureRequest")
    public JAXBElement<ThreeDSecureRequestType> createThreeDSecureRequest(ThreeDSecureRequestType value) {
        return new JAXBElement<ThreeDSecureRequestType>(_ThreeDSecureRequest_QNAME, ThreeDSecureRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MerchantPullPaymentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "MerchantPullPaymentDetails")
    public JAXBElement<MerchantPullPaymentType> createMerchantPullPaymentDetails(MerchantPullPaymentType value) {
        return new JAXBElement<MerchantPullPaymentType>(_MerchantPullPaymentDetails_QNAME, MerchantPullPaymentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaginationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "Pagination")
    public JAXBElement<PaginationType> createPagination(PaginationType value) {
        return new JAXBElement<PaginationType>(_Pagination_QNAME, PaginationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditCardDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "CreditCardInfo")
    public JAXBElement<CreditCardDetailsType> createCreditCardInfo(CreditCardDetailsType value) {
        return new JAXBElement<CreditCardDetailsType>(_CreditCardInfo_QNAME, CreditCardDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetExpressCheckoutDetailsResponseDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "GetExpressCheckoutDetailsResponseDetails")
    public JAXBElement<GetExpressCheckoutDetailsResponseDetailsType> createGetExpressCheckoutDetailsResponseDetails(GetExpressCheckoutDetailsResponseDetailsType value) {
        return new JAXBElement<GetExpressCheckoutDetailsResponseDetailsType>(_GetExpressCheckoutDetailsResponseDetails_QNAME, GetExpressCheckoutDetailsResponseDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ButtonSearchResultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "ButtonSearchResult")
    public JAXBElement<ButtonSearchResultType> createButtonSearchResult(ButtonSearchResultType value) {
        return new JAXBElement<ButtonSearchResultType>(_ButtonSearchResult_QNAME, ButtonSearchResultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "InsuranceFee")
    public JAXBElement<AmountType> createInsuranceFee(AmountType value) {
        return new JAXBElement<AmountType>(_InsuranceFee_QNAME, AmountType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaginationResultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "PaginationResult")
    public JAXBElement<PaginationResultType> createPaginationResult(PaginationResultType value) {
        return new JAXBElement<PaginationResultType>(_PaginationResult_QNAME, PaginationResultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "CurrentBalance")
    public JAXBElement<AmountType> createCurrentBalance(AmountType value) {
        return new JAXBElement<AmountType>(_CurrentBalance_QNAME, AmountType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "Email")
    public JAXBElement<String> createEmail(String value) {
        return new JAXBElement<String>(_Email_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "UserID")
    public JAXBElement<String> createUserID(String value) {
        return new JAXBElement<String>(_UserID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AirlineItineraryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "AirlineItinerary")
    public JAXBElement<AirlineItineraryType> createAirlineItinerary(AirlineItineraryType value) {
        return new JAXBElement<AirlineItineraryType>(_AirlineItinerary_QNAME, AirlineItineraryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ThreeDSecureInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "ThreeDSecureDetails")
    public JAXBElement<ThreeDSecureInfoType> createThreeDSecureDetails(ThreeDSecureInfoType value) {
        return new JAXBElement<ThreeDSecureInfoType>(_ThreeDSecureDetails_QNAME, ThreeDSecureInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentTransactionSearchResultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "PaymentTransactions")
    public JAXBElement<PaymentTransactionSearchResultType> createPaymentTransactions(PaymentTransactionSearchResultType value) {
        return new JAXBElement<PaymentTransactionSearchResultType>(_PaymentTransactions_QNAME, PaymentTransactionSearchResultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManageRecurringPaymentsProfileStatusRequestDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "ManageRecurringPaymentsProfileStatusRequestDetails")
    public JAXBElement<ManageRecurringPaymentsProfileStatusRequestDetailsType> createManageRecurringPaymentsProfileStatusRequestDetails(ManageRecurringPaymentsProfileStatusRequestDetailsType value) {
        return new JAXBElement<ManageRecurringPaymentsProfileStatusRequestDetailsType>(_ManageRecurringPaymentsProfileStatusRequestDetails_QNAME, ManageRecurringPaymentsProfileStatusRequestDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "AuthorizationID")
    public JAXBElement<String> createAuthorizationID(String value) {
        return new JAXBElement<String>(_AuthorizationID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "StoreURL")
    public JAXBElement<String> createStoreURL(String value) {
        return new JAXBElement<String>(_StoreURL_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoCaptureResponseDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "DoCaptureResponseDetails")
    public JAXBElement<DoCaptureResponseDetailsType> createDoCaptureResponseDetails(DoCaptureResponseDetailsType value) {
        return new JAXBElement<DoCaptureResponseDetailsType>(_DoCaptureResponseDetails_QNAME, DoCaptureResponseDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetAccessPermissionsRequestDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "SetAccessPermissionsRequestDetails")
    public JAXBElement<SetAccessPermissionsRequestDetailsType> createSetAccessPermissionsRequestDetails(SetAccessPermissionsRequestDetailsType value) {
        return new JAXBElement<SetAccessPermissionsRequestDetailsType>(_SetAccessPermissionsRequestDetails_QNAME, SetAccessPermissionsRequestDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShippingDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "ShippingDetails")
    public JAXBElement<ShippingDetailsType> createShippingDetails(ShippingDetailsType value) {
        return new JAXBElement<ShippingDetailsType>(_ShippingDetails_QNAME, ShippingDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "UUID")
    public JAXBElement<String> createUUID(String value) {
        return new JAXBElement<String>(_UUID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "CountryName")
    public JAXBElement<String> createCountryName(String value) {
        return new JAXBElement<String>(_CountryName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OptionTrackingDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "OptionTrackingDetails")
    public JAXBElement<OptionTrackingDetailsType> createOptionTrackingDetails(OptionTrackingDetailsType value) {
        return new JAXBElement<OptionTrackingDetailsType>(_OptionTrackingDetails_QNAME, OptionTrackingDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SellingStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "SellingStatus")
    public JAXBElement<SellingStatusType> createSellingStatus(SellingStatusType value) {
        return new JAXBElement<SellingStatusType>(_SellingStatus_QNAME, SellingStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShippingTermsCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "ShippingTerm")
    public JAXBElement<ShippingTermsCodeType> createShippingTerm(ShippingTermsCodeType value) {
        return new JAXBElement<ShippingTermsCodeType>(_ShippingTerm_QNAME, ShippingTermsCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReverseTransactionRequestDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "ReverseTransactionRequestDetails")
    public JAXBElement<ReverseTransactionRequestDetailsType> createReverseTransactionRequestDetails(ReverseTransactionRequestDetailsType value) {
        return new JAXBElement<ReverseTransactionRequestDetailsType>(_ReverseTransactionRequestDetails_QNAME, ReverseTransactionRequestDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MerchantPullPaymentResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "BillUserResponseDetails")
    public JAXBElement<MerchantPullPaymentResponseType> createBillUserResponseDetails(MerchantPullPaymentResponseType value) {
        return new JAXBElement<MerchantPullPaymentResponseType>(_BillUserResponseDetails_QNAME, MerchantPullPaymentResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "Balance")
    public JAXBElement<AmountType> createBalance(AmountType value) {
        return new JAXBElement<AmountType>(_Balance_QNAME, AmountType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "HighBidder")
    public JAXBElement<UserType> createHighBidder(UserType value) {
        return new JAXBElement<UserType>(_HighBidder_QNAME, UserType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "SubscriptionID")
    public JAXBElement<String> createSubscriptionID(String value) {
        return new JAXBElement<String>(_SubscriptionID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemArrayType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "ItemArray")
    public JAXBElement<ItemArrayType> createItemArray(ItemArrayType value) {
        return new JAXBElement<ItemArrayType>(_ItemArray_QNAME, ItemArrayType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "FeedbackScore")
    public JAXBElement<Integer> createFeedbackScore(Integer value) {
        return new JAXBElement<Integer>(_FeedbackScore_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "EbayTransactionID")
    public JAXBElement<String> createEbayTransactionID(String value) {
        return new JAXBElement<String>(_EbayTransactionID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "Seller")
    public JAXBElement<UserType> createSeller(UserType value) {
        return new JAXBElement<UserType>(_Seller_QNAME, UserType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SiteCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "Site")
    public JAXBElement<SiteCodeType> createSite(SiteCodeType value) {
        return new JAXBElement<SiteCodeType>(_Site_QNAME, SiteCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "Buyer")
    public JAXBElement<UserType> createBuyer(UserType value) {
        return new JAXBElement<UserType>(_Buyer_QNAME, UserType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link APIType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "APIType")
    public JAXBElement<APIType> createAPIType(APIType value) {
        return new JAXBElement<APIType>(_APIType_QNAME, APIType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BAUpdateResponseDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "BAUpdateResponseDetails")
    public JAXBElement<BAUpdateResponseDetailsType> createBAUpdateResponseDetails(BAUpdateResponseDetailsType value) {
        return new JAXBElement<BAUpdateResponseDetailsType>(_BAUpdateResponseDetails_QNAME, BAUpdateResponseDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "AmountPastDue")
    public JAXBElement<AmountType> createAmountPastDue(AmountType value) {
        return new JAXBElement<AmountType>(_AmountPastDue_QNAME, AmountType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InstrumentDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "InstrumentDetails")
    public JAXBElement<InstrumentDetailsType> createInstrumentDetails(InstrumentDetailsType value) {
        return new JAXBElement<InstrumentDetailsType>(_InstrumentDetails_QNAME, InstrumentDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "PaymentType")
    public JAXBElement<PaymentType> createPaymentType(PaymentType value) {
        return new JAXBElement<PaymentType>(_PaymentType_QNAME, PaymentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateMobilePaymentRequestDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "CreateMobilePaymentRequestDetails")
    public JAXBElement<CreateMobilePaymentRequestDetailsType> createCreateMobilePaymentRequestDetails(CreateMobilePaymentRequestDetailsType value) {
        return new JAXBElement<CreateMobilePaymentRequestDetailsType>(_CreateMobilePaymentRequestDetails_QNAME, CreateMobilePaymentRequestDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoExpressCheckoutPaymentRequestDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "DoExpressCheckoutPaymentRequestDetails")
    public JAXBElement<DoExpressCheckoutPaymentRequestDetailsType> createDoExpressCheckoutPaymentRequestDetails(DoExpressCheckoutPaymentRequestDetailsType value) {
        return new JAXBElement<DoExpressCheckoutPaymentRequestDetailsType>(_DoExpressCheckoutPaymentRequestDetails_QNAME, DoExpressCheckoutPaymentRequestDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "ItemID")
    public JAXBElement<String> createItemID(String value) {
        return new JAXBElement<String>(_ItemID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoDirectPaymentRequestDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "DoDirectPaymentRequestDetails")
    public JAXBElement<DoDirectPaymentRequestDetailsType> createDoDirectPaymentRequestDetails(DoDirectPaymentRequestDetailsType value) {
        return new JAXBElement<DoDirectPaymentRequestDetailsType>(_DoDirectPaymentRequestDetails_QNAME, DoDirectPaymentRequestDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RefundType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "RefundType")
    public JAXBElement<RefundType> createRefundType(RefundType value) {
        return new JAXBElement<RefundType>(_RefundType_QNAME, RefundType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShippingRegionCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "ShippingRegions")
    public JAXBElement<ShippingRegionCodeType> createShippingRegions(ShippingRegionCodeType value) {
        return new JAXBElement<ShippingRegionCodeType>(_ShippingRegions_QNAME, ShippingRegionCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "Region")
    public JAXBElement<String> createRegion(String value) {
        return new JAXBElement<String>(_Region_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FeesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "Fees")
    public JAXBElement<FeesType> createFees(FeesType value) {
        return new JAXBElement<FeesType>(_Fees_QNAME, FeesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoReferenceTransactionRequestDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "DoReferenceTransactionRequestDetails")
    public JAXBElement<DoReferenceTransactionRequestDetailsType> createDoReferenceTransactionRequestDetails(DoReferenceTransactionRequestDetailsType value) {
        return new JAXBElement<DoReferenceTransactionRequestDetailsType>(_DoReferenceTransactionRequestDetails_QNAME, DoReferenceTransactionRequestDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetExpressCheckoutRequestDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "SetExpressCheckoutRequestDetails")
    public JAXBElement<SetExpressCheckoutRequestDetailsType> createSetExpressCheckoutRequestDetails(SetExpressCheckoutRequestDetailsType value) {
        return new JAXBElement<SetExpressCheckoutRequestDetailsType>(_SetExpressCheckoutRequestDetails_QNAME, SetExpressCheckoutRequestDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErrorType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "Error")
    public JAXBElement<ErrorType> createError(ErrorType value) {
        return new JAXBElement<ErrorType>(_Error_QNAME, ErrorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransactionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "Transaction")
    public JAXBElement<TransactionType> createTransaction(TransactionType value) {
        return new JAXBElement<TransactionType>(_Transaction_QNAME, TransactionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsuranceOptionCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "InsuranceOption")
    public JAXBElement<InsuranceOptionCodeType> createInsuranceOption(InsuranceOptionCodeType value) {
        return new JAXBElement<InsuranceOptionCodeType>(_InsuranceOption_QNAME, InsuranceOptionCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetEbayMobileCheckoutRequestDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "SetEbayMobileCheckoutRequestDetails")
    public JAXBElement<SetEbayMobileCheckoutRequestDetailsType> createSetEbayMobileCheckoutRequestDetails(SetEbayMobileCheckoutRequestDetailsType value) {
        return new JAXBElement<SetEbayMobileCheckoutRequestDetailsType>(_SetEbayMobileCheckoutRequestDetails_QNAME, SetEbayMobileCheckoutRequestDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CategoryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "Category")
    public JAXBElement<CategoryType> createCategory(CategoryType value) {
        return new JAXBElement<CategoryType>(_Category_QNAME, CategoryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBillingAgreementCustomerDetailsResponseDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "GetBillingAgreementCustomerDetailsResponseDetails")
    public JAXBElement<GetBillingAgreementCustomerDetailsResponseDetailsType> createGetBillingAgreementCustomerDetailsResponseDetails(GetBillingAgreementCustomerDetailsResponseDetailsType value) {
        return new JAXBElement<GetBillingAgreementCustomerDetailsResponseDetailsType>(_GetBillingAgreementCustomerDetailsResponseDetails_QNAME, GetBillingAgreementCustomerDetailsResponseDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SellerPaymentMethodCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "PaymentMethod", scope = AccountSummaryType.class)
    public JAXBElement<SellerPaymentMethodCodeType> createAccountSummaryTypePaymentMethod(SellerPaymentMethodCodeType value) {
        return new JAXBElement<SellerPaymentMethodCodeType>(_AccountSummaryTypePaymentMethod_QNAME, SellerPaymentMethodCodeType.class, AccountSummaryType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdditionalAccountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "AdditionalAccount", scope = AccountSummaryType.class)
    public JAXBElement<AdditionalAccountType> createAccountSummaryTypeAdditionalAccount(AdditionalAccountType value) {
        return new JAXBElement<AdditionalAccountType>(_AccountSummaryTypeAdditionalAccount_QNAME, AdditionalAccountType.class, AccountSummaryType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "CCExp", scope = AccountSummaryType.class)
    public JAXBElement<XMLGregorianCalendar> createAccountSummaryTypeCCExp(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AccountSummaryTypeCCExp_QNAME, XMLGregorianCalendar.class, AccountSummaryType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "PastDue", scope = AccountSummaryType.class)
    public JAXBElement<Boolean> createAccountSummaryTypePastDue(Boolean value) {
        return new JAXBElement<Boolean>(_AccountSummaryTypePastDue_QNAME, Boolean.class, AccountSummaryType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "AdditionalAccountsCount", scope = AccountSummaryType.class)
    public JAXBElement<Integer> createAccountSummaryTypeAdditionalAccountsCount(Integer value) {
        return new JAXBElement<Integer>(_AccountSummaryTypeAdditionalAccountsCount_QNAME, Integer.class, AccountSummaryType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "CCModifyDate", scope = AccountSummaryType.class)
    public JAXBElement<XMLGregorianCalendar> createAccountSummaryTypeCCModifyDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AccountSummaryTypeCCModifyDate_QNAME, XMLGregorianCalendar.class, AccountSummaryType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "LastInvoiceAmount", scope = AccountSummaryType.class)
    public JAXBElement<AmountType> createAccountSummaryTypeLastInvoiceAmount(AmountType value) {
        return new JAXBElement<AmountType>(_AccountSummaryTypeLastInvoiceAmount_QNAME, AmountType.class, AccountSummaryType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "BillingCycleDate", scope = AccountSummaryType.class)
    public JAXBElement<XMLGregorianCalendar> createAccountSummaryTypeBillingCycleDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AccountSummaryTypeBillingCycleDate_QNAME, XMLGregorianCalendar.class, AccountSummaryType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "BankModifyDate", scope = AccountSummaryType.class)
    public JAXBElement<XMLGregorianCalendar> createAccountSummaryTypeBankModifyDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AccountSummaryTypeBankModifyDate_QNAME, XMLGregorianCalendar.class, AccountSummaryType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "CCInfo", scope = AccountSummaryType.class)
    public JAXBElement<String> createAccountSummaryTypeCCInfo(String value) {
        return new JAXBElement<String>(_AccountSummaryTypeCCInfo_QNAME, String.class, AccountSummaryType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountStateCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "AccountState", scope = AccountSummaryType.class)
    public JAXBElement<AccountStateCodeType> createAccountSummaryTypeAccountState(AccountStateCodeType value) {
        return new JAXBElement<AccountStateCodeType>(_AccountSummaryTypeAccountState_QNAME, AccountStateCodeType.class, AccountSummaryType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "LastAmountPaid", scope = AccountSummaryType.class)
    public JAXBElement<AmountType> createAccountSummaryTypeLastAmountPaid(AmountType value) {
        return new JAXBElement<AmountType>(_AccountSummaryTypeLastAmountPaid_QNAME, AmountType.class, AccountSummaryType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "BankAccountInfo", scope = AccountSummaryType.class)
    public JAXBElement<String> createAccountSummaryTypeBankAccountInfo(String value) {
        return new JAXBElement<String>(_AccountSummaryTypeBankAccountInfo_QNAME, String.class, AccountSummaryType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "LastInvoiceDate", scope = AccountSummaryType.class)
    public JAXBElement<XMLGregorianCalendar> createAccountSummaryTypeLastInvoiceDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AccountSummaryTypeLastInvoiceDate_QNAME, XMLGregorianCalendar.class, AccountSummaryType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "LastPaymentDate", scope = AccountSummaryType.class)
    public JAXBElement<XMLGregorianCalendar> createAccountSummaryTypeLastPaymentDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AccountSummaryTypeLastPaymentDate_QNAME, XMLGregorianCalendar.class, AccountSummaryType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "ReverseTransactionID", scope = ReverseTransactionResponseDetailsType.class)
    public JAXBElement<String> createReverseTransactionResponseDetailsTypeReverseTransactionID(String value) {
        return new JAXBElement<String>(_ReverseTransactionResponseDetailsTypeReverseTransactionID_QNAME, String.class, ReverseTransactionResponseDetailsType.class, value);
    }

}
