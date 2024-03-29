
package ebay.api.paypalapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import ebay.apis.eblbasecomponents.AbstractResponseType;
import ebay.apis.eblbasecomponents.PaymentTransactionType;
import ebay.apis.eblbasecomponents.ThreeDSecureInfoType;


/**
 * <p>Java class for GetTransactionDetailsResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetTransactionDetailsResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ebay:apis:eBLBaseComponents}PaymentTransactionDetails"/>
 *         &lt;element ref="{urn:ebay:apis:eBLBaseComponents}ThreeDSecureDetails"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetTransactionDetailsResponseType", propOrder = {
    "paymentTransactionDetails",
    "threeDSecureDetails"
})
public class GetTransactionDetailsResponseType
    extends AbstractResponseType
{

    @XmlElement(name = "PaymentTransactionDetails", namespace = "urn:ebay:apis:eBLBaseComponents", required = true)
    protected PaymentTransactionType paymentTransactionDetails;
    @XmlElement(name = "ThreeDSecureDetails", namespace = "urn:ebay:apis:eBLBaseComponents", required = true)
    protected ThreeDSecureInfoType threeDSecureDetails;

    /**
     * Gets the value of the paymentTransactionDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTransactionType }
     *     
     */
    public PaymentTransactionType getPaymentTransactionDetails() {
        return paymentTransactionDetails;
    }

    /**
     * Sets the value of the paymentTransactionDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTransactionType }
     *     
     */
    public void setPaymentTransactionDetails(PaymentTransactionType value) {
        this.paymentTransactionDetails = value;
    }

    /**
     * Gets the value of the threeDSecureDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ThreeDSecureInfoType }
     *     
     */
    public ThreeDSecureInfoType getThreeDSecureDetails() {
        return threeDSecureDetails;
    }

    /**
     * Sets the value of the threeDSecureDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThreeDSecureInfoType }
     *     
     */
    public void setThreeDSecureDetails(ThreeDSecureInfoType value) {
        this.threeDSecureDetails = value;
    }

}
