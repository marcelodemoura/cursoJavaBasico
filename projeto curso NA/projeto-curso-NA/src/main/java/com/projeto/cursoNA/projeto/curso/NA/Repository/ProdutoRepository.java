package com.projeto.cursoNA.projeto.curso.NA.Repository;

import com.projeto.cursoNA.projeto.curso.NA.Entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository <Produto, Long> {

}
