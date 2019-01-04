package com.company.infrastructure.webdrivermanager.factory;

import com.company.infrastructure.config.ConfigurationManager;
import com.company.infrastructure.webdrivermanager.enums.BrowserType;

public class RemoteWebDriverFactory implements WebDriverFactory {

    @Override
    public String getWebDriver() {
        BrowserType driverType = BrowserType.valueOf(ConfigurationManager.getInstance().getTestBrowser());

        switch (driverType){
            case CHROME:
                return "Remote Google Chrome";
            case FIREFOX:
                return "Remote Mozilla Firefox";
            case SAFARI:
                return "Remote Apple Safari";
            case ADGE:
                return "Remote MS Adge";
                default:
                    throw new RuntimeException("No such browser");
        }
    }
}
