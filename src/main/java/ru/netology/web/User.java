package ru.netology.web;

import java.time.LocalDate;

public class User {

    private final String name;
    private final String password;
    private final String status;

    public User(String name, String password, String status) {
        this.name = name;
        this.password = password;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getStatus() {
        return status;
    }
}
