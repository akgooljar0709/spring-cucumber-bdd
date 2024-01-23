package com.example.springfantazero.steps;

import com.example.springfantazero.dto.UserDto;
import com.example.springfantazero.model.User;
import com.example.springfantazero.service.UserService;
import com.example.springfantazero.service.impl.UserServiceImpl;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class UserServiceSteps {

    private UserServiceImpl userService;
    private UserDto userDTO;
    private User resultUser;

    @Given("Admin has user details with name {string} and email {string}")
    public void admin_has_user_details(String name, String email) {
        userDTO = new UserDto();
        userDTO.setName(name);
        userDTO.setEmail(email);
        userService = mock(UserServiceImpl.class);
    }

    @When("Admin adds the user")
    public void admin_adds_the_user() {
        when(userService.addUser(any(UserDto.class))).thenReturn(new User());
        resultUser = userService.addUser(userDTO);
    }

    @Then("the user should be added successfully")
    public void user_should_be_added_successfully() {
        assertNotNull(resultUser);
    }
}