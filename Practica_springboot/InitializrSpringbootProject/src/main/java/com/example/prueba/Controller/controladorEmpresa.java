
package com.example.prueba.Controller;

import com.example.prueba.entidades.Empleado;
import com.example.prueba.entidades.Empresa;
import com.example.prueba.servicio.servicioEmpresa;
import java.util.List;
import java.util.Optional;
import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
//import repaso_temporal.repaso_temporal.Entities.Empleado;



@RestController
public class controladorEmpresa {
    
/*   
    EmpresaServicio EmpCon;
    
    
    public EmpresaControlador(){
        this.EmpCon = new EmpresaServicio();
        
    }
        
    @GetMapping("/empresa")
    public Empresa informacionEmpresa(){
        return this.EmpCon.getEmpresa();
    }
*/
    
    servicioEmpresa EmpCon;
    
    public controladorEmpresa(servicioEmpresa EmpCon){
        this.EmpCon = EmpCon;
    } 
    
    
    //====Get: Read==== 
    @GetMapping("/empresa")
    public List<Empresa> readEmpresa(){
        return  this.EmpCon.getEmpRepo();
    }
    //GetOne: ReadOne   
    @GetMapping("/empresa/{id}")
    public Optional<Empresa> consultaEmpresa(@PathVariable Long id){
        return this.EmpCon.getEmpRepoOne(id);
    }   
    


    //===Post: Create===
    @PostMapping("/empresa")
    public Empresa ConsultaOneEmpre(@RequestBody Empresa Emp){
        return this.EmpCon.crearRegistro(Emp);
    
    }

     
    //===Delete: Delete===
    
    @DeleteMapping("/empresa/{id}")
    public Optional<Empresa> deleteEmpresa(@PathVariable Long id, @RequestBody Empresa Emp){
        
        return this.EmpCon.deleteEmpresa(id);
        
    }
    
    //===Put: Update====
    @PutMapping("/empresa/{id}")
    public Empresa putEmpresa(@PathVariable Long id, @RequestBody Empresa Emp){
        return this.EmpCon.putEmpresa(id, Emp);
           
    }  
    
    
    
    
}
