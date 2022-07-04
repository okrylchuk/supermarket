package com.naukma.supermarket.model;

import com.naukma.supermarket.model.security.Role;
import com.naukma.supermarket.model.security.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
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

    private Long id_employee;

    private String empl_surname;
    private String empl_name;
    private String empl_patronymic;
    private double salary;
    private Date dateOfBirth;
    private Date dateOfStart;
    private String phone_number;
    private String city;
    private String street;
    private String zip_code;

    private String login;
    private String password;
    private Role empl_role;
    private Status status;
}
