package com.dev.ecommerceAPI.entity;

import com.dev.ecommerceAPI.enums.UserRole;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String password;
    private UserRole role;
    @Lob
    @Column(columnDefinition = "longblob")
    private byte[] img;

}
