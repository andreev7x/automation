package by.andreev.basePages.translator;

import com.codeborne.selenide.Selectors;

import static com.codeborne.selenide.Selenide.$;

public class TranslatorPage {

    public static final String URL = "https://translate.yandex.ru/";

    public void goToDocumentPage() {
        $(Selectors.by("href", "/doc")).click();
    }

}
