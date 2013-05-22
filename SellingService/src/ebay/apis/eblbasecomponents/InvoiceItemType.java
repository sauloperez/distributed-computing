
package ebay.apis.eblbasecomponents;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import ebay.apis.corecomponenttypes.BasicAmountType;


/**
 * 
 * 						Describes an individual item for an invoice.
 * 					
 * 
 * <p>Java class for InvoiceItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvoiceItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EAN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SKU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReturnPolicyIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Price" type="{urn:ebay:apis:CoreComponentTypes}BasicAmountType" minOccurs="0"/>
 *         &lt;element name="ItemPrice" type="{urn:ebay:apis:CoreComponentTypes}BasicAmountType" minOccurs="0"/>
 *         &lt;element name="ItemCount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="ItemCountUnit" type="{urn:ebay:apis:eBLBaseComponents}UnitOfMeasure" minOccurs="0"/>
 *         &lt;element name="Discount" type="{urn:ebay:apis:eBLBaseComponents}DiscountType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Taxable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="TaxRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="AdditionalFees" type="{urn:ebay:apis:eBLBaseComponents}AdditionalFeeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Reimbursable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MPN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ISBN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PLU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ModelNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StyleNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceItemType", propOrder = {
    "name",
    "description",
    "ean",
    "sku",
    "returnPolicyIdentifier",
    "price",
    "itemPrice",
    "itemCount",
    "itemCountUnit",
    "discount",
    "taxable",
    "taxRate",
    "additionalFees",
    "reimbursable",
    "mpn",
    "isbn",
    "plu",
    "modelNumber",
    "styleNumber"
})
public class InvoiceItemType {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "EAN")
    protected String ean;
    @XmlElement(name = "SKU")
    protected String sku;
    @XmlElement(name = "ReturnPolicyIdentifier")
    protected String returnPolicyIdentifier;
    @XmlElement(name = "Price")
    protected BasicAmountType price;
    @XmlElement(name = "ItemPrice")
    protected BasicAmountType itemPrice;
    @XmlElement(name = "ItemCount")
    protected Double itemCount;
    @XmlElement(name = "ItemCountUnit")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String itemCountUnit;
    @XmlElement(name = "Discount")
    protected List<DiscountType> discount;
    @XmlElement(name = "Taxable")
    protected Boolean taxable;
    @XmlElement(name = "TaxRate")
    protected Double taxRate;
    @XmlElement(name = "AdditionalFees")
    protected List<AdditionalFeeType> additionalFees;
    @XmlElement(name = "Reimbursable")
    protected Boolean reimbursable;
    @XmlElement(name = "MPN")
    protected String mpn;
    @XmlElement(name = "ISBN")
    protected String isbn;
    @XmlElement(name = "PLU")
    protected String plu;
    @XmlElement(name = "ModelNumber")
    protected String modelNumber;
    @XmlElement(name = "StyleNumber")
    protected String styleNumber;

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
     * Gets the value of the ean property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEAN() {
        return ean;
    }

    /**
     * Sets the value of the ean property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEAN(String value) {
        this.ean = value;
    }

    /**
     * Gets the value of the sku property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSKU() {
        return sku;
    }

    /**
     * Sets the value of the sku property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSKU(String value) {
        this.sku = value;
    }

    /**
     * Gets the value of the returnPolicyIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnPolicyIdentifier() {
        return returnPolicyIdentifier;
    }

    /**
     * Sets the value of the returnPolicyIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnPolicyIdentifier(String value) {
        this.returnPolicyIdentifier = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link BasicAmountType }
     *     
     */
    public BasicAmountType getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasicAmountType }
     *     
     */
    public void setPrice(BasicAmountType value) {
        this.price = value;
    }

    /**
     * Gets the value of the itemPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BasicAmountType }
     *     
     */
    public BasicAmountType getItemPrice() {
        return itemPrice;
    }

    /**
     * Sets the value of the itemPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasicAmountType }
     *     
     */
    public void setItemPrice(BasicAmountType value) {
        this.itemPrice = value;
    }

    /**
     * Gets the value of the itemCount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getItemCount() {
        return itemCount;
    }

    /**
     * Sets the value of the itemCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setItemCount(Double value) {
        this.itemCount = value;
    }

    /**
     * Gets the value of the itemCountUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemCountUnit() {
        return itemCountUnit;
    }

    /**
     * Sets the value of the itemCountUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemCountUnit(String value) {
        this.itemCountUnit = value;
    }

    /**
     * Gets the value of the discount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the discount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDiscount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DiscountType }
     * 
     * 
     */
    public List<DiscountType> getDiscount() {
        if (discount == null) {
            discount = new ArrayList<DiscountType>();
        }
        return this.discount;
    }

    /**
     * Gets the value of the taxable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTaxable() {
        return taxable;
    }

    /**
     * Sets the value of the taxable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTaxable(Boolean value) {
        this.taxable = value;
    }

    /**
     * Gets the value of the taxRate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTaxRate() {
        return taxRate;
    }

    /**
     * Sets the value of the taxRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTaxRate(Double value) {
        this.taxRate = value;
    }

    /**
     * Gets the value of the additionalFees property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalFees property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalFees().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalFeeType }
     * 
     * 
     */
    public List<AdditionalFeeType> getAdditionalFees() {
        if (additionalFees == null) {
            additionalFees = new ArrayList<AdditionalFeeType>();
        }
        return this.additionalFees;
    }

    /**
     * Gets the value of the reimbursable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReimbursable() {
        return reimbursable;
    }

    /**
     * Sets the value of the reimbursable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReimbursable(Boolean value) {
        this.reimbursable = value;
    }

    /**
     * Gets the value of the mpn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMPN() {
        return mpn;
    }

    /**
     * Sets the value of the mpn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMPN(String value) {
        this.mpn = value;
    }

    /**
     * Gets the value of the isbn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISBN() {
        return isbn;
    }

    /**
     * Sets the value of the isbn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISBN(String value) {
        this.isbn = value;
    }

    /**
     * Gets the value of the plu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPLU() {
        return plu;
    }

    /**
     * Sets the value of the plu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPLU(String value) {
        this.plu = value;
    }

    /**
     * Gets the value of the modelNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelNumber() {
        return modelNumber;
    }

    /**
     * Sets the value of the modelNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelNumber(String value) {
        this.modelNumber = value;
    }

    /**
     * Gets the value of the styleNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStyleNumber() {
        return styleNumber;
    }

    /**
     * Sets the value of the styleNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStyleNumber(String value) {
        this.styleNumber = value;
    }

}
