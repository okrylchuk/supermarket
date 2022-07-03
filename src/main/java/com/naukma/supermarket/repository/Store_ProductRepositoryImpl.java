package com.naukma.supermarket.repository;

import com.naukma.supermarket.model.Product;
import com.naukma.supermarket.model.Store_Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class Store_ProductRepositoryImpl implements Store_ProductRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int save(Store_Product product) {
        return jdbcTemplate.update("INSERT INTO Store_Product (upc, selling_price, products_number, id_product, exp_date)" +
                        "VALUES (?,?,?,?,?)",
                new Object[] { product.getUpc(), product.getSelling_price(), product.getProducts_number(),
                        product.getId_product(), product.getExp_date()});
    }

    @Override
    public int update(Store_Product product) {
        return jdbcTemplate.update("UPDATE store_product SET selling_price=?, products_number=? WHERE upc=?",
                new Object[] { product.getSelling_price(), product.getProducts_number(), product.getUpc() });
    }

    @Override
    public Store_Product findById(String id) {
        try {
            Store_Product product = jdbcTemplate.queryForObject("SELECT * FROM store_product WHERE upc=?",
                    BeanPropertyRowMapper.newInstance(Store_Product.class), id);
            return product;
        } catch (IncorrectResultSizeDataAccessException e) {
            return null;
        }
    }

    /*@Override
    public int deleteById(long id) {
        return 0;
    }*/

    String str = "SELECT STORE_PRODUCT.UPC, STORE_PRODUCT.SELLING_PRICE, STORE_PRODUCT.PRODUCTS_NUMBER, PRODUCT.PRODUCT_NAME \n" +
            "FROM STORE_PRODUCT \n" +
            "INNER JOIN PRODUCT on STORE_PRODUCT.ID_PRODUCT = PRODUCT.ID_PRODUCT\n;";

//    String str = "select * from store_product;";

    @Override
    public List<Store_Product> findAll() {
        return jdbcTemplate.query(str, BeanPropertyRowMapper.newInstance(Store_Product.class));
    }
}
