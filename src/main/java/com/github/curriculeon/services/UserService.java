package com.github.curriculeon.services;

import com.github.curriculeon.models.User;
import com.github.curriculeon.repositories.UserRepository;
import com.github.curriculeon.utils.services.AbstractSimpleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService extends AbstractSimpleService<Long, User, UserRepository> {
    @Autowired
    public UserService(UserRepository crudRepository) {
        super(crudRepository);
    }

    @Override
    public User update(User existingData, User newEntityData) {
        existingData.setProfile(newEntityData.getProfile());
        existingData.setWallet(newEntityData.getWallet());
        return getRepository().save(existingData);
    }
}