package web.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateChallengePage {
    private final WebDriver driver;
    public CreateChallengePage(WebDriver driver) { this.driver = driver; }

    private final By titleField = By.id("title");
    private final By descriptionField = By.id("description");
    private final By createButton = By.xpath("//button[contains(text(),'Create')]");

    public void createChallenge(String title, String description) {
        driver.findElement(titleField).sendKeys(title);
        driver.findElement(descriptionField).sendKeys(description);
        driver.findElement(createButton).click();
    }
}
