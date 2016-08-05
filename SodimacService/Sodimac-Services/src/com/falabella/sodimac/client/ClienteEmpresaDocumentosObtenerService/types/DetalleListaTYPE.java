
package com.falabella.sodimac.client.ClienteEmpresaDocumentosObtenerService.types;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for detalleLista_TYPE complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="detalleLista_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="identificadorTipoDocumento" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="nombreTipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="identificadorUnidad" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="nombreUnidad" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="numeroDocumento" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="documentoFechaEmision" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="saldo" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="saldoVencido" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="documentoFechaVencimiento" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="diasVencido" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="documentoEstado" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "detalleLista_TYPE",
         propOrder =
         { "identificadorTipoDocumento", "nombreTipoDocumento", "identificadorUnidad", "nombreUnidad",
           "numeroDocumento", "documentoFechaEmision", "saldo", "saldoVencido", "documentoFechaVencimiento",
           "diasVencido", "documentoEstado"
    })
public class DetalleListaTYPE {

    protected short identificadorTipoDocumento;
    @XmlElement(required = true)
    protected String nombreTipoDocumento;
    protected short identificadorUnidad;
    @XmlElement(required = true)
    protected String nombreUnidad;
    protected int numeroDocumento;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar documentoFechaEmision;
    @XmlElement(required = true)
    protected BigDecimal saldo;
    @XmlElement(required = true)
    protected BigDecimal saldoVencido;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar documentoFechaVencimiento;
    protected int diasVencido;
    protected short documentoEstado;

    /**
     * Gets the value of the identificadorTipoDocumento property.
     *
     */
    public short getIdentificadorTipoDocumento() {
        return identificadorTipoDocumento;
    }

    /**
     * Sets the value of the identificadorTipoDocumento property.
     *
     */
    public void setIdentificadorTipoDocumento(short value) {
        this.identificadorTipoDocumento = value;
    }

    /**
     * Gets the value of the nombreTipoDocumento property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNombreTipoDocumento() {
        return nombreTipoDocumento;
    }

    /**
     * Sets the value of the nombreTipoDocumento property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNombreTipoDocumento(String value) {
        this.nombreTipoDocumento = value;
    }

    /**
     * Gets the value of the identificadorUnidad property.
     *
     */
    public short getIdentificadorUnidad() {
        return identificadorUnidad;
    }

    /**
     * Sets the value of the identificadorUnidad property.
     *
     */
    public void setIdentificadorUnidad(short value) {
        this.identificadorUnidad = value;
    }

    /**
     * Gets the value of the nombreUnidad property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNombreUnidad() {
        return nombreUnidad;
    }

    /**
     * Sets the value of the nombreUnidad property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNombreUnidad(String value) {
        this.nombreUnidad = value;
    }

    /**
     * Gets the value of the numeroDocumento property.
     *
     */
    public int getNumeroDocumento() {
        return numeroDocumento;
    }

    /**
     * Sets the value of the numeroDocumento property.
     *
     */
    public void setNumeroDocumento(int value) {
        this.numeroDocumento = value;
    }

    /**
     * Gets the value of the documentoFechaEmision property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getDocumentoFechaEmision() {
        return documentoFechaEmision;
    }

    /**
     * Sets the value of the documentoFechaEmision property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setDocumentoFechaEmision(XMLGregorianCalendar value) {
        this.documentoFechaEmision = value;
    }

    /**
     * Gets the value of the saldo property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getSaldo() {
        return saldo;
    }

    /**
     * Sets the value of the saldo property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setSaldo(BigDecimal value) {
        this.saldo = value;
    }

    /**
     * Gets the value of the saldoVencido property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getSaldoVencido() {
        return saldoVencido;
    }

    /**
     * Sets the value of the saldoVencido property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setSaldoVencido(BigDecimal value) {
        this.saldoVencido = value;
    }

    /**
     * Gets the value of the documentoFechaVencimiento property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getDocumentoFechaVencimiento() {
        return documentoFechaVencimiento;
    }

    /**
     * Sets the value of the documentoFechaVencimiento property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setDocumentoFechaVencimiento(XMLGregorianCalendar value) {
        this.documentoFechaVencimiento = value;
    }

    /**
     * Gets the value of the diasVencido property.
     *
     */
    public int getDiasVencido() {
        return diasVencido;
    }

    /**
     * Sets the value of the diasVencido property.
     *
     */
    public void setDiasVencido(int value) {
        this.diasVencido = value;
    }

    /**
     * Gets the value of the documentoEstado property.
     *
     */
    public short getDocumentoEstado() {
        return documentoEstado;
    }

    /**
     * Sets the value of the documentoEstado property.
     *
     */
    public void setDocumentoEstado(short value) {
        this.documentoEstado = value;
    }

}
