package by.andreev.tests;

import by.andreev.basePages.market.CatalogPage;
import by.andreev.basePages.market.FavoritePage;
import by.andreev.basePages.market.ItemPage;
import by.andreev.settings.Settings;
import org.junit.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.open;

public class AddToFavoriteTest extends Settings {

    //Переменная для названия элемента в списке каталога
    public String itemText;

    CatalogPage catalogPage = new CatalogPage();
    ItemPage itemPage = new ItemPage();
    FavoritePage favoritePage = new FavoritePage();

    @Test
    public void addToFavoriteTest() {

        //Открыть страницу маркета
        open(CatalogPage.URL);

        //Получить название первого элемента в каталоге "Компьютеры" -> "Процессоры"
        itemText = catalogPage.goToComputers()
                            .goToProcessors()
                            .getFirstItemText();

        //Перейти на страницу первого элемента в каталоге "Компьютеры" -> "Процессоры"
        catalogPage.goToFirstItemPage();

        //Добавить элемент в избранное и перейти на страницу избранного
        itemPage.addToFavorite()
                .goToFavoritePage();

        //Получить заголовок первого элемента в избранном
        //и проверить на соответствие добавленному ранее
        favoritePage.getFirstItemHeader().shouldHave(text(itemText));

        //Удалить элемент из избранного
        favoritePage.deleteFromFavorite();

    }

}