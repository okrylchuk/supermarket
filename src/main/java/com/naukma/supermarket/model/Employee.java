package com.naukma.supermarket.model;

import com.naukma.supermarket.model.security.Role;
import com.naukma.supermarket.model.security.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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


    private String email;
    private String password;
    private Role empl_role;
    private Status status;
}
