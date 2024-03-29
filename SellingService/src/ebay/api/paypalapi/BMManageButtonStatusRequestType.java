
package ebay.api.paypalapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import ebay.apis.eblbasecomponents.AbstractRequestType;
import ebay.apis.eblbasecomponents.ButtonStatusType;


/**
 * <p>Java class for BMManageButtonStatusRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BMManageButtonStatusRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="HostedButtonID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ButtonStatus" type="{urn:ebay:apis:eBLBaseComponents}ButtonStatusType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BMManageButtonStatusRequestType", propOrder = {
    "hostedButtonID",
    "buttonStatus"
})
public class BMManageButtonStatusRequestType
    extends AbstractRequestType
{

    @XmlElement(name = "HostedButtonID")
    protected String hostedButtonID;
    @XmlElement(name = "ButtonStatus")
    protected ButtonStatusType buttonStatus;

    /**
     * Gets the value of the hostedButtonID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostedButtonID() {
        return hostedButtonID;
    }

    /**
     * Sets the value of the hostedButtonID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostedButtonID(String value) {
        this.hostedButtonID = value;
    }

    /**
     * Gets the value of the buttonStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ButtonStatusType }
     *     
     */
    public ButtonStatusType getButtonStatus() {
        return buttonStatus;
    }

    /**
     * Sets the value of the buttonStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ButtonStatusType }
     *     
     */
    public void setButtonStatus(ButtonStatusType value) {
        this.buttonStatus = value;
    }

}
