package com.example.Sprint_ciclo3_clases.services;

import com.example.Sprint_ciclo3_clases.entities.MovimientoDinero;
import com.example.Sprint_ciclo3_clases.repository.RepositorioMovimiento;
import org.springframework.stereotype.Service;

@Service
public class MovimientoServicio {

    private RepositorioMovimiento repositorioMov;


    public MovimientoServicio(RepositorioMovimiento repositorioMov){
        this.repositorioMov = repositorioMov;
    }
    //metodo get /enterprises/[id]/movements
    public MovimientoDinero getMovimiento(Long id){
        return this.repositorioMov.findById(id).orElseThrow();
    }


}
