package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:properties/credentials.properties"})
public interface CredentialsConfig extends Config {
    String user();
    String password();
    @DefaultValue("")
    String remote();
}