
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
 *         &lt;element ref="{urn:ebay:api:PayPalAPI}DoDirectPaymentRequest"/>
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
    "doDirectPaymentRequest"
})
@XmlRootElement(name = "DoDirectPaymentReq")
public class DoDirectPaymentReq {

    @XmlElement(name = "DoDirectPaymentRequest", required = true)
    protected DoDirectPaymentRequestType doDirectPaymentRequest;

    /**
     * Gets the value of the doDirectPaymentRequest property.
     * 
     * @return
     *     possible object is
     *     {@link DoDirectPaymentRequestType }
     *     
     */
    public DoDirectPaymentRequestType getDoDirectPaymentRequest() {
        return doDirectPaymentRequest;
    }

    /**
     * Sets the value of the doDirectPaymentRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link DoDirectPaymentRequestType }
     *     
     */
    public void setDoDirectPaymentRequest(DoDirectPaymentRequestType value) {
        this.doDirectPaymentRequest = value;
    }

}
