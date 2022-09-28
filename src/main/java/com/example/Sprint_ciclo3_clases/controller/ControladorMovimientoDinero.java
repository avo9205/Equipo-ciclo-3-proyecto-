package com.example.Sprint_ciclo3_clases.controller;

import com.example.Sprint_ciclo3_clases.entities.Empleado;
import com.example.Sprint_ciclo3_clases.entities.Empresa;
import com.example.Sprint_ciclo3_clases.entities.MovimientoDinero;
import com.example.Sprint_ciclo3_clases.services.MovimientoServicio;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@RestController
public class ControladorMovimientoDinero {
    MovimientoServicio servicioMov;


    public ControladorMovimientoDinero(MovimientoServicio servicioMov) {
        this.servicioMov = servicioMov;
    }
    /*@GetMapping("/movements")
    public List<MovimientoDinero> listaEmpresa (){
        return this.servicioMov.getListaMovimiento();          }
   @GetMapping("/movements")
    public MovimientoDinero getMovimiento(@PathVariable Long id){
        return this.servicioMov.getMovimiento(id);}
    @GetMapping("/movements/{id}")
    public MovimientoDinero consultaMovimineto(@PathVariable Long id){
        return  this.servicioMov.getMovimiento(id);        }*/

  /*  @PostMapping("/movements")
    public MovimientoDinero crearMovimiento(@RequestBody MovimientoDinero mov){
        return this.servicioMov.crearMovi(mov);        }*/
    //consulta de una empresa

   /* @PutMapping("/movements/{id}")
    public MovimientoDinero actualizarMovimiento(@PathVariable Long id
            ,@RequestBody MovimientoDinero actual){
        return this.servicioMov.actualizarMov(id , actual);        }*/

   // ----------- método de Actualización del fronted ------------------
   @PutMapping("/movements/{id}")
   public RedirectView actualizarMovimiento(@PathVariable Long id
           ,MovimientoDinero actual){
        this.servicioMov.actualizarMov(id,actual);
        return new RedirectView("/movements");}

    //------------- método de crecaion de movimientos ------------------
    @PostMapping("/movements")
    public RedirectView CrearEmpleado(@ModelAttribute MovimientoDinero nuevoMovimiento,
                                      Model model){
        model.addAttribute(nuevoMovimiento);
        this.servicioMov.crearMovi(nuevoMovimiento);
        return new RedirectView("/movements");}

    // ----------- método de eliminación del fronted -------------------
    @DeleteMapping("/movements/{id}")
    public RedirectView eliminarMovimiento(@PathVariable(value = "id")Long id){
        this.servicioMov.elimiarMoviminento(id);
        return new RedirectView("/movements");

    }

}
