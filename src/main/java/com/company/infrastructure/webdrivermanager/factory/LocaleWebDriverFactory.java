package com.company.infrastructure.webdrivermanager.factory;

import com.company.infrastructure.config.ConfigurationManager;
import com.company.infrastructure.webdrivermanager.enums.BrowserType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class LocaleWebDriverFactory implements WebDriverFactory {

    @Override
    public WebDriver getWebDriver() {
        BrowserType browserType = BrowserType.valueOf(ConfigurationManager.getInstance().getTestBrowser().toUpperCase());

        switch (browserType) {
            case CHROME:
                return new ChromeDriver();
            case FIREFOX:
                return new FirefoxDriver();
            case SAFARI:
                return new SafariDriver();
            case ADGE:
                return new EdgeDriver();
            default:
                throw new RuntimeException("No such Browser");
        }
    }
}