package by.andreev.basePages.imageSearch;

import com.codeborne.selenide.Selectors;

import static com.codeborne.selenide.Selenide.$;

public class SearchPage {

    //Адрес страницы
    public static final String URL = "https://yandex.ru/images";

    //Отправить поисковый запрос
    public void sendQuery(String query) {
        $(Selectors.byXpath("//input[@name='text']")).setValue("qa automation").pressEnter();
    }

}
