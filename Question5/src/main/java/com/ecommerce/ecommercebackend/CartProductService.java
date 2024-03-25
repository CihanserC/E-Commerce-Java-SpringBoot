package com.ecommerce.ecommercebackend;

public interface CartProductService
{
    void addProductToCart(Long cartId, Long productId, int quantity);
    void removeProductFromCart(Long cartId, Long productId, int quantity);
}
