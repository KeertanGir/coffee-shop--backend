package org.coffeeshop.coffeeshopproject.dtos.userdtos;

import lombok.Data;

@Data
public class UserResponseDto {


    private Long id;
    private String name;
    private String email;
    private String phone;
    private String role;
    private String imageUrl;


}
