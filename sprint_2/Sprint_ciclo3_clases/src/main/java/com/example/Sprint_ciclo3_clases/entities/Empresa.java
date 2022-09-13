
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
    private String telefono;
    @Column(name = "nit")
    private String nit;

    public Empresa(){

    }
    public Empresa(String nombreEmpresa, String direccion , String telefono, String nit){
    
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }
    
    
    
    
    
}
