package com.ynz.sandbox.fakeddata;

import com.github.javafaker.Beer;
import com.github.javafaker.Demographic;
import com.github.javafaker.Faker;
import lombok.extern.java.Log;

@Log
public class DemoFaker {

  public static void main(String[] args) {
    //
    Faker faker = new Faker();
    String streetName = faker.address().streetName();
    System.out.println(streetName);

    Beer fakedBeer = faker.beer();
    System.out.println(fakedBeer.name());

    Demographic demographic = faker.demographic();
    System.out.println(demographic.educationalAttainment());
    log.info(demographic.demonym());
  }
}
