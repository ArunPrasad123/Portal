
package com.falabella.mdwcorp.sod.cl.osb.schema.clienteempresa.documentos.obtener.resp_v2016;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the com.falabella.mdwcorp.sod.cl.osb.schema.clienteempresa.documentos.obtener.resp_v2016 package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
 * provided in this class.
 *
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ClienteEmpresaDocumentosObtenerExpResp_QNAME =
        new QName("http://mdwcorp.falabella.com/SOD/CL/OSB/schema/Clienteempresa/Documentos/Obtener/Resp-v2016.07",
                  "clienteEmpresaDocumentosObtenerExpResp");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.falabella.mdwcorp.sod.cl.osb.schema.clienteempresa.documentos.obtener.resp_v2016
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ClienteEmpresaDocumentosObtenerExpRespTYPE }
     *
     */
    public ClienteEmpresaDocumentosObtenerExpRespTYPE createClienteEmpresaDocumentosObtenerExpRespTYPE() {
        return new ClienteEmpresaDocumentosObtenerExpRespTYPE();
    }

    /**
     * Create an instance of {@link ListaResultadosTYPE }
     *
     */
    public ListaResultadosTYPE createListaResultadosTYPE() {
        return new ListaResultadosTYPE();
    }

    /**
     * Create an instance of {@link DetalleListaTYPE }
     *
     */
    public DetalleListaTYPE createDetalleListaTYPE() {
        return new DetalleListaTYPE();
    }

    /**
     * Create an instance of {@link RespuestaConsultaTYPE }
     *
     */
    public RespuestaConsultaTYPE createRespuestaConsultaTYPE() {
        return new RespuestaConsultaTYPE();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClienteEmpresaDocumentosObtenerExpRespTYPE }{@code >}}
     *
     */
    @XmlElementDecl(namespace =
                    "http://mdwcorp.falabella.com/SOD/CL/OSB/schema/Clienteempresa/Documentos/Obtener/Resp-v2016.07",
                    name = "clienteEmpresaDocumentosObtenerExpResp")
    public JAXBElement<ClienteEmpresaDocumentosObtenerExpRespTYPE> createClienteEmpresaDocumentosObtenerExpResp(ClienteEmpresaDocumentosObtenerExpRespTYPE value) {
        return new JAXBElement<ClienteEmpresaDocumentosObtenerExpRespTYPE>(_ClienteEmpresaDocumentosObtenerExpResp_QNAME,
                                                                           ClienteEmpresaDocumentosObtenerExpRespTYPE.class,
                                                                           null, value);
    }

}
