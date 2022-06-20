package com.naukma.supermarket.model;

import lombok.*;

@Data
/*@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor*/

public class Category {

    private long category_id;
    private String category_name;

    @Override
    public String toString() {
        return "Category{" +
                "category_number=" + category_id +
                ", category_name='" + category_name + '\'' +
                '}';
    }
}
