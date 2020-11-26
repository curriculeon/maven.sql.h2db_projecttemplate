package com.github.curriculeon.models;


import com.github.curriculeon.utils.Jsonifier;
import com.github.curriculeon.utils.services.EntityInterface;

import javax.persistence.*;

@Entity
public class User implements EntityInterface<Long> {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    private UserProfile profile;

    @OneToOne(cascade = CascadeType.ALL)
    private UserWallet wallet;

    public User() {
    }

    public User(Long id, UserProfile profile, UserWallet wallet) {
        this.id = id;
        this.profile = profile;
        this.wallet = wallet;
    }

    @Override
    public String toString() {
        return Jsonifier.jsonify(this);
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public UserProfile getProfile() {
        return profile;
    }

    public void setProfile(UserProfile profile) {
        this.profile = profile;
    }

    public UserWallet getWallet() {
        return wallet;
    }

    public void setWallet(UserWallet wallet) {
        this.wallet = wallet;
    }
}