package com.microservice.pedido.controller;

import com.microservice.pedido.model.DetallePedido;
import com.microservice.pedido.service.DetallePedidoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/detalles-pedido")
public class DetallePedidoController {
    private final DetallePedidoService detallePedidoService;

    public DetallePedidoController(DetallePedidoService detallePedidoService){
        this.detallePedidoService= detallePedidoService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void registrarDetallePedido(@RequestBody DetallePedido detallePedido){
        this.detallePedidoService.addDetallePedido(detallePedido);
    }

    @GetMapping
    public List<DetallePedido> listarDetallesPedido(){
        return detallePedidoService.findAllDetallePedidos();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminarDetallePedido(@PathVariable Long id){
        this.detallePedidoService.deleteDetallePedido(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("buscar-pedido/{id}")
    public ResponseEntity<List<DetallePedido>> buscarDetallePedidoPorPedido(@PathVariable Long id){
        return ResponseEntity.ok(detallePedidoService.findAllByPedido(id));
    }
}
