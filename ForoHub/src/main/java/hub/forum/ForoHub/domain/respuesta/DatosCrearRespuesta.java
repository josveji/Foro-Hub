package hub.forum.ForoHub.domain.respuesta;

import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

// Este archivo se encarga de crear una entidad Respuesta

public record DatosCrearRespuesta(
        @NotNull
        Long idAutor,
        @NotNull
        String mensaje,
        @NotNull
        Long idTopico,
        @NotNull
        LocalDate fechaCreacion,
        @NotNull
        String solucion
) {
}
