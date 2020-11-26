package com.github.curriculeon.services;

import com.github.curriculeon.models.UserProfile;
import com.github.curriculeon.repositories.UserProfileRepository;
import com.github.curriculeon.utils.services.AbstractSimpleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserProfileService extends AbstractSimpleService<Long, UserProfile, UserProfileRepository> {
    @Autowired
    public UserProfileService(UserProfileRepository crudRepository) {
        super(crudRepository);
    }

    @Override
    public UserProfile update(UserProfile existingData, UserProfile newEntityData) {
        existingData.setFirstName(newEntityData.getFirstName());
        existingData.setLastName(newEntityData.getLastName());
        existingData.setDateCreated(newEntityData.getDateCreated());
        existingData.setUser(newEntityData.getUser());
        return getRepository().save(existingData);
    }
}
