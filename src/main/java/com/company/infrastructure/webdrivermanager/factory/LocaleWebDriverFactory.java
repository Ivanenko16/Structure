package com.company.infrastructure.webdrivermanager.factory;

import com.company.infrastructure.config.ConfigurationManager;
import com.company.infrastructure.webdrivermanager.enums.BrowserType;

public class LocaleWebDriverFactory implements WebDriverFactory {

    @Override
    public String getWebDriver() {
        BrowserType driverType = BrowserType.valueOf(ConfigurationManager.getInstance().getTestBrowser());

        switch (driverType){
            case CHROME:
                return "Local Google Chrome";
            case FIREFOX:
                return "Local Mozilla Firefox";
            case SAFARI:
                return "Local Apple Safari";
            case ADGE:
                return "Local MS Adge";
                default:
                    throw new RuntimeException("No such browser");
        }
    }
}
