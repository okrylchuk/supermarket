package com.naukma.supermarket.repository;

import com.naukma.supermarket.model.Product;

import java.util.List;

public interface ProductRepository {

    int save(Product product);
    int update(Product product);
    Product findById(long id);
    int deleteById(long id);
    List<Product> findAll();
}
