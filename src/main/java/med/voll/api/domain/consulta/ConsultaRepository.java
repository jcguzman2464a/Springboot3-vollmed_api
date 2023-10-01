package med.voll.api.domain.consulta;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

<<<<<<< HEAD
import java.time.LocalDateTime;

@Repository
public interface ConsultaRepository extends JpaRepository<Consulta, Long> {

    Boolean existsByPacienteIdAndFechaBetween(Long idPaciente, LocalDateTime primerHorario, LocalDateTime ultimoHorario);

    Boolean existsByMedicoIdAndFecha(Long idMedico, LocalDateTime fecha);
}
=======
@Repository
public interface ConsultaRepository extends JpaRepository<Consulta, Long> {

}
>>>>>>> 8925553c3f821d8f9eb8daaaa432cace1b56d1c6
