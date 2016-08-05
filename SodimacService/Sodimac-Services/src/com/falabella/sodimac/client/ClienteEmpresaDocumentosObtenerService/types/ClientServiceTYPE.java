
package com.falabella.sodimac.client.ClienteEmpresaDocumentosObtenerService.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ClientService_TYPE complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ClientService_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="country" type="{http://mdwcorp.falabella.com/common/schema/clientservice}Country_TYPE"/&gt;
 *         &lt;element name="commerce" type="{http://mdwcorp.falabella.com/common/schema/clientservice}Commerce_TYPE"/&gt;
 *         &lt;element name="channel" type="{http://mdwcorp.falabella.com/common/schema/clientservice}Channel_TYPE"/&gt;
 *         &lt;element name="storeId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="terminalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="hour" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClientService_TYPE", namespace = "http://mdwcorp.falabella.com/common/schema/clientservice",
         propOrder = { "country", "commerce", "channel", "storeId", "terminalId", "date", "hour" })
public class ClientServiceTYPE {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected CountryTYPE country;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected CommerceTYPE commerce;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ChannelTYPE channel;
    @XmlElement(required = true)
    protected String storeId;
    protected String terminalId;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar date;
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar hour;

    /**
     * Gets the value of the country property.
     *
     * @return
     *     possible object is
     *     {@link CountryTYPE }
     *
     */
    public CountryTYPE getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     *
     * @param value
     *     allowed object is
     *     {@link CountryTYPE }
     *
     */
    public void setCountry(CountryTYPE value) {
        this.country = value;
    }

    /**
     * Gets the value of the commerce property.
     *
     * @return
     *     possible object is
     *     {@link CommerceTYPE }
     *
     */
    public CommerceTYPE getCommerce() {
        return commerce;
    }

    /**
     * Sets the value of the commerce property.
     *
     * @param value
     *     allowed object is
     *     {@link CommerceTYPE }
     *
     */
    public void setCommerce(CommerceTYPE value) {
        this.commerce = value;
    }

    /**
     * Gets the value of the channel property.
     *
     * @return
     *     possible object is
     *     {@link ChannelTYPE }
     *
     */
    public ChannelTYPE getChannel() {
        return channel;
    }

    /**
     * Sets the value of the channel property.
     *
     * @param value
     *     allowed object is
     *     {@link ChannelTYPE }
     *
     */
    public void setChannel(ChannelTYPE value) {
        this.channel = value;
    }

    /**
     * Gets the value of the storeId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getStoreId() {
        return storeId;
    }

    /**
     * Sets the value of the storeId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setStoreId(String value) {
        this.storeId = value;
    }

    /**
     * Gets the value of the terminalId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTerminalId() {
        return terminalId;
    }

    /**
     * Sets the value of the terminalId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTerminalId(String value) {
        this.terminalId = value;
    }

    /**
     * Gets the value of the date property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    /**
     * Gets the value of the hour property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getHour() {
        return hour;
    }

    /**
     * Sets the value of the hour property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setHour(XMLGregorianCalendar value) {
        this.hour = value;
    }

}
