package com.microservice.pedido.service.impl;

import com.microservice.pedido.model.Pedido;
import com.microservice.pedido.repository.PedidoRepository;
import com.microservice.pedido.service.PedidoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoServiceImpl implements PedidoService {

    private final PedidoRepository pedidoRepository;

    public PedidoServiceImpl(PedidoRepository pedidoRepository) {
        this.pedidoRepository = pedidoRepository;
    }


    @Override
    public void addPedido(Pedido pedido) {
        this.pedidoRepository.save(pedido);
    }

    @Override
    public List<Pedido> findAllPedidos() {
        return pedidoRepository.findAll();
    }

    @Override
    public Pedido findById(Long id) {
        return pedidoRepository.findById(id).orElseThrow();
    }

    @Override
    public void deletePedido(Long id) {
        pedidoRepository.deleteById(id);
    }
}
