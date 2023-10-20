package com.ynz.sandbox.service;

import com.ynz.sandbox.dto.User;

import javax.validation.constraints.NotNull;

public class UserService {

    public User createUser(@NotNull String email) {
        User user = new User();
        user.setEmail(email);
        return user;
    }
}
