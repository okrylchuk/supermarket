package com.naukma.supermarket.repository;

import com.naukma.supermarket.model.Product;
import com.naukma.supermarket.model.Store_Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class Store_ProductRepositoryImpl implements Store_ProductRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int save(Store_Product store_product) {
        return 0;
    }

    @Override
    public int update(Store_Product store_product) {
        return 0;
    }

    @Override
    public Store_Product findById(long id) {
        return null;
    }

    @Override
    public int deleteById(long id) {
        return 0;
    }

    /*String str = "SELECT STORE_PRODUCT.UPC, PRODUCT.PRODUCT_NAME, STORE_PRODUCT.SELLING_PRICE, STORE_PRODUCT.PRODUCTS_NUMBER, CATEGORY.CATEGORY_NAME \n" +
            "FROM STORE_PRODUCT \n" +
            "INNER JOIN PRODUCT on STORE_PRODUCT.ID_PRODUCT = PRODUCT.ID_PRODUCT\n;";*/
    String str = "select * from store_product;";

    @Override
    public List<Store_Product> findAll() {
        return jdbcTemplate.query(str, BeanPropertyRowMapper.newInstance(Store_Product.class));
    }
}
