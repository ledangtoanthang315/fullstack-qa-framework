package web.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
    private final WebDriver driver;
    public DashboardPage(WebDriver driver) { this.driver = driver; }

    private final By createChallengeLink = By.xpath("//a[contains(text(),'Create Challenge')]");
    private final By logoutButton = By.xpath("//a[contains(text(),'Logout')]");

    public void goToCreateChallenge() {
        driver.findElement(createChallengeLink).click();
    }

    public void logout() {
        driver.findElement(logoutButton).click();
    }
}
