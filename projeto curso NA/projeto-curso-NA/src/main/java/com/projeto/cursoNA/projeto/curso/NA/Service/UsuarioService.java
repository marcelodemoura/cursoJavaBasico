package com.projeto.cursoNA.projeto.curso.NA.Service;

import com.projeto.cursoNA.projeto.curso.NA.Entity.Usuario;
import com.projeto.cursoNA.projeto.curso.NA.Repository.UsuarioRepository;
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

    public Optional<Usuario> findAll(Long id) {
        return usuarioRepository.findById(id);
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
