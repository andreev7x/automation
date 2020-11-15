package by.andreev.basePages.services;

import com.codeborne.selenide.Selectors;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class YandexPage {

    //Адрес страницы
    public static final String URL = "https://yandex.ru/";

    //Развернуть список серверов
    public YandexPage showMoreServices() {
        $(Selectors.byXpath("//div[text()='ещё']")).click();
        return this;
    }

    //Перейти на страницу со всеми сервисами
    public void goToAllServicesPage() {
        String allSrevicesURL = $(Selectors.byXpath("//div[@class='services-new__more-popup-bottom-links']/a[3]")).getAttribute("href");
        open(allSrevicesURL);
    }

}
