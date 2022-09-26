package com.example.Sprint_ciclo3_clases.services;

import com.example.Sprint_ciclo3_clases.entities.Empleado;
import com.example.Sprint_ciclo3_clases.repository.RepositorioEmpleado;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpleadoServicio {
    List<Empleado> litaEmpleado;
    //atributo
    private RepositorioEmpleado respositorioUser;

    //contructor
    public EmpleadoServicio(RepositorioEmpleado respositorioUser) {
        this.respositorioUser = respositorioUser;    }

    //metodo de lectura de resgistros
    public List<Empleado> getEmpleadoServicio(){
        return this.respositorioUser.findAll();    }

    //metodo de busqueda de un empleado
    public Empleado getEmpleado(Long id){
        return  this.respositorioUser.findById(id).orElseThrow();
    }

    //metodo de actualizacion
    public  Empleado actualizarEmpleados(Long id, Empleado user){

        Empleado actualizar = respositorioUser.findById(id).orElseThrow();
        actualizar.setEmpresa(user.getEmpresa());
        actualizar.setNombreEmpleado(user.getNombreEmpleado());
        actualizar.setCorreo(user.getCorreo());
        actualizar.setCargo(user.getCargo());
        return this.respositorioUser.save(actualizar);    }

    //creacion de empleados
    public Empleado CrearEmpleado(Empleado nuevoEmpleado){
        return this.respositorioUser.save(nuevoEmpleado);    }

    //Eliminar empleado
    public  Empleado eliminarEmpleado(Long id){
        Empleado eliminar = respositorioUser.findById(id).orElseThrow();
       this.respositorioUser.deleteById(id);
       return eliminar;}
}
