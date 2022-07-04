package com.naukma.supermarket.repository;

import com.naukma.supermarket.model.Category;
import com.naukma.supermarket.model.CustomerCard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomerCardRepositoryImpl implements CustomerCardRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    // CREATE

    public int save(CustomerCard card) {
        return jdbcTemplate.update("INSERT INTO Customer_card (card_number, cust_surname, cust_name, cust_patronymic, phone_number, city, street, zip_code, cust_percent) " +
                        "VALUES (?,?,?,?,?,?,?,?,?)",
                new Object[] { card.getCard_number(), card.getCust_surname(), card.getCust_name(), card.getCust_patronymic(), card.getPhone_number(),
                        card.getCity(), card.getStreet(), card.getZip_code(), card.getCust_percent() });
    }

    // UPDATE
    @Override
    public int update(CustomerCard card, String id) {
        String begin = "UPDATE customer_card SET cust_surname=?, cust_name=?, cust_patronymic=?, phone_number=?, city=?, street=?, zip_code=?, cust_percent=?, card_number=? WHERE card_number=";
        String sql = begin + "\"" + id + "\"";

        return jdbcTemplate.update(sql,
                new Object[] { card.getCust_surname(), card.getCust_name(), card.getCust_patronymic(),
                        card.getPhone_number(), card.getCity(), card.getStreet(), card.getZip_code(), card.getCust_percent(), card.getCard_number() });
    }

    public CustomerCard findById(String id) {
        try {
            CustomerCard card = jdbcTemplate.queryForObject("SELECT * FROM customer_card WHERE card_number=?",
                    BeanPropertyRowMapper.newInstance(CustomerCard.class), id);
            return card;
        } catch (IncorrectResultSizeDataAccessException e) {
            return null;
        }
    }


    public List<CustomerCard> findAll() {
        return jdbcTemplate.query("SELECT * from customer_card", BeanPropertyRowMapper.newInstance(CustomerCard.class));
    }

    // DELETE ONE
    @Override
    public int deleteById(String id) {
        return jdbcTemplate.update("DELETE FROM customer_card WHERE card_number=?", id);
    }
}
