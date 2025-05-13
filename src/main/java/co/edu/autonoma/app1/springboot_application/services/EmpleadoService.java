package co.edu.autonoma.app1.springboot_application.services;

import co.edu.autonoma.app1.springboot_application.models.EmpleadosEntity;
import co.edu.autonoma.app1.springboot_application.models.dto.BuscarEmpleadoPorIdOutDTO;
import co.edu.autonoma.app1.springboot_application.models.dto.GuardarEntidadInDTO;
import co.edu.autonoma.app1.springboot_application.models.dto.ResultadoDTO;
import co.edu.autonoma.app1.springboot_application.models.entities.Entitidad;
import co.edu.autonoma.app1.springboot_application.repositorios.EmpleadoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class EmpleadoService {
    @Autowired
    private EmpleadoRepositorio empleadoRepositorio;

    public ResultadoDTO guardarEntidad(GuardarEntidadInDTO guardarEntidadInDTO){
        ResultadoDTO resultadoDTO = new ResultadoDTO();
        EmpleadosEntity respuesta = empleadoRepositorio.save(convertirADatabaseEntity(guardarEntidadInDTO));
        if (respuesta==null){
            resultadoDTO.setExitoso(false);
            resultadoDTO.setMensaje("Falló");
        }else{
            System.out.println("");
        }
        return resultadoDTO;
    }

    public BuscarEmpleadoPorIdOutDTO buscarEmpleadoPorId(Long id){
        Optional<EmpleadosEntity> empleadoEncontrado = this.empleadoRepositorio.findById(id);
        EmpleadosEntity empleado = empleadoEncontrado.orElse(null);
        BuscarEmpleadoPorIdOutDTO resultadoDTO = new BuscarEmpleadoPorIdOutDTO();
        if (empleado==null){
            resultadoDTO.setExitoso(false);
            resultadoDTO.setMensaje("sdfasd");
            return resultadoDTO;
        }
        resultadoDTO.setExitoso(true);
        resultadoDTO.setNombre(empleado.getNombre());
        resultadoDTO.setApellido(empleado.getApellido());
        resultadoDTO.setPuesto(empleado.getPuesto());
        return resultadoDTO;
    }

    public List<BuscarEmpleadoPorIdOutDTO> buscarSecuencia(String secuencia){
        List<EmpleadosEntity> empleados = this.empleadoRepositorio.findAll();
        return empleados.stream()
                .filter(e-> e.getNombre().contains(secuencia))
                .map(this::convetirEntidadADTO)
                .toList();
    }

    private BuscarEmpleadoPorIdOutDTO convetirEntidadADTO(EmpleadosEntity empleado){
        BuscarEmpleadoPorIdOutDTO empleadoDTO = new BuscarEmpleadoPorIdOutDTO();
        empleadoDTO.setNombre(empleado.getNombre());
        empleadoDTO.setApellido(empleado.getApellido());
        empleadoDTO.setPuesto(empleado.getPuesto());
        return empleadoDTO;
    }

    public EmpleadosEntity convertirADatabaseEntity(GuardarEntidadInDTO dto) {
        // Crear una nueva instancia de la entidad Empleados
        EmpleadosEntity empleados = new EmpleadosEntity();

        // Copiar los valores del DTO a la entidad
        empleados.setNombre(dto.getNombre());
        empleados.setApellido(dto.getApellido());
        empleados.setDireccion(dto.getDireccion());
        empleados.setPuesto(dto.getPuesto());
        empleados.setTelefonoPersona(dto.getTelefono());
        empleados.setEdad(dto.getEdad());
        empleados.setFechaCreacion(LocalDateTime.now());

        // Retornar la entidad
        return empleados;
    }

}
