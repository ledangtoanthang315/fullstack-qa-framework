package mobile.pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class MobileLoginPage {
    private final AppiumDriver driver;

    // Constructor
    public MobileLoginPage(AppiumDriver driver) {
        this.driver = driver;
    }

    // Locators
    By signInButton = By.xpath("//XCUIElementTypeButton[@name='Sign In']");
    By emailInput = By.xpath("//XCUIElementTypeTextField");
    By passwordInput = By.xpath("//XCUIElementTypeSecureTextField");
    By submitButton = By.xpath("//XCUIElementTypeButton[@name='Log In']");

    // Actions
    public PortfolioPage login(String email, String password) {
        driver.findElement(signInButton).click();
        driver.findElement(emailInput).sendKeys(email);
        driver.findElement(passwordInput).sendKeys(password);
        driver.findElement(submitButton).click();
        return null;
    }

}
