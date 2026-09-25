package org.coffeeshop.coffeeshopproject.controller;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import lombok.RequiredArgsConstructor;
import org.coffeeshop.coffeeshopproject.dtos.userdtos.UserRequestDto;
import org.coffeeshop.coffeeshopproject.dtos.userdtos.UserResponseDto;
import org.coffeeshop.coffeeshopproject.entities.Users;
import org.coffeeshop.coffeeshopproject.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@CrossOrigin( origins = "http://localhost:5173/")
@RequiredArgsConstructor
@RestController
@Validated
@RequestMapping("/coffeeshop/api/users")
public class UserController {

    private final UserService userService;

    @GetMapping
    public ResponseEntity< List< UserResponseDto > > getAllUsers(){
        List<UserResponseDto> responseDtos = userService.getAll();
        return ResponseEntity.ok(responseDtos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserResponseDto> getUserById(@PathVariable Long id ){
        UserResponseDto  user  = userService.getUserById(id);
        return ResponseEntity.ok(user);
    }

    @GetMapping("/search")
    public ResponseEntity< List< UserResponseDto > > getUsersByEmail(  @RequestParam @Email(message = "Use A Valid email") String email ){

        List<UserResponseDto> responseDtos = userService.getAllByEmail(email);
        return ResponseEntity.ok(responseDtos);
    }

    @PostMapping
    public ResponseEntity<UserRequestDto> createUser(@Valid @RequestBody UserRequestDto userRequestDto ){
        Users user = userService.createUser(userRequestDto);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(user.getId()).toUri();
        return ResponseEntity.created(location).build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<UserResponseDto> deleteUserById(@PathVariable Long id){
        userService.removeUserById(id);
        return  ResponseEntity.noContent().build();
    }

}