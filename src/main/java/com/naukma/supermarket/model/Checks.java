package com.naukma.supermarket.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Checks {

    private String check_number;
    //private Date print_date;
    private double sum_total;
    //private double vat;
    //private String id_employee;
    //private String card_number;
    //private List<Sale> salesList;


}
