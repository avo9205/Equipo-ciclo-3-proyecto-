
package com.example.Sprint_ciclo3_clases.entities;


public class Empresa {
    
    private String empresa;
    private String direccion;
    private double telefono;
    private double nit;
    
    public Empresa(String empresa, String direccion , double telefono, double nit){
    
    this.empresa = empresa;
    this.direccion = direccion;
    this.telefono = telefono;
    this.nit = nit;
    }

       
    
    //====getter and setter====

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
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
