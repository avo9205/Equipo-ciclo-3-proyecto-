package com.example.Sprint_ciclo3_clases.entities;

import javax.persistence.*;
import javax.persistence.Table;

@Entity
@Table(name = "Empleados")
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long registroEmpleado;
    @Column(name = "nombreEmpleado")
    private String nombreEmpleado;
    @Column(name = "correo")
    private String correo;
    @Column(name = "cargo")
    private String cargo;

    @ManyToOne(optional = false)
    @JoinColumn(name = "nit")
    private Empresa empresa;


    //constructor vacio


    public Empleado(){

    }
  /*  public Empleado(String nombreEmpleado, String correo, String cargo, Empresa empresa) {
        this.nombreEmpleado = nombreEmpleado;
        this.correo = correo;
        this.cargo = cargo;
        this.empresa = empresa;
    }*/

    // ====getter and setter====

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Long getRegistroEmpleado(){
        return registroEmpleado;
    }
}