
package ebay.apis.eblbasecomponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IncentiveAppliedStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IncentiveAppliedStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="INCENTIVE-APPLIED-STATUS-SUCCESS"/>
 *     &lt;enumeration value="INCENTIVE-APPLIED-STATUS-ERROR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IncentiveAppliedStatusType")
@XmlEnum
public enum IncentiveAppliedStatusType {

    @XmlEnumValue("INCENTIVE-APPLIED-STATUS-SUCCESS")
    INCENTIVE_APPLIED_STATUS_SUCCESS("INCENTIVE-APPLIED-STATUS-SUCCESS"),
    @XmlEnumValue("INCENTIVE-APPLIED-STATUS-ERROR")
    INCENTIVE_APPLIED_STATUS_ERROR("INCENTIVE-APPLIED-STATUS-ERROR");
    private final String value;

    IncentiveAppliedStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IncentiveAppliedStatusType fromValue(String v) {
        for (IncentiveAppliedStatusType c: IncentiveAppliedStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
