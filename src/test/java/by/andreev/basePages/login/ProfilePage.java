package by.andreev.basePages.login;

import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class ProfilePage {

    //Коллекция доступных почтовых адресов (имен) со страницы профиля
    public ElementsCollection addressesCollection = $$(".p-mails__item");

    //Нажать "Еще...", чтобы отобразить все адреса
    public ProfilePage clickMoreAddressesButton() {
        $(withText("Ещё")).click();
        return this;
    }

    //Открыть подменю пользователя
    public ProfilePage clickUserMenu() {
        $(".dheader-user").click();
        return this;
    }

    //Нажать кнопку выхода из профиля
    public ProfilePage clickLogoutButton() {
        $(byText("Выйти")).click();
        return this;
    }

}