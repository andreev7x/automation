package by.andreev.tests;

import by.andreev.basePages.login.LoginPage;
import by.andreev.basePages.login.ProfilePage;
import by.andreev.settings.Settings;
import org.junit.Test;

import static com.codeborne.selenide.CollectionCondition.itemWithText;
import static com.codeborne.selenide.Selenide.open;

public class LoginTest extends Settings {

    //Ввести свои данные для входа в аккаунт Yandex
    public String login = "automationT@yandex.ru";
    public String password = "dummypass";

    LoginPage loginPage = new LoginPage();
    ProfilePage profilePage = new ProfilePage();

    @Test
    public void loginTest() {

        //Открыть страницу авторизации
        open(LoginPage.URL);

        //Ввести данные и войти в профиль
        loginPage.inputLogin(login)
                .clickLoginButton()
                .inputPassword(password)
                .clickLoginButton();

        //Проверить наличие адреса логина среди доступных адресов
        profilePage.clickMoreAddressesButton();
        profilePage.addressesCollection.shouldHave(itemWithText(login));

        //Выйти из профиля
        profilePage.clickUserMenu().clickLogoutButton();

    }

}