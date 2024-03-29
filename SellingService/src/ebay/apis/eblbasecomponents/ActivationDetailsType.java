
package ebay.apis.eblbasecomponents;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import ebay.apis.corecomponenttypes.BasicAmountType;


/**
 * <p>Java class for ActivationDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActivationDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InitialAmount" type="{urn:ebay:apis:CoreComponentTypes}BasicAmountType"/>
 *         &lt;element name="FailedInitialAmountAction" type="{urn:ebay:apis:eBLBaseComponents}FailedPaymentActionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActivationDetailsType", propOrder = {
    "initialAmount",
    "failedInitialAmountAction"
})
public class ActivationDetailsType {

    @XmlElement(name = "InitialAmount", required = true)
    protected BasicAmountType initialAmount;
    @XmlElement(name = "FailedInitialAmountAction")
    protected FailedPaymentActionType failedInitialAmountAction;

    /**
     * Gets the value of the initialAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BasicAmountType }
     *     
     */
    public BasicAmountType getInitialAmount() {
        return initialAmount;
    }

    /**
     * Sets the value of the initialAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasicAmountType }
     *     
     */
    public void setInitialAmount(BasicAmountType value) {
        this.initialAmount = value;
    }

    /**
     * Gets the value of the failedInitialAmountAction property.
     * 
     * @return
     *     possible object is
     *     {@link FailedPaymentActionType }
     *     
     */
    public FailedPaymentActionType getFailedInitialAmountAction() {
        return failedInitialAmountAction;
    }

    /**
     * Sets the value of the failedInitialAmountAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link FailedPaymentActionType }
     *     
     */
    public void setFailedInitialAmountAction(FailedPaymentActionType value) {
        this.failedInitialAmountAction = value;
    }

}
