package com.projeto.cursoNA.projeto.curso.NA.Service;

import com.projeto.cursoNA.projeto.curso.NA.Entity.Usuario;
import com.projeto.cursoNA.projeto.curso.NA.Repository.UsuarioRepository;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    private UsuarioService usuarioRepository;

    public Usuario salvar(Usuario usuario) {
        return usuarioRepository.salvar(usuario);
    }
}
