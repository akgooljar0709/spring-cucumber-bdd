package com.example.springfantazero.service;

import com.example.springfantazero.dto.UserDto;
import com.example.springfantazero.model.User;

public interface UserService {
    public User addUser(UserDto userDto);
}
