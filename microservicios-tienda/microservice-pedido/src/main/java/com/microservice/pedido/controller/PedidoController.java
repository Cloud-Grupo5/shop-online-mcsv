package com.microservice.pedido.controller;

import com.microservice.pedido.model.Pedido;
import com.microservice.pedido.service.PedidoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/pedido")
public class PedidoController {
    private final PedidoService pedidoService;

    public PedidoController(PedidoService pedidoService){
        this.pedidoService= pedidoService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void registraPedido(@RequestBody Pedido pedido){
        this.pedidoService.addPedido(pedido);
    }

    @GetMapping
    public List<Pedido> listarPedidos(){
        return pedidoService.findAllPedidos();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminarPedido(@PathVariable Long id){
        this.pedidoService.deletePedido(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("buscar/{id}")
    public ResponseEntity<Pedido> buscarPedidoId(@PathVariable Long id){
        return ResponseEntity.ok(pedidoService.findById(id));
    }
}