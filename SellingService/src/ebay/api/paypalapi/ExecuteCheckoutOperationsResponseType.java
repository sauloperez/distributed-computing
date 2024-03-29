
package ebay.api.paypalapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import ebay.apis.eblbasecomponents.AbstractResponseType;
import ebay.apis.eblbasecomponents.ExecuteCheckoutOperationsResponseDetailsType;


/**
 * <p>Java class for ExecuteCheckoutOperationsResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExecuteCheckoutOperationsResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ebay:apis:eBLBaseComponents}ExecuteCheckoutOperationsResponseDetails"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExecuteCheckoutOperationsResponseType", propOrder = {
    "executeCheckoutOperationsResponseDetails"
})
public class ExecuteCheckoutOperationsResponseType
    extends AbstractResponseType
{

    @XmlElement(name = "ExecuteCheckoutOperationsResponseDetails", namespace = "urn:ebay:apis:eBLBaseComponents", required = true)
    protected ExecuteCheckoutOperationsResponseDetailsType executeCheckoutOperationsResponseDetails;

    /**
     * Gets the value of the executeCheckoutOperationsResponseDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ExecuteCheckoutOperationsResponseDetailsType }
     *     
     */
    public ExecuteCheckoutOperationsResponseDetailsType getExecuteCheckoutOperationsResponseDetails() {
        return executeCheckoutOperationsResponseDetails;
    }

    /**
     * Sets the value of the executeCheckoutOperationsResponseDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExecuteCheckoutOperationsResponseDetailsType }
     *     
     */
    public void setExecuteCheckoutOperationsResponseDetails(ExecuteCheckoutOperationsResponseDetailsType value) {
        this.executeCheckoutOperationsResponseDetails = value;
    }

}
