
package ebay.apis.eblbasecomponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RefundType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RefundType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Full"/>
 *     &lt;enumeration value="Partial"/>
 *     &lt;enumeration value="ExternalDispute"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RefundType")
@XmlEnum
public enum RefundType {

    @XmlEnumValue("Other")
    OTHER("Other"),

    /**
     * Full Refund
     * 
     */
    @XmlEnumValue("Full")
    FULL("Full"),

    /**
     * Partial Refund
     * 
     */
    @XmlEnumValue("Partial")
    PARTIAL("Partial"),

    /**
     * External Dispute
     * 
     */
    @XmlEnumValue("ExternalDispute")
    EXTERNAL_DISPUTE("ExternalDispute");
    private final String value;

    RefundType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RefundType fromValue(String v) {
        for (RefundType c: RefundType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
