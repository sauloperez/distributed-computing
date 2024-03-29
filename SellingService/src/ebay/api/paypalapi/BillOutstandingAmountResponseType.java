
package ebay.api.paypalapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import ebay.apis.eblbasecomponents.AbstractResponseType;
import ebay.apis.eblbasecomponents.BillOutstandingAmountResponseDetailsType;


/**
 * <p>Java class for BillOutstandingAmountResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BillOutstandingAmountResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ebay:apis:eBLBaseComponents}BillOutstandingAmountResponseDetails"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillOutstandingAmountResponseType", propOrder = {
    "billOutstandingAmountResponseDetails"
})
public class BillOutstandingAmountResponseType
    extends AbstractResponseType
{

    @XmlElement(name = "BillOutstandingAmountResponseDetails", namespace = "urn:ebay:apis:eBLBaseComponents", required = true)
    protected BillOutstandingAmountResponseDetailsType billOutstandingAmountResponseDetails;

    /**
     * Gets the value of the billOutstandingAmountResponseDetails property.
     * 
     * @return
     *     possible object is
     *     {@link BillOutstandingAmountResponseDetailsType }
     *     
     */
    public BillOutstandingAmountResponseDetailsType getBillOutstandingAmountResponseDetails() {
        return billOutstandingAmountResponseDetails;
    }

    /**
     * Sets the value of the billOutstandingAmountResponseDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillOutstandingAmountResponseDetailsType }
     *     
     */
    public void setBillOutstandingAmountResponseDetails(BillOutstandingAmountResponseDetailsType value) {
        this.billOutstandingAmountResponseDetails = value;
    }

}
