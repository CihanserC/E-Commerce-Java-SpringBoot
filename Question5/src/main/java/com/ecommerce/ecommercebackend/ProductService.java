package com.ecommerce.ecommercebackend;

public interface ProductService
{
    Product createProduct(Product product);
    Product updateProduct(Long productId, Product product);
    void deleteProduct(Long productId);
    Product getProduct(Long productId);
}
