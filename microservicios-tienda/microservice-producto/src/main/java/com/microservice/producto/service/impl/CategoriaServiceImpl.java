package com.microservice.producto.service.impl;

import com.microservice.producto.model.Categoria;
import com.microservice.producto.model.Producto;
import com.microservice.producto.repository.CategoriaRepository;
import com.microservice.producto.service.CategoriaService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaServiceImpl implements CategoriaService {

    private final CategoriaRepository categoriaRepository;

    public CategoriaServiceImpl(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }

    @Override
    public void addCategoria(Categoria categoria) {
        this.categoriaRepository.save(categoria);
    }

    @Override
    public List<Categoria> findAllCategorias() {
        return categoriaRepository.findAll();
    }

    @Override
    public List<Producto> findProductosByCategoria(Long id) {
        return null;
    }

    @Override
    public void deleteCategory(Long id) {
        this.categoriaRepository.deleteById(id);
    }

    @Override
    public Categoria findById(Long id) {
        return categoriaRepository.findById(id).orElseThrow();
    }
}
