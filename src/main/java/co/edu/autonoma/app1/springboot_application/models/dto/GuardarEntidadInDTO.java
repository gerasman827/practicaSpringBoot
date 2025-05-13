package co.edu.autonoma.app1.springboot_application.models.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GuardarEntidadInDTO {
    private String nombre;
    private String apellido;
    private String direccion;
    private String puesto;
    private String telefono;
    private String id;
    private int edad;
}