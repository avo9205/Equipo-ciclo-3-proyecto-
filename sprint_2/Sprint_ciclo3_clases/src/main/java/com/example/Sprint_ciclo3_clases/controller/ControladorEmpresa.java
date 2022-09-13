package com.example.Sprint_ciclo3_clases.controller;

import com.example.Sprint_ciclo3_clases.entities.Empresa;
import com.example.Sprint_ciclo3_clases.services.EmpresaServicio;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ControladorEmpresa {
    //implemantacion de la herramiento Jpa
    EmpresaServicio servicioEm;
    //constructor
    public ControladorEmpresa (EmpresaServicio servicioEm){
        this.servicioEm = servicioEm;
    }
        @GetMapping("/enterprises")
            public List<Empresa> listaEmpresa (){return this.servicioEm.getListaEmpresa();}
        @PostMapping("/enterprises")
            public Empresa crearEmpresa(@RequestBody Empresa enterprises){
        return this.servicioEm.crearEmpresa(enterprises);        }
        //consulta de una empresa
        @GetMapping("/enterprises/{id}")
            public Empresa consultaEmpresa(@PathVariable Long id){
                return  this.servicioEm.getEmpresa(id);        }
        @PutMapping("/enterprises/{id}")
            public Empresa actualizarEmpresa(@PathVariable Long id
                                            ,@RequestBody Empresa actual){
            return this.servicioEm.actualizarEmp(id , actual);        }
        @DeleteMapping("/enterprises/{id}")
         public Empresa eliminarEmpresa(@PathVariable Long id){
            return this.servicioEm.elimiarEmpresas(id);
        }
}
