
package com.falabella.mdwcorp.sod.cl.osb.wsdl.clienteempresa.documentos.obtener_v1;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;

import com.falabella.mdwcorp.sod.cl.osb.schema.clienteempresa.documentos.obtener.req_v2016.ClienteEmpresaDocumentosObtenerExpReqTYPE;
import com.falabella.mdwcorp.sod.cl.osb.schema.clienteempresa.documentos.obtener.resp_v2016.ClienteEmpresaDocumentosObtenerExpRespTYPE;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150616.1732
 * Generated source version: 2.2
 *
 */
@WebService(name = "ClienteEntregaDocumentosObtenerPt",
            targetNamespace = "http://mdwcorp.falabella.com/SOD/CL/OSB/wsdl/Clienteempresa/Documentos/Obtener-v1.0")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({ com.falabella.mdwcorp.common.schema.clientservice.ObjectFactory.class,
              com.falabella.mdwcorp.sod.cl.osb.schema.clienteempresa.documentos.obtener.req_v2016.ObjectFactory.class,
              com.falabella.mdwcorp.sod.cl.osb.schema.clienteempresa.documentos.obtener.resp_v2016.ObjectFactory.class,
              org.xmlsoap.schemas.soap.envelope.ObjectFactory.class
    })
public interface ClienteEntregaDocumentosObtenerPt {


    /**
     *
     * @param clienteEmpresaDocumentosObtenerReqParam
     * @return
     *     returns com.falabella.mdwcorp.sod.cl.osb.schema.clienteempresa.documentos.obtener.resp_v2016.ClienteEmpresaDocumentosObtenerExpRespTYPE
     * @throws FaultMsg
     */
    @WebMethod(operationName = "ClienteEmpresaDocumentosObtenerOp",
               action = "http://mdwcorp.falabella.com/SOD/CL/OSB/wsdl/Clienteempresa/Documentos/Obtener-v1.0/Op")
    @WebResult(name = "clienteEmpresaDocumentosObtenerExpResp",
               targetNamespace =
               "http://mdwcorp.falabella.com/SOD/CL/OSB/schema/Clienteempresa/Documentos/Obtener/Resp-v2016.07",
               partName = "ClienteEmpresaDocumentosObtenerRespParam")
    @Action(input = "http://mdwcorp.falabella.com/SOD/CL/OSB/wsdl/Clienteempresa/Documentos/Obtener-v1.0/Op",
            output =
            "http://mdwcorp.falabella.com/SOD/CL/OSB/wsdl/Clienteempresa/Documentos/Obtener-v1.0/ClienteEntregaDocumentosObtenerPt/ClienteEmpresaDocumentosObtenerOpResponse",
            fault =
            { @FaultAction(className = FaultMsg.class,
                           value =
                           "http://mdwcorp.falabella.com/SOD/CL/OSB/wsdl/Clienteempresa/Documentos/Obtener-v1.0/ClienteEntregaDocumentosObtenerPt/ClienteEmpresaDocumentosObtenerOp/Fault/FaultMsg") })
    public ClienteEmpresaDocumentosObtenerExpRespTYPE clienteEmpresaDocumentosObtenerOp(@WebParam(name =
                                                                                                  "clienteEmpresaDocumentosObtenerExpReq",
                                                                                                  targetNamespace =
                                                                                                  "http://mdwcorp.falabella.com/SOD/CL/OSB/schema/Clienteempresa/Documentos/Obtener/Req-v2016.07",
                                                                                                  partName =
                                                                                                  "ClienteEmpresaDocumentosObtenerReqParam")
                                                                                        ClienteEmpresaDocumentosObtenerExpReqTYPE clienteEmpresaDocumentosObtenerReqParam) throws FaultMsg;

}