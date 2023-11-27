package com.microservice.producto.service;

import com.microservice.producto.model.Categoria;
import com.microservice.producto.model.Producto;

import java.util.List;

public interface CategoriaService {

    void addCategoria(Categoria categoria);

    List<Categoria> findAllCategorias();

    List<Producto> findProductosByCategoria(Long id);

    void deleteCategory(Long id);

    Categoria findById(Long id);

}
