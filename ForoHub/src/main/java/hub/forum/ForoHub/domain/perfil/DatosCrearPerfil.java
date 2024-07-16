package hub.forum.ForoHub.domain.perfil;

import hub.forum.ForoHub.domain.usuario.Usuario;
import jakarta.validation.constraints.NotNull;

public record DatosCrearPerfil(
        @NotNull
        Long idUsuario,
        @NotNull
        String nombre
) {
}
