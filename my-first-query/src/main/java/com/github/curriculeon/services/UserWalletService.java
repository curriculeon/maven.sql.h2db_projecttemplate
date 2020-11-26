package com.github.curriculeon.services;

import com.github.curriculeon.models.UserWallet;
import com.github.curriculeon.repositories.UserWalletRepository;
import com.github.curriculeon.utils.services.AbstractSimpleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserWalletService extends AbstractSimpleService<Long, UserWallet, UserWalletRepository> {
    @Autowired
    public UserWalletService(UserWalletRepository crudRepository) {
        super(crudRepository);
    }

    @Override
    public UserWallet update(UserWallet existingData, UserWallet newEntityData) {
        existingData.setBalance(newEntityData.getBalance());
        existingData.setUser(newEntityData.getUser());
        return getRepository().save(existingData);
    }
}
