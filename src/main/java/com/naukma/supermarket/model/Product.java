package com.naukma.supermarket.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    private long id_product;
    private String product_name;
    private String producer;
    private String product_characteristics;
    private long category_id;
    private String category_name;

    @Override
    public String toString() {
        return "Product{" +
                "id_product=" + id_product +
                ", product_name='" + product_name + '\'' +
                ", producer='" + producer + '\'' +
                ", product_characteristics='" + product_characteristics + '\'' +
                ", category_id=" + category_id +
                ", category_name='" + category_name + '\'' +
                '}';
    }
}
