package com.microservice.producto.service.impl;

import com.microservice.producto.model.Producto;
import com.microservice.producto.repository.ProductoRepository;
import com.microservice.producto.service.ProductoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServiceImpl implements ProductoService {

    private final ProductoRepository productoRepository;

    public ProductoServiceImpl(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    @Override
    public void addProducto(Producto producto) {
        this.productoRepository.save(producto);
    }

    @Override
    public List<Producto> findAllProductos() {
        return productoRepository.findAll();
    }

    @Override
    public void deleteProducto(Long id) {
        this.productoRepository.deleteById(id);
    }

    @Override
    public List<Producto> findAllByCategoria(Long id) {
        return this.productoRepository.findAllByCategoria(id);
    }

}
