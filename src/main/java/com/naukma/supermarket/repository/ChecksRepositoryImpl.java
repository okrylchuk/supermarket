package com.naukma.supermarket.repository;

import com.naukma.supermarket.model.Checks;
import com.naukma.supermarket.model.CustomerCard;
import com.naukma.supermarket.model.Receipt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ChecksRepositoryImpl implements ChecksRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int save(Receipt receipt) {
        return 0;
    }

    @Override
    public int update(Receipt receipt, String id) {
        return 0;
    }

    @Override
    public CustomerCard findById(String id) {
        return null;
    }

    @Override
    public int deleteById(String id) {
        return 0;
    }

    @Override
    public List<Receipt> findAll() {
        return jdbcTemplate.query("SELECT * FROM supermarket.receipts;", BeanPropertyRowMapper.newInstance(Receipt.class));
    }
}
