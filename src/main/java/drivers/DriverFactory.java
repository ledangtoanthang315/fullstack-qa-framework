package drivers;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;

public class DriverFactory {

    private static WebDriver webDriver;
    private static AppiumDriver mobileDriver;

    // Web Driver
    public static WebDriver getWebDriver() {
        if (webDriver == null) {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--start-maximized");
            options.addArguments("--remote-allow-origins=*");
            options.addArguments("user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/124.0.0.0 Safari/537.36");
            webDriver = new ChromeDriver(options);
        }
        return webDriver;
    }

    // Mobile iOS Driver
    public static AppiumDriver getMobileDriver() throws MalformedURLException {
        if (mobileDriver == null) {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("platformName", "iOS");
            caps.setCapability("deviceName", "iPhone 15 Pro");
            caps.setCapability("platformVersion", "17.0");
            caps.setCapability("automationName", "XCUITest");
            caps.setCapability("app", "/path/to/TradingView.app"); // cần export từ Xcode

            mobileDriver = new IOSDriver(new URL("http://localhost:4723/wd/hub"), caps);
        }
        return mobileDriver;
    }

    public static void quitDrivers() {
        if (webDriver != null) {
            webDriver.quit();
            webDriver = null;
        }
        if (mobileDriver != null) {
            mobileDriver.quit();
            mobileDriver = null;
        }
    }
}
