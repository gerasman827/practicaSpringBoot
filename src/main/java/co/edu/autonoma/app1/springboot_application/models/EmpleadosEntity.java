package co.edu.autonoma.app1.springboot_application.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@Entity
@Table(name = "empleados")  // Opcional, si deseas especificar el nombre de la tabla
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmpleadosEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Para generación automática de id
    private Long id;

    @Column(name = "nombre")  // Establece nombre, no nulo y longitud
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "direccion")  // Asumiendo una longitud más larga para la dirección
    private String direccion;

    @Column(name = "puesto")
    private String puesto;

    @Column(name = "telefono_persona")  // Longitud típica para un teléfono
    private String telefonoPersona;

    @Column(name = "edad")  // La columna "edad" generalmente es un número, así que no se especifica longitud
    private int edad;

    @Column(name="fecha_creacion")
    private LocalDateTime fechaCreacion;
}
