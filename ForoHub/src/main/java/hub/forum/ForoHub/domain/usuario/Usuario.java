package hub.forum.ForoHub.domain.usuario;


import hub.forum.ForoHub.domain.perfil.Perfil;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Set;

@Table(name = "usuarios")
@Entity(name = "Usuario")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Propios
    private String nombre;
    private String correoElectronico;
    private String contrasena;

    // Delgados - Perfil (Analizar añadido de perfil)
    @OneToMany(mappedBy = "usuario")
    private List<Perfil> perfiles;


    public Usuario(DatosCrearUsuario datosCrearUsuario){
        this.nombre = datosCrearUsuario.nombre();
        this.correoElectronico = datosCrearUsuario.correoElectronico();
        this.contrasena = datosCrearUsuario.contrasena();// revisar cómo encriptarla

    }
}
