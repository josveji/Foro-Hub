package hub.forum.ForoHub.domain.usuario;

import jakarta.validation.constraints.NotNull;

// Este archivo se encarga de autenticar usuario

public record DatosAutenticacionUsuario(
        @NotNull
        String nombre,
        @NotNull
        String contrasena
) {
}
