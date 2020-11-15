package by.andreev.basePages.translator;

import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;

import java.io.File;

import static com.codeborne.selenide.Selenide.$;

public class DocumentPage {

    //Загрузить файл на страницу
    public void uploadFileForTranslation(String filePath) {
        $(Selectors.byXpath("//span[@tabindex='2']")).click();
        $(Selectors.byCssSelector("input")).uploadFile(new File(filePath));
    }

    //Получить элемент отображения прогресса перевода
    public SelenideElement getProgressElement() {
        SelenideElement element = $(Selectors.byId("progress"));
        return element;
    }

    //Получить span кнопки скачивания документа с переводом
    public SelenideElement getDownloadButtonSpan() {
        SelenideElement element = $(Selectors.byXpath("//span[@data-action='downloadDoc']"));
        return element;
    }

}