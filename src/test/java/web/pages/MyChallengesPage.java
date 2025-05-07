package web.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyChallengesPage {
    private final WebDriver driver;
    public MyChallengesPage(WebDriver driver) { this.driver = driver; }

    private final By myChallengesLink = By.xpath("//a[contains(text(),'My Challenges')]");

    public boolean verifyChallengeIsPresent(String title) {
        driver.findElement(myChallengesLink).click();
        By challengeTitle = By.xpath("//h4[contains(text(),'" + title + "')]");
        return driver.findElement(challengeTitle).isDisplayed();
    }
}
