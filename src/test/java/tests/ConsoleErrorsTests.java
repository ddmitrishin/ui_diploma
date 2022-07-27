package tests;

import helpers.DriverUtils;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ConsoleErrorsTests extends TestBase {
    @Test
    @DisplayName("Page console log should not have errors")
    @Feature("Others")
    void consoleShouldNotHaveErrorsTest() {
        step("Console logs should not contain text 'SEVERE'", () -> {
            String consoleLogs = DriverUtils.getConsoleLogs();
            String errorText = "SEVERE";

            assertThat(consoleLogs).doesNotContain(errorText);
        });
    }
}
