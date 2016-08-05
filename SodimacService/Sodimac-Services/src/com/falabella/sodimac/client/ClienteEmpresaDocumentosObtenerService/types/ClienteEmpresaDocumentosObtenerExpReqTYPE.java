
package com.falabella.sodimac.client.ClienteEmpresaDocumentosObtenerService.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for clienteEmpresaDocumentosObtenerExpReq_TYPE complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="clienteEmpresaDocumentosObtenerExpReq_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="identificadorCliente" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="identificadorEmpresa" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="fechaVencimientoInicio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fechaVencimientoFin" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="tipoDocumento" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numeroFilas" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clienteEmpresaDocumentosObtenerExpReq_TYPE",
         namespace = "http://mdwcorp.falabella.com/SOD/CL/OSB/schema/Clienteempresa/Documentos/Obtener/Req-v2016.07",
         propOrder =
         { "identificadorCliente", "identificadorEmpresa", "fechaVencimientoInicio", "fechaVencimientoFin",
           "tipoDocumento", "estado", "numeroFilas"
    })
public class ClienteEmpresaDocumentosObtenerExpReqTYPE {

    @XmlElement(required = true)
    protected String identificadorCliente;
    @XmlElement(required = true)
    protected String identificadorEmpresa;
    protected String fechaVencimientoInicio;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaVencimientoFin;
    protected Short tipoDocumento;
    protected String estado;
    protected Integer numeroFilas;

    /**
     * Gets the value of the identificadorCliente property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIdentificadorCliente() {
        return identificadorCliente;
    }

    /**
     * Sets the value of the identificadorCliente property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIdentificadorCliente(String value) {
        this.identificadorCliente = value;
    }

    /**
     * Gets the value of the identificadorEmpresa property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIdentificadorEmpresa() {
        return identificadorEmpresa;
    }

    /**
     * Sets the value of the identificadorEmpresa property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIdentificadorEmpresa(String value) {
        this.identificadorEmpresa = value;
    }

    /**
     * Gets the value of the fechaVencimientoInicio property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFechaVencimientoInicio() {
        return fechaVencimientoInicio;
    }

    /**
     * Sets the value of the fechaVencimientoInicio property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFechaVencimientoInicio(String value) {
        this.fechaVencimientoInicio = value;
    }

    /**
     * Gets the value of the fechaVencimientoFin property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getFechaVencimientoFin() {
        return fechaVencimientoFin;
    }

    /**
     * Sets the value of the fechaVencimientoFin property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setFechaVencimientoFin(XMLGregorianCalendar value) {
        this.fechaVencimientoFin = value;
    }

    /**
     * Gets the value of the tipoDocumento property.
     *
     * @return
     *     possible object is
     *     {@link Short }
     *
     */
    public Short getTipoDocumento() {
        return tipoDocumento;
    }

    /**
     * Sets the value of the tipoDocumento property.
     *
     * @param value
     *     allowed object is
     *     {@link Short }
     *
     */
    public void setTipoDocumento(Short value) {
        this.tipoDocumento = value;
    }

    /**
     * Gets the value of the estado property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Sets the value of the estado property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setEstado(String value) {
        this.estado = value;
    }

    /**
     * Gets the value of the numeroFilas property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getNumeroFilas() {
        return numeroFilas;
    }

    /**
     * Sets the value of the numeroFilas property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setNumeroFilas(Integer value) {
        this.numeroFilas = value;
    }

}
