package com.microservice.pedido.service.impl;

import com.microservice.pedido.model.DetallePedido;
import com.microservice.pedido.repository.DetallePedidoRepository;
import com.microservice.pedido.service.DetallePedidoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetallePedidoServiceImpl implements DetallePedidoService {

    private final DetallePedidoRepository detallePedidoRepository;

    public DetallePedidoServiceImpl(DetallePedidoRepository detallePedidoRepository) {
        this.detallePedidoRepository = detallePedidoRepository;
    }


    @Override
    public void addDetallePedido(DetallePedido detallePedido) {
        this.detallePedidoRepository.save(detallePedido);
    }

    @Override
    public List<DetallePedido> findAllDetallePedidos() {
        return this.detallePedidoRepository.findAll();
    }
}
