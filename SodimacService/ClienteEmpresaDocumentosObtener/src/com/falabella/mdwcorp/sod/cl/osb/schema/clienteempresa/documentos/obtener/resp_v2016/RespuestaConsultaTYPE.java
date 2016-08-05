
package com.falabella.mdwcorp.sod.cl.osb.schema.clienteempresa.documentos.obtener.resp_v2016;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for respuestaConsulta_TYPE complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="respuestaConsulta_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codigoRespuesta" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="descripcionRespuesta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="cantidadDocumentos" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "respuestaConsulta_TYPE",
         propOrder = { "codigoRespuesta", "descripcionRespuesta", "cantidadDocumentos" })
public class RespuestaConsultaTYPE {

    protected int codigoRespuesta;
    @XmlElement(required = true)
    protected String descripcionRespuesta;
    protected int cantidadDocumentos;

    /**
     * Gets the value of the codigoRespuesta property.
     *
     */
    public int getCodigoRespuesta() {
        return codigoRespuesta;
    }

    /**
     * Sets the value of the codigoRespuesta property.
     *
     */
    public void setCodigoRespuesta(int value) {
        this.codigoRespuesta = value;
    }

    /**
     * Gets the value of the descripcionRespuesta property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDescripcionRespuesta() {
        return descripcionRespuesta;
    }

    /**
     * Sets the value of the descripcionRespuesta property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDescripcionRespuesta(String value) {
        this.descripcionRespuesta = value;
    }

    /**
     * Gets the value of the cantidadDocumentos property.
     *
     */
    public int getCantidadDocumentos() {
        return cantidadDocumentos;
    }

    /**
     * Sets the value of the cantidadDocumentos property.
     *
     */
    public void setCantidadDocumentos(int value) {
        this.cantidadDocumentos = value;
    }

}
