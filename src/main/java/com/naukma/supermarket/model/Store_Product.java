package com.naukma.supermarket.model;

import lombok.Data;

import java.sql.Date;

@Data

public class Store_Product {

    private String upc;
    private String upc_prom;
    private double selling_price;
    private int products_number;

    private long id_product;
    private String product_name;
    private Date exp_date;
    private boolean promotional_product;

    //private String product_name;
    //private String category_name;


}
