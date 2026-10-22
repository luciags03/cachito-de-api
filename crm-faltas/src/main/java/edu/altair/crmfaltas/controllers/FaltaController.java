
package edu.altair.crmfaltas.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResponseStatus;

import edu.altair.crmfaltas.entities.Falta;
import edu.altair.crmfaltas.services.FaltaService;

// Indica que esta clase recibe peticiones HTTP y devuelve datos JSON
@RestController

// Dirección principal de todos los endpoints de este controlador
@RequestMapping("/api/faltas")
public class FaltaController {

    // Servicio que contiene las operaciones sobre las faltas
    private final FaltaService faltaService;

    // Spring proporciona automáticamente el servicio
    public FaltaController(FaltaService faltaService) {
        this.faltaService = faltaService;
    }

    // GET /api/faltas: devuelve todas las faltas
    @GetMapping
    public List<Falta> obtenerTodas() {
        return faltaService.obtenerTodas();
    }

    // GET /api/faltas/alumno/1: devuelve las faltas del alumno 1
    @GetMapping("/alumno/{alumnoId}")
    public List<Falta> obtenerPorAlumno(
            @PathVariable Long alumnoId) {

        // Recoge el ID de la URL y lo pasa al servicio
        return faltaService.obtenerPorAlumno(alumnoId);
    }

    // POST /api/faltas: permite registrar una falta nueva
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Falta guardar(@RequestBody Falta falta) {

        // Convierte el JSON recibido en un objeto Falta y lo guarda
        return faltaService.guardar(falta);
    }
}
