package com.github.curriculeon.models.builders;

import com.github.curriculeon.models.User;
import com.github.curriculeon.models.UserProfile;
import com.github.curriculeon.models.UserWallet;

public class UserBuilder {
    private Long id;
    private UserProfile profile;
    private UserWallet wallet;

    public UserBuilder setId(Long id) {
        this.id = id;
        return this;
    }

    public UserBuilder setProfile(UserProfile profile) {
        this.profile = profile;
        return this;
    }

    public UserBuilder setWallet(UserWallet wallet) {
        this.wallet = wallet;
        return this;
    }

    public User createUser() {
        return new User(id, profile, wallet);
    }
}