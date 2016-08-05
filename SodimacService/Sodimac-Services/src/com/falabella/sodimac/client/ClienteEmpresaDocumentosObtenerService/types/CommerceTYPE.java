
package com.falabella.sodimac.client.ClienteEmpresaDocumentosObtenerService.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Commerce_TYPE.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Commerce_TYPE"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Banco"/&gt;
 *     &lt;enumeration value="CMR"/&gt;
 *     &lt;enumeration value="Falabella"/&gt;
 *     &lt;enumeration value="Seguros"/&gt;
 *     &lt;enumeration value="Sodimac"/&gt;
 *     &lt;enumeration value="Tottus"/&gt;
 *     &lt;enumeration value="Movil"/&gt;
 *     &lt;enumeration value="Viajes"/&gt;
 *     &lt;enumeration value="Falabella Movil"/&gt;
 *     &lt;enumeration value="CrateAndBarrel"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 *
 */
@XmlType(name = "Commerce_TYPE", namespace = "http://mdwcorp.falabella.com/common/schema/clientservice")
@XmlEnum
public enum CommerceTYPE {

    @XmlEnumValue("Banco")
    BANCO("Banco"),
    CMR("CMR"),
    @XmlEnumValue("Falabella")
    FALABELLA("Falabella"),
    @XmlEnumValue("Seguros")
    SEGUROS("Seguros"),
    @XmlEnumValue("Sodimac")
    SODIMAC("Sodimac"),
    @XmlEnumValue("Tottus")
    TOTTUS("Tottus"),
    @XmlEnumValue("Movil")
    MOVIL("Movil"),
    @XmlEnumValue("Viajes")
    VIAJES("Viajes"),
    @XmlEnumValue("Falabella Movil")
    FALABELLA_MOVIL("Falabella Movil"),
    @XmlEnumValue("CrateAndBarrel")
    CRATE_AND_BARREL("CrateAndBarrel");
    private final String value;

    CommerceTYPE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CommerceTYPE fromValue(String v) {
        for (CommerceTYPE c : CommerceTYPE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
