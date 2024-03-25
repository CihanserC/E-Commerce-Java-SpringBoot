package com.ecommerce.ecommercebackend;

import java.util.List;

public interface OrderService
{
    Order placeOrder(Customer customer, List<Product> products);
    Order getOrder(Long orderId);
    List<Order> getAllOrdersForCustomer(Long customerId);
}
