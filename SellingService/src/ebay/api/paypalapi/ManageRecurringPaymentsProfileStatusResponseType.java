
package ebay.api.paypalapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import ebay.apis.eblbasecomponents.AbstractResponseType;
import ebay.apis.eblbasecomponents.ManageRecurringPaymentsProfileStatusResponseDetailsType;


/**
 * <p>Java class for ManageRecurringPaymentsProfileStatusResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ManageRecurringPaymentsProfileStatusResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ebay:apis:eBLBaseComponents}ManageRecurringPaymentsProfileStatusResponseDetails"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManageRecurringPaymentsProfileStatusResponseType", propOrder = {
    "manageRecurringPaymentsProfileStatusResponseDetails"
})
public class ManageRecurringPaymentsProfileStatusResponseType
    extends AbstractResponseType
{

    @XmlElement(name = "ManageRecurringPaymentsProfileStatusResponseDetails", namespace = "urn:ebay:apis:eBLBaseComponents", required = true)
    protected ManageRecurringPaymentsProfileStatusResponseDetailsType manageRecurringPaymentsProfileStatusResponseDetails;

    /**
     * Gets the value of the manageRecurringPaymentsProfileStatusResponseDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ManageRecurringPaymentsProfileStatusResponseDetailsType }
     *     
     */
    public ManageRecurringPaymentsProfileStatusResponseDetailsType getManageRecurringPaymentsProfileStatusResponseDetails() {
        return manageRecurringPaymentsProfileStatusResponseDetails;
    }

    /**
     * Sets the value of the manageRecurringPaymentsProfileStatusResponseDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManageRecurringPaymentsProfileStatusResponseDetailsType }
     *     
     */
    public void setManageRecurringPaymentsProfileStatusResponseDetails(ManageRecurringPaymentsProfileStatusResponseDetailsType value) {
        this.manageRecurringPaymentsProfileStatusResponseDetails = value;
    }

}
