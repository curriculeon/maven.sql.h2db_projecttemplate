package com.github.curriculeon.models;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.curriculeon.models.builders.UserBuilder;
import org.junit.Assert;
import org.junit.Test;

import javax.persistence.Entity;


public class UserTest {
    @Test
    public void testClassSignatureAnnotations() {
        Assert.assertTrue(User.class.isAnnotationPresent(Entity.class));
    }
    @Test
    public void testCreateJson() throws JsonProcessingException {
        ObjectMapper jsonWriter = new ObjectMapper();
        User user = new UserBuilder().createUser();
        String json = jsonWriter.writeValueAsString(user);
    }
}
