package com.microservice.pedido.service;

import com.microservice.pedido.model.Pedido;

import java.util.List;

public interface PedidoService {

    void addPedido(Pedido pedido);

    List<Pedido> findAllPedidos();

}
