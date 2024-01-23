package com.example.springfantazero.service.impl;

import com.example.springfantazero.dto.UserDto;
import com.example.springfantazero.model.User;
import com.example.springfantazero.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl {
    @Autowired
    private UserRepository userRepository;

    public User addUser(UserDto userDto) {
        User newUser = new User();
        newUser.setName(userDto.getName());
        newUser.setEmail(userDto.getEmail());
        return userRepository.save(newUser);
    }
}
