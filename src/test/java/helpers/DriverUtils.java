package helpers;

import com.codeborne.selenide.Selenide;

import static org.openqa.selenium.logging.LogType.BROWSER;

public class DriverUtils {
    public static String getConsoleLogs() { // todo refactor
        return String.join("\n", Selenide.getWebDriverLogs(BROWSER));
    }
}
