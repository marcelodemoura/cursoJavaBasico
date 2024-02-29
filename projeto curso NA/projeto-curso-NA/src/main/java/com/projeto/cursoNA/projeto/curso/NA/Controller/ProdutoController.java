package com.projeto.cursoNA.projeto.curso.NA.Controller;

import com.projeto.cursoNA.projeto.curso.NA.Entity.Produto;
import com.projeto.cursoNA.projeto.curso.NA.Entity.Usuario;
import com.projeto.cursoNA.projeto.curso.NA.Service.ProdutoService;
import jakarta.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

    private final ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }


    @PostMapping
    public ResponseEntity<Produto> salvar(@RequestBody @Valid Produto produto) {
        return ResponseEntity.ok().body(produtoService.salvar(produto));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Produto>> findById(@PathVariable Long id) {
        return ResponseEntity.ok(produtoService.findById(id));
    }
    @GetMapping("/{todos}")
    public ResponseEntity<List<Produto>> todos(@RequestBody Usuario usuario) {
        return ResponseEntity.ok(produtoService.findAll(usuario));
    }

    @PutMapping("/{Id}")
    public ResponseEntity<Produto> update(@RequestBody Produto produto) {
        return ResponseEntity.ok(produtoService.update(produto));
    }

    @GetMapping
    public Page<Produto> page(@PageableDefault(size = 20, page = 0) Pageable pageable) {
        return produtoService.page(pageable);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id) {
        produtoService.delete(id);
        return ResponseEntity.status(HttpStatus.OK).body("Deletado com sucesso ");
    }
}
