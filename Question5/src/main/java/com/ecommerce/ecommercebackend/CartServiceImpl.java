package com.ecommerce.ecommercebackend;

import org.springframework.stereotype.Service;

@Service
public class CartServiceImpl implements CartService {

    private final CartRepository cartRepository;

    public CartServiceImpl(CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }

    @Override
    public Cart createCart(Customer customer) {
        Cart cart = new Cart();
        cart.setCustomer(customer);
        return cartRepository.save(cart);
    }

    @Override
    public Cart updateCart(Cart cart) {
        return cartRepository.save(cart);
    }

    @Override
    public void emptyCart(Long cartId) {
        cartRepository.deleteById(cartId);
    }

    @Override
    public Cart getCart(Long cartId) {
        return cartRepository.findById(cartId).orElse(null);
    }
}