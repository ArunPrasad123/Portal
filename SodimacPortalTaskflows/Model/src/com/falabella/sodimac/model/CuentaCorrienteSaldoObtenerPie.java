package com.falabella.sodimac.model;

import java.math.BigDecimal;

public class CuentaCorrienteSaldoObtenerPie {
    public CuentaCorrienteSaldoObtenerPie() {
        super();
    }
    
    private String name;
    private BigDecimal value;
    private String colorCode;

    public CuentaCorrienteSaldoObtenerPie(String name, BigDecimal value, String colorCode) {
        this.name = name;
        this.value = value;
        this.colorCode = colorCode;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setColorCode(String colorCode) {
        this.colorCode = colorCode;
    }

    public String getColorCode() {
        return colorCode;
    }
}
