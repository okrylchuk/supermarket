package com.naukma.supermarket.repository;

import com.naukma.supermarket.model.Category;
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


    // NOT WORKING
    public int save(Employee employee) {
        return jdbcTemplate.update("INSERT INTO Employee (id_employee, empl_surname, empl_name, empl_patronymic, empl_role, salary, date_of_birth, date_of_start, phone_number, city, street, zip_code, login, password, status) " +
                        "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)",
                new Object[] { employee.getId_employee(), employee.getEmpl_surname(), employee.getEmpl_name(), employee.getEmpl_patronymic(), employee.getEmpl_role(),
                employee.getSalary(), employee.getDateOfBirth(), employee.getDateOfStart(), employee.getPhone_number(), employee.getCity(),
                employee.getStreet(), employee.getZip_code(), employee.getLogin(), employee.getPassword(), employee.getStatus() } );
    }

    public Employee findByLogin(String login) {
        try {
            return jdbcTemplate.queryForObject("SELECT * FROM employee WHERE login=?",
                    new EmployeeRawMapper(), login);
        } catch (IncorrectResultSizeDataAccessException e) {
            System.out.println("here");
            return null;
        }
    }

    public Employee findById(Long id) {
        try {
            return jdbcTemplate.queryForObject("SELECT * FROM employee WHERE id_employee=?",
                    new EmployeeRawMapper(), id);
        } catch (IncorrectResultSizeDataAccessException e) {
            System.out.println("here");
            return null;
        }
    }

    public int update(Employee employee, Long id) {
        String begin = "UPDATE Employee SET empl_surname=?, id_employee=?  WHERE id_employee=";
        String oldKey = String.valueOf(id);
        String sql = begin + oldKey;

        return jdbcTemplate.update(sql,
                new Object[] { employee.getEmpl_surname(), employee.getId_employee() });
    }

    public List<Employee> findAll() {
        return jdbcTemplate.query("SELECT * from employee", new EmployeeRawMapper());
    }



}
