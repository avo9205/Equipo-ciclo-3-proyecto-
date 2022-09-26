package com.example.Sprint_ciclo3_clases.services;

import com.example.Sprint_ciclo3_clases.entities.Empresa;
import com.example.Sprint_ciclo3_clases.repository.RepositorioEmpresa;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Service
public class EmpresaServicio   {
    List<Empresa> listaEmpresa;
    //atributo clase
    private  RepositorioEmpresa repositorioEm;//Constructor de servicio
    public EmpresaServicio (RepositorioEmpresa repositorioEm){
        this.repositorioEm = repositorioEm;    }



        // Método que se usará para visualizar el Get
        public List<Empresa> getListaEmpresa(){
            return this.repositorioEm.findAll();    }


        public Empresa getEmpresa(Long id){
            return this.repositorioEm.findById(id).orElseThrow();        }


        //metodo  que permitira crear una empresa
        public Empresa CrearEmpresa(Empresa nuevaEmpresa){
            return this.repositorioEm.save(nuevaEmpresa);    }


        //metodo de actualizar empresa
        public Empresa actualizarEmp(Long id, Empresa emp){
            Empresa actualizar = repositorioEm.findById(id).orElseThrow();
            //actriburos que se modificaran
                actualizar.setNombreEmpresa(emp.getNombreEmpresa());
               //actualizar.setNit(emp.getNit());
                actualizar.setTelefono(emp.getTelefono());
                actualizar.setDireccion(emp.getDireccion());
            return this.repositorioEm.save(actualizar);        }

        public Empresa elimiarEmpresas(Long id){
        //mostrar lo que borrará
            Empresa del = repositorioEm.findById(id).orElseThrow();
            this.repositorioEm.deleteById(id);
        return del;
        }

    }


