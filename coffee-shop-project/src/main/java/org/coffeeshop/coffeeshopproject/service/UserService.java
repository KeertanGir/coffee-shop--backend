package org.coffeeshop.coffeeshopproject.service;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import org.coffeeshop.coffeeshopproject.dtos.userdtos.UserRequestDto;
import org.coffeeshop.coffeeshopproject.dtos.userdtos.UserResponseDto;
import org.coffeeshop.coffeeshopproject.entities.Users;
import org.coffeeshop.coffeeshopproject.exceptions.exceps.UserNotFoundException;
import org.coffeeshop.coffeeshopproject.mappers.UserMapperNew;
import org.coffeeshop.coffeeshopproject.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
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

//        userList.forEach(user -> {
//            System.out.println("ID       : " + user.getId());
//            System.out.println("NAME     : " + user.getName());
//            System.out.println("IMAGE URL: " + user.getImageUrl());
//            System.out.println("-------------------------");
//        });

        return userList;
    }

    public UserResponseDto getUserById(Long id) {
        return  userRepository.findById(id)
                .stream()
                .map(userMapper::toDto)
                .findFirst()
                .orElseThrow( () -> new UserNotFoundException(" User From "+ id +" id Not Available ")
                );
    }

    public List<UserResponseDto> getAllByEmail(@Email String email) {
        List<UserResponseDto> dtoList = userRepository.findAllByEmail(email)
                .stream()
                .map(userMapper::toDto)
                .toList();

        if(dtoList.isEmpty()){
            throw new UserNotFoundException("User is Not Available With This email Address "+ email );
        }

        return dtoList;
    }

    public Users createUser(@Valid UserRequestDto userRequestDto) {
        Users user = userMapper.toEntity(userRequestDto);
        user.setCreatedAt(LocalDateTime.now());
        return userRepository.save(user);
    }

    public void removeUserById(Long id) {
        userRepository.deleteById(id);
    }
}
