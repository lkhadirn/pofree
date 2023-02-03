package com.pofree.pofree.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.pofree.pofree.model.Product;
import com.pofree.pofree.persitence.ProductRepository;
import com.pofree.pofree.service.ProductService;

@Controller
public class MainController {
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public List<Product> getAllProducts() {
        productService.getProductList();
        return List.of(new Product(123456789, "firstTitle"));
    }
}
