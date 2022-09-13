package com.example.Sprint_ciclo3_clases.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

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
    private String movimiento;
   /* @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "nombreEmpleado", nullable = false)
    @JsonIgnoreProperties(value = "empleado") //se lo agregué para no ver ese ciclo infinito en Json
    private Empresa empresa;
    /*
    */
    @Transient
    private Empleado usuario;
    //constructor vacio
    public MovimientoDinero(){

    }

//contructor

    public MovimientoDinero(double monto, String movimiento, Empleado usuario) {
        this.monto = monto;
        this.movimiento = movimiento;
        this.usuario= usuario;
    }

  /*  public Empresa getEmpresa(){
        return empresa;}
    public  void  setEmpresa(Empresa empresa){
        this.empresa= empresa;
    } */

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getMovimiento() {
        return movimiento;
    }

    public void setMovimiento(String movimiento) {
        this.movimiento = movimiento;
    }

    public Empleado getUsuario() {
        return usuario;
    }

    public void setUsuario(Empleado usuario) {
        this.usuario = usuario;
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
