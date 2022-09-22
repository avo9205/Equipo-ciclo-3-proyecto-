/*
package com.example.prueba.Controller;

import com.example.prueba.entidades.MovimientoDinero;
import com.example.prueba.servicio.servicioMovDinero;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class controladorFront {
    
    
    servicioMovDinero MovCon;
    
    public controladorFront(servicioMovDinero MovCon){
        this.MovCon = MovCon;
    }
    
    
    //Mostrando la informacion de la base de datos al front end
    @GetMapping("/movdinero")
    public String readMovDinero(Model model){
        List<MovimientoDinero> movDinero = this.MovCon.getMovDinero();
        //Le pasamos las variables a la plantilla
        model.addAttribute("movDinero",movDinero);
        return "movDinero";
        
    }
    
    
}*/