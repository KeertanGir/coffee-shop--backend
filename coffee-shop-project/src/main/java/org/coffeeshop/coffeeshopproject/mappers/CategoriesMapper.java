package org.coffeeshop.coffeeshopproject.mappers;

import org.coffeeshop.coffeeshopproject.dtos.CategoriesResponseDto;
import org.coffeeshop.coffeeshopproject.entities.Categories;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CategoriesMapper {

    CategoriesResponseDto toDto(Categories categories);

    Categories toCategory(CategoriesResponseDto categoriesResponseDto);

}
