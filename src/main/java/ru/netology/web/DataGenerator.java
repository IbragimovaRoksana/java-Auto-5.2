package ru.netology.web;

import com.github.javafaker.Faker;

import java.util.Locale;

public class DataGenerator {

    private DataGenerator() {
    }

    public static class Registration {
        private Registration() {
        }

        public static User RegistrationActiveUser() {
            Faker faker = new Faker(new Locale("en"));
            User value = new User(faker.name().username(), faker.internet().password(), "active");
            return value;
        }

        public static User RegistrationBlockedUser() {
            Faker faker = new Faker(new Locale("en"));
            User value = new User(faker.name().username(), faker.internet().password(), "blocked");
            return value;
        }
    }


}
