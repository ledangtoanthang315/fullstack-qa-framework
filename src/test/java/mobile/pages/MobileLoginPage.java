package mobile.pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MobileLoginPage {
    private final AppiumDriver driver;

    // Constructor
    public MobileLoginPage(AppiumDriver driver) {
        this.driver = driver;
    }

    // Locators (bạn cần thay thế bằng giá trị thực tế của app)
    private final By emailField = By.id("com.example.app:id/email");         // Hoặc Accessibility ID nếu dùng iOS
    private final By passwordField = By.id("com.example.app:id/password");
    private final By loginButton = By.id("com.example.app:id/login_button");

    // Actions
    public PortfolioPage login(String email, String password) {
        driver.findElement(emailField).sendKeys(email);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(loginButton).click();
        return null;
    }

    public boolean isLoginSuccessful() {
        try {
            WebElement portfolioElement = driver.findElement(By.id("com.example.app:id/portfolio_header"));
            return portfolioElement.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
}
