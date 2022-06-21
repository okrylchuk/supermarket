package com.naukma.supermarket.model;

import com.naukma.supermarket.model.security.Role;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class Employee {


//    id_employee VARCHAR(10) NOT NULL,
//    empl_surname VARCHAR(50) NOT NULL,
//    empl_name VARCHAR(50) NOT NULL,
//    empl_patronymic VARCHAR(50) NOT NULL,
//    empl_role VARCHAR(10) NOT NULL,
//    salary DECIMAL(13,4) NOT NULL,
//    date_of_birth DATE NOT NULL,
//    date_of_start DATE NOT NULL,
//    phone_number VARCHAR(13) NOT NULL,
//    city VARCHAR(50) NOT NULL,
//    street VARCHAR(50) NOT NULL,
//    zip_code VARCHAR(9) NOT NULL,

    private Long id;
    private String name;
    private String password;
    private String surname;
    private String patronymic;
    private Role role;
    private double salary;
    private Date date_of_birth;
    private Date date_of_start;
    private String phone_number;
    private String city;
    private String street;
    private String zip_code;


    public Employee(Long id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }
}
