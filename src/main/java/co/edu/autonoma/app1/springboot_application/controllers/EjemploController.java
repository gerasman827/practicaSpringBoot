package co.edu.autonoma.app1.springboot_application.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import co.edu.autonoma.app1.springboot_application.models.EmpleadosEntity;

@Controller
public class EjemploController {

    @GetMapping("/detalles_info")
    public String info(Model model) {

        EmpleadosEntity empleado1 = new EmpleadosEntity("Germán", "Arenas", "Cra 1 E 48 F-18",
                "Analista", "3136620429", "12345678", 38);

        model.addAttribute("empleado", empleado1);

        return "detalles_info";
    }

    @ModelAttribute("Empleados")
    public List<EmpleadosEntity> listaEmpleados() {
        return Arrays.asList(
                new EmpleadosEntity("Germán", "Arenas Sánchez", "Cra 1 E 48 F-18",
                 "Analista", "3136620429", "12345678", 28),
                 new EmpleadosEntity("Yenny", "Cárdenas", "Cra 1 E 48 F-18",
                 "Contadora", "3136620429", "12345678", 35),
                 new EmpleadosEntity("Victor Alfonso", "Saldarriaga Sepulveda", "Cra 1 E 48 F-18",
                 "Economista", "3136620429", "12345678", 26),
                 new EmpleadosEntity("Valentina", "Giraldo Osorio", "Cra 1 E 48 F-18",
                 "Agente", "3136620429", "12345678", 31),
                 new EmpleadosEntity("Zareth", "Estupiñan", "Cra 1 E 48 F-18",
                 "Administrador", "3136620429", "12345678", 48)
        );
    }

}
