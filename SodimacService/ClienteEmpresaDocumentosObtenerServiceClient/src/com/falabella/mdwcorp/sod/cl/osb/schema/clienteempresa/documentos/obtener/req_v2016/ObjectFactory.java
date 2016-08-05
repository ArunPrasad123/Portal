
package com.falabella.mdwcorp.sod.cl.osb.schema.clienteempresa.documentos.obtener.req_v2016;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the com.falabella.mdwcorp.sod.cl.osb.schema.clienteempresa.documentos.obtener.req_v2016 package.
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

    private final static QName _ClienteEmpresaDocumentosObtenerExpReq_QNAME =
        new QName("http://mdwcorp.falabella.com/SOD/CL/OSB/schema/Clienteempresa/Documentos/Obtener/Req-v2016.07",
                  "clienteEmpresaDocumentosObtenerExpReq");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.falabella.mdwcorp.sod.cl.osb.schema.clienteempresa.documentos.obtener.req_v2016
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ClienteEmpresaDocumentosObtenerExpReqTYPE }
     *
     */
    public ClienteEmpresaDocumentosObtenerExpReqTYPE createClienteEmpresaDocumentosObtenerExpReqTYPE() {
        return new ClienteEmpresaDocumentosObtenerExpReqTYPE();
    }

    /**
     * Create an instance of {@link UbicacionConsultarTYPE }
     *
     */
    public UbicacionConsultarTYPE createUbicacionConsultarTYPE() {
        return new UbicacionConsultarTYPE();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClienteEmpresaDocumentosObtenerExpReqTYPE }{@code >}}
     *
     */
    @XmlElementDecl(namespace =
                    "http://mdwcorp.falabella.com/SOD/CL/OSB/schema/Clienteempresa/Documentos/Obtener/Req-v2016.07",
                    name = "clienteEmpresaDocumentosObtenerExpReq")
    public JAXBElement<ClienteEmpresaDocumentosObtenerExpReqTYPE> createClienteEmpresaDocumentosObtenerExpReq(ClienteEmpresaDocumentosObtenerExpReqTYPE value) {
        return new JAXBElement<ClienteEmpresaDocumentosObtenerExpReqTYPE>(_ClienteEmpresaDocumentosObtenerExpReq_QNAME,
                                                                          ClienteEmpresaDocumentosObtenerExpReqTYPE.class,
                                                                          null, value);
    }

}
