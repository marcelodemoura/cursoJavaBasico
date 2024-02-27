package com.projeto.cursoNA.projeto.curso.NA.Controller;

import com.projeto.cursoNA.projeto.curso.NA.Entity.Usuario;
import com.projeto.cursoNA.projeto.curso.NA.Service.UsuarioService;
import jakarta.servlet.ServletRequest;
import jakarta.validation.Valid;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.Optional;

@RestController
@RequestMapping(value = "/Usuario")
public class UsuarioController {

    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping
    public ResponseEntity<Usuario>salvar(@RequestBody @Valid Usuario usuario){
        return ResponseEntity.ok().body(usuarioService.salvar(usuario));
    }
    @GetMapping("/{id}")
    public ResponseEntity<Optional<Usuario>> findById(@PathVariable Long id){
        return ResponseEntity.ok(usuarioService.findById(id));
    }
//    @GetMapping("/{todos}")
//    public ResponseEntity<Usuario> findAll(ServletRequest servletRequest, Pageable pageable){
//        return ResponseEntity.ok((Usuario) usuarioService.page(pageable));
//    }
    @PutMapping("/{Id}")
    public ResponseEntity<Usuario>update(@RequestBody Usuario usuario) {
        return ResponseEntity.ok(usuarioService.update(usuario));
    }


//    @DeleteMapping("/{Delete}")
//    ResponseEntity<String> delete(@PathVariable Long id){
//        return ResponseEntity.status(HttpStatus.OK).body("sucesso");
//    }

}
