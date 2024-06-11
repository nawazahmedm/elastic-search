package com.javalearnings.elastic_search.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.elasticsearch.annotations.Document;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Document(indexName = "products")
public class Product {

    private int id;

    private String name;

    private String description;

    private int quantity;

    private double price;
}
