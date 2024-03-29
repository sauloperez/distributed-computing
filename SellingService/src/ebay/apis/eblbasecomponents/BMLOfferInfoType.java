
package ebay.apis.eblbasecomponents;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				BMLOfferInfoType
 * 				Specific information for BML.
 * 			
 * 
 * <p>Java class for BMLOfferInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BMLOfferInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OfferTrackingID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BMLOfferInfoType", propOrder = {
    "offerTrackingID"
})
public class BMLOfferInfoType {

    @XmlElement(name = "OfferTrackingID")
    protected String offerTrackingID;

    /**
     * Gets the value of the offerTrackingID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferTrackingID() {
        return offerTrackingID;
    }

    /**
     * Sets the value of the offerTrackingID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferTrackingID(String value) {
        this.offerTrackingID = value;
    }

}
