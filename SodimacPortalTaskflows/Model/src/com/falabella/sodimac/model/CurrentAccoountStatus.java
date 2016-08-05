package com.falabella.sodimac.model;

import com.falabella.mdwcorp.sod.cl.osb.schema.clienteempresa.documentos.obtener.req_v2016.ClienteEmpresaDocumentosObtenerExpReqTYPE;
import com.falabella.mdwcorp.sod.cl.osb.schema.clienteempresa.documentos.obtener.resp_v2016.ClienteEmpresaDocumentosObtenerExpRespTYPE;
import com.falabella.mdwcorp.sod.cl.osb.schema.clienteempresa.documentos.obtener.resp_v2016.DetalleListaTYPE;
import com.falabella.mdwcorp.sod.cl.osb.schema.clienteempresa.documentos.obtener.resp_v2016.ListaResultadosTYPE;
import com.falabella.mdwcorp.sod.cl.osb.schema.cuentacorriente.saldo.obtener.req_v2016.CuentaCorrienteSaldoObtenerExpReqTYPE;
import com.falabella.mdwcorp.sod.cl.osb.schema.cuentacorriente.saldo.obtener.req_v2016.CuentaCorrienteSaldoObtenerReqParamTYPE;
import com.falabella.mdwcorp.sod.cl.osb.schema.cuentacorriente.saldo.obtener.resp_v2016.CuentaCorrienteSaldoObtenerExpRespTYPE;
import com.falabella.mdwcorp.sod.cl.osb.schema.cuentacorriente.saldo.obtener.resp_v2016.LineaCreditoHeaderTYPE;
import com.falabella.mdwcorp.sod.cl.osb.wsdl.clienteempresa.documentos.obtener_v1.ClienteEmpresaDocumentosObtenerService;
import com.falabella.mdwcorp.sod.cl.osb.wsdl.clienteempresa.documentos.obtener_v1.ClienteEntregaDocumentosObtenerPt;
import com.falabella.mdwcorp.sod.cl.osb.wsdl.clienteempresa.documentos.obtener_v1.FaultMsg;
import com.falabella.mdwcorp.sod.cl.osb.wsdl.cuentacorriente.saldo.obtener_v1.CuentaCorrienteSaldoObtenerPt;
import com.falabella.mdwcorp.sod.cl.osb.wsdl.cuentacorriente.saldo.obtener_v1.CuentaCorrienteSaldoObtenerService;

import com.falabella.sodimac.model.soaphandlers.HeaderHandlerResolver;

import java.io.Serializable;

import java.net.MalformedURLException;
import java.net.URL;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.xml.ws.soap.SOAPFaultException;

import oracle.binding.AttributeContext;
import oracle.binding.RowContext;

public class CurrentAccoountStatus {

    private List<CuentaCorrienteSaldoObtenerTable> list = new ArrayList<CuentaCorrienteSaldoObtenerTable>();
    private List<CuentaCorrienteSaldoObtenerPie> pieList = new ArrayList<CuentaCorrienteSaldoObtenerPie>();
    private List<CuentaCorrienteSaldoObtenerPie> pietable = new ArrayList<CuentaCorrienteSaldoObtenerPie>();
    private List<DetalleListaType> documents=new ArrayList<DetalleListaType>();
    private List<DetalleListaType> documentsRange=new ArrayList<DetalleListaType>();
    private double totalCount;

    public double getTotalCount() {
        return documentsRange.size();
    }


