package com.ynz.sandbox.dto;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class User {
    @NotNull(message = "must have an email address")
    @Email(message = "invalid email address")
    private String email;

    @NotBlank
    private String name;
}
