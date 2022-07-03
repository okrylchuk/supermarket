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

    @Override
    public String toString() {
        return "Check{" +
                "card_number='" + card_number + '\'' +
                ", cust_surname='" + cust_surname + '\'' +
                ", cust_name='" + cust_name + '\'' +
                ", cust_patronymic='" + cust_patronymic + '\'' +
                ", phone_number='" + phone_number + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", zip_code='" + zip_code + '\'' +
                ", cust_percent=" + cust_percent +
                '}';
    }
}
