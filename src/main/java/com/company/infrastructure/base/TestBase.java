package com.company.infrastructure.base;


import com.company.infrastructure.config.ConfigurationManager;
import com.company.infrastructure.webdrivermanager.WebDriverManager;
import com.company.infrastructure.logger.FileTestLogger;
import com.company.infrastructure.logger.StdTestLogger;
import com.company.infrastructure.logger.TestLogger;
import org.junit.After;
import org.junit.Before;

public abstract class TestBase {

    protected String browser;
    private WebDriverManager wdm;

    protected TestLogger logger = getLogger();

    @Before
    public void setUp() {
        logger.log("Starting browser");
        wdm = new WebDriverManager();
        browser = wdm.getWebDriver();

        beforeTest();
    }
    @After
    public void tearDown() {
        afterTest();

        logger.log("Closing browser");
        wdm.closeWebDriver(browser);
    }

    protected void beforeTest() {}

    protected void afterTest() {}

    private TestLogger getLogger() {
        return ConfigurationManager.getInstance().getRunOn().equals("local") ?
                 new StdTestLogger() : new FileTestLogger();
    }
}
