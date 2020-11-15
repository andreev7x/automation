package by.andreev.basePages.services;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selectors;

import static com.codeborne.selenide.Selenide.$$;

public class AllServicesPage {

    //Коллекция названий сервисов
    public ElementsCollection servicesNamesCollection = $$(Selectors.byXpath("//div[@class='services-big__item_link']"));

}