package by.andreev.basePages.market;

import com.codeborne.selenide.Selectors;

import static com.codeborne.selenide.Selenide.$;

public class ItemPage {

    //Добавить элемент в избранное
    public ItemPage addToFavorite() {
        $(Selectors.byXpath("//span[text()='В избранное']/..")).click();
        return this;
    }

    //Перейти на страницу избранных товаров
    public void goToFavoritePage() {
        $(Selectors.byXpath("//div[text()='Избранное']")).click();
    }

}
