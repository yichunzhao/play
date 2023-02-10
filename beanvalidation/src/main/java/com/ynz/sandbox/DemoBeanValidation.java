package com.ynz.sandbox;

import com.ynz.sandbox.dto.User;
import com.ynz.sandbox.service.UserService;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

public class DemoBeanValidation {

    public static void main(String[] args) {
        UserService userService = new UserService();
        userService.createUser(null);

        User user = new User();
        user.setEmail(null);

        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();


        Set<ConstraintViolation<User>> violations = validator.validate(user);
        System.out.println(violations);
    }
}
