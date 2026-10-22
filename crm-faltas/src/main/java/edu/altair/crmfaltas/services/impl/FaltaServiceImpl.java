
package edu.altair.crmfaltas.services.impl;

import java.util.List;
import org.springframework.stereotype.Service;

import edu.altair.crmfaltas.entities.Falta;
import edu.altair.crmfaltas.repositories.FaltaRepository;
import edu.altair.crmfaltas.services.FaltaService;

// Indica a Spring que esta clase es un servicio
@Service
public class FaltaServiceImpl implements FaltaService {

    // Repositorio que utilizaremos para acceder a MySQL
    private final FaltaRepository faltaRepository;

    // Spring proporciona automáticamente el repositorio al crear el servicio
    public FaltaServiceImpl(FaltaRepository faltaRepository) {
        this.faltaRepository = faltaRepository;
    }

    // Obtiene todas las faltas registradas
    @Override
    public List<Falta> obtenerTodas() {
        return faltaRepository.findAll();
    }

    // Busca las faltas de un alumno concreto
    @Override
    public List<Falta> obtenerPorAlumno(Long alumnoId) {
        return faltaRepository.findByAlumnoId(alumnoId);
    }

    // Guarda una falta y devuelve la que se ha guardado
    @Override
    public Falta guardar(Falta falta) {
        return faltaRepository.save(falta);
    }
}
