package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class ProjectsPage {
    private final SelenideElement projectsHeader = $(".section");

    public void checkprojectsTitle() {
        projectsHeader.shouldHave(text("Проекты компании"));
    }
}
