package co.edu.autonoma.app1.springboot_application.controllers;

import co.edu.autonoma.app1.springboot_application.models.dto.BuscarEmpleadoPorIdOutDTO;
import co.edu.autonoma.app1.springboot_application.models.dto.GuardarEntidadInDTO;
import co.edu.autonoma.app1.springboot_application.models.dto.ResultadoDTO;
import co.edu.autonoma.app1.springboot_application.models.entities.Entitidad;
import co.edu.autonoma.app1.springboot_application.repositorios.EmpleadoRepositorio;
import co.edu.autonoma.app1.springboot_application.services.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/empleado")

public class EmpleadoController {
    @Autowired
    private EmpleadoService empleadoService;


    @PostMapping(path = "/guardarEntidad")
    public ResultadoDTO guardarEntidad(@RequestBody GuardarEntidadInDTO guardarEntidadInDTO) {
        return this.empleadoService.guardarEntidad(guardarEntidadInDTO);
    }

    @GetMapping(path = "/buscar/{id}")
    public BuscarEmpleadoPorIdOutDTO buscarEmpleadoPorId(@PathVariable Long id){
        return this.empleadoService.buscarEmpleadoPorId(id);
    }
    @GetMapping(path = "/buscarSecuencia/{secuencia}")
    public List<BuscarEmpleadoPorIdOutDTO> buscarSecuencia(@PathVariable String secuencia){
        return this.empleadoService.buscarSecuencia(secuencia);
    }

}
