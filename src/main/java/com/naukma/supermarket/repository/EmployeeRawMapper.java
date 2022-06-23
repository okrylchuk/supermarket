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
        employee.setEmail(rs.getString("email"));
        employee.setPassword(rs.getString("password"));
        employee.setEmpl_role(Role.valueOf(rs.getString("empl_role")));
        employee.setStatus(Status.valueOf(rs.getString("status")));

        return employee;
    }
}
