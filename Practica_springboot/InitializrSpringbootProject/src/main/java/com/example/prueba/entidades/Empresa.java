
package com.example.prueba.entidades;

//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
//import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.OneToMany;
import javax.persistence.Table;
//import javax.persistence.Transient;

@Entity
@Table(name = "Empresa")
public class Empresa implements Serializable {
    
   @Id
   private Long nit;
    
   @Column(name = "Empresa")
   private String empresa;
   @Column(name = "Direccion")
   private String direccion;
   @Column(name = "Telefono")
   private String telefono;
   
   

    public Empresa(){}
   
   
   public Empresa(String empresa, String direccion, String telefono/*,movimientoDinero movimiento*/){
       this.empresa = empresa;
       this.direccion = direccion;
       this.telefono = telefono;
       
       
       
   }

   
//setter and getter

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