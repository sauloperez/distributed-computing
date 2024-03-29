
package ebay.api.paypalapi;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import ebay.apis.eblbasecomponents.OptionTypeListType;


/**
 * <p>Java class for OptionSelectionDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OptionSelectionDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OptionSelection" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Price" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OptionType" type="{urn:ebay:apis:eBLBaseComponents}OptionTypeListType" minOccurs="0"/>
 *         &lt;element name="PaymentPeriod" type="{urn:ebay:api:PayPalAPI}InstallmentDetailsType" maxOccurs="10" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OptionSelectionDetailsType", propOrder = {
    "optionSelection",
    "price",
    "optionType",
    "paymentPeriod"
})
public class OptionSelectionDetailsType {

    @XmlElement(name = "OptionSelection", required = true)
    protected String optionSelection;
    @XmlElement(name = "Price")
    protected String price;
    @XmlElement(name = "OptionType")
    protected OptionTypeListType optionType;
    @XmlElement(name = "PaymentPeriod")
    protected List<InstallmentDetailsType> paymentPeriod;

    /**
     * Gets the value of the optionSelection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptionSelection() {
        return optionSelection;
    }

    /**
     * Sets the value of the optionSelection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptionSelection(String value) {
        this.optionSelection = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrice(String value) {
        this.price = value;
    }

    /**
     * Gets the value of the optionType property.
     * 
     * @return
     *     possible object is
     *     {@link OptionTypeListType }
     *     
     */
    public OptionTypeListType getOptionType() {
        return optionType;
    }

    /**
     * Sets the value of the optionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionTypeListType }
     *     
     */
    public void setOptionType(OptionTypeListType value) {
        this.optionType = value;
    }

    /**
     * Gets the value of the paymentPeriod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentPeriod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentPeriod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InstallmentDetailsType }
     * 
     * 
     */
    public List<InstallmentDetailsType> getPaymentPeriod() {
        if (paymentPeriod == null) {
            paymentPeriod = new ArrayList<InstallmentDetailsType>();
        }
        return this.paymentPeriod;
    }

}
