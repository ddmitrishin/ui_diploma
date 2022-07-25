package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

public class ServicesPage {
    private final SelenideElement servicesHeader = $(".section"),
            sendRequestButton = $(".service-item__footer").$(withText("Отправить заявку")),
            nameInputField = $("#service_order_name"),
            emailInputField = $("#service_order_email"),
            descriptionInputField = $("#service_order_message"),
            companyInputField = $("#service_order_company");

    public void checkServicesTitle() {
        servicesHeader.shouldHave(text("Услуги компании"));
    }

    public void sendRequest(String name, String companyName, String email, String description) {
        step("Click on 'Request' button", () ->
                sendRequestButton.click());
        step("Enter 'Name'", () -> nameInputField.sendKeys(name));
        step("Enter 'Company Name'", () -> companyInputField.sendKeys(companyName));
        step("Enter 'Email'", () -> emailInputField.sendKeys(email));
        step("Enter 'Description'", () -> descriptionInputField.sendKeys(description));
    }
}
