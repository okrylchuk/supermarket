package com.naukma.supermarket.repository;

import com.naukma.supermarket.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductRepositoryImpl implements ProductRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    // CREATE
    @Override
    public int save(Product product) {
        return jdbcTemplate.update("INSERT INTO Product (product_name, producer, product_characteristics, category_id) VALUES (?,?,?,?)",
                new Object[] { product.getProduct_name(), product.getProducer(), product.getProduct_characteristics(),
                        product.getCategory_id() });
    }

    // UPDATE
    @Override
    public int update(Product product) {
        return jdbcTemplate.update("UPDATE product SET product_name=?, producer=?, product_characteristics=? WHERE id_product=?",
                new Object[] { product.getProduct_name(), product.getProducer(), product.getProduct_characteristics(),
                        product.getId_product() });
    }

    @Override
    public Product findById(long id) {
        try {
            Product product = jdbcTemplate.queryForObject("SELECT * FROM product WHERE id_product=?",
                    BeanPropertyRowMapper.newInstance(Product.class), id);
            return product;
        } catch (IncorrectResultSizeDataAccessException e) {
            return null;
        }
    }

    // READ ALL
    String str = "SELECT PRODUCT.ID_PRODUCT, PRODUCT.PRODUCT_NAME, PRODUCT.PRODUCER, PRODUCT.PRODUCT_CHARACTERISTICS, PRODUCT.CATEGORY_ID, CATEGORY.CATEGORY_NAME \n" +
            "FROM PRODUCT \n" +
            "INNER JOIN CATEGORY on PRODUCT.CATEGORY_ID = CATEGORY.CATEGORY_ID;";
    @Override
    public List<Product> findAll() {

        return jdbcTemplate.query(str, BeanPropertyRowMapper.newInstance(Product.class));
    }

    // DELETE
    @Override
    public int deleteById(long id) {
        return jdbcTemplate.update("DELETE FROM product WHERE id_product=?", id);
    }
}
