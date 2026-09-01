package org.coffeeshop.coffeeshopproject.dtos.productsdtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
public class ProductsResponseDto {

    private Long id;
    private String name;
    private String description;
    private BigDecimal base_price;
    private String image_url;
    private Boolean available;
    private Long categoryId;

}
