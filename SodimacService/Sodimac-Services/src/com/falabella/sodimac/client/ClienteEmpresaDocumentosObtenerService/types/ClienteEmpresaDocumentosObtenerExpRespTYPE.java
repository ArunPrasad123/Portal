
package com.falabella.sodimac.client.ClienteEmpresaDocumentosObtenerService.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for clienteEmpresaDocumentosObtenerExpResp_TYPE complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="clienteEmpresaDocumentosObtenerExpResp_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="respuestaConsulta" type="{http://mdwcorp.falabella.com/SOD/CL/OSB/schema/Clienteempresa/Documentos/Obtener/Resp-v2016.07}respuestaConsulta_TYPE"/&gt;
 *         &lt;element name="listaResultados" type="{http://mdwcorp.falabella.com/SOD/CL/OSB/schema/Clienteempresa/Documentos/Obtener/Resp-v2016.07}listaResultados_TYPE" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clienteEmpresaDocumentosObtenerExpResp_TYPE", propOrder = { "respuestaConsulta", "listaResultados" })
public class ClienteEmpresaDocumentosObtenerExpRespTYPE {

    @XmlElement(required = true)
    protected RespuestaConsultaTYPE respuestaConsulta;
    protected ListaResultadosTYPE listaResultados;

    /**
     * Gets the value of the respuestaConsulta property.
     *
     * @return
     *     possible object is
     *     {@link RespuestaConsultaTYPE }
     *
     */
    public RespuestaConsultaTYPE getRespuestaConsulta() {
        return respuestaConsulta;
    }

    /**
     * Sets the value of the respuestaConsulta property.
     *
     * @param value
     *     allowed object is
     *     {@link RespuestaConsultaTYPE }
     *
     */
    public void setRespuestaConsulta(RespuestaConsultaTYPE value) {
        this.respuestaConsulta = value;
    }

    /**
     * Gets the value of the listaResultados property.
     *
     * @return
     *     possible object is
     *     {@link ListaResultadosTYPE }
     *
     */
    public ListaResultadosTYPE getListaResultados() {
        return listaResultados;
    }

    /**
     * Sets the value of the listaResultados property.
     *
     * @param value
     *     allowed object is
     *     {@link ListaResultadosTYPE }
     *
     */
    public void setListaResultados(ListaResultadosTYPE value) {
        this.listaResultados = value;
    }

}
