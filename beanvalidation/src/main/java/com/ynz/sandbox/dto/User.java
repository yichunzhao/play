package com.ynz.sandbox.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class User {
    @NotNull(message = "must have an email address")
    @Email(message = "invalid email address")
    private String email;

  public User(String email, String name) {
    this.email = email;
    this.name = name;
  }

  public User() {
  }

  @NotBlank
    private String name;

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
