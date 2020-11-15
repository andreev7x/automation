package by.andreev.basePages.market;

import com.codeborne.selenide.Selectors;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class CatalogPage {

    //Адрес страницы
    public static final String URL = "https://market.yandex.ru/";

    //Перейти в раздел "Компьюетры"
    public CatalogPage goToComputers() {
        $(Selectors.byXpath("//span[text()='Компьютеры']/..")).click();
        return this;
    }

    //Перейти в раздел "Процессоры"
    public CatalogPage goToProcessors() {
        $(Selectors.byXpath("//a[text()='Процессоры (CPU)']")).click();
        return this;
    }

    //Получить название первого элемента списка процессоров
    public String getFirstItemText() {
        String firstItemText = $(Selectors.byXpath("//article[1]//h3/a/span")).getText();
        return firstItemText;
    }

    //Перейти на страницу первого элемента списка процессоров
    public void goToFirstItemPage() {
        String url = $(Selectors.byXpath("//article[1]//h3/a")).getAttribute("href");
        open(url);
    }
}