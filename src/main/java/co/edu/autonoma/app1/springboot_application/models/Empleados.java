package co.edu.autonoma.app1.springboot_application.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Empleados {
    private String nombre;
    private String apellido;
    private String direccion;
    private String puesto;
    private String telefono;
    private String id;
    private int edad;

}
