package hub.forum.ForoHub.domain.respuesta;


import hub.forum.ForoHub.domain.topico.Topico;
import hub.forum.ForoHub.domain.usuario.Usuario;
import hub.forum.ForoHub.domain.usuario.UsuarioRepository;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Table(name = "respuestas")
@Entity(name = "Respuesta")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Respuesta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Propios
    private String mensaje;
    private LocalDate fechaCreacion;
    private String solucion;

    // Delegado - Topico
    @ManyToOne
    @JoinColumn(name = "topico_id")
    private Topico topico;

    // Delegado - Usuario
    @ManyToOne
    @JoinColumn(name = "autor_id")
    private Usuario autor;

    public Respuesta(DatosCrearRespuesta datosCrearRespuesta, Usuario usuario, Topico topico){
            this.mensaje = datosCrearRespuesta.mensaje();
            this.fechaCreacion = datosCrearRespuesta.fechaCreacion();
            this.solucion = datosCrearRespuesta.solucion();
            this.autor = usuario;
            this.topico = topico;
    }

}
