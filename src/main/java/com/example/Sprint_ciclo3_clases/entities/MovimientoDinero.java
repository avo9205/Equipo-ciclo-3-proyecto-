package com.example.Sprint_ciclo3_clases.entities;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.sun.istack.NotNull;
import org.springframework.lang.NonNull;

import javax.persistence.*;
import javax.persistence.Table;

@Entity
@Table(name = "MovimientoDinero")
public class MovimientoDinero {
    @Id
    private  Long Id;
    @Column(name = "monto")
    private double monto;
    //private double montoPositivoNegativo;
    @Column(name = "concepto")
    private String concepto;

    @ManyToOne(optional = false)
    @JoinColumn(name = "registroEmpleado", nullable = false)
    @JsonIgnoreProperties(value = "empleado")
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

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
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