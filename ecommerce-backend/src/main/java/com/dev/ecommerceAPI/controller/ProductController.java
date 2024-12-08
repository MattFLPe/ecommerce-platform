package com.dev.ecommerceAPI.controller;

import com.dev.ecommerceAPI.model.Product;
import com.dev.ecommerceAPI.service.ProductRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ProductController {
    public ProductController(ProductRepository userRepository) {
        this.productRepository = userRepository;
    }

    private final ProductRepository productRepository;

    @GetMapping("/products")
    public List<Product> getUsers() {
        return (List<Product>) productRepository.findAll();
    }

    @PostMapping("/products")
    void addUser(@RequestBody Product product) {
        productRepository.save(product);
    }
}
