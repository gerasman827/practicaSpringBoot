package co.edu.autonoma.app1.springboot_application.repositorios;

import co.edu.autonoma.app1.springboot_application.models.EmpleadosEntity;
import co.edu.autonoma.app1.springboot_application.models.entities.Entitidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpleadoRepositorio extends JpaRepository<EmpleadosEntity, Long> {

}
