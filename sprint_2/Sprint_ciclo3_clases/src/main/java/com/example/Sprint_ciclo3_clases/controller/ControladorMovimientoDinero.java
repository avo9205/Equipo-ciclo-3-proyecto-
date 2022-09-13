package com.example.Sprint_ciclo3_clases.controller;

import com.example.Sprint_ciclo3_clases.entities.Empleado;
import com.example.Sprint_ciclo3_clases.entities.MovimientoDinero;
import com.example.Sprint_ciclo3_clases.services.MovimientoServicio;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControladorMovimientoDinero {
    MovimientoServicio servicioMov;
    @GetMapping("/enterprises/{id}/{movements}")
    public MovimientoDinero getMovimiento(@PathVariable Long id){
        return this.servicioMov.getMovimiento(id);
    }
}
