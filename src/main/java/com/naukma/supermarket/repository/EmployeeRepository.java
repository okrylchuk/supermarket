package com.naukma.supermarket.repository;

import com.naukma.supermarket.model.Employee;
import com.naukma.supermarket.model.Status;
import com.naukma.supermarket.model.security.Role;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Repository
public class EmployeeRepository {

    private List<Employee> employees = Stream.of(
            new Employee(1L, "admin", "$2a$12$8Iym3DU0oQLVl9jd4MpAXObhe5WXfpRway1uQPERNNiowL.QAxZxO", Role.ADMIN, Status.ACTIVE),
            new Employee(1L, "user", "$2a$12$qTlzpZfcALHCYTbAfNU8Teqkb.3IfxpNyheTUcPbOeAkvA..9kQmW", Role.USER, Status.ACTIVE)
            ).toList();

    public Employee findByEmail(String email) {
        return employees.stream().filter(developer -> developer.getEmail().equals(email))
                .findFirst()
                .orElse(null);
    }

}
