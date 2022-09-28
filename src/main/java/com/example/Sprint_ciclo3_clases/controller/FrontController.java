package com.example.Sprint_ciclo3_clases.controller;

import com.example.Sprint_ciclo3_clases.entities.Empleado;
import com.example.Sprint_ciclo3_clases.entities.Empresa;
import com.example.Sprint_ciclo3_clases.entities.MovimientoDinero;
import com.example.Sprint_ciclo3_clases.entities.Usuarios;
import com.example.Sprint_ciclo3_clases.services.EmpleadoServicio;
import com.example.Sprint_ciclo3_clases.services.EmpresaServicio;
import com.example.Sprint_ciclo3_clases.services.MovimientoServicio;
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
    EmpresaServicio servicioEmpresa;
    MovimientoServicio servicioMovimiento;

    public FrontController(EmpleadoServicio servicioUser, UsuarioServicio servicioUsuario, EmpresaServicio servicioEmpresa,
                           MovimientoServicio servicioMovimiento) {
        this.servicioUser = servicioUser;
        this.servicioUsuario = servicioUsuario;
        this.servicioEmpresa = servicioEmpresa;
        this.servicioMovimiento = servicioMovimiento;
    }

    //este es el mapeo de la pantalla principal, solo muestra el login e información del grupo de trabajo
    @GetMapping("/")
    public String index(Model model, @AuthenticationPrincipal OidcUser principal) {
        if (principal != null) {
            // System.out.println(principal.getClaims());
            Usuarios usuario = this.servicioUsuario.getCreateUsuario(principal.getClaims());
            model.addAttribute("usuario", usuario);
        }
        return "index";
    }

    //mapeo de la entidad empleado
    @GetMapping("/user")
    //se crea un modelo
    public String empleados(Model modeloEmp) {
        List<Empleado> empleados = this.servicioUser.getEmpleadoServicio();
        modeloEmp.addAttribute("empleados", empleados);
        return "empleados";
    }

    @GetMapping("/user/nuevo-empleado")
    public String crearEmpleado(Model model) {
        model.addAttribute("empleado", new Empleado());
        return "nuevo-empleado";
    }

    @GetMapping("/user/{id}")
    public String actualizarEmpleado(@PathVariable Long id, Model model) {
        Empleado empleadoActual = this.servicioUser.getEmpleado(id);
        model.addAttribute("empleadoActual", empleadoActual);
        return "actualizar-empleado";
    }

    //-------------%%%%%%%%% interface %%%%%%%%%%%----------
    @GetMapping("/interface")
    public String interfaces() {
        return "interface";
    }
    //------------%%%%%% Empresa %%%%%% --------------------
    //-------------mapeo de las Empresas -------------------
    @GetMapping("/enterprises")
    public String empresas(Model model) {
        List<Empresa> empresas = this.servicioEmpresa.getListaEmpresa();
        model.addAttribute("empresas", empresas);
        return "enterprises";
    }

    //---------- Crear una empresa -------------------------
    @GetMapping("/enterprises/new-enterprises")
    public String crearEmpresa(Model model) {
        model.addAttribute("empresa", new Empresa());
        return "new-enterprises";

    }

    //------------ Actualizar empresa y get empresa --------
    @GetMapping("/enterprises/{id}")
    public String actualizarEmpresa(@PathVariable Long id, Model model) {
        Empresa empresaActual = this.servicioEmpresa.getEmpresa(id);
        model.addAttribute("empresaActual", empresaActual);
        return "update-enterprises";
    }

    //--------%%%%%%%%%%%% Movimiento Dinero %%%%%%%%%%%%%%-----------
    //------------------ visualización de la pagina ------------------
    @GetMapping("/movements")
    public String movimientoDinero(Model model) {
        List<MovimientoDinero> movimientos = this.servicioMovimiento.getListaMovimiento();
        model.addAttribute("movimientos", movimientos);
        return "movimientoDinero";}

    //------------ Actualizar empresa y get empresa --------
    @GetMapping("/movements/{id}")
    public String actualizarmovimiento(@PathVariable Long id, Model model) {
        MovimientoDinero movimientoAcual = this.servicioMovimiento.getMovimiento(id);
        model.addAttribute("movimientoAcual", movimientoAcual);
        return "actualizar-movimiento";}

    //---------- Crear un Movimiento -------------------------
    @GetMapping("/enterprises/nuevo-movimiento")
    public String crearMovimiento(Model model) {
        model.addAttribute("movimientoDinero", new MovimientoDinero());
        return "nuevo-movimiento";}
}
