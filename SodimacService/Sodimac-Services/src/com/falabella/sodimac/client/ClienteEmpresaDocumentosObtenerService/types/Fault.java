
package com.falabella.sodimac.client.ClienteEmpresaDocumentosObtenerService.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="faultcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="faultstring" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="faultactor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="detail" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "faultcode", "faultstring", "faultactor", "detail" })
@XmlRootElement(name = "Fault", namespace = "http://schemas.xmlsoap.org/soap/envelope/")
public class Fault {

    @XmlElement(namespace = "")
    protected String faultcode;
    @XmlElement(namespace = "")
    protected String faultstring;
    @XmlElement(namespace = "")
    protected String faultactor;
    @XmlElement(namespace = "")
    protected Object detail;

    /**
     * Gets the value of the faultcode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFaultcode() {
        return faultcode;
    }

    /**
     * Sets the value of the faultcode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFaultcode(String value) {
        this.faultcode = value;
    }

    /**
     * Gets the value of the faultstring property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFaultstring() {
        return faultstring;
    }

    /**
     * Sets the value of the faultstring property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFaultstring(String value) {
        this.faultstring = value;
    }

    /**
     * Gets the value of the faultactor property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFaultactor() {
        return faultactor;
    }

    /**
     * Sets the value of the faultactor property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFaultactor(String value) {
        this.faultactor = value;
    }

    /**
     * Gets the value of the detail property.
     *
     * @return
     *     possible object is
     *     {@link Object }
     *
     */
    public Object getDetail() {
        return detail;
    }

    /**
     * Sets the value of the detail property.
     *
     * @param value
     *     allowed object is
     *     {@link Object }
     *
     */
    public void setDetail(Object value) {
        this.detail = value;
    }

}
