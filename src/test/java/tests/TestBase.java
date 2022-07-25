package tests;

import com.codeborne.selenide.logevents.SelenideLogger;
import helpers.Attach;
import helpers.DriverSettings;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import pages.*;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.closeWebDriver;
import static io.qameta.allure.Allure.step;

public class TestBase {
        MainPage mainPage = new MainPage();
        CareerPage careerPage = new CareerPage();
        PartnersPage partnersPage = new PartnersPage();
        ProjectsPage projectsPage = new ProjectsPage();
        ServicesPage servicesPage = new ServicesPage();

        @BeforeAll
        static void beforeAll() {
            SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
            DriverSettings.configure();
        }

        @BeforeEach
        void openAppliedTech() {
            step("open appliedtech", () -> {
                open("");
            });
        }

        @AfterEach
        void addAttachments() {
            Attach.takeScreenshot("Last screenshot");
            Attach.pageSource();
            Attach.browserConsoleLogs();
            Attach.addVideo();
            closeWebDriver();
        }
}
