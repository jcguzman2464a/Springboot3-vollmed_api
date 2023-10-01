package med.voll.api.controller;


<<<<<<< HEAD

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
=======
>>>>>>> 8925553c3f821d8f9eb8daaaa432cace1b56d1c6
import jakarta.validation.Valid;
import med.voll.api.domain.paciente.*;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/pacientes")
<<<<<<< HEAD
@SecurityRequirement(name = "bearer-key")
@SuppressWarnings("all")
=======
>>>>>>> 8925553c3f821d8f9eb8daaaa432cace1b56d1c6
public class PacienteController {

    @Autowired
    private PacienteRepository repository;

    @PostMapping
    @Transactional
<<<<<<< HEAD
    @Operation(summary = "Registra un nuevo paciente")
=======
>>>>>>> 8925553c3f821d8f9eb8daaaa432cace1b56d1c6
    public ResponseEntity registrar(@RequestBody @Valid DatosRegistroPaciente datos, UriComponentsBuilder uriBuilder) {
        var paciente = new Paciente(datos);
        repository.save(paciente);

        var uri = uriBuilder.path("/pacientes/{id}").buildAndExpand(paciente.getId()).toUri();
        return ResponseEntity.created(uri).body(new DatosDetallesPaciente(paciente));
    }

    @GetMapping
<<<<<<< HEAD
    @Operation(summary = "Obtiene el listado para los pacientes")
=======
>>>>>>> 8925553c3f821d8f9eb8daaaa432cace1b56d1c6
    public ResponseEntity<Page<DatosListaPaciente>> listar(@PageableDefault(size = 10, sort = {"nombre"}) Pageable paginacion) {
        var page = repository.findAllByActivoTrue(paginacion).map(DatosListaPaciente::new);
        return ResponseEntity.ok(page);
    }

    @PutMapping
    @Transactional
<<<<<<< HEAD
    @Operation(summary = "Actualiza las informaciones para el paciente")
=======
>>>>>>> 8925553c3f821d8f9eb8daaaa432cace1b56d1c6
    public ResponseEntity actualizar(@RequestBody @Valid DatosActualizacionPaciente datos) {
        var paciente = repository.getReferenceById(datos.id());
        paciente.actualizarInformacoes(datos);

        return ResponseEntity.ok(new DatosDetallesPaciente(paciente));
    }

    @DeleteMapping("/{id}")
    @Transactional
<<<<<<< HEAD
    @Operation(summary = "Elimina un paciente a partir del ID")
=======
>>>>>>> 8925553c3f821d8f9eb8daaaa432cace1b56d1c6
    public ResponseEntity eliminar(@PathVariable Long id) {
        var paciente = repository.getReferenceById(id);
        paciente.eliminar();

        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
<<<<<<< HEAD
    @Operation(summary = "obtiene los detalles para el paciente con el ID indicado")
=======
>>>>>>> 8925553c3f821d8f9eb8daaaa432cace1b56d1c6
    public ResponseEntity detallar(@PathVariable Long id) {
        var paciente = repository.getReferenceById(id);
        return ResponseEntity.ok(new DatosDetallesPaciente(paciente));
    }
<<<<<<< HEAD
}
=======


}

>>>>>>> 8925553c3f821d8f9eb8daaaa432cace1b56d1c6
