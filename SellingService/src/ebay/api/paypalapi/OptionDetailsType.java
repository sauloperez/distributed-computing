
package ebay.api.paypalapi;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OptionDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OptionDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OptionName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OptionSelectionDetails" type="{urn:ebay:api:PayPalAPI}OptionSelectionDetailsType" maxOccurs="100" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OptionDetailsType", propOrder = {
    "optionName",
    "optionSelectionDetails"
})
public class OptionDetailsType {

    @XmlElement(name = "OptionName", required = true)
    protected String optionName;
    @XmlElement(name = "OptionSelectionDetails")
    protected List<OptionSelectionDetailsType> optionSelectionDetails;

    /**
     * Gets the value of the optionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptionName() {
        return optionName;
    }

    /**
     * Sets the value of the optionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptionName(String value) {
        this.optionName = value;
    }

    /**
     * Gets the value of the optionSelectionDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the optionSelectionDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOptionSelectionDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OptionSelectionDetailsType }
     * 
     * 
     */
    public List<OptionSelectionDetailsType> getOptionSelectionDetails() {
        if (optionSelectionDetails == null) {
            optionSelectionDetails = new ArrayList<OptionSelectionDetailsType>();
        }
        return this.optionSelectionDetails;
    }

}
