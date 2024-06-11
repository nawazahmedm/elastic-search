package com.javalearnings.elastic_search.controller;

import com.javalearnings.elastic_search.entity.Product;
import com.javalearnings.elastic_search.repository.ProductRepository;
import com.javalearnings.elastic_search.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping("/findAllProducts")
    public Iterable<Product> getProducts() {
        return productService.getProducts();
    }

    @PostMapping("/insertProduct")
    public Product insertProduct(@RequestBody Product product) {
        return productService.insertProduct(product);
    }

    @PostMapping("/updateProduct")
    public Product updateProduct(@RequestBody Product product) {
        return productService.updateProduct(product);
    }

    @DeleteMapping("/deleteProduct")
    public boolean deleteProduct(@RequestParam int id) {
        return productService.deleteProduct(id);
    }

}
