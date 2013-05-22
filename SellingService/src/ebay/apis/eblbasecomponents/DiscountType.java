
package ebay.apis.eblbasecomponents;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import ebay.apis.corecomponenttypes.BasicAmountType;


/**
 * 
 * 						Describes discount information
 * 					
 * 
 * <p>Java class for DiscountType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DiscountType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Amount" type="{urn:ebay:apis:CoreComponentTypes}BasicAmountType"/>
 *         &lt;element name="RedeemedOfferType" type="{urn:ebay:apis:eBLBaseComponents}RedeemedOfferType" minOccurs="0"/>
 *         &lt;element name="RedeemedOfferID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiscountType", propOrder = {
    "name",
    "description",
    "amount",
    "redeemedOfferType",
    "redeemedOfferID"
})
public class DiscountType {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Amount", required = true)
    protected BasicAmountType amount;
    @XmlElement(name = "RedeemedOfferType")
    protected RedeemedOfferType redeemedOfferType;
    @XmlElement(name = "RedeemedOfferID")
    protected String redeemedOfferID;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BasicAmountType }
     *     
     */
    public BasicAmountType getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasicAmountType }
     *     
     */
    public void setAmount(BasicAmountType value) {
        this.amount = value;
    }

    /**
     * Gets the value of the redeemedOfferType property.
     * 
     * @return
     *     possible object is
     *     {@link RedeemedOfferType }
     *     
     */
    public RedeemedOfferType getRedeemedOfferType() {
        return redeemedOfferType;
    }

    /**
     * Sets the value of the redeemedOfferType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RedeemedOfferType }
     *     
     */
    public void setRedeemedOfferType(RedeemedOfferType value) {
        this.redeemedOfferType = value;
    }

    /**
     * Gets the value of the redeemedOfferID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedeemedOfferID() {
        return redeemedOfferID;
    }

    /**
     * Sets the value of the redeemedOfferID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedeemedOfferID(String value) {
        this.redeemedOfferID = value;
    }

}
