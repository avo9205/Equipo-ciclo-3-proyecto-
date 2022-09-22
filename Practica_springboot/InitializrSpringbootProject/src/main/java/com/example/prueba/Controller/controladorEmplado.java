/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.prueba.Controller;

import com.example.prueba.entidades.Empleado;
import com.example.prueba.servicio.servicioEmpleado;
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
public class controladorEmplado {
    
 /*EmpleadoServicio EmpleCon;
    
    
    public EmpleadoController(){
        this.EmpleCon = new EmpleadoServicio();
    }
    
    @GetMapping("/empleado")
    public Empleado informacionEmpleado(){
        return  EmpleCon.getEmpleado();
    }
    */
    
    servicioEmpleado EmpleCon;
    
    public controladorEmplado(servicioEmpleado EmpleCon){
        this.EmpleCon = EmpleCon;
    }
    
    //====Get: Read====
    @GetMapping("/empleado")
    public List<Empleado> readEmpleado(){
        return  EmpleCon.getEmpleRepo();
    }
    //GetOne: ReadOne
    @GetMapping("/empleado/{id}")
    public Optional<Empleado> consultaOneEmp(@PathVariable Long id){
        return this.EmpleCon.getEmpleado(id);
    }
    
    
    //===Post: Create===
    @PostMapping("/empleado")
    public Empleado createEmpleado(@RequestBody Empleado Emple){
        return this.EmpleCon.postEmpleado(Emple);
    }
    
    //===Delete: Delete===
    @DeleteMapping("/empleado/{id}")
    public Optional<Empleado> deleteEmpleado(@PathVariable Long id, @RequestBody Empleado user){
        
        return this.EmpleCon.deleteEmpleado(id);
    }
    
    //===Put: Update====
    @PutMapping("/empleado/{id}")
    public Empleado putEmpleado(@PathVariable Long id, @RequestBody Empleado user){
        return this.EmpleCon.putEmpleado(id, user);
           
    }
    
    
    
}
