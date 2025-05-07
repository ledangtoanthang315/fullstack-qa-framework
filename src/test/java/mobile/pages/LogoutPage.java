package mobile.pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class LogoutPage {
    private final AppiumDriver driver;

    public LogoutPage(AppiumDriver driver) {
        this.driver = driver;
    }

    private final By menuButton = By.id("com.example.app:id/menu_button");
    private final By logoutButton = By.id("com.example.app:id/logout_button");

    public void logout() {
        driver.findElement(menuButton).click();
        driver.findElement(logoutButton).click();
    }
}
