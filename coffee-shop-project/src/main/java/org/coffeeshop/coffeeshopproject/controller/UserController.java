package org.coffeeshop.coffeeshopproject.controller;

import lombok.RequiredArgsConstructor;
import org.coffeeshop.coffeeshopproject.dtos.userdtos.UserResponseDto;
import org.coffeeshop.coffeeshopproject.mappers.UserMapper;
import org.coffeeshop.coffeeshopproject.repository.UserRepository;
import org.coffeeshop.coffeeshopproject.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/coffeeshop/api/users")
public class UserController {


    private final UserService userService;

    @GetMapping
    public ResponseEntity< List< UserResponseDto > > getAllUsers(){
        List<UserResponseDto> responseDtos = userService.getAll();
        return ResponseEntity.ok(responseDtos);
    }


}
