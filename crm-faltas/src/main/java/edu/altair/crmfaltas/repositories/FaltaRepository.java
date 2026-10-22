
package edu.altair.crmfaltas.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import edu.altair.crmfaltas.entities.Falta;

// Permite consultar y guardar faltas en la base de datos
public interface FaltaRepository extends JpaRepository<Falta, Long> {

    // Busca todas las faltas de un alumno concreto
    List<Falta> findByAlumnoId(Long alumnoId);

}
