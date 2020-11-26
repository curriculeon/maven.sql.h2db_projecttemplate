package com.github.curriculeon.services;


import com.github.curriculeon.MyApplication;

import com.github.curriculeon.controllers.UserController;
import com.github.curriculeon.models.User;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.BDDMockito;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = MyApplication.class)
public class UserServiceTest {
    @MockBean
    private UserService service;

    private UserController controller;

    @Before
    public void setup(){
        this.controller = new UserController(service);
    }


    @Test
    public void testCreate() {
        // Given
        HttpStatus expected = HttpStatus.CREATED;
        User expectedUser = new User();
        BDDMockito
                .given(service.create(expectedUser))
                .willReturn(expectedUser);

        // When
        ResponseEntity<User> response = controller.create(expectedUser);
        HttpStatus actual = response.getStatusCode();
        User actualUser = response.getBody();

        // Then
        Assert.assertEquals(expected, actual);
        Assert.assertEquals(expectedUser, actualUser);
    }


    @Test
    public void testShow() {
        // Given
        Long expectedId = 1L;
        HttpStatus expected = HttpStatus.OK;
        User expectedUser = new User();
        expectedUser.setId(expectedId);
        BDDMockito.
                given(service.findById(1L))
                .willReturn(expectedUser);

        // When
        ResponseEntity<User> response = controller.show(expectedId);
        HttpStatus actual = response.getStatusCode();
        User actualUser = response.getBody();

        // Then
        Assert.assertEquals(expected, actual);
        Assert.assertEquals(expectedUser, actualUser);
    }

}
