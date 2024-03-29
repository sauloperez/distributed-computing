
package ebay.api.paypalapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ebay:api:PayPalAPI}UpdateRecurringPaymentsProfileRequest"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "updateRecurringPaymentsProfileRequest"
})
@XmlRootElement(name = "UpdateRecurringPaymentsProfileReq")
public class UpdateRecurringPaymentsProfileReq {

    @XmlElement(name = "UpdateRecurringPaymentsProfileRequest", required = true)
    protected UpdateRecurringPaymentsProfileRequestType updateRecurringPaymentsProfileRequest;

    /**
     * Gets the value of the updateRecurringPaymentsProfileRequest property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateRecurringPaymentsProfileRequestType }
     *     
     */
    public UpdateRecurringPaymentsProfileRequestType getUpdateRecurringPaymentsProfileRequest() {
        return updateRecurringPaymentsProfileRequest;
    }

    /**
     * Sets the value of the updateRecurringPaymentsProfileRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateRecurringPaymentsProfileRequestType }
     *     
     */
    public void setUpdateRecurringPaymentsProfileRequest(UpdateRecurringPaymentsProfileRequestType value) {
        this.updateRecurringPaymentsProfileRequest = value;
    }

}
