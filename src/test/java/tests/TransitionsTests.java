package tests;

import io.qameta.allure.AllureId;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class TransitionsTests extends TestBase {
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
}
