package hub.forum.ForoHub.domain.topico;

import hub.forum.ForoHub.domain.curso.Curso;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

// Este archivo se encarga de crear una entidad Topico

public record DatosCrearTopico(
        @NotNull
        Long idAutor,
        @NotNull
        String titulo,
        @NotNull
        String mensaje,
        @NotNull
        LocalDate fechaCreacion,
        @NotNull
        Long idCurso

) {
}
