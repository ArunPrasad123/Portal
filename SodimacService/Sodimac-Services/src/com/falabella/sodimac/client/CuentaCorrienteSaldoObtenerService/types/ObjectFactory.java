
package com.falabella.sodimac.client.CuentaCorrienteSaldoObtenerService.types;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the com.falabella.sodimac.client.CuentaCorrienteSaldoObtenerService.types package.
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

    private final static QName _CuentaCorrienteSaldoObtenerExpReq_QNAME =
        new QName("http://mdwcorp.falabella.com/SOD/CL/OSB/schema/Cuentacorriente/Saldo/Obtener/Req-v2016.07",
                  "cuentaCorrienteSaldoObtenerExpReq");
    private final static QName _CuentaCorrienteSaldoObtenerExpResp_QNAME =
        new QName("http://mdwcorp.falabella.com/SOD/CL/OSB/schema/Cuentacorriente/Saldo/Obtener/Resp-v2016.07",
                  "cuentaCorrienteSaldoObtenerExpResp");
    private final static QName _ClientService_QNAME =
        new QName("http://mdwcorp.falabella.com/common/schema/clientservice", "ClientService");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.falabella.sodimac.client.CuentaCorrienteSaldoObtenerService.types
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CuentaCorrienteSaldoObtenerExpReqTYPE }
     *
     */
    public CuentaCorrienteSaldoObtenerExpReqTYPE createCuentaCorrienteSaldoObtenerExpReqTYPE() {
        return new CuentaCorrienteSaldoObtenerExpReqTYPE();
    }

    /**
     * Create an instance of {@link CuentaCorrienteSaldoObtenerReqParamTYPE }
     *
     */
    public CuentaCorrienteSaldoObtenerReqParamTYPE createCuentaCorrienteSaldoObtenerReqParamTYPE() {
        return new CuentaCorrienteSaldoObtenerReqParamTYPE();
    }

    /**
     * Create an instance of {@link CuentaCorrienteSaldoObtenerExpRespTYPE }
     *
     */
    public CuentaCorrienteSaldoObtenerExpRespTYPE createCuentaCorrienteSaldoObtenerExpRespTYPE() {
        return new CuentaCorrienteSaldoObtenerExpRespTYPE();
    }

    /**
     * Create an instance of {@link RespMensajeTYPE }
     *
     */
    public RespMensajeTYPE createRespMensajeTYPE() {
        return new RespMensajeTYPE();
    }

    /**
     * Create an instance of {@link LineaCreditoHeaderTYPE }
     *
     */
    public LineaCreditoHeaderTYPE createLineaCreditoHeaderTYPE() {
        return new LineaCreditoHeaderTYPE();
    }

    /**
     * Create an instance of {@link Fault }
     *
     */
    public Fault createFault() {
        return new Fault();
    }

    /**
     * Create an instance of {@link ClientServiceTYPE }
     *
     */
    public ClientServiceTYPE createClientServiceTYPE() {
        return new ClientServiceTYPE();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CuentaCorrienteSaldoObtenerExpReqTYPE }{@code >}}
     *
     */
    @XmlElementDecl(namespace =
                    "http://mdwcorp.falabella.com/SOD/CL/OSB/schema/Cuentacorriente/Saldo/Obtener/Req-v2016.07",
                    name = "cuentaCorrienteSaldoObtenerExpReq")
    public JAXBElement<CuentaCorrienteSaldoObtenerExpReqTYPE> createCuentaCorrienteSaldoObtenerExpReq(CuentaCorrienteSaldoObtenerExpReqTYPE value) {
        return new JAXBElement<CuentaCorrienteSaldoObtenerExpReqTYPE>(_CuentaCorrienteSaldoObtenerExpReq_QNAME,
                                                                      CuentaCorrienteSaldoObtenerExpReqTYPE.class, null,
                                                                      value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CuentaCorrienteSaldoObtenerExpRespTYPE }{@code >}}
     *
     */
    @XmlElementDecl(namespace =
                    "http://mdwcorp.falabella.com/SOD/CL/OSB/schema/Cuentacorriente/Saldo/Obtener/Resp-v2016.07",
                    name = "cuentaCorrienteSaldoObtenerExpResp")
    public JAXBElement<CuentaCorrienteSaldoObtenerExpRespTYPE> createCuentaCorrienteSaldoObtenerExpResp(CuentaCorrienteSaldoObtenerExpRespTYPE value) {
        return new JAXBElement<CuentaCorrienteSaldoObtenerExpRespTYPE>(_CuentaCorrienteSaldoObtenerExpResp_QNAME,
                                                                       CuentaCorrienteSaldoObtenerExpRespTYPE.class,
                                                                       null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClientServiceTYPE }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://mdwcorp.falabella.com/common/schema/clientservice", name = "ClientService")
    public JAXBElement<ClientServiceTYPE> createClientService(ClientServiceTYPE value) {
        return new JAXBElement<ClientServiceTYPE>(_ClientService_QNAME, ClientServiceTYPE.class, null, value);
    }

}
