package com.microservice.pedido;

import com.microservice.pedido.model.Pedido;
import com.microservice.pedido.repository.PedidoRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

@SpringBootTest
public class PedidoServiceTest {

    @Autowired
    private PedidoRepository pedidoRepository;

    @Test
    public void createPedidoTestSuccess(){
        Pedido pedido = new Pedido(1L,5L, LocalDate.now(),true);
        Pedido pedidoCreate = pedidoRepository.save(pedido);
        Assertions.assertEquals(pedido,pedidoCreate);
    }



}
