
package ebay.apis.eblbasecomponents;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * 				Details about the seller.
 * 			
 * 
 * <p>Java class for SellerDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SellerDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SellerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SellerUserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SellerRegistrationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="PayPalAccountID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SecureMerchantAccountID" type="{urn:ebay:apis:eBLBaseComponents}UserIDType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SellerDetailsType", propOrder = {
    "sellerId",
    "sellerUserName",
    "sellerRegistrationDate",
    "payPalAccountID",
    "secureMerchantAccountID"
})
public class SellerDetailsType {

    @XmlElement(name = "SellerId")
    protected String sellerId;
    @XmlElement(name = "SellerUserName")
    protected String sellerUserName;
    @XmlElement(name = "SellerRegistrationDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar sellerRegistrationDate;
    @XmlElement(name = "PayPalAccountID")
    protected String payPalAccountID;
    @XmlElement(name = "SecureMerchantAccountID")
    protected String secureMerchantAccountID;

    /**
     * Gets the value of the sellerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellerId() {
        return sellerId;
    }

    /**
     * Sets the value of the sellerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellerId(String value) {
        this.sellerId = value;
    }

    /**
     * Gets the value of the sellerUserName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellerUserName() {
        return sellerUserName;
    }

    /**
     * Sets the value of the sellerUserName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellerUserName(String value) {
        this.sellerUserName = value;
    }

    /**
     * Gets the value of the sellerRegistrationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSellerRegistrationDate() {
        return sellerRegistrationDate;
    }

    /**
     * Sets the value of the sellerRegistrationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSellerRegistrationDate(XMLGregorianCalendar value) {
        this.sellerRegistrationDate = value;
    }

    /**
     * Gets the value of the payPalAccountID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayPalAccountID() {
        return payPalAccountID;
    }

    /**
     * Sets the value of the payPalAccountID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayPalAccountID(String value) {
        this.payPalAccountID = value;
    }

    /**
     * Gets the value of the secureMerchantAccountID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecureMerchantAccountID() {
        return secureMerchantAccountID;
    }

    /**
     * Sets the value of the secureMerchantAccountID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecureMerchantAccountID(String value) {
        this.secureMerchantAccountID = value;
    }

}
