package co.edu.autonoma.app1.springboot_application.controllers;

import co.edu.autonoma.app1.springboot_application.entities.Entitidad;
import co.edu.autonoma.app1.springboot_application.repositorios.EmpleadoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/empleado")

public class EmpleadoController {

    @Autowired
    private EmpleadoRepositorio empleadoRepositorio;

    @PostMapping(path = "/guardarEntidad")
    public Entitidad guardarEntidad(@RequestBody Entitidad entidad) {
        return empleadoRepositorio.save(entidad);
    }
}
