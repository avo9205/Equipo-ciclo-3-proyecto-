package com.example.Sprint_ciclo3_clases.services;

import com.example.Sprint_ciclo3_clases.entities.Empresa;
import com.example.Sprint_ciclo3_clases.entities.MovimientoDinero;
import com.example.Sprint_ciclo3_clases.repository.RepositorioEmpresa;
import com.example.Sprint_ciclo3_clases.repository.RepositorioMovimiento;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovimientoServicio {
    private RepositorioMovimiento repositorioMov;

    public MovimientoServicio(RepositorioMovimiento repositorioMov){
        this.repositorioMov = repositorioMov;
    }

    //-------------metodo que se usara para visualizar el Get--------------
    public List<MovimientoDinero> getListaMovimiento(){
        return this.repositorioMov.findAll();    }


    public MovimientoDinero getMovimiento(Long id){
        return this.repositorioMov.findById(id).orElseThrow(IllegalStateException::new);        }


    //-----------metodo  que permitira crear una empresa POST-------------
    public MovimientoDinero crearMovi(MovimientoDinero nuevoMov){
        return this.repositorioMov.save(nuevoMov);    }

    //metodo de actualizar empresa
    public MovimientoDinero actualizarMov(Long id, MovimientoDinero mov){
        MovimientoDinero actualizar = repositorioMov.findById(id).orElseThrow(IllegalStateException::new);
        //atributos que se modificaran
        actualizar.setConcepto(mov.getConcepto());
        actualizar.setMonto(mov.getMonto());
        //actualizar.setEmpleado(mov.getEmpleado());
        return this.repositorioMov.save(actualizar);
    }
    public MovimientoDinero elimiarMoviminento(Long id){
        //mostrar lo que borrará
        MovimientoDinero del = repositorioMov.findById(id).orElseThrow(IllegalStateException::new);
        this.repositorioMov.deleteById(id);
        return del;
    }

    public double getMontosPositivos(){
        List<MovimientoDinero> positivos = this.repositorioMov.findAll();
        double  montosPositivos = 0;
        for (int i =0; i< positivos.size();i++){
            if (positivos.get(i).getMonto()>0){
                montosPositivos += positivos.get(i).getMonto();
            }
        }
        return montosPositivos;
    }
    public double getMontosNegativos(){
        List<MovimientoDinero> negativos = this.repositorioMov.findAll();
        double  montosNegativos = 0;
        for (int i =0; i< negativos.size();i++){
            if (negativos.get(i).getMonto()<0){
                montosNegativos += negativos.get(i).getMonto();
            }
        }
        return montosNegativos;
    }
    public double getMontoTotal(){
        List<MovimientoDinero> total = this.repositorioMov.findAll();
        double  totales = 0;
        for (int i =0; i< total.size();i++){
            if (total.get(i).getMonto() >0 || total.get(i).getMonto() <0 ){
                totales += total.get(i).getMonto();
            }
        }
        return totales;
    }


}
