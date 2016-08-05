package com.falabella.mdwcorp.sod.cl.osb.wsdl.cuentacorriente.saldo.obtener_v1;

import com.falabella.mdwcorp.common.schema.clientservice.ObjectFactory;
import com.falabella.mdwcorp.sod.cl.osb.schema.cuentacorriente.saldo.obtener.req_v2016.CuentaCorrienteSaldoObtenerExpReqTYPE;
import com.falabella.mdwcorp.sod.cl.osb.schema.cuentacorriente.saldo.obtener.resp_v2016.CuentaCorrienteSaldoObtenerExpRespTYPE;

import com.falabella.mdwcorp.sod.cl.osb.schema.cuentacorriente.saldo.obtener.resp_v2016.LineaCreditoHeaderTYPE;

import com.falabella.mdwcorp.sod.cl.osb.schema.cuentacorriente.saldo.obtener.resp_v2016.RespMensajeTYPE;

import java.math.BigDecimal;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;

@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({ ObjectFactory.class,
              com.falabella.mdwcorp.sod.cl.osb.schema.cuentacorriente.saldo.obtener.req_v2016.ObjectFactory.class,
              com.falabella.mdwcorp.sod.cl.osb.schema.cuentacorriente.saldo.obtener.resp_v2016.ObjectFactory.class,
              org.xmlsoap.schemas.soap.envelope.ObjectFactory.class
    })
@WebService(name = "CuentaCorrienteSaldoObtenerPt", serviceName = "CuentaCorrienteSaldoObtenerService",
            targetNamespace = "http://mdwcorp.falabella.com/SOD/CL/OSB/wsdl/Cuentacorriente/Saldo/Obtener-v1.0",
            portName = "CuentaCorrienteSaldoObtenerPort")
public class CuentaCorrienteSaldoObtenerPtImpl {
    public CuentaCorrienteSaldoObtenerPtImpl() {
    }

    @WebResult(name = "cuentaCorrienteSaldoObtenerExpResp", partName = "cuentaCorrienteSaldoObtenerRespParam",
               targetNamespace =
               "http://mdwcorp.falabella.com/SOD/CL/OSB/schema/Cuentacorriente/Saldo/Obtener/Resp-v2016.07")
    @WebMethod(operationName = "CuentaCorrienteSaldoObtenerOp",
               action = "http://mdwcorp.falabella.com/SOD/CL/OSB/wsdl/Cuentacorriente/Saldo/Obtener-v1.0/Op")
    public CuentaCorrienteSaldoObtenerExpRespTYPE cuentaCorrienteSaldoObtenerOp(@WebParam(name =
                                                                                          "cuentaCorrienteSaldoObtenerExpReq",
                                                                                          partName =
                                                                                          "cuentaCorrienteSaldoObtenerReqParam",
                                                                                          targetNamespace =
                                                                                          "http://mdwcorp.falabella.com/SOD/CL/OSB/schema/Cuentacorriente/Saldo/Obtener/Req-v2016.07")
                                                                                CuentaCorrienteSaldoObtenerExpReqTYPE cuentaCorrienteSaldoObtenerReqParam) throws FaultMsg {
        
        BigDecimal creditoAutorizado=new BigDecimal(50000000);
        BigDecimal creditoOtorgado=new BigDecimal(2675513);
        BigDecimal porFacturar=new BigDecimal(0);
        BigDecimal disponible=new BigDecimal(47324487);
        BigDecimal montoLineaCreditoDocumentoSuc=new BigDecimal(0);
        BigDecimal montoDeudaDocumentoSuc=new BigDecimal(0);
        BigDecimal montoComprometidoSuc=new BigDecimal(0);
        BigDecimal disponibleDocumentado=new BigDecimal(0);
        
        CuentaCorrienteSaldoObtenerExpRespTYPE response=new CuentaCorrienteSaldoObtenerExpRespTYPE();
        
        LineaCreditoHeaderTYPE credit=new LineaCreditoHeaderTYPE();
        credit.setCreditoAutorizado(creditoAutorizado);
        credit.setCreditoOtorgado(creditoOtorgado);
        credit.setDisponible(disponible);
        credit.setDisponibleDocumentado(disponibleDocumentado);
        credit.setMontoComprometidoSuc(montoComprometidoSuc);
        credit.setMontoDeudaDocumentoSuc(montoDeudaDocumentoSuc);
        credit.setMontoLineaCreditoDocumentoSuc(montoLineaCreditoDocumentoSuc);
        credit.setPorFacturar(porFacturar);
        
        RespMensajeTYPE res=new RespMensajeTYPE();
        res.setCodigoMensaje(3);
        res.setDescripcionMensaje("this is the description");
        
        response.setLineaCreditoHeader(credit);
        response.setRespMensaje(res);
        
        return response;
    }
}
