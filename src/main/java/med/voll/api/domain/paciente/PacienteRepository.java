package med.voll.api.domain.paciente;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Long> {
    Page<Paciente> findAllByActivoTrue(Pageable paginacion);

    @Query("""
            select p.activo
            from Paciente p
            where p.id=:idPaciente 
            """)
    Boolean findActivoById(Long idPaciente);
<<<<<<< HEAD
}
=======
}
>>>>>>> 8925553c3f821d8f9eb8daaaa432cace1b56d1c6
