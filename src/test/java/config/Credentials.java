package config;

import org.aeonbits.owner.ConfigFactory;

public class Credentials {
    public static CredentialsConfig config = ConfigFactory.create(CredentialsConfig.class, System.getProperties());

    public static boolean isRemoteWebDriver() {
        return !config.remote().equals("");
    }
}