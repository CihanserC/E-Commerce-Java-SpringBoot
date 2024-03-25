package com.ecommerce.ecommercebackend;

import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product updateProduct(Long productId, Product product) {
        Product existingProduct = getProduct(productId);
        if (existingProduct != null) {
            existingProduct.setName(product.getName());
            existingProduct.setPrice(product.getPrice());
            existingProduct.setStockQuantity(product.getStockQuantity());
            return productRepository.save(existingProduct);
        }
        return null;
    }

    @Override
    public void deleteProduct(Long productId) {
        productRepository.deleteById(productId);
    }

    @Override
    public Product getProduct(Long productId) {
        return productRepository.findById(productId).orElse(null);
    }
}