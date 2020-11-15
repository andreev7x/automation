package by.andreev.basePages.market;

import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class FavoritePage {

    //Получить заголовок первого элемента списка
    public SelenideElement getFirstItemHeader() {
        SelenideElement element = $(Selectors.byXpath("//article//h3/a/span"));
        return element;
    }

    //Удалить элемент из избранного
    public FavoritePage deleteFromFavorite() {
        $(Selectors.byXpath("//span[text()='Удалить']/..//child::div")).click();
        return this;
    }

}
