package com.github.curriculeon.controllers;

import com.github.curriculeon.repositories.UserRepository;
import com.github.curriculeon.services.UserService;
import com.github.curriculeon.models.User;
import com.github.curriculeon.utils.controllers.AbstractSimpleController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/user")
public class UserController extends AbstractSimpleController<Long, User, UserRepository, UserService> {
    public UserController(UserService service) {
        super(service);
    }
}