
package com.example.Sprint_ciclo3_clases.entities;


public class movimientoDinero {
    
    private double monto;
    private double montoPositivoNegativo; 
    private double movimineto;         
    private String usuario;
    
    public movimientoDinero(double monto , double montoPositivoNegativo, double movimineto, String usuario){
    
        this.monto = monto;
        this.montoPositivoNegativo = montoPositivoNegativo;
        this.movimineto = movimineto;
        this.usuario = usuario;
    }
    
    //====getter and setter====

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public double getMontoPositivoNegativo() {
        return montoPositivoNegativo;
    }

    public void setMontoPositivoNegativo(double montoPositivoNegativo) {
        this.montoPositivoNegativo = montoPositivoNegativo;
    }

    public double getMovimineto() {
        return movimineto;
    }

    public void setMovimineto(double movimineto) {
        this.movimineto = movimineto;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    
}
