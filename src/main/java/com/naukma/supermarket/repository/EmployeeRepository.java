package com.naukma.supermarket.repository;

import com.naukma.supermarket.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    public Employee findByEmail(String email) {
        try {
            return jdbcTemplate.queryForObject("SELECT * FROM employee WHERE email=?",
                    new EmployeeRawMapper(), email);
        } catch (IncorrectResultSizeDataAccessException e) {
            System.out.println("here");
            return null;
        }
    }

    public List<Employee> findAll() {
        return jdbcTemplate.query("SELECT * from employee", new EmployeeRawMapper());
    }



}
