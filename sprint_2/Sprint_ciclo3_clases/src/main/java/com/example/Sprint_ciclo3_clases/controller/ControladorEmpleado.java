package com.example.Sprint_ciclo3_clases.controller;

import com.example.Sprint_ciclo3_clases.entities.Empleado;
import com.example.Sprint_ciclo3_clases.entities.Empresa;
import com.example.Sprint_ciclo3_clases.services.EmpleadoServicio;
import com.example.Sprint_ciclo3_clases.services.EmpresaServicio;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class ControladorEmpleado {
   //jpa
   EmpleadoServicio servicioUser;
   public ControladorEmpleado(EmpleadoServicio servicioUser) {
        this.servicioUser = servicioUser;    }
    @GetMapping("/user")
        public List<Empleado> visualizacionEmpleados() {
        return this.servicioUser.getEmpleadoServicio();}
    @GetMapping("user/{id}")
        public  Empleado consultarempleado(@PathVariable Long id){
            return this.servicioUser.getEmpleado(id);    }
    @PutMapping("/user/{id}")
        public Empleado modificarEmpleado(@PathVariable Long id,
                                          @RequestBody Empleado user){
        return  this.servicioUser.actualizarEmpleados(id,user);    }
    @PostMapping("/user")
        public  Empleado CrearEmpleado(@RequestBody Empleado nuevoEmpleado){
            return this.servicioUser.CrearEmpleado(nuevoEmpleado);    }
    @DeleteMapping("/user/{id}")
        public Empleado eliminarEmpleado(@PathVariable Long id, @RequestBody Empleado user){
        return this.servicioUser.eliminarEmpleado(id,user);
    }
}
