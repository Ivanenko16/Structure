package com.company.infrastructure.webdrivermanager;

import com.company.infrastructure.config.ConfigurationManager;
import com.company.infrastructure.webdrivermanager.enums.RunOn;
import com.company.infrastructure.webdrivermanager.factory.CloudWebDriverFactory;
import com.company.infrastructure.webdrivermanager.factory.LocaleWebDriverFactory;
import com.company.infrastructure.webdrivermanager.factory.RemoteWebDriverFactory;
import com.company.infrastructure.webdrivermanager.factory.WebDriverFactory;

public class WebDriverManager {

    public String getWebDriver(){

        RunOn runON = RunOn.valueOf(ConfigurationManager.getInstance().getRunOn().toUpperCase());
        WebDriverFactory factory;

        switch (runON){
            case LOCAL:
                factory = new LocaleWebDriverFactory();
                break;
            case REMOTE:
                factory = new RemoteWebDriverFactory();
                break;
            case CLOUD:
                factory = new CloudWebDriverFactory();
                break;
                default:
                    throw new RuntimeException("No such env");

        }
        return factory.getWebDriver();
    }
    public  void closeWebDriver(String webDriver) {
        System.out.println("Closing " + webDriver);
    }
}
