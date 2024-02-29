package com.projeto.cursoNA.projeto.curso.NA.Service;

import com.projeto.cursoNA.projeto.curso.NA.Entity.Produto;
import com.projeto.cursoNA.projeto.curso.NA.Entity.Usuario;
import com.projeto.cursoNA.projeto.curso.NA.Repository.ProdutoRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ProdutoService {

    private final ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    public Produto salvar(Produto produto) {
        return produtoRepository.save(produto);
    }
    public Optional<Produto> findById(Long id) {
        return produtoRepository.findById(id);
    }
    public Page<Produto> page(Pageable pageable) {
        return produtoRepository.findAll(pageable);
    }
    public Produto update(Produto produto) {
        return produtoRepository.save(produto);
    }
    public void delete(Long id) {
    }

    public List<Produto> findAll(Usuario usuario) {
        return produtoRepository.findAll();
    }
}
