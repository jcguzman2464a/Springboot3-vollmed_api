package med.voll.api.domain.consulta;

<<<<<<< HEAD

import med.voll.api.domain.consulta.validaciones.ValidadorDeConsultas;
=======
>>>>>>> 8925553c3f821d8f9eb8daaaa432cace1b56d1c6
import med.voll.api.domain.medico.Medico;
import med.voll.api.domain.medico.MedicoRepository;
import med.voll.api.domain.paciente.PacienteRepository;
import med.voll.api.infra.errores.ValidacionDeIntegridad;
import org.springframework.beans.factory.annotation.Autowired;
<<<<<<< HEAD

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgendaDeConsultaService {
=======
import org.springframework.stereotype.Service;

@Service
public class AgendaDeConsultaService {

>>>>>>> 8925553c3f821d8f9eb8daaaa432cace1b56d1c6
    @Autowired
    private PacienteRepository pacienteRepository;
    @Autowired
    private MedicoRepository medicoRepository;
    @Autowired
    private ConsultaRepository consultaRepository;

<<<<<<< HEAD
    @Autowired
    List<ValidadorDeConsultas> validadores;

    public DatosDetalleConsulta agendar(DatosAgendarConsulta datos){

        if(!pacienteRepository.findById(datos.idPaciente()).isPresent()){
            throw new ValidacionDeIntegridad("este id para el paciente no fue encontrado");
        }

        if(datos.idMedico()!=null && !medicoRepository.existsById(datos.idMedico())){
            throw new ValidacionDeIntegridad("este id para el medico no fue encontrado");
        }

        validadores.forEach(v-> v.validar(datos));

=======
    public void agendar(DatosAgendarConsulta datos){

        if(pacienteRepository.findById(datos.idPaciente()).isPresent()){
            throw new ValidacionDeIntegridad("este id para el paciente no fue encontrado");
        }

        if(datos.idMedico()!=null && medicoRepository.existsById(datos.idMedico())){
            throw new ValidacionDeIntegridad("este id para el medico no fue encontrado");
        }

>>>>>>> 8925553c3f821d8f9eb8daaaa432cace1b56d1c6
        var paciente = pacienteRepository.findById(datos.idPaciente()).get();

        var medico = seleccionarMedico(datos);

<<<<<<< HEAD
        if(medico==null){
            throw new ValidacionDeIntegridad("no existen medicos disponibles para este horario y especialidad");
        }

=======
>>>>>>> 8925553c3f821d8f9eb8daaaa432cace1b56d1c6
        var consulta = new Consulta(null,medico,paciente,datos.fecha());

        consultaRepository.save(consulta);

<<<<<<< HEAD
        return new DatosDetalleConsulta(consulta);

=======
>>>>>>> 8925553c3f821d8f9eb8daaaa432cace1b56d1c6
    }

    private Medico seleccionarMedico(DatosAgendarConsulta datos) {
        if(datos.idMedico()!=null){
            return medicoRepository.getReferenceById(datos.idMedico());
        }
        if(datos.especialidad()==null){
            throw new ValidacionDeIntegridad("debe seleccionarse una especialidad para el medico");
        }
<<<<<<< HEAD
=======


>>>>>>> 8925553c3f821d8f9eb8daaaa432cace1b56d1c6
        return medicoRepository.seleccionarMedicoConEspecialidadEnFecha(datos.especialidad(),datos.fecha());
    }
}