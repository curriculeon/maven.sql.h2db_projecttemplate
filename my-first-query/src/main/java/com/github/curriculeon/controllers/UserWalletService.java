package com.github.curriculeon.controllers;

import com.github.curriculeon.models.UserWallet;
import com.github.curriculeon.repositories.UserWalletRepository;
import com.github.curriculeon.utils.services.AbstractSimpleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/user/wallet")
public class UserWalletService extends AbstractSimpleService<Long, UserWallet, UserWalletRepository> {

    @Autowired
    public UserWalletService(UserWalletRepository crudRepository) {
        super(crudRepository);
    }

    @Override
    public UserWallet update(UserWallet existingData, UserWallet newEntityData) {
        existingData.setUser(newEntityData.getUser());
        existingData.setBalance(newEntityData.getBalance());
        return getRepository().save(existingData);
    }
}
