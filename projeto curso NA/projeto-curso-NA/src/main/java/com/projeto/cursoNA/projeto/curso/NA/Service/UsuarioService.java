package com.projeto.cursoNA.projeto.curso.NA.Service;

import com.projeto.cursoNA.projeto.curso.NA.Entity.Usuario;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;

@Service
public class UsuarioService {
    private UsuarioService usuarioRepository;

//    public Usuario buscarId(Long id) {
//        return usuarioRepository.buscarId(id);
//    }

    public Usuario salvar(Usuario usuario) {
        return usuarioRepository.salvar(usuario);
    }

//    public Usuario atualiza(Usuario usuario) {
//        return usuarioRepository.atualiza(usuario);
//    }
//
//    public ResponseEntity<Usuario> page(Pageable pageable) {
//        return usuarioRepository.page(pageable);
//    }
//
//    public ResponseEntity<Usuario> delete(Long id) {
//        return usuarioRepository.delete(id);
//    }
}
