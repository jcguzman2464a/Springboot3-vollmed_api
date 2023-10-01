package med.voll.api.controller;

<<<<<<< HEAD
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;

=======
>>>>>>> 8925553c3f821d8f9eb8daaaa432cace1b56d1c6
import jakarta.validation.Valid;

import med.voll.api.domain.consulta.AgendaDeConsultaService;
import med.voll.api.domain.consulta.DatosAgendarConsulta;
<<<<<<< HEAD

import med.voll.api.infra.errores.ValidacionDeIntegridad;
import org.springframework.beans.factory.annotation.Autowired;

=======
import med.voll.api.domain.consulta.DatosDetalleConsulta;
import org.springframework.beans.factory.annotation.Autowired;
>>>>>>> 8925553c3f821d8f9eb8daaaa432cace1b56d1c6
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping("/consultas")
<<<<<<< HEAD
@SecurityRequirement(name = "bearer-key")
@SuppressWarnings("all")
=======
>>>>>>> 8925553c3f821d8f9eb8daaaa432cace1b56d1c6
public class ConsultaController {

    @Autowired
    private AgendaDeConsultaService service;

    @PostMapping
    @Transactional
<<<<<<< HEAD
    @Operation(
            summary = "registra una consulta en la base de datos",
            description = "",
            tags = { "consulta", "post" })
    public ResponseEntity agendar(@RequestBody @Valid DatosAgendarConsulta datos) throws ValidacionDeIntegridad {
        var response = service.agendar(datos);
        return ResponseEntity.ok(response);
=======
    public ResponseEntity agendar(@RequestBody @Valid DatosAgendarConsulta datos){

        service.agendar(datos);

        return ResponseEntity.ok(new DatosDetalleConsulta(null,null,null,null));
>>>>>>> 8925553c3f821d8f9eb8daaaa432cace1b56d1c6
    }
}