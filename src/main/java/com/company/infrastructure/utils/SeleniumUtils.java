package com.company.infrastructure.utils;

import org.openqa.selenium.WebDriver;


public class SeleniumUtils {

    private WebDriver driver;

    public SeleniumUtils(WebDriver driver) {
        this.driver = driver;
    }

    private String handle = null;

    public void switchToWindow(String windowTitle) {

        handle = driver.getWindowHandle();

        if(driver.getWindowHandles().size() < 2)
            returnToPerentWindow();

        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }
    }

    public void returnToPerentWindow() {
        driver.switchTo().window(handle);
    }
}

