
package com.falabella.mdwcorp.sod.cl.osb.schema.cuentacorriente.saldo.obtener.resp_v2016;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the com.falabella.mdwcorp.sod.cl.osb.schema.cuentacorriente.saldo.obtener.resp_v2016 package.
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

    private final static QName _CuentaCorrienteSaldoObtenerExpResp_QNAME =
        new QName("http://mdwcorp.falabella.com/SOD/CL/OSB/schema/Cuentacorriente/Saldo/Obtener/Resp-v2016.07",
                  "cuentaCorrienteSaldoObtenerExpResp");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.falabella.mdwcorp.sod.cl.osb.schema.cuentacorriente.saldo.obtener.resp_v2016
     *
     */
    public ObjectFactory() {
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

}
