package org.coffeeshop.coffeeshopproject.mappers;

import org.coffeeshop.coffeeshopproject.dtos.categorydtos.CategoriesResponseDto;
import org.coffeeshop.coffeeshopproject.entities.Category;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CategoriesMapper {

    CategoriesResponseDto toDto(Category categories);

    Category toCategory(CategoriesResponseDto categoriesResponseDto);

}
