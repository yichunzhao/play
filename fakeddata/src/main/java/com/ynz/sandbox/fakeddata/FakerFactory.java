package com.ynz.sandbox.fakeddata;

import com.github.javafaker.Faker;

import java.util.Locale;

public class FakerFactory {

  public static Faker build(Locale locale) {
    return new Faker(locale);
  }
}
