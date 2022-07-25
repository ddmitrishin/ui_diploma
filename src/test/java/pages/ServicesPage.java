package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;

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

    public void sendRequest(String name, String companyName, String email, String description){
        sendRequestButton.click();
        nameInputField.sendKeys(name);
        companyInputField.sendKeys(companyName);
        emailInputField.sendKeys(email);
        descriptionInputField.sendKeys(description);
    }
}
