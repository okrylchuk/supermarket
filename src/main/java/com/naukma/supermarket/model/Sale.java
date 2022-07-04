package com.naukma.supermarket.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Sale {

    private int product_number;
    private double selling_price;
    private String upc;
    private String check_number;
}
