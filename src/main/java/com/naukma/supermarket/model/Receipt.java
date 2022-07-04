package com.naukma.supermarket.model;

import lombok.Data;

@Data

public class Receipt {

    private String check_number;
    private double sum_total;
}
