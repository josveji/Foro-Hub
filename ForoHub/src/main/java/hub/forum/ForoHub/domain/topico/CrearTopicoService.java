package hub.forum.ForoHub.domain.topico;

import hub.forum.ForoHub.domain.curso.Curso;
import hub.forum.ForoHub.domain.curso.CursoRepository;
import hub.forum.ForoHub.domain.topico.validaciones.ValidadorDeCrearTopico;
import hub.forum.ForoHub.domain.usuario.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CrearTopicoService {
    @Autowired
    private UsuarioRepository usuarioRepository;
    @Autowired
    private CursoRepository cursoRepository;

    @Autowired
    List<ValidadorDeCrearTopico> validadores;

//    public DatosCrearTopico crearTopico(DatosCrearTopico datosCrearTopico){
//        var autor = usuarioRepository.findById(datosCrearTopico.idAutor()).get();
//        Curso curso = datosCrearTopico.curso();
//    }

}
