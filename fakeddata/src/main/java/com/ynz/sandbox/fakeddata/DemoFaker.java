package com.ynz.sandbox.fakeddata;

import com.github.javafaker.Beer;
import com.github.javafaker.CreditCardType;
import com.github.javafaker.Demographic;
import com.github.javafaker.Faker;
import lombok.extern.java.Log;

import java.util.Date;
import java.util.Locale;

@Log
public class DemoFaker {

    public static void main(String[] args) {
        //
        Faker faker = new Faker(new Locale("da-DK"));
        String streetName = faker.address().streetName();
        log.info("faked street name: " + streetName);

        Beer fakedBeer = faker.beer();
        log.info("faked beer name: " + fakedBeer.name());

        Date birthDate = faker.date().birthday();
        log.info("faked birth date: " + birthDate);

        String creditCard = faker.finance().creditCard();
        log.info("faked credit card: " + creditCard);

        String fakedDanKort = faker.finance().creditCard(CreditCardType.DANKORT);
        log.info("faked dan kort: " + fakedDanKort);

        Demographic demographic = faker.demographic();
        log.info(demographic.demonym());
    }
}
