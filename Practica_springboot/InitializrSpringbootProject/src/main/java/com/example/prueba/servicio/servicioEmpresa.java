
package com.example.prueba.servicio;

//import org.springframework.stereotype.Service;
import com.example.prueba.entidades.Empleado;
import com.example.prueba.entidades.Empresa;
import com.example.prueba.repositorio.EmpresaRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class servicioEmpresa {
 /* Empresa empresa;
    EmpleadoServicio empleado;
    MovimientoDineroServicio MovDinero;
    
    public EmpresaServicio(){
        this.empleado = new EmpleadoServicio();
        this.MovDinero = new MovimientoDineroServicio();
        this.empresa = new Empresa("empresa", "direccion", "telefono", "nit",this.empleado.getEmpleado(),this.MovDinero.getMovDinero());
               
    }
    
//getter

    public Empresa getEmpresa() {
        return this.empresa;
    }
*/
    
    EmpresaRepository EmpRepo;
    
    public servicioEmpresa(EmpresaRepository EmpRepo){
        this.EmpRepo = EmpRepo;
    }

    
    
    //====Get: Read====
    public List<Empresa> getEmpRepo() {
        return this.EmpRepo.findAll();
    }
    //GetOne: ReadOne
    public Optional<Empresa> getEmpRepoOne(Long id){
    return  this.EmpRepo.findById(id);
    }    
    


    //===Post: Create===
    public Empresa crearRegistro(Empresa empresaPost){
        return this.EmpRepo.save(empresaPost);
    }
    
    
    //===Delete: Delete===
    public Optional<Empresa> deleteEmpresa(Long id){
        Optional<Empresa> delete = this.EmpRepo.findById(id);
        this.EmpRepo.deleteById(id);
        return delete;
    }
    
    //===Put: Update====
    public Empresa putEmpresa(@PathVariable Long Id, @RequestBody Empresa Emp){
        Empresa update = this.EmpRepo.findById(Id).orElseThrow(IllegalStateException::new);
        update.setEmpresa(Emp.getEmpresa());
        
        update.setDireccion(Emp.getDireccion());
        update.setTelefono(Emp.getTelefono());
        
        return this.EmpRepo.save(update);
    
    }
            
}
    

