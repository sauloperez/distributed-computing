
package ebay.apis.eblbasecomponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for APIType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="APIType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="CHECKOUT_AUTHORIZATION"/>
 *     &lt;enumeration value="CHECKOUT_SALE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "APIType")
@XmlEnum
public enum APIType {


    /**
     * POS CHECKOUT AUTHORIZATION
     * 
     */
    CHECKOUT_AUTHORIZATION,

    /**
     * POS CHECKOUT SALE
     * 
     */
    CHECKOUT_SALE;

    public String value() {
        return name();
    }

    public static APIType fromValue(String v) {
        return valueOf(v);
    }

}
