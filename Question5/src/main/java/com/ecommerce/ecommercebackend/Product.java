package com.ecommerce.ecommercebackend;
import jakarta.persistence.Entity;

@Entity
public class Product extends BaseEntity
{
    private String name;
    private double price;
    private int stockQuantity;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }
}
