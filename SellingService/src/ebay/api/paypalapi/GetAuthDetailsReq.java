
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
 *         &lt;element ref="{urn:ebay:api:PayPalAPI}GetAuthDetailsRequest"/>
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
    "getAuthDetailsRequest"
})
@XmlRootElement(name = "GetAuthDetailsReq")
public class GetAuthDetailsReq {

    @XmlElement(name = "GetAuthDetailsRequest", required = true)
    protected GetAuthDetailsRequestType getAuthDetailsRequest;

    /**
     * Gets the value of the getAuthDetailsRequest property.
     * 
     * @return
     *     possible object is
     *     {@link GetAuthDetailsRequestType }
     *     
     */
    public GetAuthDetailsRequestType getGetAuthDetailsRequest() {
        return getAuthDetailsRequest;
    }

    /**
     * Sets the value of the getAuthDetailsRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetAuthDetailsRequestType }
     *     
     */
    public void setGetAuthDetailsRequest(GetAuthDetailsRequestType value) {
        this.getAuthDetailsRequest = value;
    }

}
