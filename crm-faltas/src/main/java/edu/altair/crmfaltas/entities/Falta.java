
package edu.altair.crmfaltas.entities;

// Importamos las anotaciones para conectar la clase con MySQL
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDate;

// Indica que esta clase representa una tabla de la base de datos
@Entity
// Le damos el nombre "faltas" a la tabla
@Table(name = "faltas")
public class Falta {

    // Clave primaria: identifica cada falta de forma única
    @Id
    // MySQL genera el identificador automáticamente
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Identificador del alumno al que pertenece la falta
    private Long alumnoId;

    // Nombre de la asignatura
    private String asignatura;

    // Fecha en la que se produjo la falta
    private LocalDate fecha;

    // Indica si la falta está justificada (true o false)
    private boolean justificada;

    // Constructor vacío necesario para JPA
    public Falta() {
    }

    // Constructor para crear una falta con sus datos
    public Falta(Long alumnoId, String asignatura,
                 LocalDate fecha, boolean justificada) {
        this.alumnoId = alumnoId;
        this.asignatura = asignatura;
        this.fecha = fecha;
        this.justificada = justificada;
    }

    // Devuelve el identificador de la falta
    public Long getId() {
        return id;
    }

    // Devuelve el identificador del alumno
    public Long getAlumnoId() {
        return alumnoId;
    }

    // Modifica el identificador del alumno
    public void setAlumnoId(Long alumnoId) {
        this.alumnoId = alumnoId;
    }

    // Devuelve el nombre de la asignatura
    public String getAsignatura() {
        return asignatura;
    }

    // Modifica el nombre de la asignatura
    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    // Devuelve la fecha de la falta
    public LocalDate getFecha() {
        return fecha;
    }

    // Modifica la fecha de la falta
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    // Devuelve si la falta está justificada
    public boolean isJustificada() {
        return justificada;
    }

    // Modifica el estado de justificación
    public void setJustificada(boolean justificada) {
        this.justificada = justificada;
    }
}
