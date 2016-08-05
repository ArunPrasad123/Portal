package com.falabella.sodimac.model;

import java.math.BigDecimal;

import java.util.Date;


public class DetalleListaType {
    public DetalleListaType() {
        super();
    }
    private short identificadorTipoDocumento;
    private String nombreTipoDocumento;
    private short identificadorUnidad;
    private String nombreUnidad;
    private int numeroDocumento;
    private Date documentoFechaEmision;
    private BigDecimal saldo;
    private BigDecimal saldoVencido;
    private Date documentoFechaVencimiento;
    private int diasVencido;
    private short documentoEstado;


    public DetalleListaType(short identificadorTipoDocumento, String nombreTipoDocumento, short identificadorUnidad,
                            String nombreUnidad, int numeroDocumento, Date documentoFechaEmision, BigDecimal saldo,
                            BigDecimal saldoVencido, Date documentoFechaVencimiento, int diasVencido,
                            short documentoEstado) {
        this.identificadorTipoDocumento = identificadorTipoDocumento;
        this.nombreTipoDocumento = nombreTipoDocumento;
        this.identificadorUnidad = identificadorUnidad;
        this.nombreUnidad = nombreUnidad;
        this.numeroDocumento = numeroDocumento;
        this.documentoFechaEmision = documentoFechaEmision;
        this.saldo = saldo;
        this.saldoVencido = saldoVencido;
        this.documentoFechaVencimiento = documentoFechaVencimiento;
        this.diasVencido = diasVencido;
        this.documentoEstado = documentoEstado;
    }

    public void setIdentificadorTipoDocumento(short identificadorTipoDocumento) {
        this.identificadorTipoDocumento = identificadorTipoDocumento;
    }

    public short getIdentificadorTipoDocumento() {
        return identificadorTipoDocumento;
    }

    public void setNombreTipoDocumento(String nombreTipoDocumento) {
        this.nombreTipoDocumento = nombreTipoDocumento;
    }

    public String getNombreTipoDocumento() {
        return nombreTipoDocumento;
    }

    public void setIdentificadorUnidad(short identificadorUnidad) {
        this.identificadorUnidad = identificadorUnidad;
    }

    public short getIdentificadorUnidad() {
        return identificadorUnidad;
    }

    public void setNombreUnidad(String nombreUnidad) {
        this.nombreUnidad = nombreUnidad;
    }

    public String getNombreUnidad() {
        return nombreUnidad;
    }

    public void setNumeroDocumento(int numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public int getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setDocumentoFechaEmision(Date documentoFechaEmision) {
        this.documentoFechaEmision = documentoFechaEmision;
    }

    public Date getDocumentoFechaEmision() {
        return documentoFechaEmision;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldoVencido(BigDecimal saldoVencido) {
        this.saldoVencido = saldoVencido;
    }

    public BigDecimal getSaldoVencido() {
        return saldoVencido;
    }

    public void setDocumentoFechaVencimiento(Date documentoFechaVencimiento) {
        this.documentoFechaVencimiento = documentoFechaVencimiento;
    }

    public Date getDocumentoFechaVencimiento() {
        return documentoFechaVencimiento;
    }

    public void setDiasVencido(int diasVencido) {
        this.diasVencido = diasVencido;
    }

    public int getDiasVencido() {
        return diasVencido;
    }

    public void setDocumentoEstado(short documentoEstado) {
        this.documentoEstado = documentoEstado;
    }

    public short getDocumentoEstado() {
        return documentoEstado;
    }
}
