package co.edu.autonoma.app1.springboot_application.models.dto;

import lombok.Data;

@Data
public class BuscarEmpleadoPorIdOutDTO extends ResultadoDTO {
    private String nombre;
    private String apellido;
    private String puesto;
}
