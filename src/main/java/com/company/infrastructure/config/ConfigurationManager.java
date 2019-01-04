package com.company.infrastructure.config;

public class ConfigurationManager {

    private static ConfigurationManager instance;
    private ConfigurationManager() {}

    public static ConfigurationManager getInstance() {
        if (instance == null)
            instance = new ConfigurationManager();

        return instance;

    }


    public String getTestBrowser() {
        return getEnviromentVariableOrDefault("testBrowser", "chrome");

    }

    public String getTestEnv() {
        return getEnviromentVariableOrDefault("testEnv", "production");

    }

    public  String getRunOn() {
        return getEnviromentVariableOrDefault("runOn", "local");
    }


    private String getEnviromentVariableOrDefault(String envaVar, String defaultValue) {
        return System.getenv(envaVar) != null ? System.getenv(envaVar) : defaultValue;
    }
}