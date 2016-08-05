
package com.falabella.sodimac.client.ClienteEmpresaDocumentosObtenerService.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Country_TYPE.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Country_TYPE"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AR"/&gt;
 *     &lt;enumeration value="BR"/&gt;
 *     &lt;enumeration value="CL"/&gt;
 *     &lt;enumeration value="CO"/&gt;
 *     &lt;enumeration value="PE"/&gt;
 *     &lt;enumeration value="UY"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 *
 */
@XmlType(name = "Country_TYPE", namespace = "http://mdwcorp.falabella.com/common/schema/clientservice")
@XmlEnum
public enum CountryTYPE {

    AR,
    BR,
    CL,
    CO,
    PE,
    UY;

    public String value() {
        return name();
    }

    public static CountryTYPE fromValue(String v) {
        return valueOf(v);
    }

}
