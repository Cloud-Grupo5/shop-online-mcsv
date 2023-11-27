package com.microservice.usuario.service;

import com.microservice.usuario.model.Usuario;

import java.util.List;

public interface UsuarioService {

    void addUsuario(Usuario usuario);

    List<Usuario> findAllUsuarios();

    Usuario findById(Long id);

    void deleteUsuario(Long id);
}
