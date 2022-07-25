package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainPage {

    private final SelenideElement
            partnersPageButton = $(withText("Партнёры")),
            projectsPageButton = $(withText("Проекты")),
            careerPageButton = $(withText("Карьера")),
            servicesPageButton = $(withText("Услуги")),
            languageSelector = $(".language-selector__current"),
            landuageENSelector = $(".language-selector__goto-language"),
            aboutCompanyButton = $(byText("О компании")),
            feedbackButton = $(byText("Отзывы")),
            mainTitle = $(".about-teaser__left"),
            mainTitleEndlish = $(".hero__title"),
            logoButton = $(".index-logo-img");

    public void openMainPage() {
        open("https://www.appliedtech.ru/");
    }

    public void goToPartnersPage() {
        partnersPageButton.click();
    }

    public void changeLanguageToEnglish() {
        languageSelector.click();
        landuageENSelector.click();
    }

    public void goToFeedbackPage() {
        aboutCompanyButton.hover();
        feedbackButton.click();
    }

    public void clickOnLogo() {
        logoButton.click();
    }

    public void checkTitleMainPage() {
        mainTitle.shouldHave(text("О компании"));
    }

    public void checkEnLanguage() {
        mainTitleEndlish.shouldHave(text("Software development"));
    }
}
