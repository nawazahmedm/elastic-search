package com.javalearnings.elastic_search.repository;

import com.javalearnings.elastic_search.entity.Product;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends ElasticsearchRepository<Product, Integer> {
}
