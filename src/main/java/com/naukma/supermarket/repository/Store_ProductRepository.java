package com.naukma.supermarket.repository;

import com.naukma.supermarket.model.Store_Product;

import java.util.List;

public interface Store_ProductRepository {

    int save(Store_Product store_product);
    int update(Store_Product store_product);
    Store_Product findById(String id);
    //int deleteById(long id);
    List<Store_Product> findAll();
}
