package mobile.pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class LogoutPage {
    private final AppiumDriver driver;

    public LogoutPage(AppiumDriver driver) {
        this.driver = driver;
    }

    private final By menuButton = By.xpath("//XCUIElementTypeButton[@name='More']");
    private final By settingsButton = By.xpath("//XCUIElementTypeStaticText[@name='Settings']");
    private final By logoutButton = By.xpath("//XCUIElementTypeStaticText[@name='Log Out']");

    public void logout() {
        try {
            driver.findElement(menuButton).click();
            driver.findElement(settingsButton).click();
            driver.findElement(logoutButton).click();
        } catch (Exception e) {
            System.out.println("Logout failed: " + e.getMessage());
        }
    }
}
