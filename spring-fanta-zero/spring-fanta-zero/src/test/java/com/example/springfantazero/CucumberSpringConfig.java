package com.example.springfantazero;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = SpringFantaZeroApplication.class)
public class CucumberSpringConfig {
    // This class should be empty and is used for setting up the Spring context for Cucumber
}