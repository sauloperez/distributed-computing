
package ebay.apis.eblbasecomponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CoupleType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CoupleType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="LifeTime"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CoupleType")
@XmlEnum
public enum CoupleType {


    /**
     * 
     * 								The relation between buckets are for lifetime. Any post-transaction action on one affects other as well.
     * 							
     * 
     */
    @XmlEnumValue("LifeTime")
    LIFE_TIME("LifeTime");
    private final String value;

    CoupleType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CoupleType fromValue(String v) {
        for (CoupleType c: CoupleType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
