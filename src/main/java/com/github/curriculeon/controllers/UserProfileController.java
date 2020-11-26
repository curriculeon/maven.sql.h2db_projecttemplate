package com.github.curriculeon.controllers;

import com.github.curriculeon.models.UserProfile;
import com.github.curriculeon.repositories.UserProfileRepository;
import com.github.curriculeon.services.UserProfileService;
import com.github.curriculeon.utils.controllers.AbstractSimpleController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/user/profile")
public class UserProfileController extends AbstractSimpleController<Long, UserProfile, UserProfileRepository, UserProfileService> {
    public UserProfileController(UserProfileService service) {
        super(service);
    }
}
