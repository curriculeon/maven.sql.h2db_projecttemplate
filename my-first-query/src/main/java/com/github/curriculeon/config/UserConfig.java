package com.github.curriculeon.config;

import com.github.curriculeon.models.builders.UserBuilder;
import com.github.curriculeon.models.builders.UserProfileBuilder;
import com.github.curriculeon.models.builders.UserWalletBuilder;
import com.github.curriculeon.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.Date;

@Configuration
public class UserConfig {
    @Autowired
    private UserService userService;

    @PostConstruct
    public void setup() {
        Arrays.asList(
                new UserBuilder()
                        .setProfile(new UserProfileBuilder()
                                .setFirstName("Leon")
                                .setLastName("Hunter")
                                .setDateCreated(new Date())
                                .createUserProfile())
                        .setWallet(new UserWalletBuilder()
                                .setBalance(999999.99)
                                .createUserWallet())
                        .createUser(),

                new UserBuilder()
                        .setProfile(new UserProfileBuilder()
                                .setFirstName("Noel")
                                .setLastName("Retnuh")
                                .setDateCreated(new Date())
                                .createUserProfile())
                        .setWallet(new UserWalletBuilder()
                                .setBalance(9999998.99)
                                .createUserWallet())
                        .createUser(),

                new UserBuilder()
                        .setProfile(new UserProfileBuilder()
                                .setFirstName("Leon")
                                .setLastName("Christopher")
                                .setDateCreated(new Date())
                                .createUserProfile())
                        .setWallet(new UserWalletBuilder()
                                .setBalance(99999987.99)
                                .createUserWallet())
                        .createUser())
                .forEach(userService::create);
    }
}
