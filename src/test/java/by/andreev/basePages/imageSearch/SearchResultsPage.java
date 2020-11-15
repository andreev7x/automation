package by.andreev.basePages.imageSearch;

import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SearchResultsPage {

    //Переключить отображение филтров
    public SearchResultsPage toggleFilters() {
        $(Selectors.byXpath("//input[@value='filter']")).click();
        return this;
    }

    //Открыть фильтр по ресширению изображения
    public SearchResultsPage openFileFilter() {
        $(Selectors.byXpath("//span[text()='Файл']/..")).click();
        return this;
    }

    //Установить фильтр по .png
    public SearchResultsPage setPNGFileFilter() {
        $(Selectors.byXpath("//input[@value='png']/../..")).click();
        return this;
    }

    //Открыть предпросмотр результата выдачи под номером i (от 0 и выше)
    public SearchResultsPage openQueryResult(int i) {
        $$(Selectors.byXpath("//a[@class='serp-item__link']")).get(i).click();
        return this;
    }

    //Получить span кнопки "Отправить"
    public SelenideElement getShareButtonSpan() {
        SelenideElement element = $(Selectors.byXpath("//button[@class='MMButton MMViewerButtons-Share']/span[@class='MMButton-Text']"));
        return element;
    }

}
