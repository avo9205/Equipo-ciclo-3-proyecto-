package com.example.Sprint_ciclo3_clases.controller;

import com.example.Sprint_ciclo3_clases.entities.Empleado;
import com.example.Sprint_ciclo3_clases.services.EmpleadoServicio;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class FrontController {

    EmpleadoServicio servicioUser;
    public FrontController(EmpleadoServicio servicioUser) {
        this.servicioUser = servicioUser;    }

    @GetMapping("/")
    public String index(){
        return "index";
    }
    @GetMapping("/user")
    //se crea un modelo
    public String empleados(Model modeloEmp){
        List<Empleado> empleados = this.servicioUser.getEmpleadoServicio();
        modeloEmp.addAttribute("empleados", empleados);
        return "empleados";
    }
    @GetMapping("/user/nuevo-empleado")
    public String crearEmpleado(Model model){
        model.addAttribute("empleado", new Empleado());
        return "nuevo-empleado";
    }
}
