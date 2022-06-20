package com.naukma.supermarket.model;

import lombok.Data;

@Data

public class Store_Product {

    private String upc;
    private double selling_price;
    private int products_number;

    private long id_product;
    private String product_name;
    private String category_name;

    @Override
    public String toString() {
        return "Store_Product{" +
                "upc='" + upc + '\'' +
                ", selling_price=" + selling_price +
                ", products_number=" + products_number +
                ", id_product=" + id_product +
                ", product_name='" + product_name + '\'' +
                ", category_name='" + category_name + '\'' +
                '}';
    }
}
