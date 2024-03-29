
package ebay.apis.eblbasecomponents;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import org.w3c.dom.Element;

import ebay.api.paypalapi.AddressVerifyRequestType;
import ebay.api.paypalapi.BAUpdateRequestType;
import ebay.api.paypalapi.BMButtonSearchRequestType;
import ebay.api.paypalapi.BMCreateButtonRequestType;
import ebay.api.paypalapi.BMGetButtonDetailsRequestType;
import ebay.api.paypalapi.BMGetInventoryRequestType;
import ebay.api.paypalapi.BMManageButtonStatusRequestType;
import ebay.api.paypalapi.BMSetInventoryRequestType;
import ebay.api.paypalapi.BMUpdateButtonRequestType;
import ebay.api.paypalapi.BillOutstandingAmountRequestType;
import ebay.api.paypalapi.BillUserRequestType;
import ebay.api.paypalapi.CancelRecoupRequestType;
import ebay.api.paypalapi.CompleteRecoupRequestType;
import ebay.api.paypalapi.CreateBillingAgreementRequestType;
import ebay.api.paypalapi.CreateMobilePaymentRequestType;
import ebay.api.paypalapi.CreateRecurringPaymentsProfileRequestType;
import ebay.api.paypalapi.DoAuthorizationRequestType;
import ebay.api.paypalapi.DoCancelRequestType;
import ebay.api.paypalapi.DoCaptureRequestType;
import ebay.api.paypalapi.DoDirectPaymentRequestType;
import ebay.api.paypalapi.DoExpressCheckoutPaymentRequestType;
import ebay.api.paypalapi.DoMobileCheckoutPaymentRequestType;
import ebay.api.paypalapi.DoNonReferencedCreditRequestType;
import ebay.api.paypalapi.DoReauthorizationRequestType;
import ebay.api.paypalapi.DoReferenceTransactionRequestType;
import ebay.api.paypalapi.DoUATPAuthorizationRequestType;
import ebay.api.paypalapi.DoVoidRequestType;
import ebay.api.paypalapi.EnterBoardingRequestType;
import ebay.api.paypalapi.ExecuteCheckoutOperationsRequestType;
import ebay.api.paypalapi.ExternalRememberMeOptOutRequestType;
import ebay.api.paypalapi.GetAccessPermissionDetailsRequestType;
import ebay.api.paypalapi.GetAuthDetailsRequestType;
import ebay.api.paypalapi.GetBalanceRequestType;
import ebay.api.paypalapi.GetBillingAgreementCustomerDetailsRequestType;
import ebay.api.paypalapi.GetBoardingDetailsRequestType;
import ebay.api.paypalapi.GetExpressCheckoutDetailsRequestType;
import ebay.api.paypalapi.GetIncentiveEvaluationRequestType;
import ebay.api.paypalapi.GetMobileStatusRequestType;
import ebay.api.paypalapi.GetPalDetailsRequestType;
import ebay.api.paypalapi.GetRecurringPaymentsProfileDetailsRequestType;
import ebay.api.paypalapi.GetTransactionDetailsRequestType;
import ebay.api.paypalapi.InitiateRecoupRequestType;
import ebay.api.paypalapi.ManagePendingTransactionStatusRequestType;
import ebay.api.paypalapi.ManageRecurringPaymentsProfileStatusRequestType;
import ebay.api.paypalapi.MassPayRequestType;
import ebay.api.paypalapi.RefundTransactionRequestType;
import ebay.api.paypalapi.ReverseTransactionRequestType;
import ebay.api.paypalapi.SetAccessPermissionsRequestType;
import ebay.api.paypalapi.SetAuthFlowParamRequestType;
import ebay.api.paypalapi.SetCustomerBillingAgreementRequestType;
import ebay.api.paypalapi.SetExpressCheckoutRequestType;
import ebay.api.paypalapi.SetMobileCheckoutRequestType;
import ebay.api.paypalapi.TransactionSearchRequestType;
import ebay.api.paypalapi.UpdateAccessPermissionsRequestType;
import ebay.api.paypalapi.UpdateRecurringPaymentsProfileRequestType;


