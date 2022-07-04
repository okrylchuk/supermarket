package com.naukma.supermarket.repository;

import com.naukma.supermarket.model.Checks;
import com.naukma.supermarket.model.CustomerCard;
import com.naukma.supermarket.model.Receipt;

import java.util.List;

public interface ChecksRepository {

    int save(Receipt receipt);
    int update(Receipt receipt, String id);
    CustomerCard findById(String id);
    int deleteById(String id);
    List<Receipt> findAll();
}