    public CurrentAccoountStatus() {
        super();
        URL cuentaCorrienteSaldoObtenerServiceUrl =null;
        URL clienteEmpresaDocumentosObtenerService =null;
        
        try {
            cuentaCorrienteSaldoObtenerServiceUrl=  new URL("http://localhost:7101/SodimacService-CuentaCorrienteSaldoObtener-context-root/CuentaCorrienteSaldoObtenerPort?WSDL");
            clienteEmpresaDocumentosObtenerService= new URL("http://localhost:7101/SodimacService-ClienteEmpresaDocumentosObtener-context-root/ClienteEmpresaDocumentosObtenerPort?WSDL");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        invokeCuentaCorrienteSaldoObtenerService(cuentaCorrienteSaldoObtenerServiceUrl);
        invokeClienteEmpresaDocumentosObtenerService(clienteEmpresaDocumentosObtenerService);
    }

    public void invokeCuentaCorrienteSaldoObtenerService(URL url){
        CuentaCorrienteSaldoObtenerService cuentaCorrienteSaldoObtenerService =
            new CuentaCorrienteSaldoObtenerService(url);
        HeaderHandlerResolver handlerResolver = new HeaderHandlerResolver();
        cuentaCorrienteSaldoObtenerService.setHandlerResolver(handlerResolver);
        CuentaCorrienteSaldoObtenerPt cuentaCorrienteSaldoObtenerPt =
            cuentaCorrienteSaldoObtenerService.getCuentaCorrienteSaldoObtenerPort();
        CuentaCorrienteSaldoObtenerExpReqTYPE request = new CuentaCorrienteSaldoObtenerExpReqTYPE();
        CuentaCorrienteSaldoObtenerReqParamTYPE type = new CuentaCorrienteSaldoObtenerReqParamTYPE();
        type.setIdCliente("0074589751-7");
        type.setIdEmpresa(1);
        request.setCuentaCorrienteSaldoObtenerReqParam(type);
        try {
            CuentaCorrienteSaldoObtenerExpRespTYPE response =
                cuentaCorrienteSaldoObtenerPt.cuentaCorrienteSaldoObtenerOp(request);
            LineaCreditoHeaderTYPE responseType = response.getLineaCreditoHeader();
            CuentaCorrienteSaldoObtenerTable abierto =
                new CuentaCorrienteSaldoObtenerTable("Abierto", responseType.getCreditoAutorizado(),
                                                     responseType.getCreditoOtorgado(), responseType.getPorFacturar(),
                                                     responseType.getDisponible(), "Total",
                                                     responseType.getCreditoAutorizado()
                                                     .add(responseType.getMontoLineaCreditoDocumentoSuc()),
                                                     responseType.getCreditoOtorgado()
                                                     .add(responseType.getMontoDeudaDocumentoSuc()),
                                                     responseType.getPorFacturar()
                                                     .add(responseType.getMontoComprometidoSuc()),
                                                     responseType.getDisponible()
                                                     .add(responseType.getDisponibleDocumentado()));
            CuentaCorrienteSaldoObtenerTable documentado =
                new CuentaCorrienteSaldoObtenerTable("Documentado", responseType.getMontoLineaCreditoDocumentoSuc(),
                                                     responseType.getMontoDeudaDocumentoSuc(),
                                                     responseType.getMontoComprometidoSuc(),
                                                     responseType.getDisponibleDocumentado(), "Total",
                                                     responseType.getCreditoAutorizado()
                                                     .add(responseType.getMontoLineaCreditoDocumentoSuc()),
                                                     responseType.getCreditoOtorgado()
                                                     .add(responseType.getMontoDeudaDocumentoSuc()),
                                                     responseType.getPorFacturar()
                                                     .add(responseType.getMontoComprometidoSuc()),
                                                     responseType.getDisponible()
                                                     .add(responseType.getDisponibleDocumentado()));

            list.add(abierto);
            list.add(documentado);

            CuentaCorrienteSaldoObtenerPie utilizado =
                new CuentaCorrienteSaldoObtenerPie("Utilizado",
                                                   responseType.getCreditoOtorgado()
                                                   .add(responseType.getMontoDeudaDocumentoSuc()), "#666666");
            CuentaCorrienteSaldoObtenerPie porFacturar =
                new CuentaCorrienteSaldoObtenerPie("Por facturar",
                                                   responseType.getPorFacturar()
                                                   .add(responseType.getMontoComprometidoSuc()), "#A3A3A3");
            CuentaCorrienteSaldoObtenerPie disponible =
                new CuentaCorrienteSaldoObtenerPie("Disponible",
                                                   responseType.getDisponible()
                                                   .add(responseType.getDisponibleDocumentado()), "#C5C5C5");
            
            CuentaCorrienteSaldoObtenerPie cupo =
                new CuentaCorrienteSaldoObtenerPie("Cupo",
                                                   responseType.getCreditoAutorizado()
                                                   .add(responseType.getMontoDeudaDocumentoSuc()), "transparent");

            pieList.add(utilizado);
            pieList.add(porFacturar);
            pieList.add(disponible);
            
            pietable.add(cupo);
            pietable.add(utilizado);
            pietable.add(porFacturar);
            pietable.add(disponible);
        
        }catch(SOAPFaultException e){
            e.printStackTrace();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
    public void invokeClienteEmpresaDocumentosObtenerService(URL url){
        ClienteEmpresaDocumentosObtenerService clienteEmpresaDocumentosObtenerService =
            new ClienteEmpresaDocumentosObtenerService(url);
        HeaderHandlerResolver handlerResolver = new HeaderHandlerResolver();
        clienteEmpresaDocumentosObtenerService.setHandlerResolver(handlerResolver);
        ClienteEntregaDocumentosObtenerPt clienteEntregaDocumentosObtenerPt =
            clienteEmpresaDocumentosObtenerService.getClienteEmpresaDocumentosObtenerPort();
        ClienteEmpresaDocumentosObtenerExpReqTYPE request=new ClienteEmpresaDocumentosObtenerExpReqTYPE();
        request.setIdentificadorCliente("0074589751-7");
        request.setIdentificadorEmpresa("1");
        try {
            ClienteEmpresaDocumentosObtenerExpRespTYPE response=clienteEntregaDocumentosObtenerPt.clienteEmpresaDocumentosObtenerOp(request);
            ListaResultadosTYPE listType=response.getListaResultados();
            List<DetalleListaTYPE> tempDocuments=listType.getDetalleLista();
            Iterator itr=tempDocuments.iterator();
            int i=0;
            while(itr.hasNext()){
                i++;
                DetalleListaTYPE document=(DetalleListaTYPE)itr.next();
                Date broadcastDate=document.getDocumentoFechaEmision().toGregorianCalendar().getTime();
                Date expirationDate=document.getDocumentoFechaVencimiento().toGregorianCalendar().getTime();
                if(i<=10){
                    documents.add(new DetalleListaType(document.getIdentificadorTipoDocumento(),document.getNombreTipoDocumento(),document.getIdentificadorUnidad(),document.getNombreUnidad(),document.getNumeroDocumento(),broadcastDate,document.getSaldo(),document.getSaldoVencido(),expirationDate,document.getDiasVencido(),document.getDocumentoEstado()));
                    documentsRange.add(new DetalleListaType(document.getIdentificadorTipoDocumento(),document.getNombreTipoDocumento(),document.getIdentificadorUnidad(),document.getNombreUnidad(),document.getNumeroDocumento(),broadcastDate,document.getSaldo(),document.getSaldoVencido(),expirationDate,document.getDiasVencido(),document.getDocumentoEstado()));
                }else{
                    documentsRange.add(new DetalleListaType(document.getIdentificadorTipoDocumento(),document.getNombreTipoDocumento(),document.getIdentificadorUnidad(),document.getNombreUnidad(),document.getNumeroDocumento(),broadcastDate,document.getSaldo(),document.getSaldoVencido(),expirationDate,document.getDiasVencido(),document.getDocumentoEstado()));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setList(List<CuentaCorrienteSaldoObtenerTable> list) {
        this.list = list;
    }

    public List<CuentaCorrienteSaldoObtenerTable> getList() {
        return list;
    }

    public void setPieList(List<CuentaCorrienteSaldoObtenerPie> pieList) {
        this.pieList = pieList;
    }

    public List<CuentaCorrienteSaldoObtenerPie> getPieList() {
        return pieList;
    }

    public Serializable createSnapshot() {
        return null;
    }

    public void restoreSnapshot(Serializable p0) {
    }

    public void removeSnapshot(Serializable p0) {
    }

    public boolean isTransactionDirty() {
        return false;
    }

    public void rollbackTransaction() {
    }

    public void commitTransaction() {
    }

    public boolean setAttributeValue(AttributeContext p0, Object p1) {
        return false;
    }

    public Object createRowData(RowContext p0) {
        return null;
    }

    public Object registerDataProvider(RowContext p0) {
        return null;
    }

    public boolean removeRowData(RowContext p0) {
        return false;
    }

    public void validate() {
    }

    public void setPietable(List<CuentaCorrienteSaldoObtenerPie> pietable) {
        this.pietable = pietable;
    }

    public List<CuentaCorrienteSaldoObtenerPie> getPietable() {
        return pietable;
    }

    public void setDocuments(List<DetalleListaType> documents) {
        this.documents = documents;
    }

    public List<DetalleListaType> getDocuments() {
        return documents;
    }

    public void setDocumentsRange(List<DetalleListaType> documentsRange) {
        this.documentsRange = documentsRange;
    }

    public List<DetalleListaType> getDocumentsRange() {
        return documentsRange;
    }

}

