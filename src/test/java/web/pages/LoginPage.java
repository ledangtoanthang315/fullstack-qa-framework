package web.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private final WebDriver driver;

    // Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    private final By usernameField = By.id("identifier");
    private final By passwordField = By.id("password");
    private final By loginButton = By.xpath("//button[contains(text(), 'Login')]");

    // Actions
    public void login(String username, String password) {
        driver.get("https://ctflearn.com");
        driver.findElement(usernameField).sendKeys(username);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(loginButton).click();
    }

    public boolean isLoginSuccessful() {
        try {
            WebElement dashboard = driver.findElement(By.xpath("//a[contains(text(),'Dashboard')]"));
            return dashboard.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
}
