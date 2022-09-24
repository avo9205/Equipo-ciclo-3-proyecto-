package com.example.Sprint_ciclo3_clases.controller;

import com.example.Sprint_ciclo3_clases.entities.Empleado;
import com.example.Sprint_ciclo3_clases.entities.Usuarios;
import com.example.Sprint_ciclo3_clases.services.EmpleadoServicio;
import com.example.Sprint_ciclo3_clases.services.UsuarioServicio;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class FrontController {

    EmpleadoServicio servicioUser;
    UsuarioServicio servicioUsuario;
    public FrontController(EmpleadoServicio servicioUser, UsuarioServicio servicioUsuario) {
        this.servicioUser = servicioUser;
        this.servicioUsuario = servicioUsuario; }

    @GetMapping("/")
    public String index(Model model, @AuthenticationPrincipal OidcUser principal){
        if(principal != null){
           // System.out.println(principal.getClaims());
            Usuarios usuario =this.servicioUsuario.getCreateUsuario(principal.getClaims());
            model.addAttribute("usuario",usuario);
        }
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

    @GetMapping("/user/{id}")
    public String actualizarEmpleado(@PathVariable Long id, Model model){
        Empleado empleadoActual = this.servicioUser.getEmpleado(id);
        model.addAttribute("empleadoActual", empleadoActual);
        return "actualizar-empleado";
    }

    //Modelado de la autentificacion
}
