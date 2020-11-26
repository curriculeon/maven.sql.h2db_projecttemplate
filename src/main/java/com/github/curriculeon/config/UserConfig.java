package com.github.curriculeon.config;

import com.github.curriculeon.models.User;
import com.github.curriculeon.models.builders.UserBuilder;
import com.github.curriculeon.models.builders.UserProfileBuilder;
import com.github.curriculeon.models.builders.UserWalletBuilder;
import com.github.curriculeon.services.UserService;
import com.github.git_leon.RandomUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.Date;

@Configuration
public class UserConfig {
    @Autowired
    private UserService userService;

    private void createUser(User newUserData) {
        User user = new User();
        userService.create(user);
        newUserData.getProfile().setUser(user);
        newUserData.getWallet().setUser(user);
        userService.update(user, newUserData);
    }

    @PostConstruct
    public void setup() {
        for (int i = 0; i < 9999; i++) {
            int firstNameLength = RandomUtils.createInteger(5, 10);
            int lastNameLength = RandomUtils.createInteger(5, 10);
            String firstName = RandomUtils.createString('A','Z', firstNameLength);
            String lastName = RandomUtils.createString('A','Z', lastNameLength);
            Date creationDate = RandomUtils.createDate(2019, 2021);
            Double walletBalance = RandomUtils.createDouble(10000.0, 9999999.0);

            createUser(new UserBuilder()
                    .setProfile(new UserProfileBuilder()
                            .setFirstName(firstName)
                            .setLastName(lastName)
                            .setDateCreated(creationDate)
                            .createUserProfile())
                    .setWallet(new UserWalletBuilder()
                            .setBalance(walletBalance)
                            .createUserWallet())
                    .createUser());
        }
    }
}
