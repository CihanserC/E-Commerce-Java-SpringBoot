package com.ecommerce.ecommercebackend;

import jakarta.persistence.*;

@Entity
public class Cart extends BaseEntity {
    @OneToOne
    private Customer customer;
    private double totalAmount;

    // Getter and Setters
    public double getTotalAmount() {
        return totalAmount;
    }
    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}