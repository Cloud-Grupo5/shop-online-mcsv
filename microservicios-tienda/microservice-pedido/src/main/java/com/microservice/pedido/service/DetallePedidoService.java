package com.microservice.pedido.service;

import com.microservice.pedido.model.DetallePedido;

import java.util.List;

public interface DetallePedidoService {

    void addDetallePedido(DetallePedido detallePedido);

    List<DetallePedido> findAllDetallePedidos();

    void deleteDetallePedido(Long id);

    List<DetallePedido> findAllByPedido(Long id);
}
