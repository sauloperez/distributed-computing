
package ebay.api.paypalapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import ebay.apis.eblbasecomponents.AbstractRequestType;
import ebay.apis.eblbasecomponents.EnterBoardingRequestDetailsType;


/**
 * <p>Java class for EnterBoardingRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnterBoardingRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ebay:apis:eBLBaseComponents}EnterBoardingRequestDetails"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnterBoardingRequestType", propOrder = {
    "enterBoardingRequestDetails"
})
public class EnterBoardingRequestType
    extends AbstractRequestType
{

    @XmlElement(name = "EnterBoardingRequestDetails", namespace = "urn:ebay:apis:eBLBaseComponents", required = true)
    protected EnterBoardingRequestDetailsType enterBoardingRequestDetails;

    /**
     * Gets the value of the enterBoardingRequestDetails property.
     * 
     * @return
     *     possible object is
     *     {@link EnterBoardingRequestDetailsType }
     *     
     */
    public EnterBoardingRequestDetailsType getEnterBoardingRequestDetails() {
        return enterBoardingRequestDetails;
    }

    /**
     * Sets the value of the enterBoardingRequestDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnterBoardingRequestDetailsType }
     *     
     */
    public void setEnterBoardingRequestDetails(EnterBoardingRequestDetailsType value) {
        this.enterBoardingRequestDetails = value;
    }

}
