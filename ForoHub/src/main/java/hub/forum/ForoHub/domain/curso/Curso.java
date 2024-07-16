package hub.forum.ForoHub.domain.curso;


import hub.forum.ForoHub.domain.perfil.DatosCrearPerfil;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "cursos")
@Entity(name = "Curso")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Propios
    private String nombre;

    // Delegados - Enum Categoria
    @Enumerated(EnumType.STRING)
    private Categoria categoria;

    public Curso(DatosCrearCurso datosCrearCurso){
        this.nombre = datosCrearCurso.nombre();
        this.categoria = datosCrearCurso.categoria();
    }

}
