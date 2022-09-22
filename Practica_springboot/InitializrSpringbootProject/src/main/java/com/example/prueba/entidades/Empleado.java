
package com.example.prueba.entidades;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
//import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
//import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="Empleado")
public class Empleado implements Serializable {
    
    
    @Id
    private Long IdEmpleado;
    
    @Column(name = "Empleado")
    private String empleado;
    @Column(name = "Correo")
    private String correo;
    
    @Column(name = "Cargo")
    private String cargo;
    
    
    //nit empresa
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "empresa")
    Empresa empresa;
    
    
    
    
    
    public Empleado(String empleado, String correo,String cargo){
        this.empleado = empleado;
        this.correo = correo;
        this.cargo = cargo;
        
    }
 
    
    public Empleado(){}
    
    
    
    
//setter and getter

    public String getEmpleado() {
        return empleado;
    }

    public void setEmpleado(String empleado) {
        this.empleado = empleado;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Long getIdEmpleado() {
        return IdEmpleado;
    }

    public void setIdEmpleado(Long IdEmpleado) {
        this.IdEmpleado = IdEmpleado;
    }
    
    

//toString

    @Override
    public String toString() {
        return "Empleado{" + "empleado=" + empleado + ", correo=" + correo + ", empresa=" + empresa + ", cargo=" + cargo + '}';
    }
    
    
    
}
