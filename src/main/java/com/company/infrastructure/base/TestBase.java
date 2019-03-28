package com.company.infrastructure.base;


import com.company.infrastructure.config.ConfigurationManager;
import com.company.infrastructure.webdrivermanager.WebDriverManager;
import com.company.infrastructure.logger.FileTestLogger;
import com.company.infrastructure.logger.StdTestLogger;
import com.company.infrastructure.logger.TestLogger;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

public abstract class TestBase {

    protected WebDriver browser;
    private WebDriverManager driverManager;

    protected TestLogger logger = getLogger();

    @Before
    public void setUp() {
        logger.logger("Starting browser...");
        driverManager = new WebDriverManager();
        browser = driverManager.getWebDriver();
    }

    @After
    public void tearDown() {
        logger.logger("Closing browser...");
        driverManager.closeBrouser(browser);
    }

    protected void beforeTest() {}

    protected void afterTest() {}

    private TestLogger getLogger() {
        return ConfigurationManager.getInstance().getRunOn().equals("local") ?
                new StdTestLogger() : new FileTestLogger();
    }
}