package com.ynz.sandbox.dto;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.Set;
import java.util.stream.Collectors;

import static org.hamcrest.MatcherAssert.assertThat;

class UserTest {
  private Validator validator;

  @BeforeEach
  public void setup() {
    validator = Validation.buildDefaultValidatorFactory().getValidator();
  }

  @Test
  void validateInvalidEmail() {
    User user = new User("email", "somebody");
    Set<ConstraintViolation<User>> violations = validator.validate(user);
    assertThat(violations, Matchers.hasSize(Matchers.greaterThanOrEqualTo(1)));
  }

  @Test
  void validateNullEmail() {
    User user = new User(null, "somebody");
    Set<ConstraintViolation<User>> violations = validator.validate(user);
    assertThat(violations, Matchers.hasSize(1));
    String message =
        violations.stream()
            .map(ConstraintViolation::getMessage)
            .collect(Collectors.toList())
            .get(0);
    assertThat(message, Matchers.containsString("must have an email address"));
  }
}
