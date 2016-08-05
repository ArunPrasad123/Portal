package com.falabella.mdwcorp.sod.cl.osb.wsdl.clienteempresa.documentos.obtener_v1;

import com.falabella.mdwcorp.common.schema.clientservice.ObjectFactory;
import com.falabella.mdwcorp.sod.cl.osb.schema.clienteempresa.documentos.obtener.req_v2016.ClienteEmpresaDocumentosObtenerExpReqTYPE;
import com.falabella.mdwcorp.sod.cl.osb.schema.clienteempresa.documentos.obtener.resp_v2016.ClienteEmpresaDocumentosObtenerExpRespTYPE;

import com.falabella.mdwcorp.sod.cl.osb.schema.clienteempresa.documentos.obtener.resp_v2016.DetalleListaTYPE;

import com.falabella.mdwcorp.sod.cl.osb.schema.clienteempresa.documentos.obtener.resp_v2016.ListaResultadosTYPE;
import com.falabella.mdwcorp.sod.cl.osb.schema.clienteempresa.documentos.obtener.resp_v2016.RespuestaConsultaTYPE;

import java.math.BigDecimal;

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({ ObjectFactory.class,
              com.falabella.mdwcorp.sod.cl.osb.schema.clienteempresa.documentos.obtener.req_v2016.ObjectFactory.class,
              com.falabella.mdwcorp.sod.cl.osb.schema.clienteempresa.documentos.obtener.resp_v2016.ObjectFactory.class,
              org.xmlsoap.schemas.soap.envelope.ObjectFactory.class
    })
@WebService(name = "ClienteEntregaDocumentosObtenerPt", serviceName = "ClienteEmpresaDocumentosObtenerService",
            targetNamespace = "http://mdwcorp.falabella.com/SOD/CL/OSB/wsdl/Clienteempresa/Documentos/Obtener-v1.0",
            portName = "ClienteEmpresaDocumentosObtenerPort")
public class ClienteEntregaDocumentosObtenerPtImpl {
    public ClienteEntregaDocumentosObtenerPtImpl() {
    }

    @WebResult(name = "clienteEmpresaDocumentosObtenerExpResp", partName = "ClienteEmpresaDocumentosObtenerRespParam",
               targetNamespace =
               "http://mdwcorp.falabella.com/SOD/CL/OSB/schema/Clienteempresa/Documentos/Obtener/Resp-v2016.07")
    @WebMethod(operationName = "ClienteEmpresaDocumentosObtenerOp",
               action = "http://mdwcorp.falabella.com/SOD/CL/OSB/wsdl/Clienteempresa/Documentos/Obtener-v1.0/Op")
    public ClienteEmpresaDocumentosObtenerExpRespTYPE clienteEmpresaDocumentosObtenerOp(@WebParam(name =
                                                                                                  "clienteEmpresaDocumentosObtenerExpReq",
                                                                                                  partName =
                                                                                                  "ClienteEmpresaDocumentosObtenerReqParam",
                                                                                                  targetNamespace =
                                                                                                  "http://mdwcorp.falabella.com/SOD/CL/OSB/schema/Clienteempresa/Documentos/Obtener/Req-v2016.07")
                                                                                        ClienteEmpresaDocumentosObtenerExpReqTYPE clienteEmpresaDocumentosObtenerReqParam) throws FaultMsg {
        
        DatatypeFactory df=null;
        try {
        df = DatatypeFactory.newInstance();
        } catch(DatatypeConfigurationException e) {
        throw new IllegalStateException(
        "Error while trying to obtain a new instance of DatatypeFactory", e);
        }
        Date date=new Date();
        GregorianCalendar gc = new GregorianCalendar();
        gc.setTimeInMillis(date.getTime());
        
        short identificadorTipoDocumento=11;
        String nombreTipoDocumento="Documento1";
        short identificadorUnidad=11;
        String nombreUnidad="Store Name";
        int numeroDocumento=22222221;
        XMLGregorianCalendar documentoFechaEmision=df.newXMLGregorianCalendar(gc);
        BigDecimal saldo=new BigDecimal(1000);
        BigDecimal saldoVencido=new BigDecimal(100);
        XMLGregorianCalendar documentoFechaVencimiento=df.newXMLGregorianCalendar(gc);
        int diasVencido=-12;
        short documentoEstado=11;
        
        ListaResultadosTYPE listType=new ListaResultadosTYPE();
        List<DetalleListaTYPE> detalleLista=listType.getDetalleLista();
        DetalleListaTYPE document1=new DetalleListaTYPE();        
        document1.setIdentificadorTipoDocumento(identificadorTipoDocumento);
        document1.setNombreTipoDocumento(nombreTipoDocumento);
        document1.setIdentificadorUnidad(identificadorUnidad);
        document1.setNombreUnidad(nombreUnidad);
        document1.setNumeroDocumento(numeroDocumento);
        document1.setDocumentoFechaEmision(documentoFechaEmision);
        document1.setSaldo(saldo);
        document1.setSaldoVencido(saldoVencido);
        document1.setDocumentoFechaVencimiento(documentoFechaVencimiento);
        document1.setDiasVencido(diasVencido);
        document1.setDocumentoEstado(documentoEstado);
        
        detalleLista.add(document1);
        detalleLista.add(document1);
        detalleLista.add(document1);
        detalleLista.add(document1);
        detalleLista.add(document1);
        detalleLista.add(document1);
        detalleLista.add(document1);
        detalleLista.add(document1);
        detalleLista.add(document1);
        detalleLista.add(document1);
        detalleLista.add(document1);
        detalleLista.add(document1);
        detalleLista.add(document1);
        detalleLista.add(document1);
        detalleLista.add(document1);
        detalleLista.add(document1);
        detalleLista.add(document1);
        detalleLista.add(document1);
        detalleLista.add(document1);
        detalleLista.add(document1);
        detalleLista.add(document1);
        
        ClienteEmpresaDocumentosObtenerExpRespTYPE response=new ClienteEmpresaDocumentosObtenerExpRespTYPE();
        RespuestaConsultaTYPE type=new RespuestaConsultaTYPE();
        type.setCantidadDocumentos(2);
        type.setCodigoRespuesta(3);
        type.setDescripcionRespuesta("This is the description");
        response.setListaResultados(listType);
       
        return response;
    }
}
