
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
 *         &lt;element ref="{urn:ebay:api:PayPalAPI}GetMobileStatusRequest"/>
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
    "getMobileStatusRequest"
})
@XmlRootElement(name = "GetMobileStatusReq")
public class GetMobileStatusReq {

    @XmlElement(name = "GetMobileStatusRequest", required = true)
    protected GetMobileStatusRequestType getMobileStatusRequest;

    /**
     * Gets the value of the getMobileStatusRequest property.
     * 
     * @return
     *     possible object is
     *     {@link GetMobileStatusRequestType }
     *     
     */
    public GetMobileStatusRequestType getGetMobileStatusRequest() {
        return getMobileStatusRequest;
    }

    /**
     * Sets the value of the getMobileStatusRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetMobileStatusRequestType }
     *     
     */
    public void setGetMobileStatusRequest(GetMobileStatusRequestType value) {
        this.getMobileStatusRequest = value;
    }

}
