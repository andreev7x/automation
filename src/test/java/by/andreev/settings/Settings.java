package by.andreev.settings;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.AfterClass;
import org.junit.BeforeClass;

public class Settings {

    @BeforeClass
    public static void beforeClass() {
        //Развернуть окно браузера
        Configuration.startMaximized = true;
    }

    @AfterClass
    public static void closeWebdriver() {
        //Остановить драйвер
        Selenide.closeWebDriver();
    }

}