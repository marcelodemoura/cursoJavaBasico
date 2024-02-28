package com.projeto.cursoNA.projeto.curso.NA.Controller;

import com.projeto.cursoNA.projeto.curso.NA.Entity.Usuario;
import com.projeto.cursoNA.projeto.curso.NA.Service.UsuarioService;
import jakarta.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
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
    public ResponseEntity<Usuario> salvar(@RequestBody @Valid Usuario usuario) {
        return ResponseEntity.ok().body(usuarioService.salvar(usuario));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Usuario>> findById(@PathVariable Long id) {
        return ResponseEntity.ok(usuarioService.findById(id));
    }

    @PutMapping("/{Id}")
    public ResponseEntity<Usuario> update(@RequestBody Usuario usuario) {
        return ResponseEntity.ok(usuarioService.update(usuario));
    }

    @GetMapping
    public Page<Usuario> page(@PageableDefault(size = 20, page = 0) Pageable pageable) {
        return usuarioService.page(pageable);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        usuarioService.delete(id);
        return ResponseEntity.status(HttpStatus.OK).body("Deletado com sucesso ");
    }
}