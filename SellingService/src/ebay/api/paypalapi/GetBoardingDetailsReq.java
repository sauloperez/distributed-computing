
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
 *         &lt;element ref="{urn:ebay:api:PayPalAPI}GetBoardingDetailsRequest"/>
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
    "getBoardingDetailsRequest"
})
@XmlRootElement(name = "GetBoardingDetailsReq")
public class GetBoardingDetailsReq {

    @XmlElement(name = "GetBoardingDetailsRequest", required = true)
    protected GetBoardingDetailsRequestType getBoardingDetailsRequest;

    /**
     * Gets the value of the getBoardingDetailsRequest property.
     * 
     * @return
     *     possible object is
     *     {@link GetBoardingDetailsRequestType }
     *     
     */
    public GetBoardingDetailsRequestType getGetBoardingDetailsRequest() {
        return getBoardingDetailsRequest;
    }

    /**
     * Sets the value of the getBoardingDetailsRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetBoardingDetailsRequestType }
     *     
     */
    public void setGetBoardingDetailsRequest(GetBoardingDetailsRequestType value) {
        this.getBoardingDetailsRequest = value;
    }

}
