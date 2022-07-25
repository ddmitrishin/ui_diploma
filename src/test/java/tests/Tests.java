package tests;

import helpers.DriverUtils;
import io.qameta.allure.AllureId;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
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
    void changeLanguageTest() {
        step("Open main page https://www.appliedtech.ru/", () ->
                open(""));
        step("Change Language to English", () ->
                mainPage.changeLanguageToEnglish());
        step("Verified that language changed", () ->
                mainPage.checkEnLanguage());
    }

    @Test
    @DisplayName("Open Feedback page from drop-down list 'About company'")
    @Feature("Feedback Page")
    void openFeedbackPageTest() {
        step("Open main page https://www.appliedtech.ru/", () ->
                open(""));
        step("Choose feedback fro drop-down list", () ->
                mainPage.chooseFeedbackPage());
        step("Verified that feedback open", () ->
                feedbackPage.checkFeedbackTitle());
    }

    @Test
    @DisplayName("Check content of Partners Page")
    @Feature("Partners Page")
    void contentPartnersPageTest() {
        step("Open main page https://www.appliedtech.ru/", () ->
                open(""));
        step("Go to Partners Page", () ->
                mainPage.goToPartnersPage());
        step("Verified that Partners Page open", () ->
                partnersPage.checkPartnersTitle());
    }

    @Test
    @DisplayName("Check content of Career Page")
    @Feature("Career Page")
    void contentCareerPageTest() {
        step("Open main page https://www.appliedtech.ru/", () ->
                open(""));
        step("Go to Career Page", () ->
                mainPage.goToCareerPage());
        step("Verified that Career Page open", () ->
                careerPage.checkCareerTitle());
    }

    @Test
    @DisplayName("Check content of Project Page")
    @Feature("Project Page")
    void contentProjectPageTest() {
        step("Open main page https://www.appliedtech.ru/", () ->
                open(""));
        step("Go to Project Page", () ->
                mainPage.goToProjectsPage());
        step("Verified that Project Page open", () ->
                projectsPage.checkprojectsTitle());
    }

    @Test
    @DisplayName("Send request to company")
    @Feature("Service Page")
    void SendRequestTest() {
        step("Open main page https://www.appliedtech.ru/", () ->
                open(""));
        step("Go to Service page", () ->
                mainPage.goToServicePage());
        step("Fill form", () ->
                servicesPage.sendRequest(RANDOM_FIRST_NAME, RANDOM_COMPANY_NAME, RANDOM_EMAIL, RANDOM_DESCRIPTION));
        step("Send form");
    }

    @Test
    @DisplayName("Page console log should not have errors")
    @Feature("Others")
    void consoleShouldNotHaveErrorsTest() {
        step("Console logs should not contain text 'SEVERE'", () -> {
            String consoleLogs = DriverUtils.getConsoleLogs();
            String errorText = "SEVERE";

            assertThat(consoleLogs).doesNotContain(errorText);
        });
    }
}
