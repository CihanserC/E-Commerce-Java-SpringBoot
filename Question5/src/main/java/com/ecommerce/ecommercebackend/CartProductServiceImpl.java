package com.ecommerce.ecommercebackend;

import org.springframework.stereotype.Service;

@Service
public class CartProductServiceImpl implements CartProductService {

    private final CartRepository cartRepository;
    private final ProductRepository productRepository;

    public CartProductServiceImpl(CartRepository cartRepository, ProductRepository productRepository) {
        this.cartRepository = cartRepository;
        this.productRepository = productRepository;
    }

    @Override
    public void addProductToCart(Long cartId, Long productId, int quantity) {
        // Implement logic to add a product to the cart
    }

    @Override
    public void removeProductFromCart(Long cartId, Long productId, int quantity) {
        // Implement logic to remove a product from the cart
    }
}