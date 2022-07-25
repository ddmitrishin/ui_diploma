package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class CareerPage {
    private final SelenideElement careerHeader = $(".section");

    public void checkCareerTitle() {
        careerHeader.shouldHave(text("Карьера"));
    }
}
