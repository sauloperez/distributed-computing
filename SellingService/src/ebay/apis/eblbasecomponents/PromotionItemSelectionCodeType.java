
package ebay.apis.eblbasecomponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PromotionItemSelectionCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PromotionItemSelectionCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Manual"/>
 *     &lt;enumeration value="Automatic"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PromotionItemSelectionCodeType")
@XmlEnum
public enum PromotionItemSelectionCodeType {


    /**
     * 
     * 						    Manual Selection
     * 					
     * 
     */
    @XmlEnumValue("Manual")
    MANUAL("Manual"),

    /**
     * 
     * 						  Automatic Selection
     * 					
     * 
     */
    @XmlEnumValue("Automatic")
    AUTOMATIC("Automatic"),

    /**
     * 
     * 						  Reserved. Do not use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    PromotionItemSelectionCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PromotionItemSelectionCodeType fromValue(String v) {
        for (PromotionItemSelectionCodeType c: PromotionItemSelectionCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
