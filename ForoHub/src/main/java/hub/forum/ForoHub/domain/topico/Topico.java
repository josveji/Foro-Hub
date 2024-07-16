package hub.forum.ForoHub.domain.topico;


import hub.forum.ForoHub.domain.curso.Curso;
import hub.forum.ForoHub.domain.curso.DatosCrearCurso;
import hub.forum.ForoHub.domain.respuesta.Respuesta;
import hub.forum.ForoHub.domain.usuario.Usuario;
import hub.forum.ForoHub.domain.usuario.UsuarioRepository;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Table(name = "topicos")
@Entity(name = "Topico")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Topico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    // Propios
    private String titulo;
    private String mensaje;
    private LocalDate fechaCreacion;
    private Boolean status;

    // Delegados - Usuario
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "autor_id")
    private Usuario autor;

    // Delegados - Respuesta
    @OneToMany(mappedBy = "topico")
    private List<Respuesta> respuestas;

    // Delegados - Curso
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "curso_id")
    private Curso curso;

    // Crear topico de cero
    public Topico(DatosCrearTopico datosCrearTopico, Usuario usuario, Curso curso){
        this.titulo = datosCrearTopico.titulo();
        this.mensaje = datosCrearTopico.mensaje();
        this.fechaCreacion = datosCrearTopico.fechaCreacion();
        this.status = true;
        this.autor = usuario;
        this.curso = curso;
    }

    // Desactivar Topico
    public void desactivarTopico(){
        this.status = false;
    }

    // Getters

}
