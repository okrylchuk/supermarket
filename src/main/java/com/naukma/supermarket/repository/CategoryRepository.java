package com.naukma.supermarket.repository;

import com.naukma.supermarket.model.Category;

import java.util.List;

public interface CategoryRepository {

    int save(Category category);
    int update(Category category, long id);
    Category findById(long id);
    int deleteById(long id);
    List<Category> findAll();
    List<Category> findByName(String name);
    List<Category> findByNameContaining(String name);
    int deleteAll();
}
