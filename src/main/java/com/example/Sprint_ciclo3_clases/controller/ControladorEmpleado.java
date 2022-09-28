package com.example.Sprint_ciclo3_clases.controller;

import com.example.Sprint_ciclo3_clases.entities.Empleado;
import com.example.Sprint_ciclo3_clases.entities.Empresa;
import com.example.Sprint_ciclo3_clases.services.EmpleadoServicio;
import com.example.Sprint_ciclo3_clases.services.EmpresaServicio;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;
@RestController
public class ControladorEmpleado {
   //jpa
   EmpleadoServicio servicioUser;
   public ControladorEmpleado(EmpleadoServicio servicioUser) {
        this.servicioUser = servicioUser;    }
    /*@GetMapping("/user")
        public List<Empleado> visualizacionEmpleados() {
        return this.servicioUser.getEmpleadoServicio();}*/

   /* @GetMapping("/user/{id}")
        public  Empleado consultarempleado(@PathVariable Long id){
            return this.servicioUser.getEmpleado(id);    }*/

   /* @PutMapping("/user/{id}")
        public Empleado modificarEmpleado(@PathVariable Long id,
                                          @RequestBody Empleado user){
        return  this.servicioUser.actualizarEmpleados(id,user);    }*/
//---------- se crea un nuevo Put para usar desde el fronted el cual debera redigiri una pagina
     @PutMapping("/user/{id}")
        public RedirectView modificarEmpleado(@PathVariable Long id,Empleado user){
        this.servicioUser.actualizarEmpleados(id,user);
        return new RedirectView("/user");    }


    /*@PostMapping("/user")
        public  Empleado CrearEmpleado(@ModelAttribute Empleado nuevoEmpleado, Model model){
            model.addAttribute(nuevoEmpleado);
            return this.servicioUser.CrearEmpleado(nuevoEmpleado);    }*/
    @PostMapping("/user")
    public RedirectView CrearEmpleado(@ModelAttribute Empleado nuevoEmpleado, Model model){
        model.addAttribute(nuevoEmpleado);
        this.servicioUser.CrearEmpleado(nuevoEmpleado);
        return new RedirectView("/user");
    }
    /*@DeleteMapping("/user/{id}")
        public Empleado eliminarEmpleado(@PathVariable Long id, @RequestBody Empleado user){
        return this.servicioUser.eliminarEmpleado(id,user);
    }*/

    //------metodo de eliminacion en el frontend-------------------------
    @DeleteMapping("/user/{id}")
    public RedirectView eliminarEmpleado(@PathVariable(value = "id") Long id){
        this.servicioUser.eliminarEmpleado(id);
        return new RedirectView("/user");
    }
}
