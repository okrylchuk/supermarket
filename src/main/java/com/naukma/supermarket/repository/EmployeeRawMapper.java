package com.naukma.supermarket.repository;

import com.naukma.supermarket.model.Employee;
import com.naukma.supermarket.model.security.Role;
import com.naukma.supermarket.model.security.Status;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeRawMapper implements RowMapper<Employee> {

    @Override
    public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {

        Employee employee = new Employee();
        employee.setId_employee(rs.getLong("id_employee"));
        employee.setEmpl_surname(rs.getString("empl_surname"));
        employee.setEmpl_name(rs.getString("empl_name"));
        employee.setEmpl_patronymic(rs.getString("empl_patronymic"));
        employee.setSalary(rs.getDouble("salary"));
        employee.setDateOfBirth(rs.getDate("date_of_birth"));
        employee.setDateOfStart(rs.getDate("date_of_start"));
        employee.setPhone_number(rs.getString("phone_number"));
        employee.setCity(rs.getString("city"));
        employee.setStreet(rs.getString("street"));
        employee.setZip_code(rs.getString("zip_code"));
        employee.setLogin(rs.getString("login"));
        employee.setPassword(rs.getString("password"));
        employee.setEmpl_role(Role.valueOf(rs.getString("empl_role")));
        employee.setStatus(Status.valueOf(rs.getString("status")));

        return employee;
    }
}
