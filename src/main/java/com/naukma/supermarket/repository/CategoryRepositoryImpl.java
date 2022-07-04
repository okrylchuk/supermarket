package com.naukma.supermarket.repository;

import com.naukma.supermarket.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CategoryRepositoryImpl implements CategoryRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    // CREATE
    @Override
    public int save(Category category) {
        return jdbcTemplate.update("INSERT INTO Category (category_name) VALUES(?)",
                new Object[] { category.getCategory_name() });
    }

    // UPDATE
    @Override
    public int update(Category category, long id) {

        String begin = "UPDATE category SET category_name=?, category_number=? WHERE category_number=";
        String oldKey = String.valueOf(id);
        String sql = begin + oldKey;


        return jdbcTemplate.update(sql,
                new Object[] { category.getCategory_name(), category.getCategory_number() });
    }

    @Override
    public Category findById(long id) {
        try {
            Category category = jdbcTemplate.queryForObject("SELECT * FROM category WHERE category_number=?",
                    BeanPropertyRowMapper.newInstance(Category.class), id);
            return category;
        } catch (IncorrectResultSizeDataAccessException e) {
            return null;
        }
    }

    @Override
    public List<Category> findAll() {
        return jdbcTemplate.query("SELECT * from category", BeanPropertyRowMapper.newInstance(Category.class));
    }

    @Override
    public List<Category> findByName(String name) {
        return jdbcTemplate.query("SELECT * from category WHERE category_name=?",
                BeanPropertyRowMapper.newInstance(Category.class), name);
    }

    @Override
    public List<Category> findByNameContaining(String name) {
        String q = "SELECT * from category WHERE category_name ILIKE '%" + name + "%'";
        return jdbcTemplate.query(q, BeanPropertyRowMapper.newInstance(Category.class));
    }

    // DELETE ONE
    @Override
    public int deleteById(long id) {
        return jdbcTemplate.update("DELETE FROM category WHERE category_number=?", id);
    }

    // DELETE ALL
    @Override
    public int deleteAll() {
        return jdbcTemplate.update("DELETE from category");
    }
}
