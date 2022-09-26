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
    @Column(name = "concepto")
    private String concepto;

    @Column(name = "registro_empleado")
    private Long registroEmpleado;

    @ManyToOne
    @JoinColumn(name = "registro_empleado",insertable = false,updatable = false)
    private Empleado empleado;

    //constructor vacio
    public MovimientoDinero(){

    }

//contructor

    public MovimientoDinero(double monto, String concepto) {
        this.monto = monto;
        this.concepto = concepto;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public double montoPositivioNegativo(double monto){
        if(monto >= 0){
            return  monto;
        }
        else{
            return  monto;
        }


    }
}