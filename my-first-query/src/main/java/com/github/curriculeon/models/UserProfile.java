package com.github.curriculeon.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.github.curriculeon.utils.services.EntityInterface;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.util.Date;

public class UserProfile implements EntityInterface<Long> {
    @JsonIgnore
    @OneToOne
    private User user;

    @Id
    @GeneratedValue
    private Long id;
    private String firstName;
    private String lastName;
    private Date dateCreated;


    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }
}
