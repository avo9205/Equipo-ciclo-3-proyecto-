package com.example.Sprint_ciclo3_clases.services;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpresaServicio {
    @GetMapping("/vista1")
    public String visualizador(){
        return "vista de la clase empresa";
    }


}