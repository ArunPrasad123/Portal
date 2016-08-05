
package com.falabella.mdwcorp.sod.cl.osb.schema.clienteempresa.documentos.obtener.req_v2016;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ubicacionConsultar_TYPE complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ubicacionConsultar_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codigoProceso" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="codigoRegion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ubicacionConsultar_TYPE", propOrder = { "codigoProceso", "codigoRegion" })
public class UbicacionConsultarTYPE {

    @XmlElement(required = true)
    protected String codigoProceso;
    protected Integer codigoRegion;

    /**
     * Gets the value of the codigoProceso property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCodigoProceso() {
        return codigoProceso;
    }

    /**
     * Sets the value of the codigoProceso property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCodigoProceso(String value) {
        this.codigoProceso = value;
    }

    /**
     * Gets the value of the codigoRegion property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getCodigoRegion() {
        return codigoRegion;
    }

    /**
     * Sets the value of the codigoRegion property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setCodigoRegion(Integer value) {
        this.codigoRegion = value;
    }

}
