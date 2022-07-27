package tests;

import io.qameta.allure.AllureId;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class MainPageTests extends TestBase {
    @Test
    @AllureId("11617")
    @DisplayName("Change Language to English")
    @Feature("Main Page")
    void changeLanguageTest() {
        step("Open main page https://www.appliedtech.ru/", () ->
                open(""));
        step("Change Language to English", () ->
                mainPage.changeLanguageToEnglish());
        step("Verified that language changed", () ->
                mainPage.checkEnLanguage());
    }
}
