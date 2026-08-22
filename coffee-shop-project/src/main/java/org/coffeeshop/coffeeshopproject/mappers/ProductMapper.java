package org.coffeeshop.coffeeshopproject.mappers;

import org.coffeeshop.coffeeshopproject.dtos.ProductsResponseDto;
import org.coffeeshop.coffeeshopproject.entities.Products;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    ProductsResponseDto toDto(Products products);

    Products toProducts(ProductsResponseDto productsResponseDto);

}
