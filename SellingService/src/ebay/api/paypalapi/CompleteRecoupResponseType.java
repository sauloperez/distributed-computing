
package ebay.api.paypalapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import ebay.apis.eblbasecomponents.AbstractResponseType;
import ebay.apis.enhanceddatatypes.EnhancedCompleteRecoupResponseDetailsType;


/**
 * <p>Java class for CompleteRecoupResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompleteRecoupResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ebay:apis:EnhancedDataTypes}EnhancedCompleteRecoupResponseDetails"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompleteRecoupResponseType", propOrder = {
    "enhancedCompleteRecoupResponseDetails"
})
public class CompleteRecoupResponseType
    extends AbstractResponseType
{

    @XmlElement(name = "EnhancedCompleteRecoupResponseDetails", namespace = "urn:ebay:apis:EnhancedDataTypes", required = true)
    protected EnhancedCompleteRecoupResponseDetailsType enhancedCompleteRecoupResponseDetails;

    /**
     * Gets the value of the enhancedCompleteRecoupResponseDetails property.
     * 
     * @return
     *     possible object is
     *     {@link EnhancedCompleteRecoupResponseDetailsType }
     *     
     */
    public EnhancedCompleteRecoupResponseDetailsType getEnhancedCompleteRecoupResponseDetails() {
        return enhancedCompleteRecoupResponseDetails;
    }

    /**
     * Sets the value of the enhancedCompleteRecoupResponseDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnhancedCompleteRecoupResponseDetailsType }
     *     
     */
    public void setEnhancedCompleteRecoupResponseDetails(EnhancedCompleteRecoupResponseDetailsType value) {
        this.enhancedCompleteRecoupResponseDetails = value;
    }

}
