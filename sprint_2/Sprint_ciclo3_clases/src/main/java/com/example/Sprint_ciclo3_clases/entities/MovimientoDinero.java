package com.example.Sprint_ciclo3_clases.entities;

import javax.persistence.*;
import javax.persistence.Table;

@Entity
@Table(name = "MovimientoDinero")
public class MovimientoDinero {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long Id;
    @Column(name = "monto")
    private double monto;
    //private double montoPositivoNegativo;
    @Column(name = "movimiento")
    private double movimiento;
    @Transient
    private Empleado usuario;
    //constructor vacio
    public MovimientoDinero(){

    }

//contructor
    public MovimientoDinero(double monto, double movimiento, Empleado usuario) {
        this.setMonto(monto);
        this.setMovimiento(movimiento);
        this.setUsuario(usuario);
    }


    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public double getMovimiento() {
        return movimiento;
    }

    public void setMovimiento(double movimiento) {
        this.movimiento = movimiento;
    }

    public Empleado getUsuario() {
        return usuario;
    }

    public void setUsuario(Empleado usuario) {
        this.usuario = usuario;
    }

    public double montoPositivioNegativo(double monto){
        return  monto*-1;

    }
}
