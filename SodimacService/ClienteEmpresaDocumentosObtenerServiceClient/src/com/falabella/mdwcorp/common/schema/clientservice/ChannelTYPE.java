
package com.falabella.mdwcorp.common.schema.clientservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Channel_TYPE.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Channel_TYPE"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ASL+"/&gt;
 *     &lt;enumeration value="B2B"/&gt;
 *     &lt;enumeration value="B2C"/&gt;
 *     &lt;enumeration value="Cardif"/&gt;
 *     &lt;enumeration value="Comercio Adherido"/&gt;
 *     &lt;enumeration value="CRM"/&gt;
 *     &lt;enumeration value="Fono Compras"/&gt;
 *     &lt;enumeration value="Homy"/&gt;
 *     &lt;enumeration value="IVR"/&gt;
 *     &lt;enumeration value="Kiosco"/&gt;
 *     &lt;enumeration value="Mobile"/&gt;
 *     &lt;enumeration value="Mobile-APP"/&gt;
 *     &lt;enumeration value="Mobile-WEB"/&gt;
 *     &lt;enumeration value="Portal"/&gt;
 *     &lt;enumeration value="Presencial"/&gt;
 *     &lt;enumeration value="POS"/&gt;
 *     &lt;enumeration value="Punto de Venta"/&gt;
 *     &lt;enumeration value="SIX"/&gt;
 *     &lt;enumeration value="UXPOS"/&gt;
 *     &lt;enumeration value="Venta-Empresa"/&gt;
 *     &lt;enumeration value="Web"/&gt;
 *     &lt;enumeration value="Web CMR"/&gt;
 *     &lt;enumeration value="Web-PAC"/&gt;
 *     &lt;enumeration value="USSD"/&gt;
 *     &lt;enumeration value="DIM"/&gt;
 *     &lt;enumeration value="PMM"/&gt;
 *     &lt;enumeration value="WMOS"/&gt;
 *     &lt;enumeration value="SRX"/&gt;
 *     &lt;enumeration value="ATG"/&gt;
 *     &lt;enumeration value="OMS"/&gt;
 *     &lt;enumeration value="TRL"/&gt;
 *     &lt;enumeration value="SAB"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 *
 */
@XmlType(name = "Channel_TYPE")
@XmlEnum
public enum ChannelTYPE {

    @XmlEnumValue("ASL+")
    ASL("ASL+"),
    @XmlEnumValue("B2B")
    B_2_B("B2B"),
    @XmlEnumValue("B2C")
    B_2_C("B2C"),
    @XmlEnumValue("Cardif")
    CARDIF("Cardif"),
    @XmlEnumValue("Comercio Adherido")
    COMERCIO_ADHERIDO("Comercio Adherido"),
    CRM("CRM"),
    @XmlEnumValue("Fono Compras")
    FONO_COMPRAS("Fono Compras"),
    @XmlEnumValue("Homy")
    HOMY("Homy"),
    IVR("IVR"),
    @XmlEnumValue("Kiosco")
    KIOSCO("Kiosco"),
    @XmlEnumValue("Mobile")
    MOBILE("Mobile"),
    @XmlEnumValue("Mobile-APP")
    MOBILE_APP("Mobile-APP"),
    @XmlEnumValue("Mobile-WEB")
    MOBILE_WEB("Mobile-WEB"),
    @XmlEnumValue("Portal")
    PORTAL("Portal"),
    @XmlEnumValue("Presencial")
    PRESENCIAL("Presencial"),
    POS("POS"),
    @XmlEnumValue("Punto de Venta")
    PUNTO_DE_VENTA("Punto de Venta"),
    SIX("SIX"),
    UXPOS("UXPOS"),
    @XmlEnumValue("Venta-Empresa")
    VENTA_EMPRESA("Venta-Empresa"),
    @XmlEnumValue("Web")
    WEB("Web"),
    @XmlEnumValue("Web CMR")
    WEB_CMR("Web CMR"),
    @XmlEnumValue("Web-PAC")
    WEB_PAC("Web-PAC"),
    USSD("USSD"),
    DIM("DIM"),
    PMM("PMM"),
    WMOS("WMOS"),
    SRX("SRX"),
    ATG("ATG"),
    OMS("OMS"),
    TRL("TRL"),
    SAB("SAB");
    private final String value;

    ChannelTYPE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ChannelTYPE fromValue(String v) {
        for (ChannelTYPE c : ChannelTYPE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
