package com.example.springfantazero.controller;

import com.example.springfantazero.dto.UserDto;
import com.example.springfantazero.model.User;
import com.example.springfantazero.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserServiceImpl userService;

    @PostMapping("/users")
    public ResponseEntity<User> addUser(@RequestBody UserDto userDto) {
        User user = userService.addUser(userDto);
        return ResponseEntity.ok(user);
    }
}
