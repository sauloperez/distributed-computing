
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
 *         &lt;element ref="{urn:ebay:api:PayPalAPI}ManageRecurringPaymentsProfileStatusRequest"/>
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
    "manageRecurringPaymentsProfileStatusRequest"
})
@XmlRootElement(name = "ManageRecurringPaymentsProfileStatusReq")
public class ManageRecurringPaymentsProfileStatusReq {

    @XmlElement(name = "ManageRecurringPaymentsProfileStatusRequest", required = true)
    protected ManageRecurringPaymentsProfileStatusRequestType manageRecurringPaymentsProfileStatusRequest;

    /**
     * Gets the value of the manageRecurringPaymentsProfileStatusRequest property.
     * 
     * @return
     *     possible object is
     *     {@link ManageRecurringPaymentsProfileStatusRequestType }
     *     
     */
    public ManageRecurringPaymentsProfileStatusRequestType getManageRecurringPaymentsProfileStatusRequest() {
        return manageRecurringPaymentsProfileStatusRequest;
    }

    /**
     * Sets the value of the manageRecurringPaymentsProfileStatusRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManageRecurringPaymentsProfileStatusRequestType }
     *     
     */
    public void setManageRecurringPaymentsProfileStatusRequest(ManageRecurringPaymentsProfileStatusRequestType value) {
        this.manageRecurringPaymentsProfileStatusRequest = value;
    }

}
