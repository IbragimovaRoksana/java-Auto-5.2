package ru.netology.web;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class TestByTestmod {
    @BeforeEach
    void setUp() {
        open("http://localhost:9999/");
    }

    @Test
    void shouldValidActiveUser() {
        User userActive = DataGenerator.Registration.RegistrationActiveUser();
        Request.setUpAll(userActive);
        $("[data-test-id=login] .input__control").setValue(userActive.getLogin());
        $("[data-test-id=password] .input__control").setValue(userActive.getPassword());
        $("[data-test-id=action-login]").click();
        $(withText("Личный кабинет")).shouldBe(Condition.visible);
    }

    @Test
    void shouldValidActiveUser1() {
        User userVasya = DataGenerator.Registration.RegistrationVasyaUser();
        Request.setUpAll(userVasya);
        $("[data-test-id=login] .input__control").setValue(userVasya.getLogin());
        $("[data-test-id=password] .input__control").setValue(userVasya.getPassword());
        $("[data-test-id=action-login]").click();
        $(withText("Личный кабинет")).shouldBe(Condition.visible);
    }

    @Test
    void shouldValidBlockedUser() {
        User userBlocked = DataGenerator.Registration.RegistrationBlockedUser();
        Request.setUpAll(userBlocked);
        $("[data-test-id=login] .input__control").setValue(userBlocked.getLogin());
        $("[data-test-id=password] .input__control").setValue(userBlocked.getPassword());
        $("[data-test-id=action-login]").click();
        $(withText("Пользователь заблокирован")).shouldBe(Condition.visible);
    }

    @Test
    void shouldSendWrongLogin() {
        User userActive = DataGenerator.Registration.RegistrationActiveUser();
        Request.setUpAll(userActive);
        $("[data-test-id=login] .input__control").setValue("125869574");
        $("[data-test-id=password] .input__control").setValue(userActive.getPassword());
        $("button[data-test-id=action-login]").click();
        $(withText("Неверно указан логин или пароль")).shouldBe(Condition.visible);

    }

    @Test
    void shouldSendWrongPassword() {
        User userActive = DataGenerator.Registration.RegistrationActiveUser();
        Request.setUpAll(userActive);
        $("[data-test-id=login] .input__control").setValue(userActive.getLogin());
        $("[data-test-id=password] .input__control").setValue("asdfvcxz");
        $("button[data-test-id=action-login]").click();
        $(withText("Неверно указан логин или пароль")).shouldBe(Condition.visible);

    }


}
