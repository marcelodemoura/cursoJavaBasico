package com.projeto.cursoNA.projeto.curso.NA.Controller;

import com.projeto.cursoNA.projeto.curso.NA.Entity.Usuario;
import com.projeto.cursoNA.projeto.curso.NA.Service.UsuarioService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Pageable;

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
//    @PutMapping("/{Id}")
//    public ResponseEntity<Usuario>atualiza(@RequestBody Usuario usuario,@PathVariable Long Id){
//        return ResponseEntity.ok(usuarioService.atualiza(usuario));
//    }
//    @GetMapping("/{Id}")
//    public ResponseEntity<Usuario>buscarId(@PathVariable Long Id){
//        usuarioService.buscarId(Id);
//        return ResponseEntity.ok(usuarioService.buscarId(Id));
//    }
//    @GetMapping("/{pagina}")
//    public ResponseEntity<Usuario> page(@RequestBody Usuario usuario, @PathVariable Pageable pageable){
//        return usuarioService.page(pageable);
//    }
//    @DeleteMapping("/{Delete}")
//    ResponseEntity<String> delete(@PathVariable Long id){
//        return ResponseEntity.status(HttpStatus.OK).body("sucesso");
//    }

}
