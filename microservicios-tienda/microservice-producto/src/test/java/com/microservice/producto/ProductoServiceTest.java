package com.microservice.producto;

import com.microservice.producto.model.Producto;
import com.microservice.producto.repository.ProductoRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ProductoServiceTest {

    @Autowired
    private ProductoRepository productoRepository;


    @Test
    public void createProductTestSuccess(){
        Producto producto = new Producto(1L,"Leche", "Leche en taroo", 5.5f, 15, 2L);
        Producto productoCreate = productoRepository.save(producto);
        Assertions.assertEquals(producto, productoCreate);
    }

    

}
