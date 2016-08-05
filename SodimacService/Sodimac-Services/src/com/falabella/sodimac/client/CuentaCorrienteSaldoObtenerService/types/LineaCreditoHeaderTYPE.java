
package com.falabella.sodimac.client.CuentaCorrienteSaldoObtenerService.types;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for lineaCreditoHeader_TYPE complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="lineaCreditoHeader_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="creditoAutorizado" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="creditoOtorgado" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="porFacturar" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="disponible" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="montoLineaCreditoDocumentoSuc" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="montoDeudaDocumentoSuc" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="montoComprometidoSuc" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="disponibleDocumentado" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lineaCreditoHeader_TYPE",
         propOrder =
         { "creditoAutorizado", "creditoOtorgado", "porFacturar", "disponible", "montoLineaCreditoDocumentoSuc",
           "montoDeudaDocumentoSuc", "montoComprometidoSuc", "disponibleDocumentado"
    })
public class LineaCreditoHeaderTYPE {

    @XmlElement(required = true)
    protected BigDecimal creditoAutorizado;
    @XmlElement(required = true)
    protected BigDecimal creditoOtorgado;
    @XmlElement(required = true)
    protected BigDecimal porFacturar;
    @XmlElement(required = true)
    protected BigDecimal disponible;
    @XmlElement(required = true)
    protected BigDecimal montoLineaCreditoDocumentoSuc;
    @XmlElement(required = true)
    protected BigDecimal montoDeudaDocumentoSuc;
    @XmlElement(required = true)
    protected BigDecimal montoComprometidoSuc;
    @XmlElement(required = true)
    protected BigDecimal disponibleDocumentado;

    /**
     * Gets the value of the creditoAutorizado property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getCreditoAutorizado() {
        return creditoAutorizado;
    }

    /**
     * Sets the value of the creditoAutorizado property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setCreditoAutorizado(BigDecimal value) {
        this.creditoAutorizado = value;
    }

    /**
     * Gets the value of the creditoOtorgado property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getCreditoOtorgado() {
        return creditoOtorgado;
    }

    /**
     * Sets the value of the creditoOtorgado property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setCreditoOtorgado(BigDecimal value) {
        this.creditoOtorgado = value;
    }

    /**
     * Gets the value of the porFacturar property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getPorFacturar() {
        return porFacturar;
    }

    /**
     * Sets the value of the porFacturar property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setPorFacturar(BigDecimal value) {
        this.porFacturar = value;
    }

    /**
     * Gets the value of the disponible property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getDisponible() {
        return disponible;
    }

    /**
     * Sets the value of the disponible property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setDisponible(BigDecimal value) {
        this.disponible = value;
    }

    /**
     * Gets the value of the montoLineaCreditoDocumentoSuc property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getMontoLineaCreditoDocumentoSuc() {
        return montoLineaCreditoDocumentoSuc;
    }

    /**
     * Sets the value of the montoLineaCreditoDocumentoSuc property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setMontoLineaCreditoDocumentoSuc(BigDecimal value) {
        this.montoLineaCreditoDocumentoSuc = value;
    }

    /**
     * Gets the value of the montoDeudaDocumentoSuc property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getMontoDeudaDocumentoSuc() {
        return montoDeudaDocumentoSuc;
    }

    /**
     * Sets the value of the montoDeudaDocumentoSuc property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setMontoDeudaDocumentoSuc(BigDecimal value) {
        this.montoDeudaDocumentoSuc = value;
    }

    /**
     * Gets the value of the montoComprometidoSuc property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getMontoComprometidoSuc() {
        return montoComprometidoSuc;
    }

    /**
     * Sets the value of the montoComprometidoSuc property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setMontoComprometidoSuc(BigDecimal value) {
        this.montoComprometidoSuc = value;
    }

    /**
     * Gets the value of the disponibleDocumentado property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getDisponibleDocumentado() {
        return disponibleDocumentado;
    }

    /**
     * Sets the value of the disponibleDocumentado property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setDisponibleDocumentado(BigDecimal value) {
        this.disponibleDocumentado = value;
    }

}
