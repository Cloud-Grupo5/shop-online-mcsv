package com.microservice.producto.service;

import com.microservice.producto.model.Producto;

import java.util.List;

public interface ProductoService {

    void addProducto(Producto producto);

    List<Producto> findAllProductos();

    void deleteProducto(Long id);

    List<Producto> findAllByCategoria(Long id);

}
