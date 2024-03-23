package org.example.lession.lession5.Product.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    private String id;

    private String code;

    private String name;

    private Float price;

    private String size;

    private Long quantity;

}
