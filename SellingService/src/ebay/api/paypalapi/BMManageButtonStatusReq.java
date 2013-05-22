
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
 *         &lt;element ref="{urn:ebay:api:PayPalAPI}BMManageButtonStatusRequest"/>
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
    "bmManageButtonStatusRequest"
})
@XmlRootElement(name = "BMManageButtonStatusReq")
public class BMManageButtonStatusReq {

    @XmlElement(name = "BMManageButtonStatusRequest", required = true)
    protected BMManageButtonStatusRequestType bmManageButtonStatusRequest;

    /**
     * Gets the value of the bmManageButtonStatusRequest property.
     * 
     * @return
     *     possible object is
     *     {@link BMManageButtonStatusRequestType }
     *     
     */
    public BMManageButtonStatusRequestType getBMManageButtonStatusRequest() {
        return bmManageButtonStatusRequest;
    }

    /**
     * Sets the value of the bmManageButtonStatusRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link BMManageButtonStatusRequestType }
     *     
     */
    public void setBMManageButtonStatusRequest(BMManageButtonStatusRequestType value) {
        this.bmManageButtonStatusRequest = value;
    }

}
