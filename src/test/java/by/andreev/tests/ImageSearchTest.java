package by.andreev.tests;

import by.andreev.basePages.imageSearch.SearchPage;
import by.andreev.basePages.imageSearch.SearchResultsPage;
import by.andreev.settings.Settings;
import org.junit.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.open;

public class ImageSearchTest extends Settings {

    //Отправляемый поисковый запрос
    public String query = "qa automation";

    //Проверяемый текст кнопки
    public String spanText = "Отправить";

    SearchPage searchPage = new SearchPage();
    SearchResultsPage searchResultsPage = new SearchResultsPage();

    @Test
    public void imageSearchTest() {

        //Открыть страницу поиска изображений
        open(SearchPage.URL);

        //Отправить поисковый запрос
        searchPage.sendQuery(query);

        //Устновить фильтр по расширению .png
        searchResultsPage.toggleFilters()
                .openFileFilter()
                .setPNGFileFilter()
                .toggleFilters();

        //Открыть предпросмотр выдачи и проверить наличие нужного текста кнопки
        searchResultsPage.openQueryResult(0)
                .getShareButtonSpan().shouldHave(text(spanText));
    }

}