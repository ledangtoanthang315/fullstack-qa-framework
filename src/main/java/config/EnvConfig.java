package config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class EnvConfig {
    private static final Properties properties = new Properties();

    public static void load(String env) {
        try {
            FileInputStream input = new FileInputStream("src/test/resources/config/" + env + ".properties");
            properties.load(input);
        } catch (IOException e) {
            throw new RuntimeException("Failed to load environment configuration: " + env, e);
        }
    }

    public static String get(String key) {
        return properties.getProperty(key);
    }

    public static String getBaseUrl() {
        return get("base.url");
    }

}
