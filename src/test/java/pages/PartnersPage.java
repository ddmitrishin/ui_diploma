package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class PartnersPage {
    private final SelenideElement partnersHeader = $(".section");

    public void checkPartnersTitle() {
        partnersHeader.shouldHave(text("Наши партнёры"));
    }
}
