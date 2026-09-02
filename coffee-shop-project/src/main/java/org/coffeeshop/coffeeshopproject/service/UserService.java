package org.coffeeshop.coffeeshopproject.service;

import org.coffeeshop.coffeeshopproject.dtos.userdtos.UserResponseDto;
import org.coffeeshop.coffeeshopproject.mappers.UserMapper;
import org.coffeeshop.coffeeshopproject.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {


    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public UserService(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    public List<UserResponseDto> getAll() {
        List<UserResponseDto> userList = userRepository
                .findAll()
                .stream()
                .map(userMapper::toDto)
                .toList();

        return userList;
    }
}
