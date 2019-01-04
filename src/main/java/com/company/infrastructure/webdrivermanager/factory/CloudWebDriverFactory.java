package com.company.infrastructure.webdrivermanager.factory;

import com.company.infrastructure.config.ConfigurationManager;
import com.company.infrastructure.webdrivermanager.enums.BrowserType;

public class CloudWebDriverFactory implements WebDriverFactory {

    @Override
    public String getWebDriver() {
        BrowserType driverType = BrowserType.valueOf(ConfigurationManager.getInstance().getTestBrowser());

        switch (driverType){
            case CHROME:
                return "Cloud Google Chrome";
            case FIREFOX:
                return "Cloud Mozilla Firefox";
            case SAFARI:
                return "Cloud Apple Safari";
            case ADGE:
                return "Cloud MS Adge";
                default:
                    throw new RuntimeException("No such browser");
        }
    }
}
