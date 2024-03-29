
package ebay.api.paypalapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import ebay.apis.eblbasecomponents.AbstractResponseType;
import ebay.apis.eblbasecomponents.DoReferenceTransactionResponseDetailsType;
import ebay.apis.eblbasecomponents.FMFDetailsType;


/**
 * <p>Java class for DoReferenceTransactionResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DoReferenceTransactionResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ebay:apis:eBLBaseComponents}DoReferenceTransactionResponseDetails"/>
 *         &lt;element name="FMFDetails" type="{urn:ebay:apis:eBLBaseComponents}FMFDetailsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DoReferenceTransactionResponseType", propOrder = {
    "doReferenceTransactionResponseDetails",
    "fmfDetails"
})
public class DoReferenceTransactionResponseType
    extends AbstractResponseType
{

    @XmlElement(name = "DoReferenceTransactionResponseDetails", namespace = "urn:ebay:apis:eBLBaseComponents", required = true)
    protected DoReferenceTransactionResponseDetailsType doReferenceTransactionResponseDetails;
    @XmlElement(name = "FMFDetails")
    protected FMFDetailsType fmfDetails;

    /**
     * Gets the value of the doReferenceTransactionResponseDetails property.
     * 
     * @return
     *     possible object is
     *     {@link DoReferenceTransactionResponseDetailsType }
     *     
     */
    public DoReferenceTransactionResponseDetailsType getDoReferenceTransactionResponseDetails() {
        return doReferenceTransactionResponseDetails;
    }

    /**
     * Sets the value of the doReferenceTransactionResponseDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link DoReferenceTransactionResponseDetailsType }
     *     
     */
    public void setDoReferenceTransactionResponseDetails(DoReferenceTransactionResponseDetailsType value) {
        this.doReferenceTransactionResponseDetails = value;
    }

    /**
     * Gets the value of the fmfDetails property.
     * 
     * @return
     *     possible object is
     *     {@link FMFDetailsType }
     *     
     */
    public FMFDetailsType getFMFDetails() {
        return fmfDetails;
    }

    /**
     * Sets the value of the fmfDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link FMFDetailsType }
     *     
     */
    public void setFMFDetails(FMFDetailsType value) {
        this.fmfDetails = value;
    }

}
