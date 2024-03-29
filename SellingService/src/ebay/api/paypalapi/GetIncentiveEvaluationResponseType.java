
package ebay.api.paypalapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import ebay.apis.eblbasecomponents.AbstractResponseType;
import ebay.apis.eblbasecomponents.GetIncentiveEvaluationResponseDetailsType;


/**
 * <p>Java class for GetIncentiveEvaluationResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetIncentiveEvaluationResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ebay:apis:eBLBaseComponents}GetIncentiveEvaluationResponseDetails"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetIncentiveEvaluationResponseType", propOrder = {
    "getIncentiveEvaluationResponseDetails"
})
public class GetIncentiveEvaluationResponseType
    extends AbstractResponseType
{

    @XmlElement(name = "GetIncentiveEvaluationResponseDetails", namespace = "urn:ebay:apis:eBLBaseComponents", required = true)
    protected GetIncentiveEvaluationResponseDetailsType getIncentiveEvaluationResponseDetails;

    /**
     * Gets the value of the getIncentiveEvaluationResponseDetails property.
     * 
     * @return
     *     possible object is
     *     {@link GetIncentiveEvaluationResponseDetailsType }
     *     
     */
    public GetIncentiveEvaluationResponseDetailsType getGetIncentiveEvaluationResponseDetails() {
        return getIncentiveEvaluationResponseDetails;
    }

    /**
     * Sets the value of the getIncentiveEvaluationResponseDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetIncentiveEvaluationResponseDetailsType }
     *     
     */
    public void setGetIncentiveEvaluationResponseDetails(GetIncentiveEvaluationResponseDetailsType value) {
        this.getIncentiveEvaluationResponseDetails = value;
    }

}
