package co.edu.autonoma.app1.springboot_application.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping(path = "/api/parametros")
public class RequestParamControllers {

    @GetMapping("/detalle")
    public ParametroDTO detalle(@RequestParam(required = false, defaultValue = "Hola a todos") String informacion) {

        ParametroDTO parametro1 = new ParametroDTO();

        parametro1.setInformacion(informacion);

        return parametro1;

    }

}
