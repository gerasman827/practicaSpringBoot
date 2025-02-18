package co.edu.autonoma.app1.springboot_application.controllers;

import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.autonoma.app1.springboot_application.models.Empleados;

import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("/api")

public class EjemploRestController {
    

    @GetMapping(path = "/detalles_info2")
    public Map<String, Object> detalles_info2() {

        Empleados empleado1 = new Empleados("Germán", "Arenas", "Cra 1 E 48 F-18", 
                                        "Analista", "3136620429", "1056370116", 38);

        Map<String,Object> respuesta = new HashMap<>();
        respuesta.put("Información", empleado1);          
        

        return respuesta;
    }

}
