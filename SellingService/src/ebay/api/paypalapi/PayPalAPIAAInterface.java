package ebay.api.paypalapi;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.7.3
 * 2013-05-22T17:22:02.091+02:00
 * Generated source version: 2.7.3
 * 
 */
@WebService(targetNamespace = "urn:ebay:api:PayPalAPI", name = "PayPalAPIAAInterface")
@XmlSeeAlso({ebay.apis.eblbasecomponents.ObjectFactory.class, ObjectFactory.class, ebay.apis.enhanceddatatypes.ObjectFactory.class, ebay.apis.corecomponenttypes.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface PayPalAPIAAInterface {

    @WebResult(name = "BillOutstandingAmountResponse", targetNamespace = "urn:ebay:api:PayPalAPI", partName = "BillOutstandingAmountResponse")
    @WebMethod(operationName = "BillOutstandingAmount")
    public BillOutstandingAmountResponseType billOutstandingAmount(
        @WebParam(partName = "BillOutstandingAmountRequest", name = "BillOutstandingAmountReq", targetNamespace = "urn:ebay:api:PayPalAPI")
        BillOutstandingAmountReq billOutstandingAmountRequest,
        @WebParam(partName = "RequesterCredentials", mode = WebParam.Mode.INOUT, name = "RequesterCredentials", targetNamespace = "urn:ebay:api:PayPalAPI", header = true)
        javax.xml.ws.Holder<ebay.apis.eblbasecomponents.CustomSecurityHeaderType> requesterCredentials
    );

    @WebResult(name = "DoCancelResponse", targetNamespace = "urn:ebay:api:PayPalAPI", partName = "DoCancelResponse")
    @WebMethod(operationName = "DoCancel")
    public DoCancelResponseType doCancel(
        @WebParam(partName = "DoCancelRequest", name = "DoCancelReq", targetNamespace = "urn:ebay:api:PayPalAPI")
        DoCancelReq doCancelRequest,
        @WebParam(partName = "RequesterCredentials", mode = WebParam.Mode.INOUT, name = "RequesterCredentials", targetNamespace = "urn:ebay:api:PayPalAPI", header = true)
        javax.xml.ws.Holder<ebay.apis.eblbasecomponents.CustomSecurityHeaderType> requesterCredentials
    );

    @WebResult(name = "DoExpressCheckoutPaymentResponse", targetNamespace = "urn:ebay:api:PayPalAPI", partName = "DoExpressCheckoutPaymentResponse")
    @WebMethod(operationName = "DoExpressCheckoutPayment")
    public DoExpressCheckoutPaymentResponseType doExpressCheckoutPayment(
        @WebParam(partName = "DoExpressCheckoutPaymentRequest", name = "DoExpressCheckoutPaymentReq", targetNamespace = "urn:ebay:api:PayPalAPI")
        DoExpressCheckoutPaymentReq doExpressCheckoutPaymentRequest,
        @WebParam(partName = "RequesterCredentials", mode = WebParam.Mode.INOUT, name = "RequesterCredentials", targetNamespace = "urn:ebay:api:PayPalAPI", header = true)
        javax.xml.ws.Holder<ebay.apis.eblbasecomponents.CustomSecurityHeaderType> requesterCredentials
    );

    @WebResult(name = "SetCustomerBillingAgreementResponse", targetNamespace = "urn:ebay:api:PayPalAPI", partName = "SetCustomerBillingAgreementResponse")
    @WebMethod(operationName = "SetCustomerBillingAgreement")
    public SetCustomerBillingAgreementResponseType setCustomerBillingAgreement(
        @WebParam(partName = "SetCustomerBillingAgreementRequest", name = "SetCustomerBillingAgreementReq", targetNamespace = "urn:ebay:api:PayPalAPI")
        SetCustomerBillingAgreementReq setCustomerBillingAgreementRequest,
        @WebParam(partName = "RequesterCredentials", mode = WebParam.Mode.INOUT, name = "RequesterCredentials", targetNamespace = "urn:ebay:api:PayPalAPI", header = true)
        javax.xml.ws.Holder<ebay.apis.eblbasecomponents.CustomSecurityHeaderType> requesterCredentials
    );

    @WebResult(name = "SetAccessPermissionsResponse", targetNamespace = "urn:ebay:api:PayPalAPI", partName = "SetAccessPermissionsResponse")
    @WebMethod(operationName = "SetAccessPermissions")
    public SetAccessPermissionsResponseType setAccessPermissions(
        @WebParam(partName = "SetAccessPermissionsRequest", name = "SetAccessPermissionsReq", targetNamespace = "urn:ebay:api:PayPalAPI")
        SetAccessPermissionsReq setAccessPermissionsRequest,
        @WebParam(partName = "RequesterCredentials", mode = WebParam.Mode.INOUT, name = "RequesterCredentials", targetNamespace = "urn:ebay:api:PayPalAPI", header = true)
        javax.xml.ws.Holder<ebay.apis.eblbasecomponents.CustomSecurityHeaderType> requesterCredentials
    );

    @WebResult(name = "GetBillingAgreementCustomerDetailsResponse", targetNamespace = "urn:ebay:api:PayPalAPI", partName = "GetBillingAgreementCustomerDetailsResponse")
    @WebMethod(operationName = "GetBillingAgreementCustomerDetails")
    public GetBillingAgreementCustomerDetailsResponseType getBillingAgreementCustomerDetails(
        @WebParam(partName = "GetBillingAgreementCustomerDetailsRequest", name = "GetBillingAgreementCustomerDetailsReq", targetNamespace = "urn:ebay:api:PayPalAPI")
        GetBillingAgreementCustomerDetailsReq getBillingAgreementCustomerDetailsRequest,
        @WebParam(partName = "RequesterCredentials", mode = WebParam.Mode.INOUT, name = "RequesterCredentials", targetNamespace = "urn:ebay:api:PayPalAPI", header = true)
        javax.xml.ws.Holder<ebay.apis.eblbasecomponents.CustomSecurityHeaderType> requesterCredentials
    );

    @WebResult(name = "SetExpressCheckoutResponse", targetNamespace = "urn:ebay:api:PayPalAPI", partName = "SetExpressCheckoutResponse")
    @WebMethod(operationName = "SetExpressCheckout")
    public SetExpressCheckoutResponseType setExpressCheckout(
        @WebParam(partName = "SetExpressCheckoutRequest", name = "SetExpressCheckoutReq", targetNamespace = "urn:ebay:api:PayPalAPI")
        SetExpressCheckoutReq setExpressCheckoutRequest,
        @WebParam(partName = "RequesterCredentials", mode = WebParam.Mode.INOUT, name = "RequesterCredentials", targetNamespace = "urn:ebay:api:PayPalAPI", header = true)
        javax.xml.ws.Holder<ebay.apis.eblbasecomponents.CustomSecurityHeaderType> requesterCredentials
    );

    @WebResult(name = "GetRecurringPaymentsProfileDetailsResponse", targetNamespace = "urn:ebay:api:PayPalAPI", partName = "GetRecurringPaymentsProfileDetailsResponse")
    @WebMethod(operationName = "GetRecurringPaymentsProfileDetails")
    public GetRecurringPaymentsProfileDetailsResponseType getRecurringPaymentsProfileDetails(
        @WebParam(partName = "GetRecurringPaymentsProfileDetailsRequest", name = "GetRecurringPaymentsProfileDetailsReq", targetNamespace = "urn:ebay:api:PayPalAPI")
        GetRecurringPaymentsProfileDetailsReq getRecurringPaymentsProfileDetailsRequest,
        @WebParam(partName = "RequesterCredentials", mode = WebParam.Mode.INOUT, name = "RequesterCredentials", targetNamespace = "urn:ebay:api:PayPalAPI", header = true)
        javax.xml.ws.Holder<ebay.apis.eblbasecomponents.CustomSecurityHeaderType> requesterCredentials
    );

    @WebResult(name = "DoNonReferencedCreditResponse", targetNamespace = "urn:ebay:api:PayPalAPI", partName = "DoNonReferencedCreditResponse")
    @WebMethod(operationName = "DoNonReferencedCredit")
    public DoNonReferencedCreditResponseType doNonReferencedCredit(
        @WebParam(partName = "DoNonReferencedCreditRequest", name = "DoNonReferencedCreditReq", targetNamespace = "urn:ebay:api:PayPalAPI")
        DoNonReferencedCreditReq doNonReferencedCreditRequest,
        @WebParam(partName = "RequesterCredentials", mode = WebParam.Mode.INOUT, name = "RequesterCredentials", targetNamespace = "urn:ebay:api:PayPalAPI", header = true)
        javax.xml.ws.Holder<ebay.apis.eblbasecomponents.CustomSecurityHeaderType> requesterCredentials
    );

    @WebResult(name = "GetAuthDetailsResponse", targetNamespace = "urn:ebay:api:PayPalAPI", partName = "GetAuthDetailsResponse")
    @WebMethod(operationName = "GetAuthDetails")
    public GetAuthDetailsResponseType getAuthDetails(
        @WebParam(partName = "GetAuthDetailsRequest", name = "GetAuthDetailsReq", targetNamespace = "urn:ebay:api:PayPalAPI")
        GetAuthDetailsReq getAuthDetailsRequest,
        @WebParam(partName = "RequesterCredentials", mode = WebParam.Mode.INOUT, name = "RequesterCredentials", targetNamespace = "urn:ebay:api:PayPalAPI", header = true)
        javax.xml.ws.Holder<ebay.apis.eblbasecomponents.CustomSecurityHeaderType> requesterCredentials
    );

    @WebResult(name = "DoDirectPaymentResponse", targetNamespace = "urn:ebay:api:PayPalAPI", partName = "DoDirectPaymentResponse")
    @WebMethod(operationName = "DoDirectPayment")
    public DoDirectPaymentResponseType doDirectPayment(
        @WebParam(partName = "DoDirectPaymentRequest", name = "DoDirectPaymentReq", targetNamespace = "urn:ebay:api:PayPalAPI")
        DoDirectPaymentReq doDirectPaymentRequest,
        @WebParam(partName = "RequesterCredentials", mode = WebParam.Mode.INOUT, name = "RequesterCredentials", targetNamespace = "urn:ebay:api:PayPalAPI", header = true)
        javax.xml.ws.Holder<ebay.apis.eblbasecomponents.CustomSecurityHeaderType> requesterCredentials
    );

    @WebResult(name = "ExecuteCheckoutOperationsResponse", targetNamespace = "urn:ebay:api:PayPalAPI", partName = "ExecuteCheckoutOperationsResponse")
    @WebMethod(operationName = "ExecuteCheckoutOperations")
    public ExecuteCheckoutOperationsResponseType executeCheckoutOperations(
        @WebParam(partName = "ExecuteCheckoutOperationsRequest", name = "ExecuteCheckoutOperationsReq", targetNamespace = "urn:ebay:api:PayPalAPI")
        ExecuteCheckoutOperationsReq executeCheckoutOperationsRequest,
        @WebParam(partName = "RequesterCredentials", mode = WebParam.Mode.INOUT, name = "RequesterCredentials", targetNamespace = "urn:ebay:api:PayPalAPI", header = true)
        javax.xml.ws.Holder<ebay.apis.eblbasecomponents.CustomSecurityHeaderType> requesterCredentials
    );

    @WebResult(name = "DoCaptureResponse", targetNamespace = "urn:ebay:api:PayPalAPI", partName = "DoCaptureResponse")
    @WebMethod(operationName = "DoCapture")
    public DoCaptureResponseType doCapture(
        @WebParam(partName = "DoCaptureRequest", name = "DoCaptureReq", targetNamespace = "urn:ebay:api:PayPalAPI")
        DoCaptureReq doCaptureRequest,
        @WebParam(partName = "RequesterCredentials", mode = WebParam.Mode.INOUT, name = "RequesterCredentials", targetNamespace = "urn:ebay:api:PayPalAPI", header = true)
        javax.xml.ws.Holder<ebay.apis.eblbasecomponents.CustomSecurityHeaderType> requesterCredentials
    );

    @WebResult(name = "UpdateRecurringPaymentsProfileResponse", targetNamespace = "urn:ebay:api:PayPalAPI", partName = "UpdateRecurringPaymentsProfileResponse")
    @WebMethod(operationName = "UpdateRecurringPaymentsProfile")
    public UpdateRecurringPaymentsProfileResponseType updateRecurringPaymentsProfile(
        @WebParam(partName = "UpdateRecurringPaymentsProfileRequest", name = "UpdateRecurringPaymentsProfileReq", targetNamespace = "urn:ebay:api:PayPalAPI")
        UpdateRecurringPaymentsProfileReq updateRecurringPaymentsProfileRequest,
        @WebParam(partName = "RequesterCredentials", mode = WebParam.Mode.INOUT, name = "RequesterCredentials", targetNamespace = "urn:ebay:api:PayPalAPI", header = true)
        javax.xml.ws.Holder<ebay.apis.eblbasecomponents.CustomSecurityHeaderType> requesterCredentials
    );

    @WebResult(name = "DoUATPAuthorizationResponse", targetNamespace = "urn:ebay:api:PayPalAPI", partName = "DoUATPAuthorizationResponse")
    @WebMethod(operationName = "DoUATPAuthorization")
    public DoUATPAuthorizationResponseType doUATPAuthorization(
        @WebParam(partName = "DoUATPAuthorizationRequest", name = "DoUATPAuthorizationReq", targetNamespace = "urn:ebay:api:PayPalAPI")
        DoUATPAuthorizationReq doUATPAuthorizationRequest,
        @WebParam(partName = "RequesterCredentials", mode = WebParam.Mode.INOUT, name = "RequesterCredentials", targetNamespace = "urn:ebay:api:PayPalAPI", header = true)
        javax.xml.ws.Holder<ebay.apis.eblbasecomponents.CustomSecurityHeaderType> requesterCredentials
    );

    @WebResult(name = "DoUATPExpressCheckoutPaymentResponse", targetNamespace = "urn:ebay:api:PayPalAPI", partName = "DoUATPExpressCheckoutPaymentResponse")
    @WebMethod(operationName = "DoUATPExpressCheckoutPayment")
    public DoUATPExpressCheckoutPaymentResponseType doUATPExpressCheckoutPayment(
        @WebParam(partName = "DoUATPExpressCheckoutPaymentRequest", name = "DoUATPExpressCheckoutPaymentReq", targetNamespace = "urn:ebay:api:PayPalAPI")
        DoUATPExpressCheckoutPaymentReq doUATPExpressCheckoutPaymentRequest,
        @WebParam(partName = "RequesterCredentials", mode = WebParam.Mode.INOUT, name = "RequesterCredentials", targetNamespace = "urn:ebay:api:PayPalAPI", header = true)
        javax.xml.ws.Holder<ebay.apis.eblbasecomponents.CustomSecurityHeaderType> requesterCredentials
    );

    @WebResult(name = "DoReferenceTransactionResponse", targetNamespace = "urn:ebay:api:PayPalAPI", partName = "DoReferenceTransactionResponse")
    @WebMethod(operationName = "DoReferenceTransaction")
    public DoReferenceTransactionResponseType doReferenceTransaction(
        @WebParam(partName = "DoReferenceTransactionRequest", name = "DoReferenceTransactionReq", targetNamespace = "urn:ebay:api:PayPalAPI")
        DoReferenceTransactionReq doReferenceTransactionRequest,
        @WebParam(partName = "RequesterCredentials", mode = WebParam.Mode.INOUT, name = "RequesterCredentials", targetNamespace = "urn:ebay:api:PayPalAPI", header = true)
        javax.xml.ws.Holder<ebay.apis.eblbasecomponents.CustomSecurityHeaderType> requesterCredentials
    );

    @WebResult(name = "ManagePendingTransactionStatusResponse", targetNamespace = "urn:ebay:api:PayPalAPI", partName = "ManagePendingTransactionStatusResponse")
    @WebMethod(operationName = "ManagePendingTransactionStatus")
    public ManagePendingTransactionStatusResponseType managePendingTransactionStatus(
        @WebParam(partName = "ManagePendingTransactionStatusRequest", name = "ManagePendingTransactionStatusReq", targetNamespace = "urn:ebay:api:PayPalAPI")
        ManagePendingTransactionStatusReq managePendingTransactionStatusRequest,
        @WebParam(partName = "RequesterCredentials", mode = WebParam.Mode.INOUT, name = "RequesterCredentials", targetNamespace = "urn:ebay:api:PayPalAPI", header = true)
        javax.xml.ws.Holder<ebay.apis.eblbasecomponents.CustomSecurityHeaderType> requesterCredentials
    );

    @WebResult(name = "ReverseTransactionResponse", targetNamespace = "urn:ebay:api:PayPalAPI", partName = "ReverseTransactionResponse")
    @WebMethod(operationName = "ReverseTransaction")
    public ReverseTransactionResponseType reverseTransaction(
        @WebParam(partName = "ReverseTransactionRequest", name = "ReverseTransactionReq", targetNamespace = "urn:ebay:api:PayPalAPI")
        ReverseTransactionReq reverseTransactionRequest,
        @WebParam(partName = "RequesterCredentials", mode = WebParam.Mode.INOUT, name = "RequesterCredentials", targetNamespace = "urn:ebay:api:PayPalAPI", header = true)
        javax.xml.ws.Holder<ebay.apis.eblbasecomponents.CustomSecurityHeaderType> requesterCredentials
    );

    @WebResult(name = "DoAuthorizationResponse", targetNamespace = "urn:ebay:api:PayPalAPI", partName = "DoAuthorizationResponse")
    @WebMethod(operationName = "DoAuthorization")
    public DoAuthorizationResponseType doAuthorization(
        @WebParam(partName = "DoAuthorizationRequest", name = "DoAuthorizationReq", targetNamespace = "urn:ebay:api:PayPalAPI")
        DoAuthorizationReq doAuthorizationRequest,
        @WebParam(partName = "RequesterCredentials", mode = WebParam.Mode.INOUT, name = "RequesterCredentials", targetNamespace = "urn:ebay:api:PayPalAPI", header = true)
        javax.xml.ws.Holder<ebay.apis.eblbasecomponents.CustomSecurityHeaderType> requesterCredentials
    );

    @WebResult(name = "CreateRecurringPaymentsProfileResponse", targetNamespace = "urn:ebay:api:PayPalAPI", partName = "CreateRecurringPaymentsProfileResponse")
    @WebMethod(operationName = "CreateRecurringPaymentsProfile")
    public CreateRecurringPaymentsProfileResponseType createRecurringPaymentsProfile(
        @WebParam(partName = "CreateRecurringPaymentsProfileRequest", name = "CreateRecurringPaymentsProfileReq", targetNamespace = "urn:ebay:api:PayPalAPI")
        CreateRecurringPaymentsProfileReq createRecurringPaymentsProfileRequest,
        @WebParam(partName = "RequesterCredentials", mode = WebParam.Mode.INOUT, name = "RequesterCredentials", targetNamespace = "urn:ebay:api:PayPalAPI", header = true)
        javax.xml.ws.Holder<ebay.apis.eblbasecomponents.CustomSecurityHeaderType> requesterCredentials
    );

    @WebResult(name = "UpdateAccessPermissionsResponse", targetNamespace = "urn:ebay:api:PayPalAPI", partName = "UpdateAccessPermissionsResponse")
    @WebMethod(operationName = "UpdateAccessPermissions")
    public UpdateAccessPermissionsResponseType updateAccessPermissions(
        @WebParam(partName = "UpdateAccessPermissionsRequest", name = "UpdateAccessPermissionsReq", targetNamespace = "urn:ebay:api:PayPalAPI")
        UpdateAccessPermissionsReq updateAccessPermissionsRequest,
        @WebParam(partName = "RequesterCredentials", mode = WebParam.Mode.INOUT, name = "RequesterCredentials", targetNamespace = "urn:ebay:api:PayPalAPI", header = true)
        javax.xml.ws.Holder<ebay.apis.eblbasecomponents.CustomSecurityHeaderType> requesterCredentials
    );

    @WebResult(name = "GetExpressCheckoutDetailsResponse", targetNamespace = "urn:ebay:api:PayPalAPI", partName = "GetExpressCheckoutDetailsResponse")
    @WebMethod(operationName = "GetExpressCheckoutDetails")
    public GetExpressCheckoutDetailsResponseType getExpressCheckoutDetails(
        @WebParam(partName = "GetExpressCheckoutDetailsRequest", name = "GetExpressCheckoutDetailsReq", targetNamespace = "urn:ebay:api:PayPalAPI")
        GetExpressCheckoutDetailsReq getExpressCheckoutDetailsRequest,
        @WebParam(partName = "RequesterCredentials", mode = WebParam.Mode.INOUT, name = "RequesterCredentials", targetNamespace = "urn:ebay:api:PayPalAPI", header = true)
        javax.xml.ws.Holder<ebay.apis.eblbasecomponents.CustomSecurityHeaderType> requesterCredentials
    );

    @WebResult(name = "ManageRecurringPaymentsProfileStatusResponse", targetNamespace = "urn:ebay:api:PayPalAPI", partName = "ManageRecurringPaymentsProfileStatusResponse")
    @WebMethod(operationName = "ManageRecurringPaymentsProfileStatus")
    public ManageRecurringPaymentsProfileStatusResponseType manageRecurringPaymentsProfileStatus(
        @WebParam(partName = "ManageRecurringPaymentsProfileStatusRequest", name = "ManageRecurringPaymentsProfileStatusReq", targetNamespace = "urn:ebay:api:PayPalAPI")
        ManageRecurringPaymentsProfileStatusReq manageRecurringPaymentsProfileStatusRequest,
        @WebParam(partName = "RequesterCredentials", mode = WebParam.Mode.INOUT, name = "RequesterCredentials", targetNamespace = "urn:ebay:api:PayPalAPI", header = true)
        javax.xml.ws.Holder<ebay.apis.eblbasecomponents.CustomSecurityHeaderType> requesterCredentials
    );

    @WebResult(name = "DoReauthorizationResponse", targetNamespace = "urn:ebay:api:PayPalAPI", partName = "DoReauthorizationResponse")
    @WebMethod(operationName = "DoReauthorization")
    public DoReauthorizationResponseType doReauthorization(
        @WebParam(partName = "DoReauthorizationRequest", name = "DoReauthorizationReq", targetNamespace = "urn:ebay:api:PayPalAPI")
        DoReauthorizationReq doReauthorizationRequest,
        @WebParam(partName = "RequesterCredentials", mode = WebParam.Mode.INOUT, name = "RequesterCredentials", targetNamespace = "urn:ebay:api:PayPalAPI", header = true)
        javax.xml.ws.Holder<ebay.apis.eblbasecomponents.CustomSecurityHeaderType> requesterCredentials
    );

    @WebResult(name = "GetIncentiveEvaluationResponse", targetNamespace = "urn:ebay:api:PayPalAPI", partName = "GetIncentiveEvaluationResponse")
    @WebMethod(operationName = "GetIncentiveEvaluation")
    public GetIncentiveEvaluationResponseType getIncentiveEvaluation(
        @WebParam(partName = "GetIncentiveEvaluationRequest", name = "GetIncentiveEvaluationReq", targetNamespace = "urn:ebay:api:PayPalAPI")
        GetIncentiveEvaluationReq getIncentiveEvaluationRequest,
        @WebParam(partName = "RequesterCredentials", mode = WebParam.Mode.INOUT, name = "RequesterCredentials", targetNamespace = "urn:ebay:api:PayPalAPI", header = true)
        javax.xml.ws.Holder<ebay.apis.eblbasecomponents.CustomSecurityHeaderType> requesterCredentials
    );

    @WebResult(name = "SetAuthFlowParamResponse", targetNamespace = "urn:ebay:api:PayPalAPI", partName = "SetAuthFlowParamResponse")
    @WebMethod(operationName = "SetAuthFlowParam")
    public SetAuthFlowParamResponseType setAuthFlowParam(
        @WebParam(partName = "SetAuthFlowParamRequest", name = "SetAuthFlowParamReq", targetNamespace = "urn:ebay:api:PayPalAPI")
        SetAuthFlowParamReq setAuthFlowParamRequest,
        @WebParam(partName = "RequesterCredentials", mode = WebParam.Mode.INOUT, name = "RequesterCredentials", targetNamespace = "urn:ebay:api:PayPalAPI", header = true)
        javax.xml.ws.Holder<ebay.apis.eblbasecomponents.CustomSecurityHeaderType> requesterCredentials
    );

    @WebResult(name = "DoVoidResponse", targetNamespace = "urn:ebay:api:PayPalAPI", partName = "DoVoidResponse")
    @WebMethod(operationName = "DoVoid")
    public DoVoidResponseType doVoid(
        @WebParam(partName = "DoVoidRequest", name = "DoVoidReq", targetNamespace = "urn:ebay:api:PayPalAPI")
        DoVoidReq doVoidRequest,
        @WebParam(partName = "RequesterCredentials", mode = WebParam.Mode.INOUT, name = "RequesterCredentials", targetNamespace = "urn:ebay:api:PayPalAPI", header = true)
        javax.xml.ws.Holder<ebay.apis.eblbasecomponents.CustomSecurityHeaderType> requesterCredentials
    );

    @WebResult(name = "GetAccessPermissionDetailsResponse", targetNamespace = "urn:ebay:api:PayPalAPI", partName = "GetAccessPermissionDetailsResponse")
    @WebMethod(operationName = "GetAccessPermissionDetails")
    public GetAccessPermissionDetailsResponseType getAccessPermissionDetails(
        @WebParam(partName = "GetAccessPermissionDetailsRequest", name = "GetAccessPermissionDetailsReq", targetNamespace = "urn:ebay:api:PayPalAPI")
        GetAccessPermissionDetailsReq getAccessPermissionDetailsRequest,
        @WebParam(partName = "RequesterCredentials", mode = WebParam.Mode.INOUT, name = "RequesterCredentials", targetNamespace = "urn:ebay:api:PayPalAPI", header = true)
        javax.xml.ws.Holder<ebay.apis.eblbasecomponents.CustomSecurityHeaderType> requesterCredentials
    );

    @WebResult(name = "ExternalRememberMeOptOutResponse", targetNamespace = "urn:ebay:api:PayPalAPI", partName = "ExternalRememberMeOptOutResponse")
    @WebMethod(operationName = "ExternalRememberMeOptOut")
    public ExternalRememberMeOptOutResponseType externalRememberMeOptOut(
        @WebParam(partName = "ExternalRememberMeOptOutRequest", name = "ExternalRememberMeOptOutReq", targetNamespace = "urn:ebay:api:PayPalAPI")
        ExternalRememberMeOptOutReq externalRememberMeOptOutRequest,
        @WebParam(partName = "RequesterCredentials", mode = WebParam.Mode.INOUT, name = "RequesterCredentials", targetNamespace = "urn:ebay:api:PayPalAPI", header = true)
        javax.xml.ws.Holder<ebay.apis.eblbasecomponents.CustomSecurityHeaderType> requesterCredentials
    );

    @WebResult(name = "CreateBillingAgreementResponse", targetNamespace = "urn:ebay:api:PayPalAPI", partName = "CreateBillingAgreementResponse")
    @WebMethod(operationName = "CreateBillingAgreement")
    public CreateBillingAgreementResponseType createBillingAgreement(
        @WebParam(partName = "CreateBillingAgreementRequest", name = "CreateBillingAgreementReq", targetNamespace = "urn:ebay:api:PayPalAPI")
        CreateBillingAgreementReq createBillingAgreementRequest,
        @WebParam(partName = "RequesterCredentials", mode = WebParam.Mode.INOUT, name = "RequesterCredentials", targetNamespace = "urn:ebay:api:PayPalAPI", header = true)
        javax.xml.ws.Holder<ebay.apis.eblbasecomponents.CustomSecurityHeaderType> requesterCredentials
    );
}
