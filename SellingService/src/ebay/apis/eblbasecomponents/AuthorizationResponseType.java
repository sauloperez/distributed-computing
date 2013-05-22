
package ebay.apis.eblbasecomponents;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AuthorizationResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AuthorizationResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Status" type="{urn:ebay:apis:eBLBaseComponents}AckCodeType"/>
 *         &lt;element name="AuthorizationError" type="{urn:ebay:apis:eBLBaseComponents}ErrorType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuthorizationResponseType", propOrder = {
    "status",
    "authorizationError"
})
public class AuthorizationResponseType {

    @XmlElement(name = "Status", required = true)
    protected AckCodeType status;
    @XmlElement(name = "AuthorizationError")
    protected List<ErrorType> authorizationError;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link AckCodeType }
     *     
     */
    public AckCodeType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link AckCodeType }
     *     
     */
    public void setStatus(AckCodeType value) {
        this.status = value;
    }

    /**
     * Gets the value of the authorizationError property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the authorizationError property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthorizationError().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ErrorType }
     * 
     * 
     */
    public List<ErrorType> getAuthorizationError() {
        if (authorizationError == null) {
            authorizationError = new ArrayList<ErrorType>();
        }
        return this.authorizationError;
    }

}
