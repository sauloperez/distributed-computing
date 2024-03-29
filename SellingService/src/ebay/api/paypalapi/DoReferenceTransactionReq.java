
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
 *         &lt;element ref="{urn:ebay:api:PayPalAPI}DoReferenceTransactionRequest"/>
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
    "doReferenceTransactionRequest"
})
@XmlRootElement(name = "DoReferenceTransactionReq")
public class DoReferenceTransactionReq {

    @XmlElement(name = "DoReferenceTransactionRequest", required = true)
    protected DoReferenceTransactionRequestType doReferenceTransactionRequest;

    /**
     * Gets the value of the doReferenceTransactionRequest property.
     * 
     * @return
     *     possible object is
     *     {@link DoReferenceTransactionRequestType }
     *     
     */
    public DoReferenceTransactionRequestType getDoReferenceTransactionRequest() {
        return doReferenceTransactionRequest;
    }

    /**
     * Sets the value of the doReferenceTransactionRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link DoReferenceTransactionRequestType }
     *     
     */
    public void setDoReferenceTransactionRequest(DoReferenceTransactionRequestType value) {
        this.doReferenceTransactionRequest = value;
    }

}
