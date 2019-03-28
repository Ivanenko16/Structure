package com.company.infrastructure.config;

public final class ConfigurationManager {

    private static ConfigurationManager instance;

    private ConfigurationManager() { }

    public static synchronized ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }

    public String getTestBrowser() {

        return getEnvironmentVariableOrDefault("testBrowser", "chrome");
    }

    public String getTestEnv() {

        return getEnvironmentVariableOrDefault("testEnvironment", "production");
    }

    public String getRunOn() {
        return getEnvironmentVariableOrDefault("runOn", "local");
    }

    private String getEnvironmentVariableOrDefault(String envVariable, String defaultValue) {

        return System.getenv(envVariable) !=null ?
                System.getenv(envVariable) : defaultValue;
    }
}