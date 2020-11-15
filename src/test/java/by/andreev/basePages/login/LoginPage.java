package by.andreev.basePages.login;

import static com.codeborne.selenide.Selenide.*;

public class LoginPage {

    //Адрес страницы
    public static final String URL = "https://passport.yandex.ru/auth";

    //Ввести логин
    public LoginPage inputLogin(String login) {
        $("#passp-field-login").sendKeys(login);
        return this;
    }

    //Ввести пароль
    public LoginPage inputPassword(String password) {
        $("#passp-field-passwd").sendKeys(password);
        return this;
    }

    //Нажать кнопку "Войти"
    public LoginPage clickLoginButton() {
        $(".Button2_type_submit").click();
        return this;
    }

}