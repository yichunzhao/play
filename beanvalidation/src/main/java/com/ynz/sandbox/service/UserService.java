package com.ynz.sandbox.service;

import com.ynz.sandbox.dto.User;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class UserService {

    public User createUser(@NotNull String email) {
        User user = new User();
        user.setEmail(email);
        return user;
    }
}
