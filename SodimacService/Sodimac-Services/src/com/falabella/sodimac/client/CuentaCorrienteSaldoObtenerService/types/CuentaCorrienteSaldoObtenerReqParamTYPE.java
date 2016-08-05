
package com.falabella.sodimac.client.CuentaCorrienteSaldoObtenerService.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cuentaCorrienteSaldoObtenerReqParam_TYPE complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="cuentaCorrienteSaldoObtenerReqParam_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idCliente" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="idEmpresa" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cuentaCorrienteSaldoObtenerReqParam_TYPE",
         namespace = "http://mdwcorp.falabella.com/SOD/CL/OSB/schema/Cuentacorriente/Saldo/Obtener/Req-v2016.07",
         propOrder = { "idCliente", "idEmpresa" })
public class CuentaCorrienteSaldoObtenerReqParamTYPE {

    @XmlElement(required = true)
    protected String idCliente;
    protected int idEmpresa;

    /**
     * Gets the value of the idCliente property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIdCliente() {
        return idCliente;
    }

    /**
     * Sets the value of the idCliente property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIdCliente(String value) {
        this.idCliente = value;
    }

    /**
     * Gets the value of the idEmpresa property.
     *
     */
    public int getIdEmpresa() {
        return idEmpresa;
    }

    /**
     * Sets the value of the idEmpresa property.
     *
     */
    public void setIdEmpresa(int value) {
        this.idEmpresa = value;
    }

}
