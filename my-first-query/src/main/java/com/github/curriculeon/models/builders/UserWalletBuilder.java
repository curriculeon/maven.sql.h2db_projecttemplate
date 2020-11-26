package com.github.curriculeon.models.builders;

import com.github.curriculeon.models.User;
import com.github.curriculeon.models.UserWallet;

public class UserWalletBuilder {
    private Long id;
    private User user;
    private double balance;

    public UserWalletBuilder setId(Long id) {
        this.id = id;
        return this;
    }

    public UserWalletBuilder setUser(User user) {
        this.user = user;
        return this;
    }

    public UserWalletBuilder setBalance(double balance) {
        this.balance = balance;
        return this;
    }

    public UserWallet createUserWallet() {
        return new UserWallet(id, user, balance);
    }
}