package com.microservice.usuario;

import com.microservice.usuario.model.Usuario;
import com.microservice.usuario.repository.UsuarioRepository;
import com.microservice.usuario.service.UsuarioService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UsuarioServiceTest {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Test
    public void createUserTestSuccess(){
        Usuario user = new Usuario(1L, "Favio", "Angulo","fangulos1@upao.edu.pe","1234","Trujillo");
        Usuario createUserService = usuarioRepository.save(user);
        Assertions.assertEquals(user, createUserService);
    }

    @Test
    public void createUserFailed(){
        Usuario user = new Usuario(1L, "Favio",null ,"fangulos1@upao.edu.pe","1234","Trujillo");
        Usuario createUserService = usuarioRepository.save(user);
        Assertions.assertNotEquals(user, createUserService);
    }

    



}
