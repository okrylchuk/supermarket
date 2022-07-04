package com.naukma.supermarket.repository;

import com.naukma.supermarket.model.CustomerCard;

import java.util.List;

public interface CustomerCardRepository {

    int save(CustomerCard customerCard);
    int update(CustomerCard customerCard, String id);
    CustomerCard findById(String id);
    int deleteById(String id);
    List<CustomerCard> findAll();
    //List<Check> findByName(String name);
    //List<Category> findByNameContaining(String name);
    //int deleteAll();
}
