
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
 *         &lt;element ref="{urn:ebay:api:PayPalAPI}DoCaptureRequest"/>
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
    "doCaptureRequest"
})
@XmlRootElement(name = "DoCaptureReq")
public class DoCaptureReq {

    @XmlElement(name = "DoCaptureRequest", required = true)
    protected DoCaptureRequestType doCaptureRequest;

    /**
     * Gets the value of the doCaptureRequest property.
     * 
     * @return
     *     possible object is
     *     {@link DoCaptureRequestType }
     *     
     */
    public DoCaptureRequestType getDoCaptureRequest() {
        return doCaptureRequest;
    }

    /**
     * Sets the value of the doCaptureRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link DoCaptureRequestType }
     *     
     */
    public void setDoCaptureRequest(DoCaptureRequestType value) {
        this.doCaptureRequest = value;
    }

}
