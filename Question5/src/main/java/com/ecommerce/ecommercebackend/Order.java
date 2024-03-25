package com.ecommerce.ecommercebackend;
import jakarta.persistence.*;
import java.util.List;

@Entity
public class Order extends BaseEntity
{
    @ManyToOne
    private Customer customer;

    @ManyToMany
    private List<Product> products;

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

}
