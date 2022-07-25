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
    void testOpenMainPageFromTitleTest() {
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
    void testChangeLanguage() {
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
    void testOpenFeedbackPage() {
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
    void testcontentPartnersPage() {
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
    void testcontentCareerPage() {
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
    void testcontentProjectPage() {
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
    void testSendRequest() {
        step("Open main page https://www.appliedtech.ru/", () ->
                open(""));
        step("Go to Service page", () ->
                mainPage.goToServicePage());
        step("Fill form", () ->
                servicesPage.sendRequest(RANDOM_FIRST_NAME, RANDOM_COMPANY_NAME, RANDOM_EMAIL, RANDOM_DESCRIPTION));
        step("Send form");
    }
}
