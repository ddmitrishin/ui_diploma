package tests;

import io.qameta.allure.AllureId;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;
import static tests.TestData.*;

public class Tests extends TestBase {

    @Test
    @AllureId("11616")
    @DisplayName("Open main page when press on title")
    @Feature("Main Page")
    void openMainPageFromTitleTest() {
        step("Open page https://www.appliedtech.ru/", () ->
                open(""));
        step("Press on title", () ->
                mainPage.clickOnLogo());
        step("Check title name", () ->
                mainPage.checkTitleMainPage());
    }

    @Test
    @AllureId("11617")
    @DisplayName("Change Language to English")
    @Feature("Main Page")
    void changeLanguage() {
        step("Open main page https://www.appliedtech.ru/", () ->
                open(""));
        step("Change Language to English", () ->
                mainPage.changeLanguageToEnglish());
        step("Verified that language changed", () ->
                mainPage.checkEnLanguage());
    }

    @Test
    @DisplayName("Send request to company")
    @Feature("Service Page")
    void sendRequest() {
        step("Open main page https://www.appliedtech.ru/", () ->
                open(""));
        step("Go to Service page", () ->
                mainPage.goToServicePage());
        step("Fill form", () ->
                servicesPage.sendRequest(RANDOM_FIRST_NAME, RANDOM_COMPANY_NAME, RANDOM_EMAIL, RANDOM_DESCRIPTION));
        step("Send form");
    }
}
