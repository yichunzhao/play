package com.ynz.sandbox.fakeddata;

import com.github.javafaker.Faker;
import com.github.javafaker.Name;
import lombok.extern.java.Log;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Locale;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@Log
class FakerFactoryTest {
  private Faker faker;

  @BeforeEach
  void setUp() {
    faker = FakerFactory.build(new Locale("en", "US"));
  }

  @AfterEach
  public void tearDown() {}

  @Test
  void fakeUserNames() {
    Name faked = faker.name();

    log.info(faked.name());
    assertNotNull(faked);
  }
}
