package ru.netology.web;

import java.time.LocalDate;

public class User {

    private final String login;
    private final String password;
    private final String status;

    public User(String name, String password, String status) {
        this.login = name;
        this.password = password;
        this.status = status;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getStatus() {
        return status;
    }
}