/**
 *  
 *                        Base type definition of request payload that can carry any type 
 *                        of payload content with optional versioning information and detail level
 *                        requirements.
 *                    
 * 
 * <p>Java class for AbstractRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DetailLevel" type="{urn:ebay:apis:eBLBaseComponents}DetailLevelCodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ErrorLanguage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;any processContents='lax' namespace='' minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractRequestType", propOrder = {
    "detailLevel",
    "errorLanguage",
    "version",
    "any"
})
@XmlSeeAlso({
    DoDirectPaymentRequestType.class,
    ExternalRememberMeOptOutRequestType.class,
    UpdateAccessPermissionsRequestType.class,
    BMSetInventoryRequestType.class,
    DoUATPAuthorizationRequestType.class,
    SetExpressCheckoutRequestType.class,
    DoNonReferencedCreditRequestType.class,
    DoCaptureRequestType.class,
    GetAuthDetailsRequestType.class,
    DoMobileCheckoutPaymentRequestType.class,
    UpdateRecurringPaymentsProfileRequestType.class,
    SetMobileCheckoutRequestType.class,
    InitiateRecoupRequestType.class,
    CreateMobilePaymentRequestType.class,
    BAUpdateRequestType.class,
    SetAccessPermissionsRequestType.class,
    BMGetButtonDetailsRequestType.class,
    ManagePendingTransactionStatusRequestType.class,
    EnterBoardingRequestType.class,
    DoCancelRequestType.class,
    ManageRecurringPaymentsProfileStatusRequestType.class,
    CreateBillingAgreementRequestType.class,
    CreateRecurringPaymentsProfileRequestType.class,
    DoVoidRequestType.class,
    BMGetInventoryRequestType.class,
    SetAuthFlowParamRequestType.class,
    AddressVerifyRequestType.class,
    ExecuteCheckoutOperationsRequestType.class,
    BMButtonSearchRequestType.class,
    GetBalanceRequestType.class,
    GetBoardingDetailsRequestType.class,
    ReverseTransactionRequestType.class,
    GetMobileStatusRequestType.class,
    SetCustomerBillingAgreementRequestType.class,
    TransactionSearchRequestType.class,
    GetIncentiveEvaluationRequestType.class,
    BillUserRequestType.class,
    GetTransactionDetailsRequestType.class,
    GetPalDetailsRequestType.class,
    BMManageButtonStatusRequestType.class,
    CompleteRecoupRequestType.class,
    DoAuthorizationRequestType.class,
    CancelRecoupRequestType.class,
    GetRecurringPaymentsProfileDetailsRequestType.class,
    BillOutstandingAmountRequestType.class,
    DoExpressCheckoutPaymentRequestType.class,
    GetExpressCheckoutDetailsRequestType.class,
    GetAccessPermissionDetailsRequestType.class,
    MassPayRequestType.class,
    BMUpdateButtonRequestType.class,
    DoReferenceTransactionRequestType.class,
    DoReauthorizationRequestType.class,
    BMCreateButtonRequestType.class,
    RefundTransactionRequestType.class,
    GetBillingAgreementCustomerDetailsRequestType.class
})
public abstract class AbstractRequestType {

    @XmlElement(name = "DetailLevel")
    protected List<DetailLevelCodeType> detailLevel;
    @XmlElement(name = "ErrorLanguage")
    protected String errorLanguage;
    @XmlElement(name = "Version", required = true)
    protected String version;
    @XmlAnyElement(lax = true)
    protected Object any;

    /**
     * Gets the value of the detailLevel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the detailLevel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDetailLevel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DetailLevelCodeType }
     * 
     * 
     */
    public List<DetailLevelCodeType> getDetailLevel() {
        if (detailLevel == null) {
            detailLevel = new ArrayList<DetailLevelCodeType>();
        }
        return this.detailLevel;
    }

    /**
     * Gets the value of the errorLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorLanguage() {
        return errorLanguage;
    }

    /**
     * Sets the value of the errorLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorLanguage(String value) {
        this.errorLanguage = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     {@link Element }
     *     
     */
    public Object getAny() {
        return any;
    }

    /**
     * Sets the value of the any property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     {@link Element }
     *     
     */
    public void setAny(Object value) {
        this.any = value;
    }

}
