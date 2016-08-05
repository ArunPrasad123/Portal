
package com.falabella.sodimac.client.CuentaCorrienteSaldoObtenerService.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for respMensaje_TYPE complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="respMensaje_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codigoMensaje" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="descripcionMensaje" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "respMensaje_TYPE", propOrder = { "codigoMensaje", "descripcionMensaje" })
public class RespMensajeTYPE {

    protected int codigoMensaje;
    @XmlElement(required = true)
    protected String descripcionMensaje;

    /**
     * Gets the value of the codigoMensaje property.
     *
     */
    public int getCodigoMensaje() {
        return codigoMensaje;
    }

    /**
     * Sets the value of the codigoMensaje property.
     *
     */
    public void setCodigoMensaje(int value) {
        this.codigoMensaje = value;
    }

    /**
     * Gets the value of the descripcionMensaje property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDescripcionMensaje() {
        return descripcionMensaje;
    }

    /**
     * Sets the value of the descripcionMensaje property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDescripcionMensaje(String value) {
        this.descripcionMensaje = value;
    }

}
