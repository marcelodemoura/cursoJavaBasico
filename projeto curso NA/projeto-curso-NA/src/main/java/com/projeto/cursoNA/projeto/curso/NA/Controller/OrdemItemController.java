package com.projeto.cursoNA.projeto.curso.NA.Controller;

import com.projeto.cursoNA.projeto.curso.NA.Entity.OrdemItem;
import com.projeto.cursoNA.projeto.curso.NA.Service.OrdemItemService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("item")
public class OrdemItemController {

    OrdemItemService ordemItemService;

    public OrdemItemController(OrdemItemService ordemItemService) {
        this.ordemItemService = ordemItemService;
    }

    @PostMapping
    public ResponseEntity<?> salvar(@RequestBody OrdemItem ordemItem) {
        return ResponseEntity.ok().body(ordemItemService.save(ordemItem));
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> buscarId(@PathVariable Long id) {
        return ResponseEntity.ok(ordemItemService.buscarId(id));
    }

    @GetMapping("/{Todos}")
    public ResponseEntity<?> buscarTodos(@RequestBody OrdemItem ordemItem) {
        return ResponseEntity.ok(ordemItemService.buscarTodos(ordemItem));
    }

    @GetMapping
    public Page<OrdemItem> page(@PageableDefault(size = 20, page = 0) Pageable pageable) {
        return ordemItemService.page(pageable);
    }

    @PutMapping("/{Id}")
    public ResponseEntity<OrdemItem> update(@RequestBody OrdemItem ordemItem) {
        return ResponseEntity.ok(ordemItemService.update(ordemItem));
    }

    @DeleteMapping("{id}")
    ResponseEntity<?> delete(@PathVariable Long id) {
        ordemItemService.delete(id);
        return ResponseEntity.status(HttpStatus.OK).body("Deletado com sucesso");
    }

}
