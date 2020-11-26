package com.github.curriculeon.config;

import com.github.curriculeon.models.User;
import com.github.curriculeon.services.UserService;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
public class UserConfig {
    private UserService userService;

    @PostConstruct
    public void setup() {
    }
}
