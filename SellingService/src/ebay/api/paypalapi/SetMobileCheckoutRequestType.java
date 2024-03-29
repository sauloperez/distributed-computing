
package ebay.api.paypalapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import ebay.apis.eblbasecomponents.AbstractRequestType;
import ebay.apis.eblbasecomponents.SetMobileCheckoutRequestDetailsType;


/**
 * <p>Java class for SetMobileCheckoutRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SetMobileCheckoutRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ebay:apis:eBLBaseComponents}SetMobileCheckoutRequestDetails"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetMobileCheckoutRequestType", propOrder = {
    "setMobileCheckoutRequestDetails"
})
public class SetMobileCheckoutRequestType
    extends AbstractRequestType
{

    @XmlElement(name = "SetMobileCheckoutRequestDetails", namespace = "urn:ebay:apis:eBLBaseComponents", required = true)
    protected SetMobileCheckoutRequestDetailsType setMobileCheckoutRequestDetails;

    /**
     * Gets the value of the setMobileCheckoutRequestDetails property.
     * 
     * @return
     *     possible object is
     *     {@link SetMobileCheckoutRequestDetailsType }
     *     
     */
    public SetMobileCheckoutRequestDetailsType getSetMobileCheckoutRequestDetails() {
        return setMobileCheckoutRequestDetails;
    }

    /**
     * Sets the value of the setMobileCheckoutRequestDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link SetMobileCheckoutRequestDetailsType }
     *     
     */
    public void setSetMobileCheckoutRequestDetails(SetMobileCheckoutRequestDetailsType value) {
        this.setMobileCheckoutRequestDetails = value;
    }

}
