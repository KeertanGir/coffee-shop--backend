package org.coffeeshop.coffeeshopproject.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.coffeeshop.coffeeshopproject.entities.Products;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class CategoriesResponseDto {
    private Long id;
    private String name;
    private String description;
    private String imageUrl;
    private Boolean active;
}
