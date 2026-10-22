
package edu.altair.crmfaltas.services;

import java.util.List;
import edu.altair.crmfaltas.entities.Falta;

// Define las operaciones que podrá realizar el servicio
public interface FaltaService {

    // Obtiene todas las faltas
    List<Falta> obtenerTodas();

    // Obtiene las faltas de un alumno por su identificador
    List<Falta> obtenerPorAlumno(Long alumnoId);

    // Guarda una falta nueva
    Falta guardar(Falta falta);
}
