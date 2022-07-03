package com.naukma.supermarket.repository;

import com.naukma.supermarket.model.CustomerCard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomerCardRepositoryImpl implements CustomerCardRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    // CREATE

    /*public int save(Check check) {
        return jdbcTemplate.update("INSERT INTO check (card_number, cust_surname, cust_name, cust_patronymic, phone_number," +
                        "city, street, zip_code, cust_percent) VALUES(?,?,?,?,?,?,?,?,?)",
                new Object[] { check.getCard_number(), check.getCust_surname(), check.getCust_name(), check.getCust_patronymic(),
                check.getPhone_number(), check.getCity(), check.getStreet(), check.getZip_code(), check.getCust_percent() });
    }*/

    @Override
    public int save(CustomerCard customerCard) {
        return 0;
    }

    @Override
    public int update(CustomerCard customerCard) {
        return 0;
    }

    // UPDATE
    /*@Override
    public int update(Check check) {
        return jdbcTemplate.update("UPDATE category SET category_name=? WHERE category_number=?",
                new Object[] { category.getCategory_name(), category.getCategory_number() });
    }


    public Check findById(long id) {
        try {
            Check check = jdbcTemplate.queryForObject("SELECT * FROM category WHERE category_number=?",
                    BeanPropertyRowMapper.newInstance(Check.class), id);
            return check;
        } catch (IncorrectResultSizeDataAccessException e) {
            return null;
        }
    }*/


    public List<CustomerCard> findAll() {
        return jdbcTemplate.query("SELECT * from customer_card", BeanPropertyRowMapper.newInstance(CustomerCard.class));
    }

    @Override
    public int deleteAll() {
        return 0;
    }


    /*public List<Check> findByName(String name) {
        return jdbcTemplate.query("SELECT * from category WHERE category_name=?",
                BeanPropertyRowMapper.newInstance(Check.class), name);
    }

    public List<Check> findByNameContaining(String name) {
        String q = "SELECT * from category WHERE category_name ILIKE '%" + name + "%'";
        return jdbcTemplate.query(q, BeanPropertyRowMapper.newInstance(Check.class));
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
    }*/
}
