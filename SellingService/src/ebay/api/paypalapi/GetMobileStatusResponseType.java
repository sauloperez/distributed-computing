
package ebay.api.paypalapi;

import java.math.BigInteger;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import ebay.apis.eblbasecomponents.AbstractResponseType;


/**
 * <p>Java class for GetMobileStatusResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetMobileStatusResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="IsActivated" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="PaymentPending" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetMobileStatusResponseType", propOrder = {
    "isActivated",
    "paymentPending"
})
public class GetMobileStatusResponseType
    extends AbstractResponseType
{

    @XmlElement(name = "IsActivated", required = true)
    protected BigInteger isActivated;
    @XmlElement(name = "PaymentPending", required = true)
    protected BigInteger paymentPending;

    /**
     * Gets the value of the isActivated property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIsActivated() {
        return isActivated;
    }

    /**
     * Sets the value of the isActivated property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIsActivated(BigInteger value) {
        this.isActivated = value;
    }

    /**
     * Gets the value of the paymentPending property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPaymentPending() {
        return paymentPending;
    }

    /**
     * Sets the value of the paymentPending property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPaymentPending(BigInteger value) {
        this.paymentPending = value;
    }

}
