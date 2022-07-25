package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class FeedbackPage {
    private final SelenideElement feedbackHeader = $(".section");

    public void checkFeedbackTitle() {
        feedbackHeader.shouldHave(text("Отзывы"));
    }
}
