package com.ecommerce.ecommercebackend;

public interface CartService
{
    Cart createCart(Customer customer);
    Cart updateCart(Cart cart);
    void emptyCart(Long cartId);
    Cart getCart(Long cartId);
}
