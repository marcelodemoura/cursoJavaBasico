package com.projeto.cursoNA.projeto.curso.NA.Repository;

import com.projeto.cursoNA.projeto.curso.NA.Entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;
import java.util.List;

@Repository
public interface UsuarioRepository extends JpaRepository <Usuario,Long> {

}
