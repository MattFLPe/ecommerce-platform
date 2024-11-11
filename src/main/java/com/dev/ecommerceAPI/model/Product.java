package com.dev.ecommerceAPI.model;
import jakarta.persistence.*;

@Entity
public class Product {
    @Id
    private String id;
    private String name;
    private double price;
}
