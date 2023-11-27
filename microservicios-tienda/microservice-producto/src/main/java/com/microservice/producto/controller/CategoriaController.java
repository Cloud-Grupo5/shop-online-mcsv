package com.microservice.producto.controller;

import com.microservice.producto.model.Categoria;
import com.microservice.producto.service.CategoriaService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/categoria")
public class CategoriaController {

    private final CategoriaService categoriaService;

    public CategoriaController(CategoriaService categoriaService) {
        this.categoriaService = categoriaService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void registrarCategoria(@RequestBody Categoria categoria){
        this.categoriaService.addCategoria(categoria);
    }


    @GetMapping
    public List<Categoria> listarCategorias(){
        return categoriaService.findAllCategorias();
    }





}
