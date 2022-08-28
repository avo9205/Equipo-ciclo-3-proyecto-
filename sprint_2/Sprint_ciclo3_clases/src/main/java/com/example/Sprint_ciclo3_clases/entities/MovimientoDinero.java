package com.example.Sprint_ciclo3_clases.entities;

public class MovimientoDinero {
    private double monto;
    private double montoPositivoNegativo;
    private double movimiento;
    private String usuario;

    public MovimientoDinero(double monto, double montoPositivoNegativo, double movimiento, String usuario) {
        this.setMonto(monto);
        this.setMontoPositivoNegativo(montoPositivoNegativo);
        this.setMovimiento(movimiento);
        this.setUsuario(usuario);
    }

    public double getMonto() {
        return monto;    }
    public void setMonto(double monto) {
        this.monto = monto;    }

    public double getMontoPositivoNegativo() {
        return montoPositivoNegativo;    }
    public void setMontoPositivoNegativo(double montoPositivoNegativo) {
        this.montoPositivoNegativo = montoPositivoNegativo;    }

    public double getMovimiento() {
        return movimiento;    }
    public void setMovimiento(double movimiento) {
        this.movimiento = movimiento;    }

    public String getUsuario() {
        return usuario;    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;    }
}
