package com.projeto.cursoNA.projeto.curso.NA.Controller;

import com.projeto.cursoNA.projeto.curso.NA.Entity.Pagamento;
import com.projeto.cursoNA.projeto.curso.NA.Entity.Usuario;
import com.projeto.cursoNA.projeto.curso.NA.Service.PagamentoService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("pagamento")
public class PagamentoController {

    private final PagamentoService pagamentoService;

    public PagamentoController(PagamentoService pagamentoService) {
        this.pagamentoService = pagamentoService;
    }
    @PostMapping
    public ResponseEntity<?> salvar(@RequestBody Pagamento pagamento){
        return ResponseEntity.ok().body(pagamentoService.save(pagamento));
    }
    @GetMapping("/{id}")
    public ResponseEntity<?>buscarId(@PathVariable Long id){
        return ResponseEntity.ok(pagamentoService.buscarId(id));
    }
    @GetMapping("/{Todos}")
    public ResponseEntity<?>buscarTodos(@RequestBody Pagamento pagamento){
        return ResponseEntity.ok(pagamentoService.buscarTodos(pagamento));
    }
    @GetMapping
    public Page<Pagamento> page(@PageableDefault(size = 20, page = 0) Pageable pageable) {
        return pagamentoService.page(pageable);
    }
    @PutMapping("/{Id}")
    public ResponseEntity<Pagamento> update(@RequestBody Pagamento pagamento) {
        return ResponseEntity.ok(pagamentoService.update(pagamento));
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        pagamentoService.delete(id);
        return ResponseEntity.status(HttpStatus.OK).body("Deletado com sucesso ");
    }



}
