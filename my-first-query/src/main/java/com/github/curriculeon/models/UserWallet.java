package com.github.curriculeon.models;

import com.github.curriculeon.utils.services.EntityInterface;

import javax.persistence.*;

@Entity
public class UserWallet implements EntityInterface<Long> {
    @OneToOne
    private User user;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private double balance;

    public UserWallet() {
    }

    public UserWallet(Long id, User user, double balance) {
        this.user = user;
        this.id = id;
        this.balance = balance;
    }

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

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
