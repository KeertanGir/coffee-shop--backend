package org.coffeeshop.coffeeshopproject.dtos.categorydtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class CategoriesRequestDto {

    @NotBlank(message = "Category name Is Required")
    @Size(min = 2 , max = 100 , message = "Category Name Should have At-least 2 letters and Maximum 100 letters.")
    private String name;

    @NotBlank(message = "Category Description Is Required")
    @Size(min = 2 , message = "Category Description Should have At-least 2 letters.")
    private String description;


    private String imageUrl;


    private Boolean active;
}
