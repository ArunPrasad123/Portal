
package com.falabella.sodimac.client.CuentaCorrienteSaldoObtenerService.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cuentaCorrienteSaldoObtenerExpReq_TYPE complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="cuentaCorrienteSaldoObtenerExpReq_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cuentaCorrienteSaldoObtenerReqParam" type="{http://mdwcorp.falabella.com/SOD/CL/OSB/schema/Cuentacorriente/Saldo/Obtener/Req-v2016.07}cuentaCorrienteSaldoObtenerReqParam_TYPE"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cuentaCorrienteSaldoObtenerExpReq_TYPE",
         namespace = "http://mdwcorp.falabella.com/SOD/CL/OSB/schema/Cuentacorriente/Saldo/Obtener/Req-v2016.07",
         propOrder = { "cuentaCorrienteSaldoObtenerReqParam" })
public class CuentaCorrienteSaldoObtenerExpReqTYPE {

    @XmlElement(required = true)
    protected CuentaCorrienteSaldoObtenerReqParamTYPE cuentaCorrienteSaldoObtenerReqParam;

    /**
     * Gets the value of the cuentaCorrienteSaldoObtenerReqParam property.
     *
     * @return
     *     possible object is
     *     {@link CuentaCorrienteSaldoObtenerReqParamTYPE }
     *
     */
    public CuentaCorrienteSaldoObtenerReqParamTYPE getCuentaCorrienteSaldoObtenerReqParam() {
        return cuentaCorrienteSaldoObtenerReqParam;
    }

    /**
     * Sets the value of the cuentaCorrienteSaldoObtenerReqParam property.
     *
     * @param value
     *     allowed object is
     *     {@link CuentaCorrienteSaldoObtenerReqParamTYPE }
     *
     */
    public void setCuentaCorrienteSaldoObtenerReqParam(CuentaCorrienteSaldoObtenerReqParamTYPE value) {
        this.cuentaCorrienteSaldoObtenerReqParam = value;
    }

}
