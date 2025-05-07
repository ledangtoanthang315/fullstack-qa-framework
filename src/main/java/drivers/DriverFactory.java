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

    public static WebDriver getWebDriver() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        return new ChromeDriver(options);
    }

    public static AppiumDriver getMobileDriver() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "iOS");
        caps.setCapability("deviceName", "iPhone Simulator");
        caps.setCapability("platformVersion", "16.4");
        caps.setCapability("automationName", "XCUITest");
        caps.setCapability("app", "/path/to/your/app.app"); // hoặc dùng bundleId nếu app đã cài

        return new IOSDriver(new URL("http://localhost:4723/wd/hub"), caps);
    }
}
