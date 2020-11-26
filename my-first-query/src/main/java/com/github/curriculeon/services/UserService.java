package com.github.curriculeon.services;

import com.github.curriculeon.models.User;
import com.github.curriculeon.repositories.UserRepository;
import com.github.curriculeon.utils.services.AbstractSimpleService;
import org.springframework.stereotype.Service;

@Service
public class UserService extends AbstractSimpleService<Long, User, UserRepository> {
    public UserService(UserRepository crudRepository) {
        super(crudRepository);
    }

    @Override
    public User update(User existingData, User newEntityData) {
        existingData.setName(newEntityData.getName());
        return getRepository().save(existingData);
    }
}