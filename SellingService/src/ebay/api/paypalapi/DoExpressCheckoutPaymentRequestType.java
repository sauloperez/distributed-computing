
package ebay.api.paypalapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import ebay.apis.eblbasecomponents.AbstractRequestType;
import ebay.apis.eblbasecomponents.DoExpressCheckoutPaymentRequestDetailsType;


/**
 * <p>Java class for DoExpressCheckoutPaymentRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DoExpressCheckoutPaymentRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ebay:apis:eBLBaseComponents}DoExpressCheckoutPaymentRequestDetails"/>
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
@XmlType(name = "DoExpressCheckoutPaymentRequestType", propOrder = {
    "doExpressCheckoutPaymentRequestDetails",
    "returnFMFDetails"
})
@XmlSeeAlso({
    DoUATPExpressCheckoutPaymentRequestType.class
})
public class DoExpressCheckoutPaymentRequestType
    extends AbstractRequestType
{

    @XmlElement(name = "DoExpressCheckoutPaymentRequestDetails", namespace = "urn:ebay:apis:eBLBaseComponents", required = true)
    protected DoExpressCheckoutPaymentRequestDetailsType doExpressCheckoutPaymentRequestDetails;
    @XmlElement(name = "ReturnFMFDetails")
    protected Integer returnFMFDetails;

    /**
     * Gets the value of the doExpressCheckoutPaymentRequestDetails property.
     * 
     * @return
     *     possible object is
     *     {@link DoExpressCheckoutPaymentRequestDetailsType }
     *     
     */
    public DoExpressCheckoutPaymentRequestDetailsType getDoExpressCheckoutPaymentRequestDetails() {
        return doExpressCheckoutPaymentRequestDetails;
    }

    /**
     * Sets the value of the doExpressCheckoutPaymentRequestDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link DoExpressCheckoutPaymentRequestDetailsType }
     *     
     */
    public void setDoExpressCheckoutPaymentRequestDetails(DoExpressCheckoutPaymentRequestDetailsType value) {
        this.doExpressCheckoutPaymentRequestDetails = value;
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
