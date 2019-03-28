package com.company.infrastructure.webdrivermanager.factory;

import com.company.infrastructure.config.ConfigurationManager;
import com.company.infrastructure.webdrivermanager.enums.BrowserType;
import org.openqa.selenium.WebDriver;

public class RemoteWebDriverFactory implements WebDriverFactory {
    @Override
    public WebDriver getWebDriver() {
        BrowserType browserType = BrowserType.valueOf(ConfigurationManager.getInstance().getTestBrowser().toUpperCase());

//        switch (browserType) {
//            case CHROME:
//                return new RemoteWebDriver();
//            case FIREFOX:
//                return "FireFox";
//            case SAFARI:
//                return "Safari";
//            case EDGE:
//                return "Edge";
//            default:
//                throw new RuntimeException("No such Browser");
//        }
        return null;
    }
}
