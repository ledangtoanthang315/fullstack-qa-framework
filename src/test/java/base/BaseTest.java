package base;

import drivers.DriverFactory;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseTest {
    protected WebDriver webDriver;
    protected AppiumDriver mobileDriver;

    @BeforeMethod(alwaysRun = true)

    @Parameters("platform")
    public void setUp(@Optional("web") String platform) throws Exception {
        if (platform.equalsIgnoreCase("web")) {
            webDriver = DriverFactory.getWebDriver();
        } else {
            mobileDriver = DriverFactory.getMobileDriver();
        }
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        if (webDriver != null) webDriver.quit();
        if (mobileDriver != null) mobileDriver.quit();
    }
}