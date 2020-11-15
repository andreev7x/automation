package by.andreev.tests;

import by.andreev.basePages.services.AllServicesPage;
import by.andreev.basePages.services.YandexPage;
import by.andreev.settings.Settings;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.CollectionCondition.itemWithText;

public class ServicesTest extends Settings {

    //Название искомого сервиса
    public String serviceName = "Дзен";

    YandexPage yandexPage = new YandexPage();
    AllServicesPage allServicesPage = new AllServicesPage();

    @Test
    public void servicesTest() {

        //Открыть главную страницу яндекса
        open(YandexPage.URL);

        //Раскрыть список сервисов и перейти на страницу со всеми сервисами
        yandexPage.showMoreServices()
                .goToAllServicesPage();

        //Получить коллекцию названий сервисовй и найти в ней нужное название
        allServicesPage.servicesNamesCollection.shouldHave(itemWithText(serviceName));

    }

}