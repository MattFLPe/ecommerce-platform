package com.dev.ecommerceAPI.service;
import com.dev.ecommerceAPI.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, String> {
    
}