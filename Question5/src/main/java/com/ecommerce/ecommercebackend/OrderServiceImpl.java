package com.ecommerce.ecommercebackend;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;

    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public Order placeOrder(Customer customer, List<Product> products) {
        Order order = new Order();
        order.setCustomer(customer);
        order.setProducts(products);
        // Calculate total price, update product quantities, etc.
        return orderRepository.save(order);
    }

    @Override
    public Order getOrder(Long orderId) {
        return orderRepository.findById(orderId).orElse(null);
    }

    @Override
    public List<Order> getAllOrdersForCustomer(Long customerId) {
        return orderRepository.findByCustomer_Id(customerId);
    }

}