package com.masbro.MasbroShop.controller;

import com.masbro.MasbroShop.model.Productos;
import com.masbro.MasbroShop.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/MasbroShop/")
public class ProductoController {

    @Autowired
    private ProductoRepository repository;

    @GetMapping("/productos")
    public List<Productos> listarTodosLosProductos(){
        return repository.findAll();
    }
}
