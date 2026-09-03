package org.coffeeshop.coffeeshopproject.service;

import org.coffeeshop.coffeeshopproject.dtos.userdtos.UserResponseDto;
import org.coffeeshop.coffeeshopproject.mappers.UserMapperNew;
import org.coffeeshop.coffeeshopproject.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {


    private final UserRepository userRepository;
    private final UserMapperNew userMapper;

    public UserService(UserRepository userRepository, UserMapperNew userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    public List<UserResponseDto> getAll() {
        List<UserResponseDto> userList = userRepository
                .findAll()
                .stream()
                .map(userMapper::toDto)
                .toList();


        userList.forEach(user -> {
            System.out.println("ID       : " + user.getId());
            System.out.println("NAME     : " + user.getName());
            System.out.println("IMAGE URL: " + user.getImageUrl());
            System.out.println("-------------------------");
        });

        return userList;
    }
}
