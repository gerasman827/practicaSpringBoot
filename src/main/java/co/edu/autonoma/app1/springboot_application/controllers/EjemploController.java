package co.edu.autonoma.app1.springboot_application.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import co.edu.autonoma.app1.springboot_application.models.Empleados;

@Controller
public class EjemploController {
    

    @GetMapping("/detalles_info")
    public String info(Model model) {

         Empleados empleado1 = new Empleados("Germán", "Arenas", "Cra 1 E 48 F-18", 
                                        "Analista", "3136620429", "1056370116", 38);
        
        model.addAttribute("empleado", empleado1);

        return "detalles_info";
    }

}
