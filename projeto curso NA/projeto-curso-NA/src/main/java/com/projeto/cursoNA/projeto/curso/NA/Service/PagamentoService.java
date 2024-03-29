package com.projeto.cursoNA.projeto.curso.NA.Service;

import com.projeto.cursoNA.projeto.curso.NA.Entity.Pagamento;
import com.projeto.cursoNA.projeto.curso.NA.Repository.PagamentoRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class PagamentoService {

    private final PagamentoRepository pagamentoRepository;

    public PagamentoService(PagamentoRepository pagamentoRepository) {
        this.pagamentoRepository = pagamentoRepository;
    }

    public Pagamento save(Pagamento pagamento) {
        return pagamentoRepository.save(pagamento);
    }
    public Object buscarId(Long id) {return pagamentoRepository.findById(id);}
    public Object buscarTodos(Pagamento pagamento) {
        return pagamentoRepository.findAll();
    }
    public Page<Pagamento> page(Pageable pageable) {return pagamentoRepository.findAll(pageable);}
    public Pagamento update(Pagamento pagamento) {return pagamentoRepository.save(pagamento);}
    public void delete(Long id) {pagamentoRepository.deleteById(id);}
}
