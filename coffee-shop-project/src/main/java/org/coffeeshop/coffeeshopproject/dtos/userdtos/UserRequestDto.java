package org.coffeeshop.coffeeshopproject.dtos.userdtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class UserRequestDto {

    @NotBlank(message = "Name is Required")
    @Size( min = 2, message = "Name Should have at-least 2 letters!")
    private String name;

    @NotBlank(message = "Email is required")
    @Email(message = "Email Must be Correct")
    private String email;

    @NotBlank(message = "Password is Required")
    @Size(min = 8, max = 16, message = "Password must be in the Range of 8 to 16 latter with charectors")
    private String password;

    @NotBlank(message = "Phone is Required")
    private String phone;

    @NotBlank(message = "Role is Required")
    private String role;

}
