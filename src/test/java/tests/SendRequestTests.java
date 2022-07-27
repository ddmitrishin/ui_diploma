package tests;

import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;
import static tests.TestData.*;

public class SendRequestTests extends TestBase {
    @Test
    @DisplayName("Send request to company")
    @Feature("Service Page")
    void sendRequestTest() {
        step("Open main page https://www.appliedtech.ru/", () ->
                open(""));
        step("Go to Service page", () ->
                mainPage.goToServicePage());
        step("Fill form", () ->
                servicesPage.sendRequest(RANDOM_FIRST_NAME, RANDOM_COMPANY_NAME, RANDOM_EMAIL, RANDOM_DESCRIPTION));
        step("Send form");
    }

}
