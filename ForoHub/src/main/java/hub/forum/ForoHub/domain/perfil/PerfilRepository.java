package hub.forum.ForoHub.domain.perfil;

import hub.forum.ForoHub.domain.curso.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PerfilRepository extends JpaRepository <Perfil,Long>{
}
