
package com.example.Sprint_ciclo3_clases.entities;

import javax.persistence.*;
import javax.persistence.Table;

@Entity
@Table(name = "Empresa")
public class Empresa {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    @Column(name = "nombreEmpresa")
    private String nombreEmpresa;
    @Column(name = "direccion")
    private String direccion;
    @Column(name = "telefono")
    private double telefono;
    @Column(name = "nit")
    private double nit;

    public Empresa(){

    }
    public Empresa(String nombreEmpresa, String direccion , double telefono, double nit){
    
    this.nombreEmpresa = nombreEmpresa;
    this.direccion = direccion;
    this.telefono = telefono;
    this.nit = nit;
    }
    
    //====getter and setter====

    public String getEmpresa() {
        return nombreEmpresa;
    }

    public void setEmpresa(String empresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getTelefono() {
        return telefono;
    }

    public void setTelefono(double telefono) {
        this.telefono = telefono;
    }

    public double getNit() {
        return nit;
    }

    public void setNit(double nit) {
        this.nit = nit;
    }
    
    
    
    
    
}
