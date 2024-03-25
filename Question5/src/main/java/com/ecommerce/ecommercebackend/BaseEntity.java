package com.ecommerce.ecommercebackend;
import jakarta.persistence.*;

@MappedSuperclass
public abstract class BaseEntity
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Getter and setter methods
}
