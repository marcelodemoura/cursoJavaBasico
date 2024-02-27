package com.projeto.cursoNA.projeto.curso.NA.Service;

import com.projeto.cursoNA.projeto.curso.NA.Entity.Usuario;
import com.projeto.cursoNA.projeto.curso.NA.Repository.UsuarioRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


import java.util.Optional;

@Service
public class UsuarioService {
    private UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }
    public Usuario salvar(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }
    public Optional<Usuario> findById(Long id) {
        return usuarioRepository.findById(id);
    }
//    public Page<Usuario> page(Pageable pageable) {
//        return (Page<Usuario>) usuarioRepository.page(pageable);
//    }
    public Usuario update(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }
//    public ResponseEntity<Usuario> delete(Long id) {
//        return usuarioRepository.delete(id);
//    }
}
