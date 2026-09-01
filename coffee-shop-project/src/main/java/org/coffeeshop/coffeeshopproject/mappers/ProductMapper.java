package org.coffeeshop.coffeeshopproject.mappers;

import org.coffeeshop.coffeeshopproject.dtos.productsdtos.ProductsResponseDto;
import org.coffeeshop.coffeeshopproject.entities.Product;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    ProductsResponseDto toDto(Product products);

    Product toProducts(ProductsResponseDto productsResponseDto);

}
