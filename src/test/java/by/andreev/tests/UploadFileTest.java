package by.andreev.tests;

import by.andreev.basePages.translator.DocumentPage;
import by.andreev.basePages.translator.TranslatorPage;
import by.andreev.settings.Settings;
import org.junit.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.open;

public class UploadFileTest extends Settings {

    //Путь до файла на ПК
    public String filePath = "C:/Users/Nick/Desktop/uploadTest.pdf";

    TranslatorPage translatorPage = new TranslatorPage();
    DocumentPage documentPage = new DocumentPage();

    @Test
    public void uploadFileTest() {

        //Открыть страницу переводчика
        open(TranslatorPage.URL);

        //Перейти на страницу загрузки документа
        translatorPage.goToDocumentPage();

        //Загрузить файл на страницу
        documentPage.uploadFileForTranslation(filePath);

        //Проверить выполнение перевода до конца
        documentPage.getProgressElement().shouldHave(text("100%"));

        //Проверить отображение кнопки скачивания перевода
        documentPage.getDownloadButtonSpan().shouldBe(visible);

    }

}