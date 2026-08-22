package org.coffeeshop.coffeeshopproject.mappers;

import org.coffeeshop.coffeeshopproject.dtos.UserResponseDto;
import org.coffeeshop.coffeeshopproject.entities.Users;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    Users toUser(UserResponseDto userResponseDto);

    UserResponseDto toDto(Users users);

}
