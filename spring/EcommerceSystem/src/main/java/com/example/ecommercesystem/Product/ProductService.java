package com.example.ecommercesystem.Product;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    public void deleteProduct(Product product) {
        productRepository.delete(product);
    }

    public Product getProduct(Integer id) {
        return productRepository.findById(id).get();
    }

    public List<Product> allProducts() {
        return (List<Product>) productRepository.findAll();
    }
}
