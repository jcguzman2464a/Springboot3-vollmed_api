package med.voll.api.controller;

<<<<<<< HEAD
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
=======

>>>>>>> 8925553c3f821d8f9eb8daaaa432cace1b56d1c6
import jakarta.validation.Valid;
import med.voll.api.domain.usuarios.DatosAutenticacionUsuario;
import med.voll.api.domain.usuarios.Usuario;
import med.voll.api.infra.security.DatosJWTToken;
import med.voll.api.infra.security.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
<<<<<<< HEAD
@Tag(name = "Autenticacion", description = "obtiene el token para el usuario asignado que da acceso al resto de endpoint")
=======
>>>>>>> 8925553c3f821d8f9eb8daaaa432cace1b56d1c6
public class AutenticacionController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private TokenService tokenService;

    @PostMapping
    public ResponseEntity autenticarUsuario(@RequestBody @Valid DatosAutenticacionUsuario datosAutenticacionUsuario) {
        Authentication authToken = new UsernamePasswordAuthenticationToken(datosAutenticacionUsuario.login(),
                datosAutenticacionUsuario.clave());
        var usuarioAutenticado = authenticationManager.authenticate(authToken);
        var JWTtoken = tokenService.generarToken((Usuario) usuarioAutenticado.getPrincipal());
        return ResponseEntity.ok(new DatosJWTToken(JWTtoken));
    }

<<<<<<< HEAD
}
=======
}
>>>>>>> 8925553c3f821d8f9eb8daaaa432cace1b56d1c6
