package com.naukma.supermarket.model;

import lombok.Data;

@Data
public class CustomerCard {

    private String card_number;
    private String cust_surname;
    private String cust_name;
    private String cust_patronymic;
    private String phone_number;
    private String city;
    private String street;
    private String zip_code;
    private int cust_percent;
}
