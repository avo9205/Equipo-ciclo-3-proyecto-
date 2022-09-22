
package com.example.prueba.servicio;

import com.example.prueba.entidades.Empleado;
import com.example.prueba.repositorio.EmpleadoRepository;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;


@Service
public class servicioEmpleado {
    
/*    Empleado empleado;
    
    public EmpleadoServicio(){
        this.empleado = new Empleado("juan","mundo@","google","programador");
    }
    
 
//getter

    public Empleado getEmpleado() {
        return empleado;
    }
*/

    private final EmpleadoRepository EmpleRepo;
    
    public servicioEmpleado(EmpleadoRepository EmpleRepo){
       this.EmpleRepo = EmpleRepo;
    }
    
    
    //====Get: Read====
    public List<Empleado> getEmpleRepo(){
        return EmpleRepo.findAll();
    }
    //GetOne: ReadOne
    public Optional<Empleado> getEmpleado(Long id){
    return  this.EmpleRepo.findById(id);
    }
    


 
    //===Post: Create===
    public Empleado postEmpleado(Empleado empleadoPost){
        return this.EmpleRepo.save(empleadoPost);
    
    }
    
    //===Delete: Delete===
    public Optional<Empleado> deleteEmpleado(Long id){
        Optional<Empleado> delete = this.EmpleRepo.findById(id);
        this.EmpleRepo.deleteById(id);
        return delete;
    }
    
    //===Put: Update====
    public Empleado putEmpleado(@PathVariable Long Id, @RequestBody Empleado user){
        Empleado update = this.EmpleRepo.findById(Id).orElseThrow(IllegalStateException::new);
        update.setEmpleado(user.getEmpleado());
        //update.setEmpresa(user.getEmpresa());
        update.setCorreo(user.getCorreo());
        update.setCargo(user.getCargo());
        
        return this.EmpleRepo.save(update);
    
    }
    
    
    
    
}
