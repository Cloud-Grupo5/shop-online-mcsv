package com.microservice.usuario.controller;

import com.microservice.usuario.model.Usuario;
import com.microservice.usuario.service.UsuarioService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/usuario")
public class UsuarioController {

    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void registrarUsuario(@RequestBody Usuario usuario) {
        this.usuarioService.addUsuario(usuario);
    }

    @GetMapping
    public ResponseEntity<List<Usuario>> listarUsuarios() {
        return ResponseEntity.ok(usuarioService.findAllUsuarios());
    }

    @GetMapping("/buscar/{id}")
    public ResponseEntity<Usuario> buscarUsuarioId(@PathVariable Long id) {
        return ResponseEntity.ok(usuarioService.findById(id));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> eliminarUsuario(@PathVariable Long id){
        this.usuarioService.deleteUsuario(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
