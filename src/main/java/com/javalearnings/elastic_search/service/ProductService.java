package com.javalearnings.elastic_search.service;

import com.javalearnings.elastic_search.entity.Product;
import com.javalearnings.elastic_search.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public Iterable<Product> getProducts() {
        return productRepository.findAll();
    }

    public Product insertProduct(Product product) {
        return productRepository.save(product);
    }

    public Product updateProduct(Product product) {
        Product product1 = productRepository.findById(product.getId()).get();
        product1.setPrice(product.getPrice());
        return productRepository.save(product1);
    }

    public boolean deleteProduct(int id) {
        productRepository.deleteById(id);
        return true;
    }

}
