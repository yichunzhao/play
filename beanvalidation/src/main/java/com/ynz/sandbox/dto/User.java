package com.ynz.sandbox.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
  @NotNull(message = "must have an email address")
  @Email(message = "invalid email address")
  private String email;

  @NotBlank private String name;
}
