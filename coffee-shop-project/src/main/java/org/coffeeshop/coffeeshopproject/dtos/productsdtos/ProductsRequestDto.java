package org.coffeeshop.coffeeshopproject.dtos.productsdtos;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
public class ProductsRequestDto {

    @NotBlank( message = "Product name Is Required")
    @Size(min = 2 , max = 255 , message = "Category Name Should have At-least 2 letters and Maximum 255 letters.")
    private String name;

    @NotBlank( message = "Product Description Is Required")
    @Size(min = 2 , message = "Category Description Should have At-least 2 letters.")
    private String description;

    @NotBlank( message = "Product Base Pice Is Required")
//    @DecimalMin(value =  "1" )
    @Positive
    private BigDecimal base_price;

    private String image_url;
    private Boolean available;

    @NotBlank(message = "Category ID is Required")
    private Long categoryId;

}
