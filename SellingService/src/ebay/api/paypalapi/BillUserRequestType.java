
package ebay.api.paypalapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import ebay.apis.eblbasecomponents.AbstractRequestType;
import ebay.apis.eblbasecomponents.MerchantPullPaymentType;


/**
 * <p>Java class for BillUserRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BillUserRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ebay:apis:eBLBaseComponents}MerchantPullPaymentDetails"/>
 *         &lt;element name="ReturnFMFDetails" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillUserRequestType", propOrder = {
    "merchantPullPaymentDetails",
    "returnFMFDetails"
})
public class BillUserRequestType
    extends AbstractRequestType
{

    @XmlElement(name = "MerchantPullPaymentDetails", namespace = "urn:ebay:apis:eBLBaseComponents", required = true)
    protected MerchantPullPaymentType merchantPullPaymentDetails;
    @XmlElement(name = "ReturnFMFDetails")
    protected Integer returnFMFDetails;

    /**
     * Gets the value of the merchantPullPaymentDetails property.
     * 
     * @return
     *     possible object is
     *     {@link MerchantPullPaymentType }
     *     
     */
    public MerchantPullPaymentType getMerchantPullPaymentDetails() {
        return merchantPullPaymentDetails;
    }

    /**
     * Sets the value of the merchantPullPaymentDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link MerchantPullPaymentType }
     *     
     */
    public void setMerchantPullPaymentDetails(MerchantPullPaymentType value) {
        this.merchantPullPaymentDetails = value;
    }

    /**
     * Gets the value of the returnFMFDetails property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReturnFMFDetails() {
        return returnFMFDetails;
    }

    /**
     * Sets the value of the returnFMFDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReturnFMFDetails(Integer value) {
        this.returnFMFDetails = value;
    }

}
