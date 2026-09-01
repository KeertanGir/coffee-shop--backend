package org.coffeeshop.coffeeshopproject.dtos.categorydtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

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
