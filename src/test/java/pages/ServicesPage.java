package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class ServicesPage {
    private final SelenideElement servicesHeader = $(".section");

    public void checkServicesTitle() {
        servicesHeader.shouldHave(text("Услуги компании"));
    }
}
