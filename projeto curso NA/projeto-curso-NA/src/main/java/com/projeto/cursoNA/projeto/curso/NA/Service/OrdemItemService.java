package com.projeto.cursoNA.projeto.curso.NA.Service;

import com.projeto.cursoNA.projeto.curso.NA.Entity.OrdemItem;

import com.projeto.cursoNA.projeto.curso.NA.Repository.OrdemItemRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class OrdemItemService {
    private final OrdemItemRepository ordemItemRepository;

    public OrdemItemService(OrdemItemRepository ordemItemRepository) {
        this.ordemItemRepository = ordemItemRepository;
    }

    public OrdemItem save(OrdemItem ordemItem) {
        return ordemItemRepository.save(ordemItem);
    }

    public void delete(Long id) {
        ordemItemRepository.deleteById(id);
    }

    public Object buscarId(Long id) {
        return ordemItemRepository.findById(id);
    }

    public Object buscarTodos(OrdemItem ordemItem) {
        return ordemItemRepository.findAll();
    }

    public Page<OrdemItem> page(Pageable pageable) {
        return ordemItemRepository.findAll(pageable);
    }

    public OrdemItem update(OrdemItem ordemItem) {
        return ordemItemRepository.save(ordemItem);
    }
}
