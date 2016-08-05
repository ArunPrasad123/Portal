package com.falabella.sodimac.model;

import java.math.BigDecimal;

public class CuentaCorrienteSaldoObtenerTable {
    public CuentaCorrienteSaldoObtenerTable() {
        super();
    }

    public CuentaCorrienteSaldoObtenerTable(String tipoDeCr�dito, BigDecimal cupo, BigDecimal utilizado,
                                            BigDecimal porFacturar, BigDecimal disponible, String totalTipoDeCr�dito,
                                            BigDecimal totalCupo, BigDecimal totalUtilizado,
                                            BigDecimal totalPorFacturar, BigDecimal totalDisponible) {
        this.tipoDeCr�dito = tipoDeCr�dito;
        this.cupo = cupo;
        this.utilizado = utilizado;
        this.porFacturar = porFacturar;
        this.disponible = disponible;
        this.totalTipoDeCr�dito = totalTipoDeCr�dito;
        this.totalCupo = totalCupo;
        this.totalUtilizado = totalUtilizado;
        this.totalPorFacturar = totalPorFacturar;
        this.totalDisponible = totalDisponible;
    }
    private String tipoDeCr�dito;
    private BigDecimal cupo;
    private BigDecimal utilizado;
    private BigDecimal porFacturar;
    private BigDecimal disponible;
    private String totalTipoDeCr�dito;
    private BigDecimal totalCupo;

    public void setTipoDeCr�dito(String tipoDeCr�dito) {
        this.tipoDeCr�dito = tipoDeCr�dito;
    }

    public String getTipoDeCr�dito() {
        return tipoDeCr�dito;
    }

    public void setCupo(BigDecimal cupo) {
        this.cupo = cupo;
    }

    public BigDecimal getCupo() {
        return cupo;
    }

    public void setUtilizado(BigDecimal utilizado) {
        this.utilizado = utilizado;
    }

    public BigDecimal getUtilizado() {
        return utilizado;
    }

    public void setPorFacturar(BigDecimal porFacturar) {
        this.porFacturar = porFacturar;
    }

    public BigDecimal getPorFacturar() {
        return porFacturar;
    }

    public void setDisponible(BigDecimal disponible) {
        this.disponible = disponible;
    }

    public BigDecimal getDisponible() {
        return disponible;
    }

    public void setTotalTipoDeCr�dito(String totalTipoDeCr�dito) {
        this.totalTipoDeCr�dito = totalTipoDeCr�dito;
    }

    public String getTotalTipoDeCr�dito() {
        return totalTipoDeCr�dito;
    }

    public void setTotalCupo(BigDecimal totalCupo) {
        this.totalCupo = totalCupo;
    }

    public BigDecimal getTotalCupo() {
        return totalCupo;
    }

    public void setTotalUtilizado(BigDecimal totalUtilizado) {
        this.totalUtilizado = totalUtilizado;
    }

    public BigDecimal getTotalUtilizado() {
        return totalUtilizado;
    }

    public void setTotalPorFacturar(BigDecimal totalPorFacturar) {
        this.totalPorFacturar = totalPorFacturar;
    }

    public BigDecimal getTotalPorFacturar() {
        return totalPorFacturar;
    }

    public void setTotalDisponible(BigDecimal totalDisponible) {
        this.totalDisponible = totalDisponible;
    }

    public BigDecimal getTotalDisponible() {
        return totalDisponible;
    }
    private BigDecimal totalUtilizado;
    private BigDecimal totalPorFacturar;
    private BigDecimal totalDisponible;
}
