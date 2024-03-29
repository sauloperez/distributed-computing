
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
 *         &lt;element ref="{urn:ebay:api:PayPalAPI}GetPalDetailsRequest"/>
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
    "getPalDetailsRequest"
})
@XmlRootElement(name = "GetPalDetailsReq")
public class GetPalDetailsReq {

    @XmlElement(name = "GetPalDetailsRequest", required = true)
    protected GetPalDetailsRequestType getPalDetailsRequest;

    /**
     * Gets the value of the getPalDetailsRequest property.
     * 
     * @return
     *     possible object is
     *     {@link GetPalDetailsRequestType }
     *     
     */
    public GetPalDetailsRequestType getGetPalDetailsRequest() {
        return getPalDetailsRequest;
    }

    /**
     * Sets the value of the getPalDetailsRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetPalDetailsRequestType }
     *     
     */
    public void setGetPalDetailsRequest(GetPalDetailsRequestType value) {
        this.getPalDetailsRequest = value;
    }

}
