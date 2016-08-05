
package com.falabella.sodimac.client.ClienteEmpresaDocumentosObtenerService.types;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for listaResultados_TYPE complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="listaResultados_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="detalleLista" type="{http://mdwcorp.falabella.com/SOD/CL/OSB/schema/Clienteempresa/Documentos/Obtener/Resp-v2016.07}detalleLista_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listaResultados_TYPE", propOrder = { "detalleLista" })
public class ListaResultadosTYPE {

    @XmlElement(nillable = true)
    protected List<DetalleListaTYPE> detalleLista;

    /**
     * Gets the value of the detalleLista property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the detalleLista property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDetalleLista().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DetalleListaTYPE }
     *
     *
     */
    public List<DetalleListaTYPE> getDetalleLista() {
        if (detalleLista == null) {
            detalleLista = new ArrayList<DetalleListaTYPE>();
        }
        return this.detalleLista;
    }

}
