package com.github.curriculeon.models.builders;

import com.github.curriculeon.models.User;
import com.github.curriculeon.models.UserProfile;

import java.util.Date;

public class UserProfileBuilder {
    private User user;
    private Long id;
    private String firstName;
    private String lastName;
    private Date dateCreated;

    public UserProfileBuilder setUser(User user) {
        this.user = user;
        return this;
    }

    public UserProfileBuilder setId(Long id) {
        this.id = id;
        return this;
    }

    public UserProfileBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public UserProfileBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public UserProfileBuilder setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
        return this;
    }

    public UserProfile createUserProfile() {
        return new UserProfile(user, id, firstName, lastName, dateCreated);
    }
}