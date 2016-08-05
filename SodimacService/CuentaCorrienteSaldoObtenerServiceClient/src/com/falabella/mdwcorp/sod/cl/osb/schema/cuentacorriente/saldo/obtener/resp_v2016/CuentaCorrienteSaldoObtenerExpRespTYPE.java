
package com.falabella.mdwcorp.sod.cl.osb.schema.cuentacorriente.saldo.obtener.resp_v2016;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cuentaCorrienteSaldoObtenerExpResp_TYPE complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="cuentaCorrienteSaldoObtenerExpResp_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="respMensaje" type="{http://mdwcorp.falabella.com/SOD/CL/OSB/schema/Cuentacorriente/Saldo/Obtener/Resp-v2016.07}respMensaje_TYPE"/&gt;
 *         &lt;element name="lineaCreditoHeader" type="{http://mdwcorp.falabella.com/SOD/CL/OSB/schema/Cuentacorriente/Saldo/Obtener/Resp-v2016.07}lineaCreditoHeader_TYPE" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cuentaCorrienteSaldoObtenerExpResp_TYPE", propOrder = { "respMensaje", "lineaCreditoHeader" })
public class CuentaCorrienteSaldoObtenerExpRespTYPE {

    @XmlElement(required = true)
    protected RespMensajeTYPE respMensaje;
    protected LineaCreditoHeaderTYPE lineaCreditoHeader;

    /**
     * Gets the value of the respMensaje property.
     *
     * @return
     *     possible object is
     *     {@link RespMensajeTYPE }
     *
     */
    public RespMensajeTYPE getRespMensaje() {
        return respMensaje;
    }

    /**
     * Sets the value of the respMensaje property.
     *
     * @param value
     *     allowed object is
     *     {@link RespMensajeTYPE }
     *
     */
    public void setRespMensaje(RespMensajeTYPE value) {
        this.respMensaje = value;
    }

    /**
     * Gets the value of the lineaCreditoHeader property.
     *
     * @return
     *     possible object is
     *     {@link LineaCreditoHeaderTYPE }
     *
     */
    public LineaCreditoHeaderTYPE getLineaCreditoHeader() {
        return lineaCreditoHeader;
    }

    /**
     * Sets the value of the lineaCreditoHeader property.
     *
     * @param value
     *     allowed object is
     *     {@link LineaCreditoHeaderTYPE }
     *
     */
    public void setLineaCreditoHeader(LineaCreditoHeaderTYPE value) {
        this.lineaCreditoHeader = value;
    }

}
