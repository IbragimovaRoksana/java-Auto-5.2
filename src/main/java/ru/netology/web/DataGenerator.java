package ru.netology.web;

import com.github.javafaker.Faker;

import java.util.Locale;

public class DataGenerator {

    private DataGenerator() {
    }

    public static class Registration {
        private Registration() {
        }

        public static User registrationActiveUser() {
            Faker faker = new Faker(new Locale("en"));
            User value = new User(faker.name().username(), faker.internet().password(), "active");
            return value;
        }

        public static User registrationBlockedUser() {
            Faker faker = new Faker(new Locale("en"));
            User value = new User(faker.name().username(), faker.internet().password(), "blocked");
            return value;
        }

        public static User registrationVasyaUser() {

            User value = new User("vasya", "password", "active");
            return value;
        }
    }


}
