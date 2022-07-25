package helpers;

import com.codeborne.selenide.Configuration;
import config.Credentials;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DriverSettings {

    public static void configure() {
        Configuration.baseUrl = "https://www.appliedtech.ru/";
        Configuration.browserSize = System.getProperty("size", "1920x1080");
        Configuration.browser = System.getProperty("browser", "chrome");
        Configuration.pageLoadTimeout = 80000;

        if (Credentials.isRemoteWebDriver()) {
            String user = Credentials.config.user();
            String password = Credentials.config.password();
            String remote = Credentials.config.remote();
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("enableVNC", true);
            capabilities.setCapability("enableVideo", true);
            Configuration.browserCapabilities = capabilities;
            Configuration.remote = "https://" + user + ":" + password + "@" + remote;
        }
    }
}