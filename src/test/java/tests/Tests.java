package tests;

import io.qameta.allure.AllureId;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class Tests extends TestBase {

    @Test
    @AllureId("11616")
    @DisplayName("Open main page when press on title")
    @Feature("Main Page")
    void OpenMainPageFromTitleTest() {
        step("Open page https://www.appliedtech.ru/", () ->
                open(""));
        step("Press on title", () ->
                mainPage.clickOnLogo());
        step("Check title name", () ->
                mainPage.checkTitleMainPage());
    }
}
