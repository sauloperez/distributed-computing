
package ebay.api.paypalapi;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import ebay.apis.eblbasecomponents.AbstractRequestType;
import ebay.apis.eblbasecomponents.ItemTrackingDetailsType;
import ebay.apis.eblbasecomponents.OptionTrackingDetailsType;


/**
 * <p>Java class for BMSetInventoryRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BMSetInventoryRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="HostedButtonID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TrackInv" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TrackPnl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{urn:ebay:apis:eBLBaseComponents}ItemTrackingDetails" minOccurs="0"/>
 *         &lt;element name="OptionIndex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{urn:ebay:apis:eBLBaseComponents}OptionTrackingDetails" maxOccurs="10" minOccurs="0"/>
 *         &lt;element name="SoldoutURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReuseDigitalDownloadKeys" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AppendDigitalDownloadKeys" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DigitalDownloadKeys" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="1000" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BMSetInventoryRequestType", propOrder = {
    "hostedButtonID",
    "trackInv",
    "trackPnl",
    "itemTrackingDetails",
    "optionIndex",
    "optionTrackingDetails",
    "soldoutURL",
    "reuseDigitalDownloadKeys",
    "appendDigitalDownloadKeys",
    "digitalDownloadKeys"
})
public class BMSetInventoryRequestType
    extends AbstractRequestType
{

    @XmlElement(name = "HostedButtonID", required = true)
    protected String hostedButtonID;
    @XmlElement(name = "TrackInv", required = true)
    protected String trackInv;
    @XmlElement(name = "TrackPnl", required = true)
    protected String trackPnl;
    @XmlElement(name = "ItemTrackingDetails", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected ItemTrackingDetailsType itemTrackingDetails;
    @XmlElement(name = "OptionIndex")
    protected String optionIndex;
    @XmlElement(name = "OptionTrackingDetails", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<OptionTrackingDetailsType> optionTrackingDetails;
    @XmlElement(name = "SoldoutURL")
    protected String soldoutURL;
    @XmlElement(name = "ReuseDigitalDownloadKeys")
    protected String reuseDigitalDownloadKeys;
    @XmlElement(name = "AppendDigitalDownloadKeys")
    protected String appendDigitalDownloadKeys;
    @XmlElement(name = "DigitalDownloadKeys")
    protected List<String> digitalDownloadKeys;

    /**
     * Gets the value of the hostedButtonID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostedButtonID() {
        return hostedButtonID;
    }

    /**
     * Sets the value of the hostedButtonID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostedButtonID(String value) {
        this.hostedButtonID = value;
    }

    /**
     * Gets the value of the trackInv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackInv() {
        return trackInv;
    }

    /**
     * Sets the value of the trackInv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackInv(String value) {
        this.trackInv = value;
    }

    /**
     * Gets the value of the trackPnl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackPnl() {
        return trackPnl;
    }

    /**
     * Sets the value of the trackPnl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackPnl(String value) {
        this.trackPnl = value;
    }

    /**
     * Gets the value of the itemTrackingDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ItemTrackingDetailsType }
     *     
     */
    public ItemTrackingDetailsType getItemTrackingDetails() {
        return itemTrackingDetails;
    }

    /**
     * Sets the value of the itemTrackingDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemTrackingDetailsType }
     *     
     */
    public void setItemTrackingDetails(ItemTrackingDetailsType value) {
        this.itemTrackingDetails = value;
    }

    /**
     * Gets the value of the optionIndex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptionIndex() {
        return optionIndex;
    }

    /**
     * Sets the value of the optionIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptionIndex(String value) {
        this.optionIndex = value;
    }

    /**
     * Gets the value of the optionTrackingDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the optionTrackingDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOptionTrackingDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OptionTrackingDetailsType }
     * 
     * 
     */
    public List<OptionTrackingDetailsType> getOptionTrackingDetails() {
        if (optionTrackingDetails == null) {
            optionTrackingDetails = new ArrayList<OptionTrackingDetailsType>();
        }
        return this.optionTrackingDetails;
    }

    /**
     * Gets the value of the soldoutURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoldoutURL() {
        return soldoutURL;
    }

    /**
     * Sets the value of the soldoutURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoldoutURL(String value) {
        this.soldoutURL = value;
    }

    /**
     * Gets the value of the reuseDigitalDownloadKeys property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReuseDigitalDownloadKeys() {
        return reuseDigitalDownloadKeys;
    }

    /**
     * Sets the value of the reuseDigitalDownloadKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReuseDigitalDownloadKeys(String value) {
        this.reuseDigitalDownloadKeys = value;
    }

    /**
     * Gets the value of the appendDigitalDownloadKeys property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppendDigitalDownloadKeys() {
        return appendDigitalDownloadKeys;
    }

    /**
     * Sets the value of the appendDigitalDownloadKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppendDigitalDownloadKeys(String value) {
        this.appendDigitalDownloadKeys = value;
    }

    /**
     * Gets the value of the digitalDownloadKeys property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the digitalDownloadKeys property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDigitalDownloadKeys().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDigitalDownloadKeys() {
        if (digitalDownloadKeys == null) {
            digitalDownloadKeys = new ArrayList<String>();
        }
        return this.digitalDownloadKeys;
    }

}
