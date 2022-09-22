
package com.example.prueba.entidades;

//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
//import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
//import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="MovimientoDinero")
public class MovimientoDinero implements Serializable {
    
    
    @Id
    private Long IdProducto;
    
    @Column(name = "Monto")
    private double monto;
    @Column(name = "Concepto")
    private String conceptoDinero;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "empleado")
    Empleado usuario;
    
     
    
    
    
    public MovimientoDinero(double monto, String conceptoDinero){
        this.monto = monto;
        this.conceptoDinero = conceptoDinero;
    }


    public MovimientoDinero(){}

   
    
    
   

//setter and getter
    
     public Long getIdProducto() {
        return IdProducto;
    }
    
    public void setIdProducto(Long IdProducto) {
        this.IdProducto = IdProducto;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getConceptoDinero() {
        return conceptoDinero;
    }

    public void setConceptoDinero(String conceptoDinero) {
        this.conceptoDinero = conceptoDinero;
    }

    public Empleado getUsuario() {
        return usuario;
    }

    public void setUsuario(Empleado usuario) {
        this.usuario = usuario;
    }
    
    

//toString

    @Override
    public String toString() {
        return "movimientoDinero{" + "monto=" + monto + ", conceptoDinero=" + conceptoDinero + '}';
    }
    
    
}
