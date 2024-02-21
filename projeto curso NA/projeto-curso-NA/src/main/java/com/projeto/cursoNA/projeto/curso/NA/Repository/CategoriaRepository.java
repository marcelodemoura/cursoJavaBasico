package com.projeto.cursoNA.projeto.curso.NA.Repository;

import com.projeto.cursoNA.projeto.curso.NA.Entity.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository <Categoria, Long>{
}
