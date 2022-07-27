package tests;

import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class PageContentTests extends TestBase {
    @Test
    @DisplayName("Check content of Partners Page")
    @Feature("Partners Page")
    void contentPartnersPageTest() {
        step("Open main page https://www.appliedtech.ru/", () ->
                open(""));
        step("Go to Partners Page", () ->
                mainPage.goToPartnersPage());
        step("Verified that Partners Page open", () ->
                partnersPage.checkPartnersTitle());
    }

    @Test
    @DisplayName("Check content of Career Page")
    @Feature("Career Page")
    void contentCareerPageTest() {
        step("Open main page https://www.appliedtech.ru/", () ->
                open(""));
        step("Go to Career Page", () ->
                mainPage.goToCareerPage());
        step("Verified that Career Page open", () ->
                careerPage.checkCareerTitle());
    }

    @Test
    @DisplayName("Check content of Project Page")
    @Feature("Project Page")
    void contentProjectPageTest() {
        step("Open main page https://www.appliedtech.ru/", () ->
                open(""));
        step("Go to Project Page", () ->
                mainPage.goToProjectsPage());
        step("Verified that Project Page open", () ->
                projectsPage.checkprojectsTitle());
    }
}
