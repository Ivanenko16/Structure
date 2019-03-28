package com.company.infrastructure.webdrivermanager;

import com.company.infrastructure.config.ConfigurationManager;
import com.company.infrastructure.webdrivermanager.enums.RunOn;
import com.company.infrastructure.webdrivermanager.factory.CloudWebDriverFactory;
import com.company.infrastructure.webdrivermanager.factory.LocaleWebDriverFactory;
import com.company.infrastructure.webdrivermanager.factory.RemoteWebDriverFactory;
import com.company.infrastructure.webdrivermanager.factory.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class WebDriverManager {

    private WebDriverFactory driverFactory;

    public WebDriver getWebDriver() {

        RunOn runOn = RunOn.valueOf(ConfigurationManager.getInstance().getRunOn().toUpperCase());

        switch (runOn) {
            case LOCAL:
                driverFactory = new LocaleWebDriverFactory();
                break;
            case CLOUD:
                driverFactory = new CloudWebDriverFactory();
                break;
            case REMOTE:
                driverFactory = new RemoteWebDriverFactory();
                break;
            default:
                throw new RuntimeException("No such browser");
        }
        return driverFactory.getWebDriver();
    }


    public void closeBrouser(WebDriver webDriver) {
        if (webDriver != null) webDriver.quit();
    }
}