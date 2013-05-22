
package ebay.api.paypalapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import ebay.apis.eblbasecomponents.AbstractRequestType;
import ebay.apis.eblbasecomponents.SetAuthFlowParamRequestDetailsType;


/**
 * <p>Java class for SetAuthFlowParamRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SetAuthFlowParamRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ebay:apis:eBLBaseComponents}SetAuthFlowParamRequestDetails"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetAuthFlowParamRequestType", propOrder = {
    "setAuthFlowParamRequestDetails"
})
public class SetAuthFlowParamRequestType
    extends AbstractRequestType
{

    @XmlElement(name = "SetAuthFlowParamRequestDetails", namespace = "urn:ebay:apis:eBLBaseComponents", required = true)
    protected SetAuthFlowParamRequestDetailsType setAuthFlowParamRequestDetails;

    /**
     * Gets the value of the setAuthFlowParamRequestDetails property.
     * 
     * @return
     *     possible object is
     *     {@link SetAuthFlowParamRequestDetailsType }
     *     
     */
    public SetAuthFlowParamRequestDetailsType getSetAuthFlowParamRequestDetails() {
        return setAuthFlowParamRequestDetails;
    }

    /**
     * Sets the value of the setAuthFlowParamRequestDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link SetAuthFlowParamRequestDetailsType }
     *     
     */
    public void setSetAuthFlowParamRequestDetails(SetAuthFlowParamRequestDetailsType value) {
        this.setAuthFlowParamRequestDetails = value;
    }

}
