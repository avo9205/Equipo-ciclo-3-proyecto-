
package com.example.Sprint_ciclo3_clases.entities;

import javax.persistence.*;
import javax.persistence.Table;

@Entity
@Table(name = "Empresa")
public class Empresa {

    //##### la clave primaria de esta tabla es el NIT ####
    @Id
    private Long nit;
    @Column(name = "nombre_empresa")
    private String nombreEmpresa;
    @Column(name = "direccion")
    private String direccion;
    @Column(name = "telefono")
    private String telefono;


    public Empresa(){

    }/*
   public Empresa(String nombreEmpresa, String direccion , String telefono, Long nit){
    
    this.nombreEmpresa = nombreEmpresa;
    this.direccion = direccion;
    this.telefono = telefono;
    this.nit = nit;
    }*/
    
    //====getter and setter====

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Long getNit() {
        return nit;
    }

    public void setNit(Long nit) {
        this.nit = nit;
    }
    
    
    
    
    
}
