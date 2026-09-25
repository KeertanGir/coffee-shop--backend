package org.coffeeshop.coffeeshopproject.mappers;

import org.coffeeshop.coffeeshopproject.dtos.userdtos.UserRequestDto;
import org.coffeeshop.coffeeshopproject.dtos.userdtos.UserResponseDto;
import org.coffeeshop.coffeeshopproject.entities.Users;
import org.mapstruct.Mapper;

@Mapper( componentModel = "spring")
public interface UserMapperNew {

    Users toEntity(UserRequestDto userRequestDto);

    UserResponseDto toDto(Users users);

}
