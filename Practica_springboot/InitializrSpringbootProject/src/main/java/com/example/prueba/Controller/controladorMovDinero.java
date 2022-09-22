/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.prueba.Controller;

import com.example.prueba.entidades.Empresa;
import com.example.prueba.entidades.MovimientoDinero;
import com.example.prueba.servicio.servicioMovDinero;
import java.util.List;
import java.util.Optional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class controladorMovDinero {
    
/*   MovimientoDineroServicio MovCon;
    
    public MovimientoDineroController(){
    this.MovCon = new MovimientoDineroServicio();
    }

    @GetMapping("/movdinero")
    public movimientoDinero informacionDinero(){
        return this.MovCon.getMovDinero();
    }
*/
    
    servicioMovDinero MovCon;
    
    public controladorMovDinero(servicioMovDinero MovCon){
        this.MovCon = MovCon;
    }
    
    
    //====Get: Read====
    @GetMapping("/movdinero")
    public List<MovimientoDinero> readMovDinero(){
        return this.MovCon.getMovDinero();
    }
    //GetOne: ReadOne   
    @GetMapping("/movdinero/{id}")
    public Optional<MovimientoDinero> readMovDineroOne(@PathVariable Long id){
        return this.MovCon.getMovDineroOne(id);
    }   
    
    
    //===Post: Create===
    @PostMapping("/movdinero")
    public MovimientoDinero createMovDinero(@RequestBody MovimientoDinero MovDin){
    
        return this.MovCon.createRegDinero(MovDin);
    
    }
    
    
    //===Delete: Delete===
    @DeleteMapping("/movdinero/{id}")
    public Optional<MovimientoDinero> deleteMovDinero(@PathVariable Long id, @RequestBody MovimientoDinero MovDin){
        
        return this.MovCon.deleteMovDinero(id);
        
    }
    
    //===Put: Update====
    @PutMapping("/movdinero/{id}")
    public MovimientoDinero putMovDinero(@PathVariable Long id, @RequestBody MovimientoDinero MovDin){
        return this.MovCon.putMovDinero(id, MovDin);
           
    }  
    
    
    
}
