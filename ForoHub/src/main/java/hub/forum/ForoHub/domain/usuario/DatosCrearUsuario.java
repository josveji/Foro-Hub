package hub.forum.ForoHub.domain.usuario;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import org.apache.coyote.http11.filters.SavedRequestInputFilter;

// Este archivo se encarga de crear una entidad Usuario

public record DatosCrearUsuario(
        @NotNull
        String nombre,
        @NotNull
        @Email
        String correoElectronico,
        @NotNull
        String contrasena

) {
}
