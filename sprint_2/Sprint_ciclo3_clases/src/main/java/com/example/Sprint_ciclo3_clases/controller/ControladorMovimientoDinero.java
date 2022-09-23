package com.example.Sprint_ciclo3_clases.controller;

import com.example.Sprint_ciclo3_clases.entities.Empleado;
import com.example.Sprint_ciclo3_clases.entities.Empresa;
import com.example.Sprint_ciclo3_clases.entities.MovimientoDinero;
import com.example.Sprint_ciclo3_clases.services.MovimientoServicio;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ControladorMovimientoDinero {
    MovimientoServicio servicioMov;
    ///enterprises/{id}/{movements}
  /*  @GetMapping("/movements")
    public MovimientoDinero getMovimiento(@PathVariable Long id){
        return this.servicioMov.getMovimiento(id);}*/

    public ControladorMovimientoDinero(MovimientoServicio servicioMov) {
        this.servicioMov = servicioMov;
    }

    @GetMapping("/movements")
    public List<MovimientoDinero> listaEmpresa (){
        return this.servicioMov.getListaMovimiento();          }
    @PostMapping("/movements")
    public MovimientoDinero crearMovimiento(@RequestBody MovimientoDinero mov){
        return this.servicioMov.crearMovi(mov);        }
    //consulta de una empresa
    @GetMapping("/movements/{id}")
    public MovimientoDinero consultaMovimineto(@PathVariable Long id){
        return  this.servicioMov.getMovimiento(id);        }
    @PutMapping("/movements/{id}")
    public MovimientoDinero actualizarMovimiento(@PathVariable Long id
            ,@RequestBody MovimientoDinero actual){
        return this.servicioMov.actualizarMov(id , actual);        }
    @DeleteMapping("/movements/{id}")
    public MovimientoDinero eliminarMovimiento(@PathVariable Long id){
        return this.servicioMov.elimiarMoviminento(id);
    }

}
