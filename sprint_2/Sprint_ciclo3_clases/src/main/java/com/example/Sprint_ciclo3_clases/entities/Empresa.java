
package com.example.Sprint_ciclo3_clases.entities;

import javax.persistence.*;
import javax.persistence.Table;

@Entity
@Table(name = "Empresa")
public class Empresa {
   /* @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;*/

    //se cambia la primary key
    @Id
    private Long nit;
    @Column(name = "nombreEmpresa")
    private String nombreEmpresa;
    @Column(name = "direccion")
    private String direccion;
    @Column(name = "telefono")
    private String telefono;


    public Empresa(){

    }
   /* public Empresa(String nombreEmpresa, String direccion , String telefono, String nit){
    
    this.nombreEmpresa = nombreEmpresa;
    this.direccion = direccion;
    this.telefono = telefono;
    this.nit = nit;
    }*/
    
    //====getter and setter====

    public String getEmpresa() {
        return nombreEmpresa;
    }

    public void setEmpresa(String nombreEmpresa) {
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
