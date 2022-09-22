/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.prueba.servicio;

import com.example.prueba.entidades.Empleado;
import com.example.prueba.entidades.Empresa;
import com.example.prueba.entidades.MovimientoDinero;
import com.example.prueba.repositorio.MovimientoDineroRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class servicioMovDinero {
    
/*    movimientoDinero movDinero;
    
    public MovimientoDineroServicio(){
        this.movDinero = new movimientoDinero(123,"camisa");
    }
    
    //getter

    public movimientoDinero getMovDinero() {
        return movDinero;
    }
    
*/
    
    MovimientoDineroRepository MovRepo;
    
    public servicioMovDinero(MovimientoDineroRepository MovRepo){
        this.MovRepo = MovRepo;
    }

    
    //====Get: Read====
    public List<MovimientoDinero> getMovDinero() {
        return MovRepo.findAll();
    }
    //GetOne: ReadOne
    public Optional<MovimientoDinero> getMovDineroOne(Long id){
    return  this.MovRepo.findById(id);
    }
    
    
    //Post: Create
    public MovimientoDinero createRegDinero(MovimientoDinero movimientoPost){
        return this.MovRepo.save(movimientoPost);
    }
    
        
    //Delete: Delete
    public Optional<MovimientoDinero> deleteMovDinero(Long id){
        Optional<MovimientoDinero> delete = this.MovRepo.findById(id);
        this.MovRepo.deleteById(id);
        return delete;
    }
    
    //Put: Update
    public MovimientoDinero putMovDinero(@PathVariable Long Id, @RequestBody MovimientoDinero MovDin){
        MovimientoDinero update = this.MovRepo.findById(Id).orElseThrow(IllegalStateException::new);
        
        update.setMonto(MovDin.getMonto());
        update.setConceptoDinero(MovDin.getConceptoDinero());
        
        
        return this.MovRepo.save(update);
    
    }
            




    
    
}