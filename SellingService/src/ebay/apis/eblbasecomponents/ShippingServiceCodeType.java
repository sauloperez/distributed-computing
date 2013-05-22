
package ebay.apis.eblbasecomponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShippingServiceCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ShippingServiceCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="UPSGround"/>
 *     &lt;enumeration value="UPS3rdDay"/>
 *     &lt;enumeration value="UPS2ndDay"/>
 *     &lt;enumeration value="UPSNextDay"/>
 *     &lt;enumeration value="USPSPriority"/>
 *     &lt;enumeration value="USPSParcel"/>
 *     &lt;enumeration value="USPSMedia"/>
 *     &lt;enumeration value="USPSFirstClass"/>
 *     &lt;enumeration value="ShippingMethodStandard"/>
 *     &lt;enumeration value="ShippingMethodExpress"/>
 *     &lt;enumeration value="ShippingMethodNextDay"/>
 *     &lt;enumeration value="USPSExpressMail"/>
 *     &lt;enumeration value="USPSGround"/>
 *     &lt;enumeration value="Download"/>
 *     &lt;enumeration value="WillCall_Or_Pickup"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ShippingServiceCodeType")
@XmlEnum
public enum ShippingServiceCodeType {


    /**
     * 
     * 						    UPS Ground
     * 					
     * 
     */
    @XmlEnumValue("UPSGround")
    UPS_GROUND("UPSGround"),

    /**
     * 
     * 						   UPS 3rd Day
     * 					
     * 
     */
    @XmlEnumValue("UPS3rdDay")
    UPS_3_RD_DAY("UPS3rdDay"),

    /**
     * 
     * 						   UPS 2nd Day
     * 					
     * 
     */
    @XmlEnumValue("UPS2ndDay")
    UPS_2_ND_DAY("UPS2ndDay"),

    /**
     * 
     * 						   UPS Next Day.
     * 					
     * 
     */
    @XmlEnumValue("UPSNextDay")
    UPS_NEXT_DAY("UPSNextDay"),

    /**
     * 
     * 						   USPS Priority.
     * 					
     * 
     */
    @XmlEnumValue("USPSPriority")
    USPS_PRIORITY("USPSPriority"),

    /**
     * 
     * 						   USPS Parcel.
     * 					
     * 
     */
    @XmlEnumValue("USPSParcel")
    USPS_PARCEL("USPSParcel"),

    /**
     * 
     * 						   USPS Media.
     * 					
     * 
     */
    @XmlEnumValue("USPSMedia")
    USPS_MEDIA("USPSMedia"),

    /**
     * 
     * 						   USPS First Class
     * 					
     * 
     */
    @XmlEnumValue("USPSFirstClass")
    USPS_FIRST_CLASS("USPSFirstClass"),

    /**
     * 
     * 						    ShippingMethodStandard - used by merchant tool only
     * 					
     * 
     */
    @XmlEnumValue("ShippingMethodStandard")
    SHIPPING_METHOD_STANDARD("ShippingMethodStandard"),

    /**
     * 
     * 						  ShippingMethodExpress- used by merchant tool only
     * 					
     * 
     */
    @XmlEnumValue("ShippingMethodExpress")
    SHIPPING_METHOD_EXPRESS("ShippingMethodExpress"),

    /**
     * 
     * 						    ShippingMethodNextDay- used by merchant tool only
     * 					
     * 
     */
    @XmlEnumValue("ShippingMethodNextDay")
    SHIPPING_METHOD_NEXT_DAY("ShippingMethodNextDay"),

    /**
     * 
     * 						    USPS Express Mail
     * 				
     * 
     */
    @XmlEnumValue("USPSExpressMail")
    USPS_EXPRESS_MAIL("USPSExpressMail"),

    /**
     * 
     * 						    USPS Ground
     * 			
     * 
     */
    @XmlEnumValue("USPSGround")
    USPS_GROUND("USPSGround"),

    /**
     *  Download. 
     * 
     */
    @XmlEnumValue("Download")
    DOWNLOAD("Download"),

    /**
     *  Will Call Or Pick Up. 
     * 
     */
    @XmlEnumValue("WillCall_Or_Pickup")
    WILL_CALL_OR_PICKUP("WillCall_Or_Pickup"),

    /**
     * 
     * 						  Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    ShippingServiceCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ShippingServiceCodeType fromValue(String v) {
        for (ShippingServiceCodeType c: ShippingServiceCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}