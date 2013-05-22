
package ebay.apis.eblbasecomponents;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				CreditCardDetailsType for DCC Reference Transaction
 * 				Information about a Credit Card.
 * 			
 * 
 * <p>Java class for ReferenceCreditCardDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReferenceCreditCardDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CreditCardNumberType" type="{urn:ebay:apis:eBLBaseComponents}CreditCardNumberTypeType" minOccurs="0"/>
 *         &lt;element name="ExpMonth" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ExpYear" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CardOwnerName" type="{urn:ebay:apis:eBLBaseComponents}PersonNameType" minOccurs="0"/>
 *         &lt;element name="BillingAddress" type="{urn:ebay:apis:eBLBaseComponents}AddressType" minOccurs="0"/>
 *         &lt;element name="CVV2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StartMonth" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="StartYear" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IssueNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReferenceCreditCardDetailsType", propOrder = {
    "creditCardNumberType",
    "expMonth",
    "expYear",
    "cardOwnerName",
    "billingAddress",
    "cvv2",
    "startMonth",
    "startYear",
    "issueNumber"
})
public class ReferenceCreditCardDetailsType {

    @XmlElement(name = "CreditCardNumberType")
    protected CreditCardNumberTypeType creditCardNumberType;
    @XmlElement(name = "ExpMonth")
    protected Integer expMonth;
    @XmlElement(name = "ExpYear")
    protected Integer expYear;
    @XmlElement(name = "CardOwnerName")
    protected PersonNameType cardOwnerName;
    @XmlElement(name = "BillingAddress")
    protected AddressType billingAddress;
    @XmlElement(name = "CVV2")
    protected String cvv2;
    @XmlElement(name = "StartMonth")
    protected Integer startMonth;
    @XmlElement(name = "StartYear")
    protected Integer startYear;
    @XmlElement(name = "IssueNumber")
    protected String issueNumber;

    /**
     * Gets the value of the creditCardNumberType property.
     * 
     * @return
     *     possible object is
     *     {@link CreditCardNumberTypeType }
     *     
     */
    public CreditCardNumberTypeType getCreditCardNumberType() {
        return creditCardNumberType;
    }

    /**
     * Sets the value of the creditCardNumberType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditCardNumberTypeType }
     *     
     */
    public void setCreditCardNumberType(CreditCardNumberTypeType value) {
        this.creditCardNumberType = value;
    }

    /**
     * Gets the value of the expMonth property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExpMonth() {
        return expMonth;
    }

    /**
     * Sets the value of the expMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExpMonth(Integer value) {
        this.expMonth = value;
    }

    /**
     * Gets the value of the expYear property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExpYear() {
        return expYear;
    }

    /**
     * Sets the value of the expYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExpYear(Integer value) {
        this.expYear = value;
    }

    /**
     * Gets the value of the cardOwnerName property.
     * 
     * @return
     *     possible object is
     *     {@link PersonNameType }
     *     
     */
    public PersonNameType getCardOwnerName() {
        return cardOwnerName;
    }

    /**
     * Sets the value of the cardOwnerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonNameType }
     *     
     */
    public void setCardOwnerName(PersonNameType value) {
        this.cardOwnerName = value;
    }

    /**
     * Gets the value of the billingAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getBillingAddress() {
        return billingAddress;
    }

    /**
     * Sets the value of the billingAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setBillingAddress(AddressType value) {
        this.billingAddress = value;
    }

    /**
     * Gets the value of the cvv2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCVV2() {
        return cvv2;
    }

    /**
     * Sets the value of the cvv2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCVV2(String value) {
        this.cvv2 = value;
    }

    /**
     * Gets the value of the startMonth property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStartMonth() {
        return startMonth;
    }

    /**
     * Sets the value of the startMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStartMonth(Integer value) {
        this.startMonth = value;
    }

    /**
     * Gets the value of the startYear property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStartYear() {
        return startYear;
    }

    /**
     * Sets the value of the startYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStartYear(Integer value) {
        this.startYear = value;
    }

    /**
     * Gets the value of the issueNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssueNumber() {
        return issueNumber;
    }

    /**
     * Sets the value of the issueNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssueNumber(String value) {
        this.issueNumber = value;
    }

}
