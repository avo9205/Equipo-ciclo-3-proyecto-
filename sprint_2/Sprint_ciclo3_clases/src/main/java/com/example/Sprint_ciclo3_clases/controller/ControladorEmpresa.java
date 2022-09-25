package com.example.Sprint_ciclo3_clases.controller;

import com.example.Sprint_ciclo3_clases.entities.Empleado;
import com.example.Sprint_ciclo3_clases.entities.Empresa;
import com.example.Sprint_ciclo3_clases.services.EmpresaServicio;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@RestController
public class ControladorEmpresa {
    //implemantacion de la herramiento Jpa
    EmpresaServicio servicioEm;
    //constructor
    public ControladorEmpresa (EmpresaServicio servicioEm){
        this.servicioEm = servicioEm;
    }

       /* @GetMapping("/enterprises")
            public List<Empresa> listaEmpresa (){return this.servicioEm.getListaEmpresa();}*/

        /*@PostMapping("/enterprises")
            public Empresa postEmpresa(@RequestBody Empresa nuevaEmpresa){
                return this.servicioEm.CrearEmpresa(nuevaEmpresa);        }*/
        @PostMapping("/enterprises")
        public RedirectView CrearEmpresa(@ModelAttribute Empresa nuevaEmpresa, Model model) {
            model.addAttribute(nuevaEmpresa);
            this.servicioEm.CrearEmpresa(nuevaEmpresa);
            return new RedirectView("/enterprises");
        }


        //consulta de una empresa
        /*@GetMapping("/enterprises/{id}")
            public Empresa consultaEmpresa(@PathVariable Long id){
                return  this.servicioEm.getEmpresa(id);        }*/


        /*@PutMapping("/enterprises/{id}")
            public Empresa actualizarEmpresa(@PathVariable Long id
                                            ,@RequestBody Empresa actual){
            return this.servicioEm.actualizarEmp(id , actual);        }*/

        @PutMapping("/enterprises/{id}")
        public RedirectView modificarEmpresa(@PathVariable Long id,Empresa empresa){
            this.servicioEm.actualizarEmp(id,empresa);
            return new RedirectView("/enterprises");    }

        /*@DeleteMapping("/enterprises/{id}")
         public Empresa eliminarEmpresa(@PathVariable Long id){
            return this.servicioEm.elimiarEmpresas(id);
        }*/

        @DeleteMapping("/enterprises/{id}")
        public RedirectView eliminarEmpresa(@PathVariable(value = "id") Long id) {
            this.servicioEm.elimiarEmpresas(id);
            return new RedirectView("/enterprises");
        }
}
