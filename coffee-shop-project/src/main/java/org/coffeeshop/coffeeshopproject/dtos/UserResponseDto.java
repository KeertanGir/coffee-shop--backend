package org.coffeeshop.coffeeshopproject.dtos;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class UserResponseDto {

    private Long id;
    private String name;
    private String email;
    private String password;
    private String phone;
    private String role;

}
